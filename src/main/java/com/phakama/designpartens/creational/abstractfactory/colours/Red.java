/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.abstractfactory.colours;

/**
 *
 * @author phakama
 */
public class Red implements Colour{

    @Override
    public String fill() {
        return "RED";
        //System.out.println("Red:: fill() method");
    }
    
}
