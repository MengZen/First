package cn.com.meng.base.domain;

/**
 * Created by meng on 2016/10/2.
 */
public class Orange implements Fruit{

    String name;

    public void eat() {
        System.out.println("剥开吃");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
