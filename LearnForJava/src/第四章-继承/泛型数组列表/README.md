### 泛型数组

在许多程序设计语言中,特别是在C语言中,必须在编译时就确定整个数组的大小.如果需要在使用过程中更改数组呢?

在Java中,它允许在运行时确定数组的大小

> int actualSize = ....;  
> Employee[] staff = new Employee[actualSize]

但是它并没有完全解决运行时动态更改数组的问题.因为一旦确定了数组的大小,改变它就不太容易了.

解决这个问题的简单方法是使用Java中另外一个被称为 ArrayList 的类

ArrayList 是一个采用类型参数(type parameter)的泛型类(generic class).为了指定数组列表保存的元素对象类型,需要用一对尖括号将类名括起来加在后面.

#### 访问数组列表元素

数组列表自动扩展容量的便利增加了访问元素语法的复杂程度 .因为ArrayList并不是Java语言的一部分,他只是标准库中的一个实用类.

它使用get和set方法实现访问或改变数组元素的操作.而不是使用人们喜爱的[]语法格式

详细内容可看 arrayList 和 ArrayListTest