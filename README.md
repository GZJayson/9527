# graphql-java-spring-boot-example

新增修改操作:
mutation{
  CreateTrac(name:"呵呵"){
    id,
    name
  }
}

mutation{
  CreateTracByObj(trac:{name:"李安娜"}){
    id,
    name
  }
}

mutation{
  UpdateTrac(id:11,name:"李宁"){
    id,
    name
  }
}


查询操作:
{
  findAllTracs{
    id,
    name,
    getDesc
  }
}





graphql默认数据类型(在graphqls文件定义对象时用到):
Int：有符号 32 位整数。
Float：有符号双精度浮点值。
String：UTF‐8 字符序列。
Boolean：true 或者 false。
ID：ID 标量类型表示一个唯一标识符，通常用以重新获取对象或者作为缓存中的键。ID 类型使用和 String 一样的方式序列化；然而将其定义为 ID 意味着并不需要人类可读型。



相关规则:
1 type Query 只能有一个,如果出现多个,则按文件名的字母排行取最后一个作为 唯一的根 type query
2 其他的 type query 得加上 extend 才能将查询方法添加进去,但不能出现方法重复,
3 在 type query 里调用的查询方法,不能在实现了GraphQLQueryResolver的多个类中出现,否则启动报错
4 GraphQLQueryResolver所有子类里的方法都能在type Query 里被调用(子类和*.graphqls 文件没有对应关系)
5 GraphQLMutationResolver所有子类里的方法都能在 type Mutation里被调用(子类和*.graphqls 文件没有对应关系)
6 实现GraphQLResolver<T>接口的类,在类里添加的方法会作为属性添加到 T 对象中,在graphqls 中定义 type 的时候可以用上新增的属性(方法名就是属性名)