package com.group.libraryapp.domain.user.loanhistory;

import com.group.libraryapp.domain.user.User;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class UserLoanHistory {

    public UserLoanHistory() {

    }

    public UserLoanHistory(User user, String bookName) {
        this.user = user;
        this.bookName = bookName;
        this.isReturn = false;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

//    private long userId;
    @JoinColumn(nullable = false)
    @ManyToOne
    private User user;

    private String bookName;

    private boolean isReturn;

    public void doReturn() {
        this.isReturn = true;
    }
}
