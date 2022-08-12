/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/12 11:36
 * FileName: Inter
 * Description: 1.7.2-一个简易的接口
 * Version: 1.0
 */
public interface Inter {
    // 接口是绝对抽象的
    // 接口中只允许public static final类型的变量, 通常IDEA会默认隐藏public static final
    int INTERID = 1223;
    String INTERDES = "接口";

    // 接口中只允许public的抽象方法, IDEA会默认隐藏public abstract
    void printIter();
}
