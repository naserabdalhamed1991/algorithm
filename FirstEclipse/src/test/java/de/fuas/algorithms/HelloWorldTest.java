package test.java.de.fuas.algorithms;

import org.junit.Assert;
import org.junit.Test;

import main.java.de.fuas.algorithms.HelloWorld;

public class HelloWorldTest {

    @Test
    public void testArrayComplete() {
	String[] array = HelloWorld.getWelcomeText();

	Assert.assertNotNull(array);

	Assert.assertTrue(array.length == 3);

	Assert.assertEquals("Welcome to Algorithmen", array[0]);

	Assert.assertNotNull(array[1]);

	Assert.assertTrue(array[1].equals("Git is great!") || array[1].equals("Java is great!"));

	// Assert.assertEquals("Hello World!", array[2]);
    }
}
