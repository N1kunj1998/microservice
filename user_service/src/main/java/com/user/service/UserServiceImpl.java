package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // fake user list

    List<User> list = List.of(
            new User(1311L,"Nikunj","1234567498"),
            new User(1312L,"Someone","4543567498"),
            new User(1313L,"Else","7498")
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
