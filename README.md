# TninkInJavaDemo

## 第六章
- friendly 指的是包访问权限，在同一个包下生效。如果没有import任何包，java会把他们默认放到default包下，所以他们的friendly方法可以相互访问。
- 类只能用public 报访问权限修饰

##第七章
1. 静态方法不能被继承
2. 所有private方法都隐式地指定为final的，对paivate方法添加final修饰词，不会给该方法带来额外的意义

##第八章
1. 静态方法是与类，而并非与单个对象相关联的
2. 访问父类的变量（域）的操作是由编译器解析，不是多态的。
2.1 组合，继承和多态在构造器的执行顺序上：
2.1.1 1. 调用基类构造器，反复递归下去，从根开始
2.1.2 2. 按生命顺序调用成员的初始化方法
2.1.3 3. 调用当前类的构造器主体

##第九章
1. 接口的所有成员自动被设置为public的；

##第十章
1. 内部类指向外部类的引用可用外部类的名字后面加.this，创建内部类对象必须使用外部类对象加.new来创建。
2. 在拥有外部类之前是不可能创建内部类对象的，因为内部类对象会默认地连接到创建它的外部类对象上；但是，如果创建的是静态内部类，那么就不需要外部类对象的引用
3. 定义一个匿名内部类，并且希望它使用一个在其外部定义的对象，那么编译器会要求其参数是final。这是因为外部类字段的引用没有传进去，传进去的只是它的一份拷贝。
4. 普通内部了不能有static字段和static方法
5. 静态嵌套类 ：OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
6. 内部类： OuterClass.InnerClass innerObject = new OuterObject().new InnerClass();
