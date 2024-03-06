/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inscripciondeestudiante;

/**
 *
 * @author 1259a
 */
public class Formato {
    ListaDeCursos lista = new ListaDeCursos();
    
    public void mostrarFormato(){
        String[] cursos = lista.getAllCursos();
        System.out.println("Cual Curso quiere escoger?");
        for(int i=0; i<cursos.length; i++){
            System.out.println("("+ i +")" + cursos[i]);
        }
    }
    
    public String inscribir(int opc){
        return lista.getCurso(opc);
    }
    
    public void actualizaFormato(){
        System.out.println("Actualizando formato");
    }
}
