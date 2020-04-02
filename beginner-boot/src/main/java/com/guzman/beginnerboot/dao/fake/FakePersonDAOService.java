package com.guzman.beginnerboot.dao.fake;

import com.guzman.beginnerboot.dao.PersonDao;
import com.guzman.beginnerboot.model.Person;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FakePersonDAOService implements PersonDao {

    private static Map<UUID, Person> DB = new HashMap<>();
    @Override
    public Integer insert(UUID id, Person person) {
        person.setId(id);
        DB.put(id, person);
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.copyOf(DB.values());
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.of(DB.get(id));
    }

    @Override
    public Boolean deletePersonById(UUID id) {
        Boolean removed = DB.containsKey(id);
        DB.remove(id);
        return removed;
    }

    @Override
    public Boolean updatePersonById(UUID id, Person person) {
        Boolean updated = DB.containsKey(id);
        DB.put(id, person);
        return updated;
    }
}
