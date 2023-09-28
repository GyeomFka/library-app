package com.group.libraryapp.dto.book.response;

import lombok.Getter;

@Getter
public class BookSaveResponse {

    public BookSaveResponse(Long id, String name) {
        this.id = id;
        this.name = name;
        System.out.println(" [" + this.name + "] 책 등록 되었습니다.");
    }

    private Long id;
    private String name;
}
