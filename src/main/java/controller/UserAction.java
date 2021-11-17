package controller;

import com.opensymphony.xwork2.ActionSupport;
import dao.UserDao;
import pojo.User;

import java.util.List;

/**
 * @author xialijuan
 * @date 2020/10/06
 */
public class UserAction extends ActionSupport {

    private int id;
    private String username;
    private Integer age;
    private String gender;
    private String password;
    private String pass2;
    private String phone;
    private String birthday;

    private List<User> users;
    private User user;

    private String message = INPUT;

    UserDao userDao = new UserDao();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 验证登录的用户名和密码是否正确
     * @return
     */
    public String checkLogin(){
        if (username==null||password==null){
            addFieldError("error","用户名或密码不能为空");
        }else {
            UserDao userDao = new UserDao();
            List list = userDao.findUserByName(username);
            if (list==null){
                addFieldError("error","该账号不存在");
            }else {
                for (int i = 0; i < list.size(); i++) {
                    User user = (User) list.get(i);
                    if (username.equals(user.getUsername())&&password.equals(user.getPassword())){
                        return "success";
                    }else {
                        addFieldError("error","密码不正确");
                    }
                }
            }
        }
        return "error";
    }

    /**
     * 添加用户
     * @return
     */
    public String add() {
        if (username == null || password == null || pass2 == null) {
            addFieldError("error", "用户名或密码不能为空");
        } else {
            if (password.equals(pass2)) {
                UserDao userDao = new UserDao();
                List list = userDao.findUserByName(username);
                if (list.size() == 0) {
                    User user = new User();
                    user.setUsername(username);
                    user.setAge(age);
                    user.setGender(gender!=null?gender.substring(0,1): null);
                    user.setPassword(pass2);
                    user.setPhone(phone);
                    user.setBirthday(birthday);
                    userDao.saveUser(user);
                    return "success";
                } else {
                    addFieldError("error", "该用户已存在");
                }
            } else {
                addFieldError("error", "两次密码不一致");
            }
        }
        return "error";
    }

    /**
     * 删除用户
     * @return
     */
    public String delete(){
        users = userDao.queryUser();
        if (id != 0) {
            userDao.deleteUser(id);
        }
        users = userDao.queryUser();//实时更新数据
        return "success";
    }

    /**
     * 修改用户
     * @return
     */
    public String update(){
        users = userDao.queryUser();
        doUpdate();
        return "success";
    }
    /**
     * 执行修改用户
     * @return
     */
    public String doUpdate(){
        if (username != null) {
            user = userDao.findUserByName(username).get(0);
        }
        if (user != null) {
            user.setUsername(username);
            user.setAge(age);
            user.setBirthday(birthday);
            user.setGender(gender);
            user.setPhone(phone);
            userDao.updateUser(user);
        }
        return "success";
    }

    /**
     * 查询用户
     * @return
     */
    public String query(){
        users = userDao.queryUser();
        return "success";
    }
}
