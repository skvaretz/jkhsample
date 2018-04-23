package ru.itpark.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itpark.entity.IndicatorEntity;
import ru.itpark.entity.Lead;
import ru.itpark.entity.TenantEntity;
import ru.itpark.repository.IndicatorRepository;
import ru.itpark.repository.TenantRepository;
import ru.itpark.service.IndicatorService;
import ru.itpark.service.TenantService;

import java.util.List;

/**
 * Created by alexander.skvortsov on 09.08.2017.
 */@RestController
   @CrossOrigin
   @RequestMapping("/tenants")
   @Api(description = "Work with tenants")

public class TenantController {

    private final TenantRepository repository;
    private final TenantService service;



    public TenantController(TenantRepository repository, TenantService service) {
        this.repository = repository;
        this.service = service;
    }

    @ApiOperation(value = "Find Tenant about FIODR", notes = "Find Tenant about id")
    @RequestMapping(path = "/tenant/{id}", method = RequestMethod.GET)
    public Object[] jpql5(@RequestParam Long id) {
        return repository.jpql5(id);
    }

    @ApiOperation(value = "Find Tenant about FIODR", notes = "Find Tenant about id")
    @RequestMapping(path = "/tenant2/{id}", method = RequestMethod.GET)
    public Object[] jpql6(@RequestParam String fiodr) {
        return repository.jpql6(fiodr);
    }


    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody TenantEntity tenantEntity) {service.save(tenantEntity);
    }


}
