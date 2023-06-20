package multiclases;

public class clase6 extends clase4 {
    private int edad;
    public clase6(){
        super();
    }

    public clase6(float radio, float perimetro, float lado, String nombre, int edad) {
        super(radio, perimetro, lado, nombre);
        this.edad = edad;
    }
}

