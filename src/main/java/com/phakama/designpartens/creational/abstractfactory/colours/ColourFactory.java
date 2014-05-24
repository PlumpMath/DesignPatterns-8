/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.abstractfactory.colours;

import com.phakama.designpartens.creational.abstractfactory.AbstractFactory;
import com.phakama.designpartens.creational.abstractfactory.shape.Shape;

/**
 *
 * @author phakama
 */
public class ColourFactory extends AbstractFactory{

    @Override
    public Colour getColour(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }
        else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
    
}
