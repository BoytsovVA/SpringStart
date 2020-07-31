package com.springboot.h2.model;

import java.util.List;

public class PersonViewBean {
    private Person person;
    private String nameQuery;
    private String delQuery;
    private List<Person> personList;

    public String getDelQuery() {
        return delQuery;
    }

    public void setDelQuery(String delQuery) {
        this.delQuery = delQuery;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNameQuery() {
        return nameQuery;
    }

    public void setNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
