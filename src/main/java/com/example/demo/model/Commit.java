package com.example.demo.model;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "commits")
public class Commit {

    @Id
    private Integer id;

    @Column(name = "commit_hash", nullable = false, unique = true)
    private String commitHash;

    @Column(nullable = false)
    private String message;

    @Column(name = "lines_added")
    private Integer linesAdded;

    @Column(name = "lines_deleted")
    private Integer linesDeleted;

    @Column(name = "commit_date")
    private Timestamp commitDate;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "author_id")
    private User authorcommit;

    @ManyToOne
    @JoinColumn(name = "repository_id")
    private Repository repository;

}
