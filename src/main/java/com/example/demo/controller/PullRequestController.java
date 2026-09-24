package com.example.demo.controller;

import com.example.demo.model.PullRequest;
import com.example.demo.repository.IPullRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pull-requests")
@RequiredArgsConstructor
public class PullRequestController {

    private final IPullRequestRepository pullRequestRepository;

    @GetMapping(name = "/consulta1")
    public List<PullRequest> consulta1() {
        return pullRequestRepository.findDistinctByauthor_classrooms_NameAndStatusEqualsOrderByCreatedAtDesc("Computacion en Internet II - Grupo 1","OPEN");
    }
}
