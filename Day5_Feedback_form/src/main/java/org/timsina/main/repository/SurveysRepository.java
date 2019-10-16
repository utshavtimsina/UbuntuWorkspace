package org.timsina.main.repository;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.timsina.main.model.Surveys;

@Repository
public interface SurveysRepository extends CrudRepository<Surveys, Integer>{

	public Optional<Surveys> findByuId(int id);

}
