/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.singleton;

/**
 *
 * @author phakama
 */
public class SingletonClass {
    private static SingletonClass singletonInstance;
    String say;
    
    private SingletonClass(){
        
    }
    
    public static SingletonClass getInstance(){
        if(singletonInstance == null){
            singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }
    
    public String sayHello(){
        
        say = "Hello";
        
        return say;
    }
}
