package org.anderson.servicioweb.models;



public class Curso {
    //Declaramos un avariable de tipo private
    private String nombre;

    //implementamos el constructorr vacio
    public Curso(){
    }

    //implementamos un constructor que inicialice el atributo nombre
    public Curso(String nombre){
        this.nombre = nombre;
    }
    //IMPLEMENTAMOIS LOS METODOS GET AND SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
