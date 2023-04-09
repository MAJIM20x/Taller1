import edu.princeton.cs.stdlib.StdDraw;
import edu.princeton.cs.stdlib.StdOut;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //Lista de las lineas generadas
    public static void main(String[] args) {

        //Generador de valores aleatorios

        //Listas
        Linea lista_lineas[] = new Linea[6];
        Color[] colores = {Color.BLACK, Color.BLUE, Color.CYAN, Color.RED, Color.ORANGE, Color.YELLOW};

        double min = -1.0;
        double max = 1.0;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        StdDraw.enableDoubleBuffering();

        generador_lineas(lista_lineas);

        dibujar_lineas(lista_lineas, colores);

        movimiento_lineas(lista_lineas);

    }


    //Metodo para generar 6 lineas al azar.
    private static void generador_lineas(Linea lista_lineas[])
    {
        //Primera linea generada.
        lista_lineas[0] = new Linea(-1 + (1 - -1) * Math.random(),-1 + (1 - -1) * Math.random(),-1 + (1 - -1) * Math.random(),-1 + (1 - -1) * Math.random(),0);

        //Ciclo para generar las demas lineas.
        for(int i = 1; i < lista_lineas.length; i++)
        {
            //Variable auxiliar.
            double resta = i/10.0;

            //Las lineas generadas son almacenadas en un arreglo.
            lista_lineas[i] = new Linea(lista_lineas[0].getX0() - resta,lista_lineas[0].getY0() - resta, lista_lineas[0].getX1() - resta, lista_lineas[0].getY1() - resta, 0);

        }

    }

    //Metodo para asignar las coordenadas a las lineas y dibujarlas.
    private static void dibujar_lineas(Linea lista_lineas[],Color colores[])
    {

        for(int i = 0; i < lista_lineas.length; i++)
        {
            StdDraw.setPenColor(colores[i]);
            StdDraw.line(lista_lineas[i].getX0(), lista_lineas[i].getY0(), lista_lineas[i].getX1(), lista_lineas[i].getY1());
            StdDraw.show();
        }

    }

    //Metodo par asignar una velocidad y comportamiento de las lineas entre ellas.
    private static void movimiento_lineas(Linea lista_lineas[])
    {
        double valor_velocidad = 3;

        while (true) {

            lista_lineas[0].x0 += valor_velocidad;
            lista_lineas[0].y0 += valor_velocidad;
            lista_lineas[0].x1 += valor_velocidad;
            lista_lineas[0].y1 += valor_velocidad;




        }
    }
}