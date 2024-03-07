package com.example.ContactMicroserviceFeign.Controller;

import com.example.ContactMicroserviceFeign.IPersonFeign;
import com.example.ContactMicroserviceFeign.Model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final IPersonFeign personFeign;

    public PersonController(IPersonFeign personFeign) {
        this.personFeign = personFeign;
    }

    @PostMapping(value = "person/{name}/{email}/{age}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> addPerson(@PathVariable(name = "name") String name,
                                  @PathVariable(name = "email") String email,
                                  @PathVariable(name = "age") int age){
        Person person = new Person(name, email, age);
        personFeign.addPerson(person);
        return personFeign.getPeople();
    }

    @GetMapping(value = "person", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getPeople(){
        return personFeign.getPeople();
    }
}
