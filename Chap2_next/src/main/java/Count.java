/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/10/9 10:19
 * FileName: Count
 * Description: none
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/10/9 10:19
 * @Description: TODO
 */
public class Count {
    private int value1 = 1;
    private int value2 = 1;

    private int counting(int value1, int value2){
        return value1+value2;
    }

    public static void main(String[] args) {
        String string1 = new String("aaa");
        String string2 = new String("aaa");
        System.out.println("string1==string2");
        System.out.println(string1.equals(string2));
    }
}
