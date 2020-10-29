package pt.iade.HelloWordSpringBoot.controllers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.HelloWordSpringBoot.models.CurricularUnit;

@RestController
@RequestMapping(path = "/api/units")
public class UnitsController {
    private Logger logger = LoggerFactory.getLogger(GreeterController.class);

    private ArrayList<CurricularUnit> units = new ArrayList<CurricularUnit>();

    @PostMapping(path = "")
    public CurricularUnit saveUnit(@RequestBody CurricularUnit unit) {
        logger.info("Added unit " + unit.getName());
        units.add(unit);
        return unit;
    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CurricularUnit> getGreeting() {
    logger.info("Sending all units");
    return units;
    }

    // @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    // public String getGreeting(@PathVariable("id") int id) {
    // logger.info("Sending unit with id: " + id);
    // return "UNIT: " + id;
    // }

}