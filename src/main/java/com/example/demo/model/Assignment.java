package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "assignments")
public class Assignment {
    @Id
    private Integer id;

    private String title;

    private String description;

    private Timestamp deadline;

    @Column(name = "max_score")
    private Integer maxScore;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom clasroom;


    @OneToMany(mappedBy = "assignment")
    @JsonIgnore
    private List<Repository> repositories;



}
