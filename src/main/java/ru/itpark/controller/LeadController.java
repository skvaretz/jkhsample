package ru.itpark.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itpark.entity.Lead;
import ru.itpark.service.LeadService;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by Student21 on 19.06.2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/leads")
@Api(description = "Work with leads")
public class LeadController {
    private final LeadService service;

    @Autowired
    public LeadController(LeadService service) {
        this.service = service;
    }

    // GET
    @ApiOperation(value = "Get all", notes = "Get all leads from DB")
    @RequestMapping(method = RequestMethod.GET)
    public List<Lead> getAll() {
        return service.findAll();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Lead get(@PathVariable long id) {
        return service.findOne(id);
    }

    /**
     * Ищем по началу имени или по подстроке в email (игнорируем регистр)
     *
     * Пример запроса: /leads/search?text=<some text>
     *
     * @param text
     * @return
     */
    @RequestMapping(path = "/search", params = {"text"}, method = RequestMethod.GET)
    public List<Lead> searchEveryWhere(@RequestParam String text) {
        System.out.println("search every where");
        return service.searchEveryWhere(text);
    }


    /**
     * Ищем по началу имени (игнорируем регистр), т.к. когда ищут по имени, обычно печатают начало имени
     *
     * Пример запроса: /leads/search?name=<some text>
     *
     * @param name
     * @return
     */
    @RequestMapping(path = "/searchByName", params = {"name"}, method = RequestMethod.GET)
    public List<Lead> searchByName(@RequestParam String name) {
        System.out.println("search by name");
        return service.searchByName(name);
    }

    /**
     * Ищем по началу телефона
     *
     * Пример запроса: /leads/search?phone=<some text>
     *
     * @param phone
     * @return
     */
    @RequestMapping(path = "/searchByPhone", params = {"phone"}, method = RequestMethod.GET)
    public List<Lead> searchByPhone(@RequestParam String phone) {
        System.out.println("search by phone");
        return service.searchByPhone(phone);
    }

    /**
     * Ищем по подстроке в email
     *
     * Пример запроса: /leads/search?email=<some text>
     *
     * @param email
     * @return
     */
    @RequestMapping(path = "/searchByEmail", params = {"email"}, method = RequestMethod.GET)
    public List<Lead> searchByEmail(@RequestParam String email) {
        System.out.println("search by email");
        return service.searchByEmail(email);
    }

    // POST
    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Lead lead) {
        service.save(lead);
    }

    // DELETE
    // /leads/:id -> id
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        service.delete(id);
    }
}