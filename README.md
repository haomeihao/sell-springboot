# sell-springboot
sell project by springboot

``` 
1.需求分析 架构设计
2.数据库设计：
  类目表 商品表 订单主表 订单详情表 卖家信息表
3.环境搭建：
  JDK1.8+Maven3.3.9+Idea+Tomcat+MySQL+Redis+Nginx
4.日志框架: (很重要)
  Logback的使用与配置
  日志门面：面向接口编程 Slf4j
  日志实现：Logback
  jar包：lombok.jar 基于注解
  配置：
    application.yml 简单
    logback-spring.xml 复杂
5.卖家端开发：
    DAO -> Service -> Controller
    
    @GeneratedValue注解
    GenerationType：
      TABLE, 使用一个特定的数据库表格来保存主键   
      SEQUENCE, 根据底层数据库的序列来生成主键，条件是数据库支持序列   
      IDENTITY, 主键由数据库自动生成（主要是自动增长型）   
      AUTO：主键由程序控制 默认
    @DynamicUpdate 动态更新 只有属性修改才会更新时间
    @Transactional 单元测试加上完全回滚
6.买家端接口开发
    第1步 接口文档约定
    @JsonProperty("name")
```
