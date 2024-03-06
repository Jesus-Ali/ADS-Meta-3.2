/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diagramadesecuencias;

/**
 *
 * @author 1259a
 */
public class DiagramaDeSecuencias {
    public static Dashboard dashboard = new Dashboard();

    public static void main(String[] args) {
        despliegaSensores();
    }
    
    public static void despliegaSensores(){
        dashboard.updateData();
    }
}
