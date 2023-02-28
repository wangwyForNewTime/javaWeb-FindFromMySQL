package test;

import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import util.GetSqlSession;

import java.util.List;

public class Test {
    public static void  main(String[] args){
        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.queryUserByName( "wen");
        List<User> list1=userMapper.findAll();
        System.out.println(user);
    }
}
