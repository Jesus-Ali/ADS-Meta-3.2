/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramadesecuencias;

import java.util.Random;

/**
 *
 * @author 1259a
 */
public class SensorProxy {
    public int sensorTemperatura;
    public int sensorLight;
    public Random rand = new Random();
    
    public SensorProxy(){
        sensorLight = 50;
        sensorTemperatura = 35;
    }
    
    public void read(){
        for(int i=0; i<3; i++){
            sensorTemperatura = rand.nextInt(120);
            sensorLight = rand.nextInt(100);
        }
    }
    
    public int getSensorTemperatura(){
        return sensorTemperatura;
    }
    
    public int getSensorLight(){
        return sensorLight;
    }
}
