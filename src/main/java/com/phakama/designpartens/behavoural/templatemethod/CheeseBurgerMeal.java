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
public class CheeseBurgerMeal extends Meal{

    @Override
    public void prepareIngrediants() {
        System.out.println("Getting grounfd beef and cheese");    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }
    @Override
    public void eat(){
        System.out.println("The cheese burger are tasty");
    }

    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes");
    }
    
}
