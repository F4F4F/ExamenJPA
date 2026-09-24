package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String role;

    @OneToMany(mappedBy = "teacher")
    private List<Classroom> classrooms;

    @OneToMany(mappedBy = "reviewer")
    private List<PullRequest>  reviewerpullRequests;

    @OneToMany(mappedBy = "author")
    private List<PullRequest>  authorpullRequests;

   @OneToMany(mappedBy = "owner")
    private List<Repository> repositories;

   @OneToMany(mappedBy = "authorcommit")
    private List<Commit> commits;
}
