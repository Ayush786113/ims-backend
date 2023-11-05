package com.ims.policy;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.util.*;

@Component
public class MockDataFactory {
    private List<Policy> policies;
    public List<Policy> getPolicies() {
        if(policies != null)
            return policies;
        policies = new LinkedList<>();
        Scanner sc;
        String [] data;
        try{
            sc = new Scanner(new FileReader("src/main/java/com/ims/policy/inte.csv"));
            while(sc.hasNextLine()){
                data = sc.nextLine().split(",");
                policies.add(new Policy(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])));
            }
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return policies;
    }
}
