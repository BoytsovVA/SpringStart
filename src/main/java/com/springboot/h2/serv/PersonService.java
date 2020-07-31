package com.springboot.h2.serv;

import com.springboot.h2.model.Person;
import com.springboot.h2.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService{
    @Autowired
    PersonRepository personRepository;

    public List<Person> findPerson(String name) {
        List<Person> personList = personRepository.findByName(name);
        return personList;
    }
    public List<Person> getAll() {
        final List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(person -> personList.add(person));
        return personList;
    }
    public void savePerson(Person person) {
        personRepository.save(person);
    }
    @Transactional
    public void deletePerson(String name) {
        personRepository.deleteByName(name);
    }
}

