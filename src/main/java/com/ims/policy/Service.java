package com.ims.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private MockDataFactory mockDataFactory;
    public List<Policy> getPolicies(){
        return mockDataFactory.getPolicies();
    }
    public List<Policy> getPolicies(int field, int order){
        List<Policy> policies = mockDataFactory.getPolicies();
        policies.sort(Policy.getComparator(field, order));
        return policies;
    }
    public List<Policy> getPolicies(String [] ids){
        List<Policy> policies = mockDataFactory.getPolicies();
        return policies.stream()
                .filter(new Predicate<Policy>() {
                    @Override
                    public boolean test(Policy policy) {
                        for(String id : ids)
                            if(policy.getPolicyID().equalsIgnoreCase(id))
                                return true;
                        return false;
                    }
                })
                .sorted(new Comparator<Policy>() {
                    @Override
                    public int compare(Policy policy, Policy t1) {
                        return (t1.getPolicyReturn() - t1.getPolicyInvestment()) - (policy.getPolicyReturn() - policy.getPolicyInvestment());
                    }
                }).collect(Collectors.toList());
    }
    public float getEMI(Map<String, Object> data){
        int downpayment = (int) data.get("downpayment");
        int months = (int) data.get("months");
        Policy policy = null;
        do{
            for(Policy policy1 : mockDataFactory.getPolicies()){
                if(policy1.getPolicyID().equals(data.get("id"))){
                    policy = policy1;
                    break;
                }
            }
        } while (policy == null);
        float emi = (float) (policy.getPolicyInvestment() - downpayment) /months;
        return emi;
    }
    public Beneficiary createBeneficiary(String ppolicyID, Beneficiary beneficiary){
        List<Policy> policies = mockDataFactory.getPolicies();
        for(Policy policy : policies){
            if(policy.getPolicyID().equals(ppolicyID)){
                ArrayList<Beneficiary> beneficiaries = policy.getBeneficiaries();
                beneficiaries.add(beneficiary);
                policy.setBeneficiaries(beneficiaries);
                break;
            }
        }
        return beneficiary;
    }
    public Policy getPolicy(String policyID){
        List<Policy> policies = mockDataFactory.getPolicies();
        for(Policy policy : policies){
            if(policy.getPolicyID().equals(policyID))
                return policy;
        }
        return null;
    }
}
