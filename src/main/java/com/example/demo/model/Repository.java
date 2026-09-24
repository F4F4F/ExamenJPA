package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
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
    @JoinColumn(name = "owner_id")
    private User owner;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;

    @OneToMany(mappedBy = "repopr")
    private List<PullRequest> pullRequests;

    @OneToMany(mappedBy = "repository")
    private List<Commit> commits;

    @ManyToOne
    @JoinColumn(name = "parent_repo_id")
    private Repository parentrepo;

    @OneToMany(mappedBy = "parentrepo")
    private List<Repository> repositories;
}
