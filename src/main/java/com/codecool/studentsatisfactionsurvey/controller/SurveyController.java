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


    @PostMapping(value = "/submit-survey", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void getSurveyResult(@RequestBody List<SurveyResult> surveyResults) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<SubmittedSurvey> request = new HttpEntity<>(submittedSurvey, headers);
        RestTemplate rt = new RestTemplate();
//        ResponseEntity<SurveyResult[]> responseEntity = rt.getForEntity("http://localhost:3000/submit-survey", SurveyResult[].class);
        ResponseEntity<SubmittedSurvey> responseEntity = rt.exchange("http://localhost:3000/submit-survey", HttpMethod.POST, null, SubmittedSurvey.class);
        SubmittedSurvey objects = responseEntity.getBody();
        log.info(objects.toString());

        System.out.println(objects.getSurveyResults());
    }
}
