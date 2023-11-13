package com.ims.policy;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    @GetMapping(value = "/tc", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<Object> getTC(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/com/ims/policy/tc.pdf")));
            System.out.println(bufferedReader.readLine());
            System.exit(0);
            Path path = Paths.get(getClass().getResource("tc.pdf").toURI());
            ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
            return new ResponseEntity<>(resource, HttpStatus.OK);
        } catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.OK);
        }
    }
    @PostMapping(value = "/{id}")
    public ResponseEntity<Object> createBeneficiary(@PathVariable("id") String policyID, @RequestBody Beneficiary beneficiary){
        return new ResponseEntity<>(service.createBeneficiary(policyID, beneficiary), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getBeneficiaries(@PathVariable("id") String policyID){
        return new ResponseEntity<>(service.getBeneficiaries(policyID), HttpStatus.OK);
    }
}
