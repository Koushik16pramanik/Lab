package com.SpringJdbc1;

import org.springframework.jdbc.core.JdbcTemplate;

public class DaoImpl implements Dao {

	private JdbcTemplate jdbcTemplate;
	public int insert (Student student) {
		String quare = "insert into Student (id,name,email,address,age) values(?,?,?,?,?)";
		int result = this.jdbcTemplate.update(quare);
		return result;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
}
}