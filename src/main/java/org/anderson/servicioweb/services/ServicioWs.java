package org.anderson.servicioweb.services;



import org.anderson.servicioweb.models.Curso;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface ServicioWs {
    //implementamos un metodo para "saludar"
    String saludar (String persona);

    //implementamos un metodo para "listar" los cursos
    List<Curso> listar();

    //implementamos un metodo para "crear" un objeto de tipo curso
    Curso crear(Curso curso);
}
