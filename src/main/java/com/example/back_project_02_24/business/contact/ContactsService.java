package com.example.back_project_02_24.business.contact;

import com.example.back_project_02_24.domain.contact.ContactMapper;
import com.example.back_project_02_24.domain.contact.ContactService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ContactsService {

    @Resource
    private ContactService contactService;

    @Resource
    private ContactMapper contactMapper;

    public Contacts getContacts(String realName, String codeName) {
        Contact contact = contactService.getContactBy(realName, codeName);
        return null;
    }
}
