package com.codecool.studentsatisfactionsurvey.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SurveyResult {

    private Integer id;
    private String question_content;
    private Integer group_id;
    private String question_type;
    private String answer_content;
}
