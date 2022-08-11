/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/11 11:15
 * FileName: CombDemo
 * Description: Chap1.4-一个组合的Demo
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/8/11 11:15
 * @Description: TODO
 */
public class CombDemo {
    public static void main(String[] args) {
        // 创建Body
        Body tonyBody = new Body(178.2d,71.5d);
        // 创建Human
        Human tony = new Human("Tony",25,tonyBody);
        // get
        System.out.print(
                "Name:"+tony.getName()+
                 "\nage:"+tony.getAge()+
                 "\nheight:"+tony.getBody().getHeight()+
                 "\nweight:"+tony.getBody().getWeight()+
                 "\n"
                );
        System.out.println();

        // 修改身高，体重
        tony.getBody().setHeight(188.9d);
        tony.getBody().setWeight(85.1d);
        // get
        System.out.print(
                "Name:"+tony.getName()+
                        "\nage:"+tony.getAge()+
                        "\nheight:"+tony.getBody().getHeight()+
                        "\nweight:"+tony.getBody().getWeight()
        );
    }
}

class Human{
    // 成员变量
    private String name;
    private int age;
    private Body body;

    // 全参构造器
    public Human(String name, int age, Body body) {
        this.name = name;
        this.age = age;
        this.body = body;
    }

    // 访问接口
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

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}

// 身体信息
class Body{

    // 成员变量
    private double height;
    // 身高
    private double weight;
    // 体重

    // 全参构造器
    public Body(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // 访问接口
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
