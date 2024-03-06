/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramadesecuencias;

/**
 *
 * @author 1259a
 */
public class Dashboard {
    public SensorProxy sensor = new SensorProxy();
    
    public void updateData(){
        System.out.println("actualizando datos");
        sensor.read();
        updateDisplay();
    }
    
    public void updateDisplay(){
        System.out.println("actualizando display");
        System.out.println("leyendo temepratura: "+ sensor.getSensorTemperatura());
        System.out.println("leyendo luz: "+ sensor.getSensorLight());
    }
}
