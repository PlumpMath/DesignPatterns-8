package factorymethod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phakama.designpartens.creational.abstractfactory.AbstractFactory;
import com.phakama.designpartens.creational.abstractfactory.FactotryProducer;
import com.phakama.designpartens.creational.abstractfactory.colours.Colour;
import com.phakama.designpartens.creational.abstractfactory.shape.Shape;
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
public class factoryMethodTest {
    
    public factoryMethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    /*Testing shapes */
    @Test
     public void cirlceTest() {
         AbstractFactory shapeFactory = FactotryProducer.getFactory("SHAPE");
         Shape shape1 = shapeFactory.getShape("CIRCLE");
         Assert.assertEquals("CIRCLE", shape1.draw());
     }
     @Test
     public void rectangleTest(){
         AbstractFactory shapeFactory = FactotryProducer.getFactory("SHAPE");
         Shape shape2 = shapeFactory.getShape("RECTANGLE");
         Assert.assertEquals("RECTANGLE", shape2.draw());
     }
     @Test
     public void squareTest(){
          AbstractFactory shapeFactory = FactotryProducer.getFactory("SHAPE");
          Shape shape3 = shapeFactory.getShape("SQUARE");
          Assert.assertEquals("SQUARE", shape3.draw());
     }
     
     /*Testing colours*/
     @Test
     public void redTest(){
         AbstractFactory colorFactory = FactotryProducer.getFactory("COLOUR");
         Colour color1 = colorFactory.getColour("RED");
         Assert.assertEquals("RED", color1.fill());
     }
     
     @Test
     public void blueTest(){
      AbstractFactory colorFactory = FactotryProducer.getFactory("COLOUR");
      Colour color2 = colorFactory.getColour("BLUE");
      Assert.assertEquals("BLUE", color2.fill());
     }
     
     @Test
     public void greentest(){
          AbstractFactory colorFactory = FactotryProducer.getFactory("COLOUR");
          Colour color3 = colorFactory.getColour("GREEN");
          Assert.assertEquals("GREEN", color3.fill());
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
