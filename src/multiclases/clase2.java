package multiclases;

public class clase2 extends clase1{

    private float radio;
    private float perimetro;

    public clase2(){
        super(0);
    }

    public clase2(float radio, float perimetro,float lado) {
        super(lado);
        this.radio = radio;
        this.perimetro = perimetro;
    }



}
