package com.springboot.h2.repo;

import com.springboot.h2.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByName(String name);

    Person findById(long Id);

    void deleteByName(String name);

}
