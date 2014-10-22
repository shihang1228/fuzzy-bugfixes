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
        model.addAttribute("contactList", contactList);
        return "contact/list";
    }
}