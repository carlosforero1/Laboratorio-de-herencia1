package Persona;

public class PersonaU{

    private String noombre;
    private int edad;

    public void limiteEdad(int edad){
        if(edad >= 0 && edad <=110){
            System.out.println("la edad es valida");
        }else{
            System.out.println("la edad no es valida");
        }
    }
    public String getNoombre() {
        return noombre;
    }

    public void setNoombre(String noombre) {
        this.noombre = noombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
