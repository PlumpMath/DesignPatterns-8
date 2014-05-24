/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phakama.designpartens.creational.factorymethod.Animal;
import com.phakama.designpartens.creational.factorymethod.AnimalFactory;
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
public class AnimalTest {
    
    public AnimalTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void birdTest() {
         AnimalFactory animalFactory = new AnimalFactory();
         Animal bird = animalFactory.getAnimal("Fly");
         System.out.println("bird move: " + bird.move());
         Assert.assertEquals("Fly", bird.move());
     }
     
     @Test
     public void frogTest(){
         AnimalFactory animalFactory = new AnimalFactory();
         Animal frog = animalFactory.getAnimal("Jump");
         System.out.println("frog move: " + frog.move());
         Assert.assertEquals("Jump", frog.move());
     }

     @Test
     public void fishTest(){
         AnimalFactory animalFactory = new AnimalFactory();
         Animal fish = animalFactory.getAnimal("Swim");
         System.out.println("fish move: " + fish.move());
         Assert.assertEquals("Swim", fish.move());
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
