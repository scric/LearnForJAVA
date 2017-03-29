## Object:所有类的超类

Object类是Java中所有类的始祖,在Java中每个类都是由它扩展而来的.

如果没有明确地指出超类,Object就被认为是这个类的超类.

Object类型的变量只能用于作为各种值的通用持有者,要想对其中的内容进行具体的操作,还需要清楚对象的原始类型,并进行相应的类型转换.

在Java中,只有基本类型(primitive types)不是对象.所有的数组类型,不管是对象数组还是基本类型数组都扩展于Object类.

#### toString方法

toString 方法,它用于返回表示对象值的字符串.

设计子类的程序员应该定义自己的toString方法,并将子类域的描述添加进去.

随处可见toString方法的原因是:只要对象与一个字符串通过操作符"+"连接起来,Java编译就会自动地调用toString方法,以便获得这个对象的字符串描述

详细内容可以看Employee类和Manager类测试中的Employee类.

println方法会直接调用x.toString()方法,并打印输出得到的字符串