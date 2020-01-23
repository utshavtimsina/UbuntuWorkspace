package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import com.example.demo.securityconfigs.CustomUserDetails;

public class UserToRoleMapper implements RowMapper<CustomUserDetails> {

	public CustomUserDetails map(ResultSet rs, StatementContext ctx) throws SQLException {
		// TODO Auto-generated method stub
		CustomUserDetails userDetails = new CustomUserDetails();
		while(rs.next()) {
			
		}
		return userDetails;
	}

}
