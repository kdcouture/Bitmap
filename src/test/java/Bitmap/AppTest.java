/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Bitmap;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class AppTest {

    @Test public void testAppHasAGreeting() {
        Lab4 classUnderTest = new Lab4();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void testRedifiy() {
        Lab4 testclass = new Lab4();
        try{
            BufferedImage testImgRed = ImageIO.read(new File("./src/test/resources/testredderCoffee.bmp"));
            BufferedImage toTestImg = testclass.redify(ImageIO.read(new File("./src/main/resources/Coffee.bmp")));
            assertTrue("Should be true",testclass.compare(testImgRed, toTestImg));
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }

    @Test public void testChecker() {
        Lab4 testclass = new Lab4();
        try{
            BufferedImage testImgCheckers = ImageIO.read(new File("./src/test/resources/testcheckersCoffee.bmp"));
            BufferedImage toTestImg = testclass.checkers(ImageIO.read(new File("./src/main/resources/Coffee.bmp")));
            assertTrue("Should be true",testclass.compare(testImgCheckers, toTestImg));
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }

    @Test public void testCheckerZag() {
        Lab4 testclass = new Lab4();
        try{
            BufferedImage testImgZag = ImageIO.read(new File("./src/test/resources/testcheckersZagCoffee.bmp"));
            BufferedImage toTestImg = testclass.checkersZag(ImageIO.read(new File("./src/main/resources/Coffee.bmp")));
            assertTrue("Should be true",testclass.compare(testImgZag, toTestImg));
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}
