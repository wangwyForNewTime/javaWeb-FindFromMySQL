package servlet;
import entity.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import service.Userservice;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.GetSqlSession;

import java.io.IOException;
import java.util.List;

@WebServlet("/index")//这个/很重要
public class Userservlet extends HttpServlet {
   // private Userservice userService =new Userservice();

    @Override
    protected  void  service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String uTestValue =request.getParameter("test");
        System.out.println(uTestValue);

        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> list=userMapper.findAll();
        System.out.println(list);
        request.setAttribute("list", list);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
