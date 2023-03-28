/*
 * @Author: 宋世杰
 * @Date: 2023-03-27 17:14:55
 * @LastEditTime: 2023-03-28 14:40:07
 * @LastEditors: 宋世杰
 * @FilePath: \VSc-Java\WNLX\M3D27\Pra01.java
 * @Description: 请自行修改描述
 */
/*
 * @Author: 宋世杰
 * @Date: 2023-03-27 17:14:55
 * @LastEditTime: 2023-03-27 19:25:49
 * @LastEditors: 宋世杰
 * @FilePath: \VSc-Java\WNLX\M3D27\Pra01.java
 * @Description: 请自行修改描述
 */
package WNLX.M3D27;

class Animal {
    Animal() {
        System.out.println("父类构造器");
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
}

class Dog extends Animal {
    Dog() {
        System.out.println("狗子类的构造器");
    }

    @Override
    public void eat() {
        System.out.println("狗吃东西");
    }

    @Override
    public void run() {
        System.out.println("狗跑");
    }

    @Override
    public void play() {
        System.out.println("狗玩耍");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("猫子类的构造器");
    }

    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }

    @Override
    public void run() {
        System.out.println("猫跑");
    }

    @Override
    public void play() {
        System.out.println("猫玩耍");
    }
}

public class Pra01 {
    public static void main(String[] args) {
        Animal a1 = new Dog();// 向上转型
        Animal a2 = new Cat();
        a1.eat();
        a1.run();
        a1.play();
        a2.eat();
        a2.run();
        a2.play();
    }
}
