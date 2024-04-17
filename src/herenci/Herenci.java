
package herenci;


public class Herenci {


    public static void main(String[] args) {
      Humano Adulto = new Humano ();
      Adulto.setNombre(" Uno ");
      Adulto.comer(Adulto.getNombre());
      Adulto.dormir();
      
        System.out.println();
        Hombre Padre = new Hombre();
        Padre.setNombre(" Dos ");
        Padre.comer(Padre.getNombre());
        Padre.dormir();
        Padre.afeitarse();
        
        Mujer Madre = new Mujer ();
        Madre.setNombre(" one ");
        Madre.comer(Madre.getNombre());
        Madre.dormir();
        Madre.maquillarse(Madre.getNombre());

        
    }
    
}
