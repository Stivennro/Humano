
package herenci;

public class Humano {
    private String Nombre;
    
    public void comer (String Nombre){
        System.out.println(Nombre + "Esta comiendo desde la clase humano");
    }
    public void dormir (){ 
        System.out.println(Nombre + "Esta durmiendo desde la clase humano");
    }
    
    public String getNombre (){
    return Nombre;
    }
    
    public void setNombre (String Nombre){
    this.Nombre=Nombre;
    }
    
}
