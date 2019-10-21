package org.famas.main.repo;

import java.util.List;
import java.util.Optional;

import org.famas.main.model.Answer;
import org.famas.main.model.Question;
import org.famas.main.model.SurveyAnswer;
import org.famas.main.model.Surveys;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface FormRepo {
	@SqlQuery("SELECT * FROM question q")
	@RegisterBeanMapper(Question.class)
	public List<Question> getQuestionAnswer();
	
	@SqlQuery("SELECT MAX(q_id) q_id FROM question ")
	@RegisterBeanMapper(Integer.class)
	public int getMaxQuestionId();
	
	@SqlQuery("SELECT * FROM answer WHERE question_q_id = :qId")
	@RegisterBeanMapper(Answer.class)
	public List<Answer> getAnswerById(@Bind int qId );
	
	@SqlUpdate("INSERT INTO question(q_id,q_description,q_name,q_remarks,a_type) VALUES (:qId,:qDescription,:qName,:qRemarks,:aType)")
	public void saveQuestion(@BindBean Question question);
	
	@SqlUpdate("INSERT INTO answer(a_description,a_name,question_q_id) VALUES(:aDescription,:aName,:qId)")
	public void saveAnswer(@BindBean Answer answer,@Bind int qId);
	
	@SqlQuery("SELECT * FROM surveys WHERE u_id = :id")
	@RegisterBeanMapper(Surveys.class)
	public Surveys findByuId(@Bind int id);
	
	@SqlUpdate("INSERT INTO survey_answer(a_id,q_id,remarks,survey_s_id) VALUES (:aId,:qId,:remarks,:id)")
	public void saveUserSurveyAnswer(@BindBean SurveyAnswer s,@Bind int id);
	
}
