package com.SpringStart.Controller.services;

import com.SpringStart.Controller.dao.PersonRepository;
import com.SpringStart.Controller.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person findPerson(String name) {
        List<Person> personList = personRepository.findByName(name);
        return personList.isEmpty() ? null:personList.get(0);
    }
}
