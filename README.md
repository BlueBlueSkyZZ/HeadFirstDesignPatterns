# Head First设计模式

## 1. 设计模式入门——策略模式Strategy Pattern

### 设计原则

1. 找到应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起
2. 针对接口编程，而不是针对实现编程
   1. 针对超类型supertype进行编程，是一个抽象类或者一个接口
3. 多用组合少用继承——”有一个“（HAS-A）可能比”是一个“（IS-A）更好

### 策略模式

策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。

### Tips

1. 封装的概念：原来在设计对象是会倾向于事物属性设为类变量，行为设为方法。然后行为如果很复杂，方法需要重复实现，完全也可以抽象成”对象“，即”万物皆对象“。
2. 请不要染上”模式病“，连写一个”Helloworld“都能扯上模式

## 2.观察者（Observer）模式