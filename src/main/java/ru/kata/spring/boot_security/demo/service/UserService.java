package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> index();

    User showUserById(Long id);

    User save(User user);

    @Transactional
    void update(User user, Long id);

    void delete(Long id);

    User findByUsername(String username);

}

