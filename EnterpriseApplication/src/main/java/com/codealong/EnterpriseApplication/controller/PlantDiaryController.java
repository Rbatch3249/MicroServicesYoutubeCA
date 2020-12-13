package com.codealong.EnterpriseApplication.controller;

import com.codealong.EnterpriseApplication.model.Specimen;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *The controller for Plant Diary REST endpoints and web UI
 *<p>
 * This class handles the CURED operations for my plant diary speciment, via HTTPactions
 *</p>
 *<p>
 *This class also serves HTML based web pages, for UI interactions with plant specimens
 *</p>
@author Brandon Jones
 */


@Controller
public class PlantDiaryController {

    /**
     * Handle the / endpoint
     * @return
     */

    @RequestMapping("/")
    public String index() {
        return "start";
    }

    @GetMapping("/specimen")
    public ResponseEntity fetchAllSpecimens(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/specimen/{id}/")
    public ResponseEntity fetchAllSpecimensById(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Create a new speciment object, given the data provided
     *
     * Returns on of the following status codes:
     * 201: successfully created a new specimen.
     * 409: unable to create specimen, because it already exists.
     *
     * @param specimen
     * @return
     */



    @PostMapping(value = "/specimen", consumes = "application/json", produces = "application/json")
    public Specimen createSpecimen(@RequestBody Specimen specimen){
        return specimen;
    }

    @DeleteMapping("/specimen/{id}/")
    public ResponseEntity deleteSpecimen(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }
}
