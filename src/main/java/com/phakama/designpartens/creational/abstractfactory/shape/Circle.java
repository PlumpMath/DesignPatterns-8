/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.abstractfactory.shape;

/**
 *
 * @author phakama
 */
public class Circle implements Shape{

    @Override
    public String draw() {
       // System.out.println("Cirle:: draw()");
        return "CIRCLE";
    }
    
}
