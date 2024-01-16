package com.example.back_project_02_24.business.contact;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.back_project_02_24.domain.contact.Contact}
 */
@Value
public class ContactDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 50)
    String fullName;
    @NotNull
    @Size(max = 20)
    String codeName;
    @NotNull
    Integer phoneNumber;
}