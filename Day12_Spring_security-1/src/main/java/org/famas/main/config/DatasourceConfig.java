package org.famas.main.config;



import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {
	@Bean
	public DataSource dataSource() { 
		DataSourceBuilder dataSourceBuilder =  DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
		dataSourceBuilder.url("jdbc:mysql://localhost:3306/test?autoreconnect=true");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("");
		return dataSourceBuilder.build();
	}
}
