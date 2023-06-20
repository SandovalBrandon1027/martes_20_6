package multiclases;

public class clase4 extends clase2{
    private String nombre;
    public clase4(){
        super();
    }

    public clase4(float radio, float perimetro, float lado, String nombre) {
        super(radio, perimetro, lado);
        this.nombre = nombre;
    }
}
