package prototype;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phakama.designpartens.creational.abstractfactory.shape.Shape;
import com.phakama.designpartens.creational.prototype.Color;
import com.phakama.designpartens.creational.prototype.Shapes;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author phakama
 */
public class PrototypeTest {
    
    public PrototypeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void shapeTest() {
         Shapes shape1 = new Shapes("Circle");
         System.out.println("Shape 1: " + shape1);
         Shapes shape2 = (Shapes) shape1.doClone();
         System.out.println("Shape 2: " + shape2);
         Assert.assertEquals("This shape is a: Circle", shape1.toString());
     }
     
     @Test
     public void colorTest(){
         Color color1 = new Color("Red");
         System.out.println("Color 1 is: " + color1);
         Color color2 = (Color)color1.doClone();
         System.out.println("Color 2 is: " + color2);
         Assert.assertEquals("This colour is: Red", color1.toString());
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
