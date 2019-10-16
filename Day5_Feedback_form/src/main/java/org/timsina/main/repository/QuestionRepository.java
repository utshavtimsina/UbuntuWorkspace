package org.timsina.main.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.timsina.main.model.Question;
@Repository
public interface QuestionRepository extends CrudRepository<Question,Integer>{

	
}
