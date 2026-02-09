package spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotasAlumnos implements Alumnos {

    private ObtenerCalificacion calificacionMinima;

    @Autowired
    public void setCalificacionMinima(ObtenerCalificacion calificacionMinima) {
        this.calificacionMinima = calificacionMinima;
    }

    @Override
    public String getTareas() {
        return "Sin tareas por hacer!";
    }

    @Override
    public Integer getCalificacion() {
        return calificacionMinima.getObtenerCalMinima();
    }
}
