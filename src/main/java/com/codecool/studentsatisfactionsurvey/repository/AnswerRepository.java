package com.codecool.studentsatisfactionsurvey.repository;

import com.codecool.studentsatisfactionsurvey.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
