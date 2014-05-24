/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.factorymethod;

/**
 *
 * @author phakama
 */
public class AnimalFactory {
    public Animal getAnimal(String move){
        if("Fly".equals(move)){
            return new Bird();
        }
        else if("Swim".equals(move)){
            return new Fish();
        }
        else{
                return new Frog();
        }
    }
    
}
