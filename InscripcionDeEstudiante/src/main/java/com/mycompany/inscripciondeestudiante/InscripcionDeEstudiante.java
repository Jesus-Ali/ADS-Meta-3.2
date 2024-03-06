/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inscripciondeestudiante;

import java.util.Scanner;

/**
 *
 * @author 1259a
 */
public class InscripcionDeEstudiante {
    public static Formato formato = new Formato();
    public static String estudiante = "";

    public static void main(String[] args) {
        System.out.println("Hello World!");
        formato.mostrarFormato();
        Scanner input = new Scanner(System.in);
        int opc = input.nextInt();
        estudiante = formato.inscribir(opc);
        System.out.println("te inscribiste a: "+ estudiante);
        formato.actualizaFormato();
    }
}
