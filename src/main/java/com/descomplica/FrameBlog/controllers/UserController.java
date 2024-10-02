package com.descomplica.FrameBlog.controllers;

import com.descomplica.FrameBlog.models.User;
import com.descomplica.FrameBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    private @ResponseBody User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping(path = "/getAll")
    private @ResponseBody List<User> gettAll() {
        return userService.getAll();
    }

    @GetMapping(path = "/get")
    private @ResponseBody User gett(@RequestParam final Long id) {
        return userService.get();
    }

    @PostMapping(path = "/update")
    private @ResponseBody User update(@RequestParam final Long id, @RequestParam User user) {
        return userService.update(id, user);
    }

    @DeleteMapping(path = "/delete")
    private ResponseEntity<?> delete(@RequestParam final Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/")
    public @ResponseBody String authentication() {
        return "Hello World";
    }
}
