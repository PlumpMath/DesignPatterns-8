/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.abstractfactory;

import com.phakama.designpartens.creational.abstractfactory.colours.ColourFactory;
import com.phakama.designpartens.creational.abstractfactory.shape.ShapeFactory;

/**
 *
 * @author phakama
 */
public class FactotryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        else if(choice.equals("COLOUR")){
            return new ColourFactory();
        }
        return null;
    }
}
