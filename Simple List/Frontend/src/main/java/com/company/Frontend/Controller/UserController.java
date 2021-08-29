package com.company.Frontend.Controller;

import com.company.Frontend.DAO.UserRepository;
import com.company.Frontend.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/usersList")
    public List<User> listOfUsers(){
        return userRepository.findAll();
    }
}
