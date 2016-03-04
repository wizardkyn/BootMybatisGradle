# BootMybatisGradle
Spring Boot Web with Mybatis

# Environment
Spring Boot 1.4.0<br>
Gradle<br>
mysql , mybatis 3.3.1 , mybatis-spring 1.2.4<br>
JSTL<br>
Logback<br>
External Tomcat 8<br>
Test URL : http://localhost:8080/BootMybatisGradle/login.do

# Tomcat Datasource JNDI
```
<GlobalNamingResources>
<Resource auth="Container" driverClassName="com.mysql.jdbc.Driver" 
loginTimeout="10" maxActive="200" maxIdle="8" maxWait="5000" 
name="jdbc/sim" username="dbuser" password="1234" 
type="javax.sql.DataSource"
url="jdbc:mysql://db.example.com:3306/exampledb?zeroDateTimeBehavior=convertToNull"/>      
</GlobalNamingResources>

<Context docBase="BootMybatisGradle" path="/BootMybatisGradle" reloadable="true">
<ResourceLink global="jdbc/sim" name="jdbc/sim" type="javax.sql.DataSource"/>
</Context>
```