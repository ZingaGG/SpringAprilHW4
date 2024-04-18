package ru.gb.springSem4.SpringAprilHW4.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.gb.springSem4.SpringAprilHW4.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class UserService {
    private List<User> users = new ArrayList<>();

    public User addUser(User user){
        users.add(user);
        return user;
    }

    public List<User> getUsers() {
        users.add(new User("Alex", 26));
        users.add(new User("Dima", 26));
        users.add(new User("Sveta", 26));
        return users;
    }
}
