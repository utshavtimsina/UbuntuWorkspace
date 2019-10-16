package org.timsina.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.timsina.main.model.StudentDto;

@Repository
public interface StudentRepo extends CrudRepository<StudentDto,Integer> {
	

}
