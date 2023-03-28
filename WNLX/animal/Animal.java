/*
 * @Author: 宋世杰
 * @Date: 2023-03-28 14:39:11
 * @LastEditTime: 2023-03-28 14:39:29
 * @LastEditors: 宋世杰
 * @FilePath: \VSc-Java\WNLX\animal\Animal.java
 * @Description: 请自行修改描述
 */
package WNLX.animal;

public class Animal {
    Animal() {
        // System.out.println("父类构造器");
    }

    public void eat() {
        System.out.println("动物吃");
    }

    public void run() {
        System.out.println("动物跑");
    }

    public void play() {
        System.out.println("动物玩耍");
    }

    @Override
    public String toString() {
        return "动物";
    }
}
