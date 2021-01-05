package javer.springbootregistrationloginsecurity.service;

import javer.springbootregistrationloginsecurity.model.Role;
import javer.springbootregistrationloginsecurity.model.User;
import javer.springbootregistrationloginsecurity.repository.UserRepository;
import javer.springbootregistrationloginsecurity.web.dto.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user = User.builder()
                .firstName(userRegistrationDto.getFirstName())
                .lastName(userRegistrationDto.getLastName())
                .email(userRegistrationDto.getEmail())
                .password(userRegistrationDto.getPassword())
                .roles(Arrays.asList(Role.builder().name("ROLE_USER").build()))
                .build();
        return userRepository.save(user);
    }
}
