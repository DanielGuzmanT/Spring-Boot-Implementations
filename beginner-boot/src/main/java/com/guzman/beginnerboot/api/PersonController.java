package com.guzman.beginnerboot.api;

import com.guzman.beginnerboot.model.Person;
import com.guzman.beginnerboot.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
