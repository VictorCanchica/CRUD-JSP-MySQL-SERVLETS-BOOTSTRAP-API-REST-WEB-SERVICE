package sga.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import sga.domain.Persona;

@WebService
public interface PersonaServiceWs {
    
    @WebMethod
    public List<Persona> listarPersonas();
    
    
}
