## 图形程序设计

### 前言

之前所编写的程序都是通过键盘接受输入, 在控制台屏幕上显示结果.

从本章开始, 将介绍如何编写使用图形用户界面 (GUI) 的 Java 程序 .


+ 如何编写定义屏幕上的窗口大小和位置的程序

+ 如何在窗口中采用多种字体显示文本

+ 如何显示图像

### 内容

#### # Swing 概述  
 优点
  + 拥有一个丰富, 便捷的用户界面元素集合
  + 对底层平台依赖的很少, 因此与平台相关的 bug 很少
  + 给予不同平台的用户一致的感觉

#### # 创建框架  
 在 java 中, 顶层窗口 (就是没有包含在其他窗口中的窗口) 被称为框架 (frame). 在 AWT 库中有一个称为 Frame 的类, 用于描述顶层窗口. 
 详细内容请看 SimpleFrameTest
 
 
 需要注意的是: 
 
 在每个 Swing 程序中, 有两个技术问题需要强调.
 
 + 首先, 所有的 Swing 组件必须由**事件分派线程** (event dispatch thread) 进行配置, 线程将鼠标点击和按键控制转移到用户接口组件
 
 执行代码为 EventQueue.. . / . 等等. 详细可看 SimpleFrameTest
 
 
#### # 框架定位

JFrame 类本身只包含若干个改变框架外观的方法, 通过继承, 从 JFrame 的各个超类中继承了许多用于处理框架大小和位置的方法. 

+ setLocation 和 setBounds : 设置框架的位置.

+ setIconImage : 用于告诉窗口系统在标题栏, 任务切换窗口等位置显示哪个图标.

+ setTitle : 用于改变标题栏的文字

+ setResizable : 利用一个 boolean 值确定框架的大小是否允许用户改变. 


组件类的很多方法是以 获取/设置 方法对形式出现的. 

比如 get / set   这样一个 获取/设置方法对被称为一种属性.   

针对 get/set 约定有一个例外 : 对于类型为 boolean 的属性, 获取方法由 is 开头. 例如 :
  
  > public boolean isLocationByPlatform()  
  > public void setLocationByPlatform(boolean b)
  
#### ## 确定合适的框架大小

+ 如果没有明确地指定框架的大小, 所有框架的默认值为 0*0 像素

+ 对于专业应用程序来说, 应该检查屏幕的分辨率, 并根据其分辨率编写大妈充值框架的大小.

得到屏幕大小的步骤如下:

1) 调用 Toolkit 类的静态方法 getDefaultToolkit 得到一个 Toolkit 对象

2) 调用 getScreenSize 方法, 这个方法以 Dimension 对象的形式返回屏幕的大小

需要注意的是: 

对于不同的操作系统, 所看到的图标显示位置有可能不同

处理框架提示 : 

+ 如果框架中只包含标准的组件, 如按钮和文本框, 那么可以通过调用 pack 方法设置框架大小. 框架将被设置为刚好能够放置所有组件的大小. 通常情况下, 将程序的祝框架尺寸设置为最大. 
> frame.setExtendedState(Frame.MAXIMIZED_BOTH);

+ 牢记用户定位应用程序的框架位置, 重置框架大小, 并且在应用程序再次启动时恢复这些内容. 

+ 如果编写一个使用多个显示屏幕的应用程序, 应该利用 GraphicsEnvironment 和 Graphics Device 类获得显示屏幕的代销

+ GraphicsDevice 类信息在全屏模式下执行应用程序.
记得
详细内容, 可以看 SizdFrameTest

  
#### ## 在组件中显示信息




