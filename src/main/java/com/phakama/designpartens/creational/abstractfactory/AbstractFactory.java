/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.abstractfactory;

import com.phakama.designpartens.creational.abstractfactory.colours.Colour;
import com.phakama.designpartens.creational.abstractfactory.shape.Shape;

/**
 *
 * @author phakama
 */
public abstract class AbstractFactory {
    public abstract Colour getColour(String color);
    public abstract Shape getShape(String shape);
    
}
