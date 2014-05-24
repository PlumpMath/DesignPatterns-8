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
public class HanburgerMeal extends Meal{

    @Override
    public void prepareIngrediants() {
        System.out.println("Gettin burgers, buns, and french fries");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers on grill in oven");
    }

    @Override
    public void cleanUp() {
        System.out.println("Throwing away paper plates");
    }
    
}
