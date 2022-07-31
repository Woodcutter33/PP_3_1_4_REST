package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminRESTController {

    private final UserService userService;
//    private final RoleService roleService;

    @Autowired
    public AdminRESTController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userService.getAll());
    }

    @PostMapping()
    public ResponseEntity<List<User>> createUser(@RequestBody User user) {
        userService.saveOrUpdate(user, user.getRoles());
        return ResponseEntity.ok(userService.getAll());
    }

    @PutMapping()
    public ResponseEntity<List<User>> updateUser(@RequestBody User user) {
        userService.saveOrUpdate(user, user.getRoles());
        return ResponseEntity.ok(userService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<User>> deleteUser(@PathVariable("id") long id) {
        userService.delete(id);
        return ResponseEntity.ok(userService.getAll());
    }
}
