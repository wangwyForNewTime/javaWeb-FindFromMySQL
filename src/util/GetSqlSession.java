package util;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSqlSession {
    public static SqlSession createSqlSession(){
        SqlSessionFactory sqlSessionFactory = null;
        InputStream input = null;
        SqlSession session = null;

        try{
            //获取mybatis的环境配置文件
            String resource ="mybatis-config.xml";
            //以流的方式获取resourse
            input = Resources.getResourceAsStream(resource);
            //创建会话工厂
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(input);
            //通过工厂得到SqlSession
            session=sqlSessionFactory.openSession();
            return session;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }




}