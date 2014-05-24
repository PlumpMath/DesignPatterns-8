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
public class Color implements Prototype{
    String color;
    
    public Color(String color){
        this.color = color;
    }

    @Override
    public Prototype doClone() {
        return new Color(color);
    }
    
    public String toString(){
        return "This colour is: " + color;
    }
    
}
