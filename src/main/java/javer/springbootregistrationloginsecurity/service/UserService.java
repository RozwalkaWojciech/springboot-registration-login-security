package javer.springbootregistrationloginsecurity.service;

import javer.springbootregistrationloginsecurity.model.User;
import javer.springbootregistrationloginsecurity.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto userRegistrationDto);
}
