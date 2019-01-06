package com.kennyzx.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    class StudentRowMapper implements RowMapper<Student> {
        @Override 
        public Student mapRow(ResultSet rs, int rowNum)
        throws SQLException {
            Student student = new Student();
            student.setId(rs.getLong("id"));            
            student.setName(rs.getString("name"));      
            student.setPassport(rs.getString("passport_number"));
            return student;      
        }
    }
    
    public List<Student> findAll() {
        return jdbcTemplate.query("select * from student", 
            new StudentRowMapper());
    }
}
