package com.codecool.studentsatisfactionsurvey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmittedSurvey {

    private List<SurveyResult> surveyResults;

}
