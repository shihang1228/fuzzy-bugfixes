package com.baldurtech.contact;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("contact")
public class ContactController {
    @RequestMapping("list")
    public String list(Model model) {
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
        model.addAttribute("contactList",contactList);
        return "contact/list";
    }
}