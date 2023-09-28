package com.group.libraryapp.dto.book.request;

import lombok.Getter;

@Getter
public class BookSaveRequest {

    public BookSaveRequest(String name, boolean isNowRented) {
        this.name = name;
        this.isNowRented = isNowRented;
    }

    private String name;
    private boolean isNowRented;
}
