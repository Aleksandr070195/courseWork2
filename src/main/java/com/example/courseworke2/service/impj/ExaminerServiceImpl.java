package com.example.courseworke2.service.impj;

import com.example.courseworke2.exception.NotEnoughQuestionsException;
import com.example.courseworke2.model.Question;
import com.example.courseworke2.service.ExaminerService;
import com.example.courseworke2.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()){
throw new NotEnoughQuestionsException();
        }
        return Stream.generate(questionService::getRandomQuestion)
                .distinct()
                .limit(amount)
                .collect(Collectors.toList());
    }
}
