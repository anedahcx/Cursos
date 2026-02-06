package org.example;

import org.springframework.stereotype.Component;

// A LA ANOTACIÓN SE LE PUEDE DAR EL NOMBRE (ESTE NOMBRE ES EL ID DE LA ANOTACIÓN) QUE SEA Y CON ESTO YA SE A CREADO UN BEAN
@Component("ComercialExp")
public class ComercialExperimentado implements Empleados{

    @Override
    public String getTareas() {
        return "Vender, vender y vender más!";
    }

    @Override
    public String getInforme() {
        return "Esto es un informe generado por el comercial";
    }
}
