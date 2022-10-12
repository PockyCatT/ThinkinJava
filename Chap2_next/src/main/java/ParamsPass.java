/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/10/11 14:19
 * FileName: ParamsPass
 * Description: value pass in java
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/10/11 14:19
 * @Description: TODO
 */
public class ParamsPass {
    // java中的参数是值传递的
    public static void main(String[] args) {
        Dog dog = new Dog("a");
        System.out.println(dog.getObjectAddress());
        fun(dog);
    }

    private static void fun(Dog dog){
        System.out.println(dog.getObjectAddress());
    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getObjectAddress(){
        return super.toString();
    }
}
