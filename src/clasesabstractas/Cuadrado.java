package clasesabstractas;

public class Cuadrado implements Figura, Dibujable {
    private  Double lado;
    public Cuadrado() {
    }
    public Cuadrado(Double lado) {

        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }
}
