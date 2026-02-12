package org.example;

public class DirectorFinanciero implements Empleados{

    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
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
}
