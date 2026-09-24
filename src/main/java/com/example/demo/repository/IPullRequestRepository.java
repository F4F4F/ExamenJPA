package com.example.demo.repository;

import com.example.demo.model.PullRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPullRequestRepository extends JpaRepository<PullRequest, Integer> {

    List<PullRequest>
    findDistinctByauthor_classrooms_NameAndStatusEqualsOrderByCreatedAtDesc(String nombrecurso, String estado);

    /*

Si su entrada es "Computacion en Internet II - Grupo 1" y "OPEN", su salida será:
Entrega Taller JPA - Valeria Mendoza, Entrega Taller JPA - Camila Jimenez.
     */

}
