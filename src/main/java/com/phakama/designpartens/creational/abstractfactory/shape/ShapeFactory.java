/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phakama.designpartens.creational.abstractfactory.shape;

import com.phakama.designpartens.creational.abstractfactory.AbstractFactory;
import com.phakama.designpartens.creational.abstractfactory.colours.Colour;

/**
 *
 * @author phakama
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Colour getColour(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
