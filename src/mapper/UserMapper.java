package mapper;

import entity.User;

import java.util.List;

public interface UserMapper {
    public User queryUserByName(String username);

    public List<User> findAll();
}
