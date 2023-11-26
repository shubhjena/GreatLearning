package mapper;

import constants.EntityConstants;
import models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getLong(EntityConstants.PersonEntity.id));
        person.setFirstName(resultSet.getString(EntityConstants.PersonEntity.firstName));
        person.setLastName(resultSet.getString(EntityConstants.PersonEntity.lastName));
        person.setAge(resultSet.getInt(EntityConstants.PersonEntity.age));
        return person;
    }
}
