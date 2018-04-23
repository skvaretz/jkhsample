package ru.itpark.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.entity.FlatEntity;
import ru.itpark.entity.MeterEntity;
import ru.itpark.service.FlatService;
import ru.itpark.service.MeterService;

import java.util.List;

/**
 * Created by alexander.skvortsov on 07.08.2017.
 */
@RestController
@CrossOrigin
@RequestMapping("/meters")
@Api(description = "Work with meters")
public class MeterController {

    private final MeterService service;

    @Autowired
    public MeterController(MeterService service) {
        this.service = service;
    }

    // GET
    @ApiOperation(value = "Get all", notes = "Get all meters from DB")
    @RequestMapping(method = RequestMethod.GET)
    public List<MeterEntity> getAll() {
        return service.findAll();
    }
}
