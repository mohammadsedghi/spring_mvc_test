package com.example.demo.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.Collection;

@Service
@Transactional
@Validated
public class PersonServiceImpl implements PersonService{
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;
@Autowired
    public PersonServiceImpl(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
    this.personMapper = personMapper;
}

    @Override
    public PersonDto create(PersonDto personDto) {
        return personMapper.convertEntityToDto(personRepository.save(personMapper.convertDtoToEntity(personDto)));
    }

    @Override
    public PersonDto update(PersonDto personDto) {
        return personMapper.convertEntityToDto(personRepository.save(personMapper.convertDtoToEntity(personDto)));

    }

    @Override
    public void remove(PersonDto personDto) {
     personRepository.delete(personMapper.convertDtoToEntity(personDto));

    }

    @Override
    public Collection<PersonDto> showAll() {
        return personMapper.convertEntityToDto(personRepository.findAll());
    }
}
