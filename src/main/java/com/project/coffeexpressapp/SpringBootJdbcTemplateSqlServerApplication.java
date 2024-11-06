package com.project.coffeexpressapp;

import com.project.coffeexpressapp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcTemplateSqlServerApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcTemplateSqlServerApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        String sql = "SELECT * FROM Users";
        List<Users> users = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Users.class));
        users.forEach(System.out :: println);
    }


}
