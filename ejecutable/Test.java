
package ejecutable;

import controlador.Controlador;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;

public class Test {
    public static void main(String[] args) 
    {
        EmpresaAutomotriz miEmpresa = new EmpresaAutomotriz();
        
        String[] nombres = ("Nestor Paez", "Jose Herrera", "Luis florez");

        for(int i=0; i<nombres.length; i++)
        {
            miEmpresa.agregarEmpleado(new Empleado(nombres[i]), i);
        }

        System.out.println("Nomina empresa" + miEmpresa.calcularNomina());

        Empleado amp1 = miEmpresa.getEmpleado(i:0);

        emp1.miVentaCarro(new Carro(15000000));
        emp1.miVentaCarro(new Carro(5000000));
        
        VentanaPrincipal miVentana = new VentanaPrincipal();
        EmpresaAutomotriz miVentaCarros;
        new Controlador(miVentana, miVentaCarros);

       

    

    }
}