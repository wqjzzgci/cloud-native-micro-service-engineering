# 二手书店的服务器端

## 示范的技术

  - QueryDSL:
    替代JPA自身的Criteria API，和Criteria API一样支持灵活的动态数据库查询语句，但相比JPA Criteria API：
    1. 通过插件把数据库表的表名和列名绑定到类型安全的Java Bean property，方便重构，也减少直接使用字符串时容易发生的拼写错误
    2. 查询条件用DSL风格的级联方式表达，接近直接写SQL，简单直观，容易学习使用

    - 官网：http://www.querydsl.com/
    - 简介文章：https://www.baeldung.com/intro-to-querydsl
    - 参考手册：http://www.querydsl.com/static/querydsl/latest/reference/html_single/

  - H2:
    仅用于单元测试。
    - 用于单元测试的优点：
      1. 快 - 对于单元测试这非常重要
      2. 不需要数据清理 - 因为H2是内存数据库，默认设置下数据不放磁盘，因此简化了单元测试的准备工作

  - Lombok:
    代码生成插件，通过简单的annotation来消除一些常见的无聊的Java代码，譬如Getter和Setter。

    - 官网：https://projectlombok.org
    - 简介文章：
      1. https://blog.csdn.net/ThinkWon/article/details/101392808
      2. https://www.jianshu.com/p/365ea41b3573

    注意：IDE里使用需要安装和该IDE集成的插件，否则IDE会不会触发代码生成、找不到生成的代码而报编译错误。
    常见的IDE插件：
      1. VS Code：https://marketplace.visualstudio.com/items?itemName=GabrielBB.vscode-lombok
      2. IDEA：待补充
      3. Eclipse：待补充