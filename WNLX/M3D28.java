package WNLX;

import java.util.ArrayList;
import java.util.Iterator;

import WNLX.animal.*;

public class M3D28 {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();
        Dog d = new Dog();
        Cat c = new Cat();

        ls.add(d);
        ls.add(c);
        Iterator it = ls.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
