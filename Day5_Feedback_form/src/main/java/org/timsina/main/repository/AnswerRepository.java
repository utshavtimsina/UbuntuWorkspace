package org.timsina.main.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.timsina.main.model.Answer;
@Repository
public interface AnswerRepository extends CrudRepository<Answer,Integer> {

	

}
