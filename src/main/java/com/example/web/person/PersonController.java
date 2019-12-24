package com.example.web.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    
    @RequestMapping("/")
    public String index() {
        Iterable<Person> all = personRepository.findAll();
        StringBuilder sb = new StringBuilder();
        all.forEach(p->sb.append(p.getName()+""));
        return sb.toString();
    }
}
