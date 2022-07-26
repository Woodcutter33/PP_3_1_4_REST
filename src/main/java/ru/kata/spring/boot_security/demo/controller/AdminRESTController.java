package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminRESTController {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public AdminRESTController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }


    @GetMapping()
    public User getAllUser() {
        return userService.showUserById(1L);
    }
//    @GetMapping()
//    public List<User> getAllUser() {
//        List<User> allUsers = userService.getAll();
//        return allUsers;
//    }



//    @PostMapping("/new")
//    public User createUser(@RequestBody User user) {
//        userService.save(user);
//        return user;
//    }

//    @PatchMapping("/edit/{id}")
//    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") Long id,
//                             @RequestParam(value = "nameRoles", required = false) String roles) {
//        user.setRoles(roleService.getByName(roles));
//        userService.update(user, id);
//        return "redirect:/admin";
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") long id) {
//        userService.delete(id);
//        return "redirect:/admin";
//    }
}
