package com.example.ContactMicroserviceFeign;

import com.example.ContactMicroserviceFeign.Model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "contacts-service")
public interface IPersonFeign {

    @GetMapping(value = "contacts", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Person> getPeople();

    @PostMapping(value = "contacts", consumes = MediaType.APPLICATION_JSON_VALUE)
    void addPerson(@RequestBody Person person);
}
