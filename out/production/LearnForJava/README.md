## 第八章 - 事件处理

要想实现用户界面, 必须掌握 Java 事件处理的基本方法.

本章将讲解 Java AWT 事件模型的工作机制,
从中可以看到如何捕获用户界面组件和输入设备产生的事件

另外, 本章还介绍如何以更加结构化的方式处理动作 (actions) 事件

### # 事件处理基础

任何支持 GUI 的操作环境都要不断地监视按键或点击鼠标这样的事件,
操作环境将这些事件报告给正在运行的应用程序. 如果有事件产生,
每个应用程序将决定如何对它们做出响应

在 AWT 所知的事件范围内, 完全可以控制事件从事件源(event source)例如, 按钮或滚动条,
到事件监听器(event listener) 的传递过程, 并将任何对象指派给事件监听器.

不同的事件源可以产生不同类别的事件

AWT 事件处理机制概要:

+ 监听器对象是一个实现了特定监听器接口(listener interface) 的类的实例

+ 事件源是一个能够注册监听器对象并发送时间对象的对象

+ 当事件发生时, 事件源将事件对象传递给所有注册的监听器

+ 监听器对象将利用事件对象中的信息决定如何对事件做出响应

详细代码可以可见 ButtonTest

但是我们也可以发现, 每个按钮的处理过程都是一样的.

1) 用标签字符串来构造按钮
2) 将按钮添加到面板上
3) 用对于的颜色构造一个动作监听器
4) 添加动作监听器

我们可以设计一个辅助方法, 来简化上面的任务

详细代码可见 ButtonTest2

###　# 动作

通常, 激活一个命令有很多方式, 在 ButtonTest2 中我们可以通过点击按钮来更换背景, 这里, 我们可以通过按键来切换背景

Swing 包中提供了一种实用的机制来封装命令, 并将它们连接到多个事件源, 这就是 Action 接口

一个动作是一个封装下列内容的对象:

+ 命令的说明 (一个文本字符串和一个可选图标)

+ 执行命令所需要的参数

它包含下列方法.

+ void actionPerformed(ActionEvent event)

+ void setEnabled(boo;ean b)

+ boolean isEnabled()

+ void putValue(String key, Object value)

+ Object getValue(String key)

+ void addPropertyChangeListener(PropertyChangeListener listener)

+ void removePropertyChangeListener(PropertyChangeListener listener)

详细的使用方法可看 ActionFrameTest

需要注意的是, Action 是一个接口, 而不是一个类. 实现这个接口的所有类都必须实现前面讨论的七个方法.

庆幸的是, AbstractAction 类实现了除 actionPerformed 方法外的所有方法.

这个类存储了所有名/值对, 并管理着属性变更监听器. 我们可以直接扩展 AbstractAction 类, 并在扩展类中实现 actionPerformed 方法

详细的使用方法可看 ActionFrameTest


为了将动作对象添加到击键中, 以便让用户通过敲击键盘命令来执行这项动作. 步骤如下

+ 生成 KeyStroke 类对象 (不需要调用构造器, 而是调用类中的 getKeyStroke 方法)

+ 使用getInputMap 方法从组建中得到输入映射

我们还需要了解 keyboard focus 的概念, 详细概念还是请看书吧.


### ## 总结

用同一个动作响应按钮, 菜单项或按键的方式

+ 实现一个扩展于 AbstractAction 类的类. 多个相关的动作可以使用同一个类,

+ 构造一个动作类的对象

+ 使用动作对象创建按钮或菜单项. 构造器将从动作对象中读取标签文本和图标.

+ 为了能够通过按键出发动作, 必须额外地执行几步操作, 首先定义顶层窗口组件, 例如, 包含所有其他组件的面板

+ 然后, 得到顶层组件的 WHEN_ANCESTOR_OF_FOCUS_COMPONENT 输入映射. 为需要的按键创建一个 KeyStrike 对象. 创建一个描述动作字符串这样的动作键对象. 将其添加到输入映射中去

+ 最后, 得到顶层组件的动作映射, 将其添加到映射中.

### ## 鼠标事件

详细内容请看代码 MouseTest
