package com.example.demo.person;

import java.util.Collection;

public interface PersonService {
    PersonDto create(PersonDto personDto);
    PersonDto update(PersonDto personDto);
    void remove(PersonDto personDto);
    Collection<PersonDto> showAll();
}
