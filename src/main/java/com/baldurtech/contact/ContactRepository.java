package com.baldurtech.contact;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {
    public List<Contact> findAll() {
        List<Contact> contactList = new ArrayList<Contact>();
        Contact contact = new Contact();
        contact.setName("Shihang");
        contact.setMobile("15235432994");
        contact.setVpmn("652994");
        contact.setHomeAddress("Taiyuan");
        
        Contact contact2 = new Contact();
        contact2.setName("Xiaobai");
        contact2.setMobile("18235100872");
        contact2.setVpmn("65872");
        contact2.setHomeAddress("Xiaodian");
        contactList.add(contact);
        contactList.add(contact2);
        return contactList;
    }
}