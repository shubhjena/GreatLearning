package dao;

import models.Person;

public interface PersonDao {
    public abstract Person getPersonById(Long id);
    public abstract Person create(Person person);
}
