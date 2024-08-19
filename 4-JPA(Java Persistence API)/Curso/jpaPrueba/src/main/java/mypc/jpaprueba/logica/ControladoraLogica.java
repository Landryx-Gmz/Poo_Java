
package mypc.jpaprueba.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import mypc.jpaprueba.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();   
    
    //Alumno
    public void crearAlumno(Alumno alu) {
        
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id) {
        
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    //creamos una funcion porque en este caso tiene que devolver un valor.
    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno(id);        
    }
    //Creamos una funcion mediante una ArrayList para que nos devuelva todo los alumnos de nuestra base de datos
    public ArrayList<Alumno> traerListaAlumnos () {
        return controlPersis.traerListaAlumnos();
    }
    
    //Carrera
    
    public void crearCarrera(Carrera carre) {
        
        controlPersis.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id) {
        
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
    }
    //creamos una funcion porque en este caso tiene que devolver un valor.
    public Carrera traerCarrera(int id) {
        return controlPersis.traerCarrera(id);        
    }
    //Creamos una funcion mediante una ArrayList para que nos devuelva todo los alumnos de nuestra base de datos
    public ArrayList<Carrera> traerListaCarreras () {
        return controlPersis.traerListaCarrera();
    }
    
    
    //Materia
    
    public void crearMateria(Materia mate) {
        
        controlPersis.crearCarrera(mate);
    }
    
    public void eliminarMateria(int id) {
        
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria(Materia mate){
        controlPersis.editarMateria(mate);
    }
    //creamos una funcion porque en este caso tiene que devolver un valor.
    public Materia traerMateria(int id) {
        return controlPersis.traerMateria(id);        
    }
    //Creamos una funcion mediante una ArrayList para que nos devuelva todo los alumnos de nuestra base de datos
    public LinkedList<Materia> traerListaMateria () {
        return controlPersis.traerListaMateria();
    }
    
    
    
}
