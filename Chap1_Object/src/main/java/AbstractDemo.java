/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/12 11:12
 * FileName: AbstrctDemo
 * Description: 1.7.1-抽象类Demo
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/8/12 11:12
 * @Description: 抽象类
 */
public class AbstractDemo extends AbClass {

    public AbstractDemo(String classDes, int classId) {
        super(classDes, classId);
    }

    // 实现抽象方法
    @Override
    public void subPrint() {
        System.out.println("classId:"+ this.getClassId() +" classDes:"+this.getClassDes());
    }

    public static void main(String[] args) {
        AbstractDemo newInstance = new AbstractDemo("抽象类",1234657);
        // 调用继承抽象类(父类)的成员方法printAll()
        newInstance.printAll();
        // 调用子类实现的方法subPrint()
        newInstance.subPrint();
    }
}

abstract class AbClass{
    // 成员变量
    private String classDes;
    private int classId;

    // 构造器
    public AbClass(String classDes, int classId) {
        this.classDes = classDes;
        this.classId = classId;
    }

    // get&set
    public String getClassDes() {
        return classDes;
    }

    public void setClassDes(String classDes) {
        this.classDes = classDes;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    // 抽象方法:没有方法体
    public abstract void subPrint();

    // 成员方法
    public void printAll(){
        System.out.println("classId:"+this.classId);
        System.out.println("classDes"+this.classDes);
    }
}
