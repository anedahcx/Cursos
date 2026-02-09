package spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCalificaciones {

    public static void main(String[] args){
        // LECTURA DEL XML DE CONFIGURACIÓN
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Alumnos Arturo = context.getBean("notasAlumnos", Alumnos.class);

        System.out.println("La calificación minima es: " + Arturo.getCalificacion());
        System.out.println(Arturo.getTareas());

        context.close();

    }
}
