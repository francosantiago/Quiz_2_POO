package modelo;

import java.util.ArrayList;


public class Empleado 
{
    public final static double SALARIO_MINIMO = 1000000;

    private String nombre;
    private ArrayList ventas;
    private double sueldo;

    public Empleado(String pNombre)
    {
        this.nombre = pNombre;
        this.ventas = new ArrayList();
    }

    public void venderCarro()
    {
        ventas.add();
    }

    public void calcularSueldo()
    {
        if(ventas.isEmpty())
        {
            sueldo = SALARIO_MINIMO;
        }
        else
        {
            //Numero carros vendidos
            int numCarrosVendidos = ventas.size();

            sueldo = SALARIO_MINIMO + 100000 * numCarrosVendidos;

            double totalVentas = 0;
            for(int i = 0; i < numCarrosVendidos; i++)
            {
                Carro carro = (Carro)ventas.get(i);
                totalVentas = totalVentas + carro.getPrecio();
            }

            sueldo = sueldo + 0.02 * totalVentas;

        }
    }

    public double getSueldo()
    {
        return sueldo;
    }

}
