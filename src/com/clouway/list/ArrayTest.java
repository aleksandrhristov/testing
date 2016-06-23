package com.clouway.list;

/**
 * Created by clouway on 23.06.16.
 */

import org.junit.Test;

public class ArrayTest {
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void removeElementFromEmptyArray() throws ArrayIsEmptyException {
        ArrayOfObjects arrayOfObjects = new ArrayOfObjects(0);
        arrayOfObjects.remove();
    }

    @Test(expected = ArrayIsFullException.class)
    public void addElementToFullArray() throws ArrayIsFullException {
        ArrayOfObjects arrayOfObjects = new ArrayOfObjects(1);
        arrayOfObjects.add(arrayOfObjects);
        arrayOfObjects.add(arrayOfObjects);
    }
}
