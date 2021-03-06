package com.sook.mysonge.domain.user;

import com.sook.mysonge.domain.character.Character;
import com.sook.mysonge.domain.calendar.Calendar;
import com.sook.mysonge.domain.routine.Routine;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

//    @OneToOne(mappedBy = "user")
//    private Routine routine;

//    @OneToOne(mappedBy = "user")
//    private Calendar calendar;

//    @OneToOne(mappedBy = "user")
//    private Character character;

    @Builder
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

}
