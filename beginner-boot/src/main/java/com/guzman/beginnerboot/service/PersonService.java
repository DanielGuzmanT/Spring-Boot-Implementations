package com.guzman.beginnerboot.service;

import com.guzman.beginnerboot.dao.PersonDao;
import com.guzman.beginnerboot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
