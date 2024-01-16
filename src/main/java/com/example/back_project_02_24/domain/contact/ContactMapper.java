package com.example.back_project_02_24.domain.contact;

import com.example.back_project_02_24.business.contact.ContactDto;
import com.example.back_project_02_24.domain.contact.Contact;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ContactMapper {
    Contact toEntity(ContactDto contactDto);

    ContactDto toDto(Contact contact);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Contact partialUpdate(ContactDto contactDto, @MappingTarget Contact contact);
}