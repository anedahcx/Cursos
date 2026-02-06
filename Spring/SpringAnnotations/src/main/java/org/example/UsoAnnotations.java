package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

    public static void main(String[] args){

        // PRIMERO LEER EL XML DE CONFIGURACIÓN
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // DESPUÉS PEDIR UN BEAN AL CONTENEDOR
        Empleados Arturo = context.getBean("ComercialExp", Empleados.class);

        // TERCERO USAR EL BEAN
        System.out.println(Arturo.getInforme());
        System.out.println(Arturo.getTareas());

        // Y POR ULTIMO CERRAR EL CONTEXTO
        context.close();
    }

}
