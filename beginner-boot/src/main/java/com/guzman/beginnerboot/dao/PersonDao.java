package com.guzman.beginnerboot.dao;

import com.guzman.beginnerboot.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    Integer insert(UUID id, Person person);

    default Integer insert(Person person) {
        UUID id = UUID.randomUUID();
        return insert(id, person);
    }

    List<Person> selectAllPeople();
    Optional<Person> selectPersonById(UUID id);
    Boolean deletePersonById(UUID id);
    Boolean updatePersonById(UUID id, Person person);
}
