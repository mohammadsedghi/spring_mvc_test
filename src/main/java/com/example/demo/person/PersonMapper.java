package com.example.demo.person;

import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper
public interface PersonMapper {
    Person convertDtoToEntity(PersonDto personDto);
    PersonDto convertEntityToDto(Person person);

    Collection<Person> convertDtoToEntity(Collection<PersonDto> personDtoCollection);
    Collection<PersonDto> convertEntityToDto(Collection<Person> personCollection);

}
