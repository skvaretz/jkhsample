package ru.itpark.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itpark.entity.IndicatorEntity;
import ru.itpark.service.IndicatorService;
import ru.itpark.repository.IndicatorRepository;

import java.util.List;

/**
 * Created by alexander.skvortsov on 07.08.2017.
 */
@RestController
@CrossOrigin
@RequestMapping("/indicators")
@Api(description = "Work with indicators")
public class IndicatorController {

    private final IndicatorRepository repository;
    private final IndicatorService service;

    @Autowired
    public IndicatorController(IndicatorRepository repository, IndicatorService service) {
        this.repository = repository;
        this.service = service;
    }

    // GET
    @ApiOperation(value = "Get all", notes = "Get all indicators from DB")
    @RequestMapping(method = RequestMethod.GET)
    public List<IndicatorEntity> findAll() {
        return IndicatorService.findAll();
     /*
    public List<Object[]> jpql4() {
        return repository.jpql4();
        */
    }

    @ApiOperation(value = "Get all info about one indicator", notes = "Fully info about one indicator")
    @RequestMapping(path = "/indicator/{id}", method = RequestMethod.GET)
    public Object[] jpql8(@RequestParam Long id) {
        return repository.jpql8(id);
    }




    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public IndicatorEntity get(@PathVariable long id) {
        return service.findOne(id);
    }


    /*

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public IndicatorEntity get(@PathVariable long id) {
        return service.findOne(id);
    }







    @RequestMapping(path = "/3", method = RequestMethod.GET)
    public List<Object[]> jpql3() {
        return repository.jpql3();
    }


    @RequestMapping(path = "/4", method = RequestMethod.GET)
    public List<Object[]> jpql4() {
        return repository.jpql4();
    }

    */


    // POST
    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody IndicatorEntity indicator) {service.save(indicator);
    }






    // DELETE
    // /indicators/:id -> id
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        service.delete(id);
    }
}



