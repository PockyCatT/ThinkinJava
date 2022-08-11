/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/11 10:30
 * FileName: EucaDemo
 * Description: Chap1.3-一个封装的Demo
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/8/11 10:30
 * @Description: TODO
 */
public class EucaDemo {
    /*
    封装的要求:
        1. 成员变量私有(private)；
        2. 提供set、get接口访问成员变量,并在其中加入属性控制语句（对属性值的合法性进行判断）；
        3. 尽量不要使用外部类的方法；
        4. 提供公开的构造器；
     */
    public static void main(String[] args) {
        // 创建Employee实例Mary
        Employee Mary = new Employee("Mary",15,1500.0d);
        // 通过get接口访问成员变量
        System.out.print("Name:"+Mary.getName()+"\nage:"+Mary.getAge()+"\nsalary:"+Mary.getSalary()+"\n");
        System.out.println();

        // 通过set接口修改成员变量
        Mary.setAge(20);
        Mary.setSalary(13000.0d);
        System.out.print("Name:"+Mary.getName()+"\nage:"+Mary.getAge()+"\nsalary:"+Mary.getSalary());
    }
}

class Employee{
    //成员变量
    private String name;
    private int age;
    private double salary;

    // 公开构造器
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //get、set访问接口
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
