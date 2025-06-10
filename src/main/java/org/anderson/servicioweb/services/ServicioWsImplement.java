package org.anderson.servicioweb.services;




import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.anderson.servicioweb.models.Curso;

import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "org.anderson.servicioweb.services.ServicioWs")
public class ServicioWsImplement implements ServicioWs {
    //declaro una variable de tipo int de nombre contador
    private int contador;

    @WebMethod
    @Override
    public List<Curso> listar() {
        return Arrays.asList(new Curso("Java"), new Curso("PHP"), new Curso("Jakarta"));
    }

    @WebMethod
    @Override
    public String saludar(String persona) {
        System.out.println("Imprimiendo dentro del servicio web con instancia" + this);
        contador++;
        System.out.println("El valor del contador en el metodo saludar es " +  contador);

        return "Hola que tal " + persona;
    }

    @WebMethod
    @Override
    public Curso crear(Curso curso) {
        System.out.println("Curso creado con exito " + curso.getNombre());
        Curso nuevoCurso = new Curso();
        nuevoCurso.setNombre(curso.getNombre());
        return nuevoCurso;
    }
}