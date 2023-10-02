package com.group.libraryapp.controller.book;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.dto.book.request.BookLoanRequest;
import com.group.libraryapp.dto.book.request.BookReturnRequest;
import com.group.libraryapp.dto.book.request.BookSaveRequest;
import com.group.libraryapp.dto.book.response.BookSaveResponse;
import com.group.libraryapp.service.book.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public BookSaveResponse saveBook(@RequestBody BookSaveRequest request) {
        Book savedBook = bookService.saveBook(request);
        return new BookSaveResponse(savedBook.getId(), savedBook.getName());
    }

    @DeleteMapping("/book")
    public void deleteBook(String name) {
        bookService.deleteBook(name);
    }

    @PostMapping("/book/loan")
    public void loanBook(@RequestBody BookLoanRequest request) {
        bookService.loanBook(request);
    }

    @PutMapping("/book/return")
    public void returnBook(@RequestBody BookReturnRequest request) {
        bookService.returnBook(request);
    }

}
