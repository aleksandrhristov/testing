package com.clouway.list;


/**
 * Created by clouway on 03.05.16.
 */
public class ArrayOfObjects {
    private Object[] array;
    private int index = 0;
    public ArrayOfObjects(int size) {

        this.array = new Object[size];
    }
    /**
     * adding object to an array;
     *
     * @param object
     * @throws Exception
     */
    public void add(Object object) throws ArrayIsFullException {
        if (index < array.length) {
            array[index] = object;
            index++;
        } else {
            throw new ArrayIsFullException();
        }
    }
    /**
     * removing object from an array;
     *
     * @throws Exception
     */
    public void remove() throws ArrayIsEmptyException {
        if (index != 0) {
            array[index - 1] = null;
            index--;
        } else if (array[0] == null) {
            throw new ArrayIsEmptyException();
        }
    }

    public String printAllElements() {
        String str = "";
        for (int i = 0; i < index; i++) {
            str += (array[i] + " ");
        }
        return str;
    }
}