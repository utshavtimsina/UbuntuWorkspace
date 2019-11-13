package org.famas.main.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.famas.main.model.Answer;
import org.famas.main.model.Question;
import org.famas.main.model.SurveyAnswer;
import org.famas.main.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Formatter {
	@Autowired
	FormService answerService;

	public Formatter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Object formatter(String formData) {
		SurveyAnswer answerGiven = null;
		if (formData.contains("&")) {
			String[] data = formData.split("&");
			for (int i = 0; i < data.length; i++) {
				String[] Values = data[i].split("=");
				// String[] Final = Values[0].split("c");
				answerGiven = new SurveyAnswer();
				answerGiven.setqId(Integer.parseInt(Values[0]));
				if (Values[1].contains("C")) {
					String[] datass = Values[1].split("C");
					answerGiven.setaId(Integer.parseInt(datass[1]));
					answerGiven.setSubQuestionId(Integer.parseInt(datass[0]));
				} else {
					answerGiven.setaId(Integer.parseInt(Values[1]));
				}
				answerService.saveUserSurveyAnswer(answerGiven);
				//return answerGiven;

			}
		} else {
			answerGiven = new SurveyAnswer();
			if (formData.contains("C")) {
				String[] Values = formData.split("=");
				answerGiven.setqId(Integer.parseInt(Values[0]));
				String[] datas = Values[1].split("C");
				answerGiven.setaId(Integer.parseInt(datas[1]));
				answerGiven.setSubQuestionId(Integer.parseInt(datas[0]));
				return answerService.saveUserSurveyAnswer(answerGiven);
			} else {
				String[] Values = formData.split("=");
				answerGiven.setqId(Integer.parseInt(Values[0]));
				answerGiven.setaId(Integer.parseInt(Values[1]));
				answerGiven.setSubQuestionId(0);
				return answerService.saveUserSurveyAnswer(answerGiven);
			}

			// return Values;
		}
		// */
		//return answerGiven;
		return "Save Success!!!";

	}

	//

}
