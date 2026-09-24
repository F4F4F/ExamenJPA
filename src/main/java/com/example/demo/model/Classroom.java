package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "classrooms")
public class Classroom {
    @Id
    private Integer id;

    private String name;

    @Column(name = "course_code")
    private String courseCode;

    private String semester;


    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @OneToMany(mappedBy = "clasroom")
    private List<Assignment> assignments;




}
