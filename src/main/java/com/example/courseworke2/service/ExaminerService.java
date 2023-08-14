package com.example.courseworke2.service;

import com.example.courseworke2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection <Question> getQuestions(int amount);

}
