# spring-boot-guide01
spring boot中配置bean的几种方式之一
java配置

java配置主要靠java类和一些注解，比较常用的注解有：
- `@Configuration`：声明一个类作为配置类，代替xml文件
- `@Bean`：声明在方法上，将方法的返回值加入Bean容器，代替`<bean>`标签
- `@value`：属性注入
- `@PropertySource`：指定外部属性文件，

接下来用java配置来尝试实现连接池配置：
