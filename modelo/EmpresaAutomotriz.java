package modelo;

public class EmpresaAutomotriz 
{
    //---------------------
    //-----Constantes------
    //---------------------
    public final static int NUMERO_EMPLEADOS = 10;

    //---------------------
    //------Atributos------
    //---------------------
    private Empleado[] empleados;

    //---------------------
    //------Metodos--------
    //---------------------
    public EmpresaAutomotriz()
    {
        empleados = new Empleado[NUMERO_EMPLEADOS];
    }

    public agregarEmpleado(Empleado emp, )
    
    
    private double calcularNomina()
    {   
        double totalNomina = 0;
        for(int i=0; i<empleados.length; i++)
        {
            totalNomina = totalNomina +  empleados[i].getSueldo(); 
        }
        return totalNomina;
    }
}
