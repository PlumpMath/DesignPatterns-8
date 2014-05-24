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
public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo {

    @Override
    public double getTemperatureInf() {
        return 0;
      //  return cToF(temperatureInc);
    }

    @Override
    public void setTemperatureInf(double temperatureInf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTemperatureInC() {
        return temperatureInc;
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
