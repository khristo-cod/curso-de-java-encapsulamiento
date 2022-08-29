package personaprueba;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 50000, false );
        System.out.println("persona1 nombre: "+ persona1.getNombre());
        
        persona1.setNombre("juan carlos");
        System.out.println("persona1 nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 sueldo: " + persona1.getSueldo());
        System.out.println("persona1 eliminado: " +persona1.isEliminado());
    }
}
