package WNLX.animal;

public class Cat extends Animal {
    public Cat() {
        // System.out.println("猫子类的构造器");
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

    @Override
    public String toString() {
        return "猫";
    }
}
