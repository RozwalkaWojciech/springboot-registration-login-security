package javer.springbootregistrationloginsecurity.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserRegistrationDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
