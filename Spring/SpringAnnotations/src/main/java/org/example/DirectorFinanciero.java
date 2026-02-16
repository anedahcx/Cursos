package org.example;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados{

    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }

    public String getEmail() {
        return email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    @Override
    public String getTareas() {
        return "Gestión y dirección de las operaciones financieras de la empresa";
    }

    @Override
    public String getInforme() {
        return informeFinanciero.getInformeFinanciero();
    }

    private CreacionInformeFinanciero informeFinanciero;

    @Value("${email}") // INYECTA EN LOS CAMPOS DE CLASE LOS VALORES QUE ESTAN EN EL ARCHIVO EXTERNO
    private String email;
    @Value("${nombreEmpresa}")
    private String nombreEmpresa;
}
