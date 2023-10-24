package com.example.soapPhone.service;

import com.example.soapPhone.model.Person;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebService(
        serviceName = "Phone",
        portName = "PhoneDirectory",
        targetNamespace = "http://service.ws.sample/",
        endpointInterface = "com.example.soapPhone.service.PhoneService"
)
public class PhoneServiceImpl  implements PhoneService{
    HashMap<String, Set<String>> td =  new HashMap<>();

    @Override
    public void addRecord(String initials, String phone) {
        td.put(initials, Set.of(phone));
    }

    @Override
    public String getInitials(String phone) {
        return phone;
    }
    @Override
    public Set<String> getPhone(String initials){
        return td.get(initials);
    }

}
