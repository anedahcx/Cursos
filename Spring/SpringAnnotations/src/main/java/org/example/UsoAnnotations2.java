package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

    public static void main(String[] args){

        // SE COMENTA PORQUE YA NO SE LEERA Y SE UTILIZARA UN ARCHIVO DE CONFIGURACIÓN JAVA
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // LEER LA CLASE DE CONFIGURACIÓN
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

        // DESPUÉS PEDIR UN BEAN AL CONTENEDOR
        // SI LA ANNOTATION NO SE LE ASIGNO UN ID Y TOMARA EL NOMBRE DE LA CLASE, HAY QUE COLOCAR EL NOMBRE DE LA CLASE
        // EMPEZANDO CON LA PRIMERA LETRA EN MINÚSCULA
        Empleados empleado = context.getBean("directorFinanciero", Empleados.class);

        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInforme());

        // Y POR ULTIMO CERRAR EL CONTEXTO
        context.close();
    }

}
