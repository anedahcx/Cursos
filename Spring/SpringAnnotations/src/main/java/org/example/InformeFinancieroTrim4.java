package org.example;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentación de informe del cierre de año";
    }
}
