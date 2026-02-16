package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// ARCHIVO DE CONFIGURACIÓN JAVA
@Configuration // INDICAMOS QUE ESTA CLASE SERA EL ARCHIVO DE CONFIGURACIÓN Y REMPLAZAR EL ARCHIVO XML
@ComponentScan("org.example") // INDICAMOS EN DONDE TIENEN QUE IR A ESCANEAR EL ARCHIVO DE CONFIGURACIÓN
@PropertySource("classpath:datosEmpresas.propiedades") // INYECTA PROPIEDADES A LOS OBJETOS EN ESPECIFICO
public class EmpleadosConfig {

    // DEFINIR EL BEAN PARA INFORMEDEPARTCOMPRAS
    @Bean
    public CreacionInformeFinanciero informeFinancieroDepartCompras(){ // ESTO SERA EL ID DEL BEAN INYECTADO
        return new InformeDepartCompras();
    }

    // DEFINIR EL BEAN PARA DIRECTORFINANCIERO E INYECTAR DEPENDENCIAS
    @Bean
    public Empleados directorFinanciero(){
        return new DirectorFinanciero(informeFinancieroDepartCompras());
    }

}
