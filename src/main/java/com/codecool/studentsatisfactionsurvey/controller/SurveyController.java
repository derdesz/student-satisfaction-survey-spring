package com.codecool.studentsatisfactionsurvey.controller;

import com.codecool.studentsatisfactionsurvey.model.Answer;
import com.codecool.studentsatisfactionsurvey.model.Question;
import com.codecool.studentsatisfactionsurvey.model.SurveyResult;
import com.codecool.studentsatisfactionsurvey.repository.AnswerRepository;
import com.codecool.studentsatisfactionsurvey.repository.QuestionRepository;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Slf4j
public class SurveyController {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    @PostMapping(value = "/submit-survey")
    public void getSurveyResult(@RequestBody List<SurveyResult> surveyResults) {
        Question question = new Question();
        Answer answer = new Answer();
        surveyResults.forEach(surveyResult -> {

            question.setId(surveyResult.getId());
            question.setGroupId(surveyResult.getGroup_id());
            question.setContent(surveyResult.getQuestion_content());
            question.setType(surveyResult.getQuestion_type());

            questionRepository.save(question);
            answer.setContent(surveyResult.getAnswer_content());
            answer.setDate(LocalDateTime.now());
            answerRepository.save(answer);
        });
        log.info(surveyResults.toString());

    }
}
