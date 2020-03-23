package com.guzman.beginnerboot.dao;

import com.guzman.beginnerboot.model.Person;

import java.util.UUID;

public interface PersonDao {
    Integer insert(UUID id, Person person);

    default Integer insert(Person person) {
        UUID id = UUID.randomUUID();
        return insert(id, person);
    }
}
