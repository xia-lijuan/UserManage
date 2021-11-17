package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.User;
import session.HibernateSessionFactory;

import java.util.List;

/**
 * @author xialijuan
 * @date 2020/10/03
 */
public class UserDao {

    /**
     * 保存用户信息
     * @param user
     */
    public int saveUser(User user){
        int num = 0;
        Transaction transaction = null;
        try {
            Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.save(user);
            num = 1;
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.commit();
        } finally {
            if(transaction!=null) transaction = null;
            return num;
        }
    }

    /**
     * 通过username查询指定用户
     * @param username
     * @return 将符合条件的用户添加到list中
     * */
    public List<User> findUserByName(String username){
        List<User> userList;
        Transaction transaction = null;
        try {
            Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            String hql = "from User as u where u.username=?";
            Query query = session.createQuery(hql);
            query.setParameter(0,username);
            userList = query.list();
            transaction.commit();
            return userList;
        }catch (Exception e){
            e.printStackTrace();
            transaction.commit();
            return null;
        } finally {
            if(transaction!=null) transaction = null;
        }
    }

    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryUser(){
        List<User> userList;
        Transaction transaction = null;
        try{
            Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            String hql = "from User";
            Query query = session.createQuery(hql);
            userList = query.list();
            transaction.commit();
            return userList;
        }catch (Exception e){
            e.printStackTrace();
            transaction.commit();
            return null;
        } finally {
            if(transaction!=null) transaction = null;
        }
    }

    /**
     * 通过id删除指定用户
     * @param id
     */
    public void deleteUser(int id){
        Transaction transaction = null;
        try{
            Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            String hql = "delete from User where id=?";
            Query query = session.createQuery(hql);
            query.setParameter(0,id);
            query.executeUpdate();
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.commit();
        } finally {
            if (transaction!=null)transaction = null;
        }
    }

    /**
     * 修改用户信息
     * @param user
     */
    public void updateUser(User user){
        Transaction transaction = null;
        try{
            Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            String hql = "update User u set u.age=?,u.gender=?,u.phone=?,u.birthday=? where u.username=?";
            Query query = session.createQuery(hql);
            query.setParameter(0,user.getAge());
            query.setParameter(1,user.getGender());
            query.setParameter(2,user.getPhone());
            query.setParameter(3,user.getBirthday());
            query.setParameter(4,user.getUsername());
            query.executeUpdate();
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.commit();
        } finally {
            if (transaction!=null)transaction = null;
        }
    }
}
