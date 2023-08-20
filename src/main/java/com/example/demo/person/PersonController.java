package com.example.demo.person;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/person")
public class PersonController {

   private final PersonService personService;
   @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping("/create")
    public ResponseEntity<PersonDto> create(@RequestBody PersonDto personDto){
       return new ResponseEntity<>(personService.create(personDto),HttpStatus.ACCEPTED) ;
    }

    @PostMapping("/findAll")
    public ResponseEntity<Collection<PersonDto>> showAll(){
        return new ResponseEntity<>(personService.showAll(),HttpStatus.ACCEPTED) ;
    }
}
