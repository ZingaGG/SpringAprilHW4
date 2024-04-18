package ru.gb.springSem4.SpringAprilHW4.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.gb.springSem4.SpringAprilHW4.model.User;
import ru.gb.springSem4.SpringAprilHW4.service.UserService;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    private UserService userService;

    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    public User addUser(User user){
        return userService.addUser(user);
    }
}
