package com.guzman.beginnerboot.api;

import com.guzman.beginnerboot.model.Person;
import com.guzman.beginnerboot.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
