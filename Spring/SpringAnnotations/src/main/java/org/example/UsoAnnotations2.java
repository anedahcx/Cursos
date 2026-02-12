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
        Empleados Arturo = context.getBean("comercialExperimentado", Empleados.class);
        Empleados Antonio = context.getBean("comercialExperimentado", Empleados.class);

        // APUNTAN AL MISMO OBJETO EN MEMORIA?
        if(Antonio == Arturo){
            System.out.println("Apuntan al mismo lugar en memoria");
            System.out.println(Antonio + "\n" + Arturo);
        } else {
            System.out.println("No apuntan al mismo lugar en memoria");
            System.out.println(Antonio + "\n" + Arturo);
        }

        // Y POR ULTIMO CERRAR EL CONTEXTO
        context.close();
    }

}
