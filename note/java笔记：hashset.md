# java笔记：HashSet

HashSet继承自Set接口，底层是一个HashMap。本质是一个数组，每一个元素都是一个单向链表。

```java
Set se = new HashSet();
se.add(1);
se.add(100);
se.add(11);

Iterator iter = se.iterator();

System.out.println(se.size());

while(iter.hasNext()){
    Object ob = iter.next();
}
```

java.util.SortedSet无序不可重复，但是存进去的元素可以按照元素大小自动排序。



多态简单叫做父类引用指向子类对象，面向抽象编程，而不是面向具体编程。代码之间的耦合度降低，代码的扩展能力强。
