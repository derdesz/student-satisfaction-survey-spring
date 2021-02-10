package com.codecool.studentsatisfactionsurvey.repository;

import com.codecool.studentsatisfactionsurvey.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
