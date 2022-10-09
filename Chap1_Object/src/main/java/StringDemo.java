
/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/9/15 11:04
 * FileName: StringDemo
 * Description: 34432
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/9/15 11:04
 * @Description: TODO
 */
public class StringDemo {
    public static void main(String[] args) {
        String x = "231231";
        String y = "231231";
        // 默认缓存池, true
        System.out.println(x==y);

        String m = new String("123123");
        String n = new String("123123");
        // 新的堆实例, false
        System.out.println(m==n);
    }
}
