package com.thoughtworks.gtb.basicquiz.repository;

import com.thoughtworks.gtb.basicquiz.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> userList  = new ArrayList<>();

    // GTB: 不需要加默认数据，调试时可以用，最终提交时删掉即可
    {
        userList.add(new User(1, "KAMIL", 24L,
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
