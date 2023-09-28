package com.group.libraryapp.service.book;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.dto.book.request.BookSaveRequest;
import com.group.libraryapp.domain.book.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public Book save(BookSaveRequest request) {
        return bookRepository.save(new Book(request.getName(), request.isNowRented()));
    }

    @Transactional
    public void deleteBook(String name) {
        Book findBook = bookRepository.findByName(name).orElseThrow(IllegalArgumentException::new);
        bookRepository.delete(findBook);
    }
}
