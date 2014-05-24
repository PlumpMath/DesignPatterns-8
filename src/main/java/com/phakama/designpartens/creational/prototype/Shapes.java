/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.prototype;

/**
 *
 * @author phakama
 */
public class Shapes implements Prototype{
    String shape;
    
    public Shapes(String shape){
        this.shape = shape;
    }

    @Override
    public Prototype doClone() {
        return new Shapes(shape);
    }
    public String toString(){
        return "This shape is a: " + shape;
    }
    
}
