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
        policies.add(new Policy("c0a75299-3c7b-4ce9-8904-510f97674aca", "HEALTH INSURANCE", 158066, 213266, new ArrayList<Beneficiary>()));
        policies.add(new Policy("64606fd3-d154-47ba-bf44-d3e415893d61", "LIFE INSURANCE", 112470, 206705, new ArrayList<Beneficiary>()));
        policies.add(new Policy("4e8c2a97-5dc1-462d-a924-a72afc5885a0", "HOME INSURANCE", 100473, 215106, new ArrayList<Beneficiary>()));
        policies.add(new Policy("cc07380e-908f-42ee-84bc-fe3c3d9b6932", "TRAVEL INSURANCE", 149451, 201260, new ArrayList<Beneficiary>()));
        policies.add(new Policy("05e45b1e-9a04-456b-857f-a000b3c50d74", "DISABILITY INSURANCE", 129712, 249063, new ArrayList<Beneficiary>()));
        policies.add(new Policy("1b48a848-0444-40ce-8c3b-6c3da3966253", "DENTAL INSURANCE", 150876, 245127, new ArrayList<Beneficiary>()));
        policies.add(new Policy("a12a3ac9-17f2-47be-9139-5ae9c05407d6", "VISION INSURANCE", 120629, 251971, new ArrayList<Beneficiary>()));
        policies.add(new Policy("092d8904-863c-46e8-a4cb-31348cfa67fe", "PET INSURANCE", 154053, 211047, new ArrayList<Beneficiary>()));
        policies.add(new Policy("62d0f2d3-f0c2-4bd9-b6b2-04c85c2e4581", "MOTORCYCLE INSURANCE", 138730, 266766, new ArrayList<Beneficiary>()));
        policies.add(new Policy("cfd2c828-54b8-41f2-9196-1f805aeba903", "RENTERS INSURANCE", 170440, 298760, new ArrayList<Beneficiary>()));
        policies.add(new Policy("af9a64d4-53c0-4e5d-8aab-0e2d67725c58", "LONG-TERM CARE INSURANCE", 123636, 255214, new ArrayList<Beneficiary>()));
        policies.add(new Policy("7981c54f-204e-4466-9869-d69c8aba1985", "CRITICAL ILLNESS INSURANCE", 154512, 246493, new ArrayList<Beneficiary>()));
        policies.add(new Policy("d36a6408-62eb-412b-a6b6-ecbb10efb959", "BUSINESS INSURANCE", 123010, 274085, new ArrayList<Beneficiary>()));
        policies.add(new Policy("246bf7dd-17ca-46d1-ad59-18e38dca636d", "LIABILITY INSURANCE", 181650, 283828, new ArrayList<Beneficiary>()));
        policies.add(new Policy("1f84573d-9694-4c2b-9ad2-0b6f056941f8", "UMBRELLA INSURANCE", 101876, 253278, new ArrayList<Beneficiary>()));
        policies.add(new Policy("70a6dd4e-9f16-4d52-8e04-89b24ae4c9e2", "WORKERS' COMPENSATION INSURANCE", 150662, 200085, new ArrayList<Beneficiary>()));
        policies.add(new Policy("98b7f7cf-2859-409a-8438-8b0e1107cd14", "BOAT INSURANCE", 197182, 200988, new ArrayList<Beneficiary>()));
        policies.add(new Policy("6a322911-a5e6-461f-83d9-9d2bd93ae1ec", "FLOOD INSURANCE", 197116, 280730, new ArrayList<Beneficiary>()));
        policies.add(new Policy("4611d6f0-0eca-4147-92d8-e48ea5314a0b", "CYBER INSURANCE", 123518, 229119, new ArrayList<Beneficiary>()));
        policies.add(new Policy("c13d091d-e03c-41b2-8d57-383b4a6873cc", "PROFESSIONAL LIABILITY INSURANCE", 130621, 231678, new ArrayList<Beneficiary>()));
        policies.add(new Policy("ece6dd80-2465-42cc-8f96-c5847b3c49e5", "TITLE INSURANCE", 124549, 236081, new ArrayList<Beneficiary>()));
        policies.add(new Policy("87e8d22a-56fb-4456-868e-1fe253e12503", "EMPLOYMENT PRACTICES LIABILITY INSURANCE (EPLI)", 138652, 203932, new ArrayList<Beneficiary>()));
        policies.add(new Policy("0335ad78-0247-428f-a052-8ee6abc7a25b", "DIRECTORS AND OFFICERS (D&O) INSURANCE", 113721, 219366, new ArrayList<Beneficiary>()));
        policies.add(new Policy("94bd0a44-2387-4db5-a61d-7f304def7ccd", "KIDNAP AND RANSOM INSURANCE", 160614, 223867, new ArrayList<Beneficiary>()));
        policies.add(new Policy("beb9f71f-580a-4111-bca7-1725fa6a31cd", "AUTO INSURANCE", 133015, 254238, new ArrayList<Beneficiary>()));
        return policies;
    }
}
