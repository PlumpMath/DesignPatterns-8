/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.behavoural.templatemethod;

/**
 *
 * @author phakama
 */
public abstract class Meal {
    public final void doMeal(){
        prepareIngrediants();
        cook();
        eat();
        cleanUp();
    }
    public abstract void prepareIngrediants();
    public abstract void cook();
    public void eat(){
        System.out.println("Mmm that's good");
    }
    
    public abstract void cleanUp();
}
