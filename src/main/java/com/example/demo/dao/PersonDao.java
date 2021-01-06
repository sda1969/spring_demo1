package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    List<Person> getAllPersons();

    default int insertPerson(Person person){
        UUID uuid = UUID.randomUUID();
        return insertPerson(uuid, person);
    }
}
