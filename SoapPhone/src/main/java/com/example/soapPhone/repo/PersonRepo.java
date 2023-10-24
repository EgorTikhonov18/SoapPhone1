package com.example.soapPhone.repo;

import com.example.soapPhone.model.Person;

public interface PersonRepo {
    void addRecord(String initials, String phone);
    String getInitials(String phone);
    String getPhone (String initials);
}
