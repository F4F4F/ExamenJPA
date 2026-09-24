package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "repositories")
public class Repository {
    @Id
    private Integer id;

    private String name;

    @Column(name = "is_template")
    private boolean isTemplate;

    @Column(name = "is_private")
    private boolean isPrivate;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "owner_id")
    private User owner;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;

    @OneToMany(mappedBy = "repopr")
    private List<PullRequest> pullRequests;

    @OneToMany(mappedBy = "repository")
    private List<Commit> commits;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "parent_repo_id")
    private Repository parentrepo;

    @OneToMany(mappedBy = "parentrepo")
    private List<Repository> repositories;
}
