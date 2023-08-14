package com.example.courseworke2;

import com.example.courseworke2.model.Question;
import com.example.courseworke2.service.ExaminerService;
import com.example.courseworke2.service.QuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {
    @Mock
    QuestionService questionService;
    @InjectMocks
    ExaminerService examinerService;
List <Question> questions = Arrays.asList(
        new Question("Какие циклы вы знаете?", "for, while, do-while"),
        new Question("Какие целочисленные переменные вы знаете", "bit, short, int, long"),
        new Question("Какие условные операторы вы знаете?", "if, else, switch, else if"));

    @BeforeEach
    void setup() {
        when(questionService.getAll()).thenReturn(questions);}
@Test
        void getQuestion() {
            List<Question> actual = (List<Question>) examinerService.getQuestions(3);
            List<Question> expected = Arrays.asList(
                    new Question("Какие циклы вы знаете?", "for, while, do-while"),
                    new Question("Какие целочисленные переменные вы знаете", "bit, short, int, long"),
                    new Question("Какие условные операторы вы знаете?", "if, else, switch, else if"));
            assertEquals(3, actual);
        }

    }