package dao;

import mapper.PersonMapper;
import models.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class PersonDaoImpl implements PersonDao {
    JdbcTemplate jdbcTemplate;

    PersonDaoImpl(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public Person getPersonById(Long id) {
        return jdbcTemplate.queryForObject("Select * from person where id = ?",new Object[]{id}, new PersonMapper());
    }

    @Override
    public Person create(Person person) {
        return null;
    }
}
