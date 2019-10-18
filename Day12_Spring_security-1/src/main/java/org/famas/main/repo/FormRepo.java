package org.famas.main.repo;

import java.util.List;

import org.famas.main.model.Answer;
import org.famas.main.model.Question;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface FormRepo {
	@SqlQuery("SELECT * FROM question q")
	@RegisterBeanMapper(Question.class)
	public List<Question> getQuestionAnswer();
	
	@SqlQuery("SELECT * FROM answer WHERE question_q_id = :qId")
	@RegisterBeanMapper(Answer.class)
	public List<Answer> getAnswerById(@Bind int qId );
}
