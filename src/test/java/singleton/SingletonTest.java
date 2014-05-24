package singleton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phakama.designpartens.creational.singleton.SingletonClass;
import junit.framework.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author phakama
 */
public class SingletonTest {
    
    public SingletonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
             SingletonClass singleton = SingletonClass.getInstance();
             Assert.assertEquals("Hello", singleton.sayHello());
     }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
