package operaciones;

import java.util.ArrayList;
import java.util.List;

import modelos.Empleado;

public class OperacionEmpleado implements IOperacionEmpleado {
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);

    }

    @Override
    public Empleado buscarPorDocumento(int documento) {
        for (Empleado e : empleados) {
            if (e.getDocumento() == documento) {
                return e;
            }
        }
        return null; // Si no se encuentra el empleado
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    @Override
    public double calcularSueldo(int documento, int horas) {
        Empleado e = buscarPorDocumento(documento);
        if (e != null) {
            return e.getSueldoHora() * horas;
        }
        return 0;
    }

    @Override
    public int contarEmpleados() {
        return empleados.size();
    }

}
