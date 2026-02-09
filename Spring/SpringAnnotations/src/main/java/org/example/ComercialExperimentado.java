package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// A LA ANOTACIÓN SE LE PUEDE DAR EL NOMBRE (ESTE NOMBRE ES EL ID DE LA ANOTACIÓN) QUE SEA Y CON ESTO YA SE A CREADO UN BEAN
// O PUEDES DEJARLO SIMPLEMENTE CON @Component, ESTO TOMARA EL NOMBRE DE LA CLASE COMO ID
@Component
public class ComercialExperimentado implements Empleados{

    // INYECCIÓN DE DEPENDENCIAS CON CONSTRUCTOR E CLASE CON AUTOWIRED

    // ESCANEA QUE CLASE CONTIENE LA INTERFAZ E INYECTA
    // AUTOWIRED AYUDA A ESCANEAR LAS CLASES DEL PROGRAMA PARA SABER CUÁL ESTÁ IMPLEMENTANDO LA INTERFAZ
    /*@Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) { //ESCANEA QUE CLASE CONTIENE LA INTERFAZ E INYECTA
        this.nuevoInforme = nuevoInforme;
    }*/

    // INYECCIÓN DE DEPENDENCIAS CON MÉTO DO SETTER */
    /*@Autowired
    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/

    @Override
    public String getTareas() {
        return "Vender, vender y vender más!";
    }

    @Override
    public String getInforme() { // return "Esto es un informe generado por el comercial"
        return nuevoInforme.getInformeFinanciero();
    }


    // CREACIÓN DE VARIABLE PARA INYECCIÓN DE DEPENDENCIA
    @Autowired // TAMBIÉN SE PUEDE INYECTAR DEPENDENCIAS CON UN CAMPO DE CLASE, SOLO PONIENDO AUTOWIRED ARRIBA DEL CAMPO
    private CreacionInformeFinanciero nuevoInforme;
}
