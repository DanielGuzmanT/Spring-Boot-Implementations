package com.guzman.beginnerboot.api;

import com.guzman.beginnerboot.model.Person;
import com.guzman.beginnerboot.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value="api/v1/people")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping(value="{id}")
    public Person getPersonById(@PathVariable UUID id) {
        return this.personService.getPersonById(id).orElse(null);
    }

    @PutMapping(value="{id}")
    public Boolean updatePersonById(@PathVariable UUID id, @RequestBody Person person) {
        return this.personService.updatePersonaById(id, person);
    }

    @DeleteMapping(value="{id}")
    public Boolean removePersonById(@PathVariable UUID id) {
        return this.personService.removePersonById(id);
    }
}
