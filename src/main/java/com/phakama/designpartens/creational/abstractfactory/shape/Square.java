/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.creational.abstractfactory.shape;

import com.phakama.designpartens.creational.abstractfactory.shape.Shape;

/**
 *
 * @author phakama
 */
public class Square implements Shape{

    @Override
    public String draw() {
        //System.out.println("Square::draw()");
        return "SQUARE";
    }
    
}
