package com.example.demo.repository;

import com.example.demo.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAssignmentRepository extends JpaRepository<Assignment, Integer> {

    List<Assignment>
    findDistinctByclasroom_Teacher_FullNameAndRepositories_pullRequests_reviewerId_FullNameAndRepositories_pullRequests_StatusEquals
            (String teacheruser,String revieweruser,String prstatus);



    /*

    Si su entrada es "krodriguez", "jvalencia" y "MERGED", su salida será: Taller 1: Spring Data JPA.
     */


}
