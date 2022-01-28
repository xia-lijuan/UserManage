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

<img src=".\images\index.jpg" style="zoom:50%;" />

输入错误的用户名/密码，提示密码不正确



<img src=".\images\login_fail.jpg" style="zoom:50%;" />

输入正确的用户名/密码，进入`功能菜单`

<img src=".\images\login_success.jpg" style="zoom:50%;" />



## 查询用户信息

<img src=".\images\query.jpg" style="zoom:50%;" />





## 注册



<img src=".\images\register.jpg" style="zoom:50%;" />

注册成功，跳转到功能菜单，查询是否添加成功

<img src=".\images\register_query.jpg" style="zoom:50%;" />

## 删除用户

删除前

<img src=".\images\delete_before.jpg" style="zoom:50%;" />





删除ID为23的zs后

<img src=".\images\delete_later.jpg" style="zoom:50%;" />





## 修改用户信息

修改前

<img src=".\images\update_before.jpg" style="zoom:50%;" />

修改后，这里将ID为20的Kyle的年龄改为了30

<img src=".\images\update_later.jpg" style="zoom:50%;" />





# 总结

由于时间有限，页面效果比较差，不太美观，只完成了要求的功能，当然bug也是比较多的，希望有时间能优化一下





