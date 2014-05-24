/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templatemethod;

import com.phakama.designpartens.behavoural.templatemethod.CheeseBurgerMeal;
import com.phakama.designpartens.behavoural.templatemethod.HanburgerMeal;
import com.phakama.designpartens.creational.builder.Meal;
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
public class TestTemplatemethod {
    
    public TestTemplatemethod() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void templateTest() {
         HanburgerMeal meal = new HanburgerMeal();
         meal.doMeal();
         
         CheeseBurgerMeal meal2 = new CheeseBurgerMeal();
         meal2.doMeal();
         
         Assert.assertNotEquals(meal, meal2);
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
