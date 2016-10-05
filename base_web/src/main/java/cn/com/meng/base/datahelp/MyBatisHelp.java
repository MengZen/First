package cn.com.meng.base.datahelp;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by meng on 2016/10/5.
 */
public class MyBatisHelp {

    private static SqlSession sqlSession = null;

    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object createMap(Class clazz) {
        return sqlSession.getMapper(clazz);
    }

    public static void close() {
        sqlSession.commit();
        sqlSession.close();
    }
}
