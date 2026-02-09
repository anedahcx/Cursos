package spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class ObtenerCalificacion implements CalificacionMinima{

    @Override
    public Integer getObtenerCalMinima() {
        return 8;
    }
}
