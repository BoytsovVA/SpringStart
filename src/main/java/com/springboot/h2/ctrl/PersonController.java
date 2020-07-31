package com.springboot.h2.ctrl;

import com.springboot.h2.model.Person;
import com.springboot.h2.model.PersonViewBean;
import com.springboot.h2.serv.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    PersonViewBean personViewBean;

    @RequestMapping("index")
    public String index(Model model) {
        if (personViewBean.getPerson() == null) {
            personViewBean.setPerson(new Person());
        }
        if (personViewBean.getNameQuery() == null || personViewBean.getNameQuery().isEmpty()) {
            personViewBean.setPersonList(personService.getAll());
        } else {
            personViewBean.setPersonList(personService.findPerson(personViewBean.getNameQuery()));
        }
        model.addAttribute("personviewbean", personViewBean);
        return "person";
    }

    @RequestMapping("search")
    public String search(@RequestParam(name = "searchquery") String searchquery) {
        personViewBean.setNameQuery(searchquery);
        return "redirect:/index";
    }

    @RequestMapping("save")
    public String save(@RequestParam(name = "id", required = false) Long id,
                       @RequestParam(name = "name", required = false, defaultValue = "test") String name,
                       @RequestParam(name = "age", required = false, defaultValue = "0") Integer age) {
        personViewBean.setPerson(new Person(name, age));
        personService.savePerson(personViewBean.getPerson());
        return "redirect:/index";
    }

    @RequestMapping("getall")
    public String getAll(Model model) {
        List<Person> personList = personService.getAll();
        personViewBean.setPersonList(personList);
        return "redirect:/index";
    }

    @RequestMapping("delete")
    public String delete(@RequestParam(name = "deletequery") String deletequery) {
        personService.deletePerson(deletequery);
        return "redirect:/index";
    }
}
