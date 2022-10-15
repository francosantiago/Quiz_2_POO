
package ejecutable;

import controlador.Controlador;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;

public class Test {
    public static void main(String[] args) 
    {
        EmpresaAutomotriz miVentaCarros = new EmpresaAutomotriz();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miVentaCarros);
        Empleado emp1 = new Empleado("Nestor");
        Empleado emp2 = new Empleado("Jose");
        Empleado emp3 = new Empleado("Luis");

        miEmpresa.agregarEmpleado(emp1, 0);
        miEmpresa.agregarEmpleado(emp2, 0);
        miEmpresa.agregarEmpleado(emp3, 0);

        System.out.println("Nomina empresa" + miEmpresa.calcularNomina);

    }
}