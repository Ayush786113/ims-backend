package com.ims.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
    private String policyID, policyName;
    private int policyInvestment, policyReturn;
    private ArrayList<Beneficiary> beneficiaries;
    public static Comparator<Policy> getComparator(int field, int order){
        switch (field){
            case 0 -> {
                if(order == 1){
                    return new Comparator<Policy>() {
                        @Override
                        public int compare(Policy policy, Policy t1) {
                            return t1.getPolicyID().compareTo(policy.getPolicyID());
                        }
                    };
                }
                return new Comparator<Policy>() {
                    @Override
                    public int compare(Policy policy, Policy t1) {
                        return policy.getPolicyID().compareTo(t1.getPolicyID());
                    }
                };
            }
            case 1 -> {
                if(order == 1){
                    return new Comparator<Policy>() {
                        @Override
                        public int compare(Policy policy, Policy t1) {
                            return t1.getPolicyName().compareTo(policy.getPolicyName());
                        }
                    };
                }
                return new Comparator<Policy>() {
                    @Override
                    public int compare(Policy policy, Policy t1) {
                        return policy.getPolicyName().compareTo(t1.getPolicyName());
                    }
                };
            }
            case 2 -> {
                if(order == 1){
                    return new Comparator<Policy>() {
                        @Override
                        public int compare(Policy policy, Policy t1) {
                            return t1.getPolicyInvestment() - policy.getPolicyInvestment();
                        }
                    };
                }
                return new Comparator<Policy>() {
                    @Override
                    public int compare(Policy policy, Policy t1) {
                        return policy.getPolicyInvestment() - t1.getPolicyInvestment();
                    }
                };
            }
            case 3 -> {
                if(order == 1){
                    return new Comparator<Policy>() {
                        @Override
                        public int compare(Policy policy, Policy t1) {
                            return t1.getPolicyReturn() - policy.getPolicyReturn();
                        }
                    };
                }
                return new Comparator<Policy>() {
                    @Override
                    public int compare(Policy policy, Policy t1) {
                        return policy.getPolicyReturn() - t1.getPolicyReturn();
                    }
                };
            }
        }
        return new Comparator<Policy>() {
            @Override
            public int compare(Policy policy, Policy t1) {
                return policy.getPolicyID().compareTo(t1.getPolicyID());
            }
        };
    }
}
