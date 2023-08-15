package com.example.demo.person;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@MappedSuperclass
public class BaseEntity <ID extends Serializable> implements Serializable {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    ID id;
}
