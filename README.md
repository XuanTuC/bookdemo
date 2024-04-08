java MariaDB Server

欢迎访问个人博客：https://xuantuc.github.io/archives/

# step.1 安装navicat

下载文件，解压后按照指示完成破解，开启无限期试用

> 下载地址：https://github.com/LiJunYi2/navicat-keygen-16V/files/11945536/Navicat16.2.3.zip



# step.2 安装mariadb

到mariadb官网

> mariadb官网 https://mariadb.org/download/?t=mariadb&p=mariadb&r=11.3.2

![image-20240408211436078](https://tuchuan-1317533020.cos.ap-nanjing.myqcloud.com/image/image-20240408211436078.png)

下载完双击`mariadb-11.3.2-winx64.msi`文件



一路next，注意填写管理员账户信息

记住数据库管理员密码，和默认端口号3306

在navicat里面选择**新建连接**

![image-20240408225455723](https://tuchuan-1317533020.cos.ap-nanjing.myqcloud.com/image/image-20240408225455723.png)



![image-20240408212030578](https://tuchuan-1317533020.cos.ap-nanjing.myqcloud.com/image/image-20240408212030578.png)

**注意：**这个是连接的密码，不是数据库用户的密码



然后测试连接，如果没问题会提示成功



# step.3 新建数据库

右键左侧点击新建数据库，输入信息，创建成功

**或者**点击新建查询，输入下面的sql语句创建

数据库名称为bookdemo

同样点击新建查询，输入sql语句

### 1).数据库创建语句：

```sql
CREATE DATABASE IF NOT EXISTS bookdemo;
USE bookdemo;
```

### 2).数据库用户名、密码创建语句：

```sql
CREATE USER 'bookdemouser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON bookdemo.* TO 'bookdemouser'@'localhost';
FLUSH PRIVILEGES;
```

### 3).创建数据表语句：

```sql
CREATE TABLE IF NOT EXISTS `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `publish_date` date DEFAULT NULL,
  `pages` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
```

### 4).测试数据插入语句：

```sql
INSERT INTO `book` (`title`, `author`, `publish_date`, `pages`) VALUES ('Book Title 1', 'Author 1', '2024-03-29', 300);
INSERT INTO `book` (`title`, `author`, `publish_date`, `pages`) VALUES ('Book Title 2', 'Author 2', '2024-03-30', 250);
```



# step.4 安装idea

注意安装**高级版**

参见详细[破解教程](https://mp.weixin.qq.com/s/Z3Yx2A4fz4p5YWo-UDKRXg)，或者先用30天免费



# 安装plugins（插件）

文件 > 设置

在插件 > 市场  中  搜索并安装图中标注的插件，并restart idea

![image-20240408230708659](https://tuchuan-1317533020.cos.ap-nanjing.myqcloud.com/image/image-20240408230708659.png)



# step.5 创建Spring Boot项目简单示例



## 1.创建项目

### 1).新建项目时输入如图所示:

建议：位置与图中保持一致

![新建项目时的选择](https://tuchuan-1317533020.cos.ap-nanjing.myqcloud.com/image/NewProject.png)

> 建议jdk版本等服从上图，19

### 2).新建项目包的选择如图所示:

![新建项目时的选择](https://tuchuan-1317533020.cos.ap-nanjing.myqcloud.com/image/NewProject2.png)

略，按照压缩包中的`SpringBootStudy.html`文件中的步骤来即可，如果你的项目位置和图中保持一致的话，可以直接复制压缩包中的文件，覆盖你新建的项目文件



完成后，运行并访问`http://localhost:8085/api/books`验证

![image-20240408231213181](https://tuchuan-1317533020.cos.ap-nanjing.myqcloud.com/image/image-20240408231213181.png)

# info-0 说明

C:\demo\java\bookdemo\src\main\resources\application.properties 这个文件中的标注部分应该为你实际创建的数据库名称、用户名、密码，**且**

我们数据库用的虽然是mariadb，但是**JDBC 子协议**：`jdbc:mariadb://` 中还是mysql，这是可行的，因为MariaDB 与 MySQL 兼容的，因此不需要修改

![image-20240408231518454](https://tuchuan-1317533020.cos.ap-nanjing.myqcloud.com/image/image-20240408231518454.png)



---



如果你有想法，你可以在github贡献pr，本文将持续更新，项目已提交github
