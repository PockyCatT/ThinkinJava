/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/9 11:17
 * FileName: ExtendsDemo
 * Description: 一个继承的Demo
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/8/9 11:17
 * @Description: TODO
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        // 创建Animal对象
        Animal animal = new Animal("Anton");
        animal.sayName();

        // 创建Cat对象
        Cat ketty = new Cat("Ketty");
        ketty.sayName();
        ketty.special();
    }
}

/**
 * 父类
 */
class Animal{
    // 私有变量name
    private String name;

    // constructor
    public Animal(String name) {
        this.name = name;
    }

    // getter() & setter()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayName(){
        System.out.println("My name is: "+this.getName());
    }
}

/**
 * 子类Cat，重写方法sayName(),实现方法special()
 */
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    // 重写sayName()
    @Override
    public void sayName() {
        System.out.println("My name is: "+this.getName()+".Cat");
    }

    // 新接口special
    public void special(){
        System.out.println("喵喵喵");
    }
}
