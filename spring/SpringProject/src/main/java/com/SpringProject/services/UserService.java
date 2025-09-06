package com.SpringProject.services;

import com.SpringProject.entities.User;
import com.SpringProject.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public void add(User user) {
        userRepository.save(user);
    }
    public String deleteById(int id) {
        if(userRepository.existsById(id)) {
            User user = userRepository.findById(id).get();
            userRepository.delete(user);
            return "deleted "+user.getName();
        }
        return "user not found";
    }
    public String update(User user, int id) {
        if(userRepository.existsById(id)) {
            User user1 = userRepository.findById(id).get();
            user.setId(user1.getId());
            userRepository.save(user);
            return "updated "+user.getId();
        }
        return "user not found";
    }
}
