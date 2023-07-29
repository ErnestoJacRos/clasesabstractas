package clasesabstractas;

public class Circulo  implements  Figura, Dibujable, Rotable{
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {

        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        return Math.PI * Math.pow(this.radio,this.radio);
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un círculo");
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un círculo");
    }
}
