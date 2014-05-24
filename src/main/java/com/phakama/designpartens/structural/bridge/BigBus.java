/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.structural.bridge;

/**
 *
 * @author phakama
 */
public class BigBus extends Vehicle{
    
public BigBus(Engine engine){
    this.weightInKilos = 3000;
    this.engine = engine;
}
    @Override
    public void drive() {
        System.out.println("The big bus is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
    
}
