package com.codecool.studentsatisfactionsurvey.controller;

import com.codecool.studentsatisfactionsurvey.model.SubmittedSurvey;
import com.codecool.studentsatisfactionsurvey.model.SurveyResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Slf4j
public class SurveyController {


    @PostMapping(value = "/submit-survey")
    public void getSurveyResult(@RequestBody List<SurveyResult> surveyResults) {
        log.info(surveyResults.toString());

    }
}
