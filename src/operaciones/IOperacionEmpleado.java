package operaciones;

import java.util.List;
import modelos.Empleado;


public interface IOperacionEmpleado {
    void agregarEmpleado(Empleado e);
    Empleado buscarPorDocumento(int documento);
    List<Empleado> listarEmpleados();
    double calcularSueldo(int documento, int horas);
    int contarEmpleados();

}
