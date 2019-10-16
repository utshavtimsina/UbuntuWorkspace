package org.famas.main.config;

import javax.sql.DataSource;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
import javax.sql.DataSource;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JDBIConfig {

	@Bean
	@Primary
	public DataSource dataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
		dataSourceBuilder.url("jdbc:mysql://localhost:3306/test?autoreconnect=true");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("");
		return dataSourceBuilder.build();
	}

	@Bean
	public Jdbi jdbiObject(DataSource dataSource) {
		Jdbi jdbi = Jdbi.create(dataSource);
		jdbi.installPlugin(new SqlObjectPlugin());
		return jdbi;
	}
}

*/

@Configuration
public class JDBIConfig {
	@Bean
	public DataSource dataSource() { 
		DataSourceBuilder dataSourceBuilder =  DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
		dataSourceBuilder.url("jdbc:mysql://localhost:3306/test?autoreconnect=true");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("");
		return dataSourceBuilder.build();
	}
	@Bean
	public Jdbi jdbiBean(DataSource dataSource) {
		Jdbi jdbi = Jdbi.create(dataSource);
		jdbi.installPlugin(new SqlObjectPlugin());
		return jdbi;
	}
}




