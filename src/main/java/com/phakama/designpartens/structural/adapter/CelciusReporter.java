/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phakama.designpartens.structural.adapter;

/**
 *
 * @author phakama
 */
public class CelciusReporter {
    double temperatureInc;

    public CelciusReporter() {
    }

    public double getTemperature() {
        return temperatureInc;
    }

    public void setTemperature(double temperatureInc) {
        this.temperatureInc = temperatureInc;
    }
    
}
