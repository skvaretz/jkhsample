package ru.itpark.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.entity.FlatEntity;
import ru.itpark.entity.Lead;
import ru.itpark.service.FlatService;
import ru.itpark.service.LeadService;

import java.util.List;

/**
 * Created by alexander.skvortsov on 06.08.2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/flats")
@Api(description = "Work with flats")
public class FlatController {

    private final FlatService service;

    @Autowired
    public FlatController(FlatService service) {
        this.service = service;
    }

    // GET
    @ApiOperation(value = "Get all", notes = "Get all flats from DB")
    @RequestMapping(method = RequestMethod.GET)
    public List<FlatEntity> getAll() {
        return service.findAll();
    }

}
