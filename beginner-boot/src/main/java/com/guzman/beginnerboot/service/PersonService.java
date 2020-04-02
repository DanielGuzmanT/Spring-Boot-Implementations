package com.guzman.beginnerboot.service;

import com.guzman.beginnerboot.dao.PersonDao;
import com.guzman.beginnerboot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public Integer addPerson(Person person) {
        return personDao.insert(person);
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return this.personDao.selectPersonById(id);
    }

    public Boolean removePersonById(UUID id) {
        return this.personDao.deletePersonById(id);
    }

    public Boolean updatePersonaById(UUID id, Person person) {
        return this.personDao.updatePersonById(id, person);
    }
}
