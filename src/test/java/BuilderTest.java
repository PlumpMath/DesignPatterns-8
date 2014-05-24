/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.phakama.designpartens.creational.builder.ItalianMealBuilder;
import com.phakama.designpartens.creational.builder.JapaneseMealBuilder;
import com.phakama.designpartens.creational.builder.Meal;
import com.phakama.designpartens.creational.builder.MealBuilder;
import com.phakama.designpartens.creational.builder.MealDirector;
import junit.framework.Assert;
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
public class BuilderTest {
    
    public BuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
//     @Test
//     public void mealTest() {
//         MealBuilder mealBuilder = new ItalianMealBuilder();
//         MealDirector mealDiractor = new MealDirector((MealDirector) mealBuilder);
//         mealDiractor.constructMeal();
//         Meal meal = mealDiractor.getMeal();
//         
//         //mealBuilder = new JapaneseMealBuilder();
//        // mealDiractor = new MealDirector(mealBuilder);
//        
//     }

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
