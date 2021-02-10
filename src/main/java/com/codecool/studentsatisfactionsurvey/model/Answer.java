package com.codecool.studentsatisfactionsurvey.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue
    private Integer id;

    private String content;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
