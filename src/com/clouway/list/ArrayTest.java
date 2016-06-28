package com.clouway.list;

/**
 * Created by clouway on 23.06.16.
 */

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ArrayTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void removeElementFromEmptyArray() throws ArrayIsEmptyException {
        ArrayOfObjects arrayOfObjects = new ArrayOfObjects(0);
        arrayOfObjects.remove();
    }

    @Test(expected = ArrayIsFullException.class)
    public void addElementToFullArray() throws ArrayIsFullException {
        ArrayOfObjects arrayOfObjects = new ArrayOfObjects(0);
        arrayOfObjects.add(1);
    }

    @Test
    public void addOneElement() throws Exception {
        ArrayOfObjects arrayOfObjects = new ArrayOfObjects(1);
        arrayOfObjects.add(1);

        assertThat(arrayOfObjects.size(), is(equalTo(1)));
    }


    @Test
    public void printEmptyArray() throws ArrayIsFullException {
        ArrayOfObjects testTool = new ArrayOfObjects(0);
        PrintStream originStream = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));
            testTool.printAllElements();
            assertEquals("", outputStream.toString());
        } finally {
            System.setOut(originStream);
        }
    }

    @Test
    public void printArrayWithElements() throws Exception {
        ArrayOfObjects arrayofobjects = new ArrayOfObjects(3);
        arrayofobjects.add(1);
        arrayofobjects.add(2);
        arrayofobjects.add(3);
        PrintStream originStream = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));
            arrayofobjects.printAllElements();
            assertEquals( "1\n2\n3\n", outputStream.toString());
        } finally {
            System.setOut(originStream);
        }
    }
}
