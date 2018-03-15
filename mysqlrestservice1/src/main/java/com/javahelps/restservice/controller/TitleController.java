package com.javahelps.restservice.controller;


import com.javahelps.restservice.entity.Title;
import com.javahelps.restservice.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class TitleController {

    @Autowired
    private TitleRepository titleRepository;

    @GetMapping(value = "/titles")
    public ResponseEntity<Iterable<Title>> getAll() {
        return new ResponseEntity<>(titleRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/titles")
    public ResponseEntity<Title> create( @Valid @RequestBody   Title t1) {
        titleRepository.save(t1);
        return new ResponseEntity<>(t1, HttpStatus.CREATED);
    }

    @PutMapping(value = "/titles/{id}")
    public ResponseEntity<Title> update(@PathVariable("id") Long id ,
                                           @Valid @RequestBody Title t1) {
        Title dbT1 = titleRepository.findOne(id);
        if (dbT1 == null) {
            return new ResponseEntity<Title>(HttpStatus.NOT_FOUND);
        }
        dbT1.setTitle(t1.getTitle());
        dbT1.setContent(t1.getContent());
        titleRepository.save(dbT1);
        return new ResponseEntity<Title>(dbT1, HttpStatus.OK);
    }

    @DeleteMapping(path = "/titles/{id}")
    public void delete(@PathVariable("id") Long id) {
        titleRepository.delete(id);
    }
}

