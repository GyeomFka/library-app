package com.group.libraryapp.controller.book;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.dto.book.request.BookSaveRequest;
import com.group.libraryapp.dto.book.response.BookSaveResponse;
import com.group.libraryapp.service.book.BookService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public BookSaveResponse saveBook(@RequestBody BookSaveRequest request) {
        Book savedBook = bookService.save(request);
        return new BookSaveResponse(savedBook.getId(), savedBook.getName());
    }

    @DeleteMapping("/book")
    public void deleteBook(String name) {
        bookService.deleteBook(name);
    }

}
