package com.thoughtworks.gtb.basicquiz.repository;

import com.thoughtworks.gtb.basicquiz.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> userList  = new ArrayList<>();

    {
        userList.add(new User(1, "KAMIL", 24,
                "https://inews.gtimg.com/newsapp_match/0/3581582328/0",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi."));
    }

    public User getUserById(long id){
        return userList.get((int) (id - 1));
    }

    public int count() { return userList.size();}

    public User addUser(User user) {
        userList.add(user);
        return getUserById(user.getId());
    }
}
