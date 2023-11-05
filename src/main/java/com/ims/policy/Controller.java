package com.ims.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(value = "*")
public class Controller {
    @Autowired
    private Service service;
    @GetMapping
    public ResponseEntity<Object> getPolicies(){
        return new ResponseEntity<>(service.getPolicies(), HttpStatus.OK);
    }
    @GetMapping(params = {"field", "order"})
    public ResponseEntity<Object> getPolicies(@RequestParam int field, @RequestParam int order){
        return new ResponseEntity<>(service.getPolicies(field, order), HttpStatus.OK);
    }
    @PostMapping("/compare")
    public ResponseEntity<Object> comparePolicies(@RequestBody String [] ids){
        return new ResponseEntity<>(service.getPolicies(ids), HttpStatus.OK);
    }
    @PostMapping("/underwriting")
    public ResponseEntity<Object> getEMI(@RequestBody Map<String, Object> data){
        return new ResponseEntity<>(service.getEMI(data), HttpStatus.OK);
    }
}
