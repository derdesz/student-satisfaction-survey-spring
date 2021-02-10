package com.codecool.studentsatisfactionsurvey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
public class Question {

    @Id
    private Integer id;

    @Lob
    private String content;
    private Integer groupId;
    private String type;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;


}
