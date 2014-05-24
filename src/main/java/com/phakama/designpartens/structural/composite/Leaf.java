/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.structural.composite;

/**
 *
 * @author phakama
 */
public class Leaf implements Component{
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String sayHello() {
       // System.out.println(name + "leaf says hello");
        return ("leaf says hello");
    }

    @Override
    public String sayGoodbye() {
       // System.out.println(name + "leaf says goodbye");
        return "leaf says goodbye";
    }
    
    
}
