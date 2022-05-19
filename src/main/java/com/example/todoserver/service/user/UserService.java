package com.example.todoserver.service.user;

import com.example.todoserver.entity.TbUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public TbUser findByEmail(String email){
       return userRepository.findByEmail(email);
    }

    public List<TbUser> getAllUser(){
        return userRepository.findAll();
    }
}
