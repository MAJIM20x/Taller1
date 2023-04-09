import edu.princeton.cs.stdlib.StdOut;

import java.util.Random;

public class Linea {

    //Primera Coordenada X
    double x0 = 0;

    //Primera Coordenada Y
    double y0 = 0;

    //Segunda Coordenada X
    double x1 = 0;

    //Segunda Coordenada Y
    double y1 = 0;

    //Valor de la velocidad
    double velocidad = 0;

    public Linea(double x0, double y0, double x1, double y1, double velocidad)
    {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.velocidad = velocidad;

    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getY0() {
        return y0;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

}



