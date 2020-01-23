package com.example.demo.configuration;


import javax.sql.DataSource;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class DatasourceConfig{
	@Bean
	public DataSource dataSource() { 
		DataSourceBuilder dataSourceBuilder =  DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSourceBuilder.url("jdbc:sqlserver://192.168.0.116;DeveloperTest=HTSdb");
		dataSourceBuilder.username("sa");
		dataSourceBuilder.password("CBFE_Admin_123");	
		return  dataSourceBuilder.build();
	}
	@Bean
	
	Jdbi jdbiConfig(DataSource dataSource) {
		Jdbi jdbi = Jdbi.create(dataSource);
		jdbi.installPlugin(new SqlObjectPlugin());
		return jdbi;
	}
}
