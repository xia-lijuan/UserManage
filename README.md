# 前言

本项目基于Struts+Hibernate框架实现，具备基本登录注册功能及通过jsp页面对用户进行增删改查的相关操作



# 开发工具

- IntelliJ IDEA
- Tomcat、利用maven管理项目



# 功能

- 登录
- 查询用户信息
- 注册
- 删除用户
- 修改用户信息

## 登录



输入错误的用户名/密码，提示密码不正确

<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/index.jpg" alt="index" style="zoom: 50%;" />

<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/login_fail.jpg" alt="login_fail" style="zoom:50%;" />

输入正确的用户名/密码，进入`功能菜单`

<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/login_success.jpg" alt="login_success" style="zoom:50%;" />



## 查询用户信息



<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/query.jpg" alt="query" style="zoom:50%;" />



## 注册

<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/register.jpg" alt="register" style="zoom:50%;" />



注册成功，跳转到功能菜单，查询是否添加成功

<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/register_query.jpg" alt="register_query" style="zoom:50%;" />

## 删除用户

删除前

<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/delete_before.jpg" alt="delete_before" style="zoom:50%;" />





删除ID为23的zs后

<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/delete_later.jpg" alt="delete_later" style="zoom:50%;" />





## 修改用户信息

修改前

<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/update_before.jpg" alt="update_before" style="zoom: 50%;" />

修改后，这里将ID为20的Kyle的年龄改为了30

<img src="https://cdn.jsdelivr.net/gh/xialijuan0/ImageRepo@master/UserManage/update_later.jpg" alt="update_later" style="zoom:50%;" />



# 总结

由于时间有限，页面效果比较差，不太美观，只完成了要求的功能，当然bug也是比较多的，希望有时间能优化一下





