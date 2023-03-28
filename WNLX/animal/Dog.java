package WNLX.animal;

public class Dog extends Animal {
    public Dog() {
        // System.out.println("狗子类的构造器");
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

    @Override
    public String toString() {
        return "狗";
    }
}
