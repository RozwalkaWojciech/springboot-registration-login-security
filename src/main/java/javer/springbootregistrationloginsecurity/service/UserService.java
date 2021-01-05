package javer.springbootregistrationloginsecurity.service;

import javer.springbootregistrationloginsecurity.model.User;
import javer.springbootregistrationloginsecurity.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto userRegistrationDto);
}
