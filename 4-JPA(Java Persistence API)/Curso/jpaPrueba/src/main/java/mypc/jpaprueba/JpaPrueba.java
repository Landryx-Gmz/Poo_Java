
package mypc.jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import mypc.jpaprueba.logica.Alumno;
import mypc.jpaprueba.logica.Carrera;
import mypc.jpaprueba.logica.ControladoraLogica;
import mypc.jpaprueba.logica.Materia;

public class JpaPrueba {

    public static void main(String[] args) {
        
       ControladoraLogica control = new ControladoraLogica();
       
        //Creamos lista de materias y las agregaamos
        LinkedList<Materia>listaMaterias = new LinkedList<Materia>();
        //Creacion Carrera con lista de materias
        Carrera carre = new Carrera(25, "Tecnicatura en Programacion", listaMaterias);
        //Guardado Carrera
        control.crearCarrera(carre);
       
       //Cracion Materias
       Materia mate1 = new Materia(58, "Programacion I", "Cuatrimestral", carre);
       Materia mate2 = new Materia(59, "Programacion II", "Cuatrimestral", carre);
       Materia mate3 = new Materia(60, "Programacion III", "Anual", carre);
       
       //Guardado Materias en BD
       control.crearMateria(mate1);
       control.crearMateria(mate2);
       control.crearMateria(mate3);
       
      //Agregar a la lista de materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);     
              
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
        
        
        
        
        //Creacion de alumno con carrera
        Alumno al = new Alumno(23, "Mike", "Schenker", new Date(), carre);
        Alumno al2 = new Alumno(2, "Andy", "Gomez", new Date(), carre);
        Alumno al3 = new Alumno(3, "Dario", "Gonzalez", new Date(), carre);
        Alumno al4 = new Alumno(4, "Rougsh", "Montoya", new Date(), carre);

        
        
        
        //Guardamos el alumno en la BD
        control.crearAlumno(al);
        control.crearAlumno(al2);
        control.crearAlumno(al3);
        control.crearAlumno(al4);

        
        //Vemos el resultado
        System.out.println("-------------------------");
        System.out.println("-------Datos Alumno------");
        Alumno alu = control.traerAlumno(23);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de " + alu.getCarre().getNombre());
      
        
    }
}
