package com.example.demo.repository;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import com.example.demo.Dto.User;
import com.example.demo.securityconfigs.CustomUserDetails;

public interface MsSqlRepository {
	
	@SqlQuery("SELECT * FROM DeveloperTest.dbo.Users")
	@RegisterBeanMapper(User.class)
	public User getAllUsers();
	
	@SqlQuery("SELECT * FROM DeveloperTest.dbo.Users u, DeveloperTest.dbo.ROLES r  WHERE u.user_name = :username")
	@RegisterRowMapper(UserToRoleMapper.class)
	public CustomUserDetails loadUserByUsername(String username);


}
