/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.builder;

/**
 *
 * @author phakama
 */
public class MealDirector {
    private MealBuilder mealBuilder = null;
    
    public MealDirector(MealDirector mealDirector){
        this.mealBuilder = mealBuilder;
    }
    
    public void constructMeal(){
        mealBuilder.buildDrink();;
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
    }
    
    public Meal getMeal(){
        return mealBuilder.getMeal();
    }
}
