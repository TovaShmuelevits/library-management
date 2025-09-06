package com.SpringProject.controller;

import com.SpringProject.entities.Item;
import com.SpringProject.entities.User;
import com.SpringProject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUsers() { return userService.findAll();}


    @PostMapping("/add")
    public void addUser(@RequestBody User user) {   userService.add(user);}


    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id) { return userService.deleteById(id);}



    @PutMapping("/updateById/{id}")
    public String updateById(@PathVariable int id, @RequestBody User user) {  return userService.update(user, id);}

    }



