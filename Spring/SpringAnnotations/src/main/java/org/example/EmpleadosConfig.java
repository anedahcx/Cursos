package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// ARCHIVO DE CONFIGURACIÓN JAVA
@Configuration // INDICAMOS QUE ESTA CLASE SERA EL ARCHIVO DE CONFIGURACIÓN Y REMPLAZAR EL ARCHIVO XML
@ComponentScan("org.example") // INDICAMOS EN DONDE TIENEN QUE IR A ESCANEAR EL ARCHIVO DE CONFIGURACIÓN
public class EmpleadosConfig {

}
