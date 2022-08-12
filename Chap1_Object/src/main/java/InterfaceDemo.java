/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/12 11:47
 * FileName: InterfaceDemo
 * Description: 1.7.2-一个接口的Demo
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/8/12 11:47
 * @Description: 接口Demo
 */
public class InterfaceDemo implements Inter{

    // 实现抽象方法
    @Override
    public void printIter() {
        System.out.println("interDes:"+INTERDES);
        System.out.println("interId:"+INTERID);
    }
}
