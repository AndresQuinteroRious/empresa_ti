package modelos;

public class Administrador extends Empleado{
    public double  calcularSalario(int horasTrabajadas) {
        return getSueldoHora()*horasTrabajadas;
    }
    
}
