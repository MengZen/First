package cn.com.meng.base.domain;


import cn.com.meng.base.util.BeanFactory;

/**
 * Created by meng on 2016/10/2.
 */
public class Person {

    public void hungry(Fruit fruit) {
        fruit.eat();
    }

    public static void main(String[] args) {
        Person person = new Person();
        Fruit fruit = (Fruit) BeanFactory.getBean("fruit");
        System.out.println(fruit.getName());
        person.hungry(fruit);
    }
}
