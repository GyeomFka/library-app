package com.group.libraryapp.domain.book;

import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
public class Book {

    public Book() {

    }

    public Book(String name, Boolean isNowRented) {
        this.name = name;
        this.isNowRented = isNowRented;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @CreationTimestamp
    private LocalDateTime bookRentalStartDt;

    @CreationTimestamp
    private LocalDateTime bookRentalEndDt;

    @Column(nullable = false)
    private Boolean isNowRented;
}
