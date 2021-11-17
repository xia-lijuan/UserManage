import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.User;

/**
 * @author xialijuan
 * @date 2020/09/26
 */
public class HibernateTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setUsername("hh");

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
