package com.clouway.list;

/**
 * Created by clouway on 03.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        ArrayOfObjects ls = new ArrayOfObjects(3);
        try {
            ls.add(123);
            ls.add(233);
            ls.add(111);
            System.out.println(ls.printAllElements());
            ls.add(166);
        } catch (ArrayIsFullException e) {
            try {
                ls.remove();
            } catch (ArrayIsEmptyException e1) {
                e1.printStackTrace();
            }
        }
        System.out.println(ls.printAllElements());
    }
}
