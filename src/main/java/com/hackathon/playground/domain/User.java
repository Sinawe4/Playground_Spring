package com.hackathon.playground.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_idx")
    private Long userIdx;

    @Size(max = 45)
    @Column(nullable = false, unique = true)
    private String username;

    @Size(max = 64)
    @Column(nullable = false)
    private String password;

    @Size(max = 45)
    private String nickname;

    private Long gold;
}
