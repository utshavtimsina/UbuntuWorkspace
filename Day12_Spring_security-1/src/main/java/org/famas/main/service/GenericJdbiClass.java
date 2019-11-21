package org.famas.main.service;

import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class GenericJdbiClass<T> {
	Jdbi jdbi;
	private final Logger log = LoggerFactory.getLogger(GenericJdbiClass.class);
	//FormRepo repo;
	public GenericJdbiClass(Jdbi jdbi) {
		this.jdbi = jdbi;
	}
	
	public T getJdbiObject(Class<T> repoClass) {
		return jdbi.onDemand(repoClass);
		
	}
	/*
	 * public T getDaoClass(Class<T> daoClass) { try { if(jdbi != null) { return
	 * jdbi.onDemand(daoClass); }
	 * 
	 * throw new NullPointerException("jdbi object isnot initialized..."); }
	 * catch(Exception ex) { log.info(ex.getMessage()); } return null; }
	 */
}
