package com.example.demo.repository;

import com.example.demo.model.Commit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICommitRepository extends JpaRepository<Commit, Integer> {
    List<Commit> findDistinctByrepository_nameAndAuthorcommitEqualsIgnoreCaseAndLinesAddedGreaterThan
            (String name, String keyword, Integer valormayor);

    /*
     Si su entrada es "template-jpa-exam", "fix" y 50, su salida será los commits con hash: e4f5g6h, i7j8k9l, m1n2o3p.
     */

}
