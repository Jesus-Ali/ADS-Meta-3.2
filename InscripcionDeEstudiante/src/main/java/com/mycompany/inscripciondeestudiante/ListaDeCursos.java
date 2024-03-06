/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inscripciondeestudiante;

/**
 *
 * @author 1259a
 */
public class ListaDeCursos {
    String[] cursos = {"Ing. en Aeroespacial","Ing. Civil","Ing. en Computacion","Ing. Electronica"};
    
    public String getCurso(int id){
        if(id<0 || id>=cursos.length){
            return "ERROR: no existe esa materia";
        }else{
            return cursos[id];
        }
    }
    
    public String[] getAllCursos(){
        return cursos;
    }
}
