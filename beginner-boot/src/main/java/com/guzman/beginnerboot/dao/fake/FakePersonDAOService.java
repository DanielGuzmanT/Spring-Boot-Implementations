package com.guzman.beginnerboot.dao.fake;

import com.guzman.beginnerboot.dao.PersonDao;
import com.guzman.beginnerboot.model.Person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class FakePersonDAOService implements PersonDao {

    private static Map<UUID, Person> DB = new HashMap<>();

    @Override
    public Integer insert(UUID id, Person person) {
        DB.put(id, person);
        return 1;
    }
}
