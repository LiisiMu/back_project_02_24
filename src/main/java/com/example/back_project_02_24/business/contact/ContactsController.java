package com.example.back_project_02_24.business.contact;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

    @Resource
    private ContactsService contactsService;

    @GetMapping("/")
    @Operation(summary = "Tagastab andmebaasist kontaktid")
    public void getContacts(@RequestParam String realName, @RequestParam String codeName) {
        Contacts contacts = contactsService.getContacts(realName, codeName);
        return;
    }
}

