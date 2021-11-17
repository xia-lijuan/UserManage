package session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author xialijuan
 * @date 2020/10/06
 */
public class HibernateSessionFactory {
    private static SessionFactory sessionFactory;//会话工厂属性
    //构造方法私有化，保证单列模式
    private HibernateSessionFactory(){
    }
    //共有静态方法，获取会话工厂对象
    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            //创建配置对象
            Configuration config = new Configuration().configure();
            //创建会话工厂对象
            sessionFactory = config.buildSessionFactory();
        }
        return sessionFactory;
    }
}
