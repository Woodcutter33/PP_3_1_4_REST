package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

public interface UserService extends UserDetailsService {

    List<User> getAll();

    Set<Role> getAllRole();

    User showUserById(Long id);

    void delete(Long id);

    User findByUsername(String username);

    void saveOrUpdate(User user, Set<Role> roles);
}

