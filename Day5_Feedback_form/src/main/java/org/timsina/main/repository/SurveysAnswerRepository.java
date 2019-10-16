package org.timsina.main.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.timsina.main.model.SurveyAnswer;

@Repository
public interface SurveysAnswerRepository extends CrudRepository<SurveyAnswer, Integer>{

}
