package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

    public static void main(String[] args){

        // PRIMERO LEER EL XML DE CONFIGURACIÓN
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // DESPUÉS PEDIR UN BEAN AL CONTENEDOR
        // SI LA ANNOTATION NO SE LE ASIGNO UN ID Y TOMARA EL NOMBRE DE LA CLASE, HAY QUE COLOCAR EL NOMBRE DE LA CLASE
        // EMPEZANDO CON LA PRIMERA LETRA EN MINÚSCULA
        Empleados Arturo = context.getBean("comercialExperimentado", Empleados.class);

        // TERCERO USAR EL BEAN
        System.out.println(Arturo.getInforme());
        System.out.println(Arturo.getTareas());

        // Y POR ULTIMO CERRAR EL CONTEXTO
        context.close();
    }

}
