package multiclases;

public class clase5 extends clase4{

    private String apellido;

    public clase5(){
        super();
    }

    public clase5(float radio, float perimetro, float lado, String nombre, String apellido) {
        super(radio, perimetro, lado, nombre);
        this.apellido = apellido;
    }
}
