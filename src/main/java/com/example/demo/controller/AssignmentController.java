package com.example.demo.controller;

import com.example.demo.model.Assignment;
import com.example.demo.repository.IAssignmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/assignments")
@RequiredArgsConstructor
public class AssignmentController {

    private final IAssignmentRepository assignmentRepository;

    @GetMapping("/consulta5")
    public List<Assignment> consulta5() {
        return assignmentRepository.findDistinctByclasroom_Teacher_FullNameAndRepositories_pullRequests_reviewerId_FullNameAndRepositories_pullRequests_StatusEquals("krodriguez","jvalencia","MERGED");
    }
}
