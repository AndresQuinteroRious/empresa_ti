package pricipal;

import modelos.*;
import operaciones.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        IOperacionEmpleado opEmpleado = new OperacionEmpleado();
        IOperacionEmpresa opEmpresa = new OperacionEmpresa();

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n---menu---");

        System.out.println("1. Agregar empresa");
        System.out.println("2. Agregar Empleado");
        System.out.println("3. Mostrar Empresas");
        System.out.println("4. Mostrar Empleados");
        System.out.println("5. Buscar Empleado por Documento");
        System.out.println("6. Calcular sueldo de un empleado");
        System.out.println("7. Contar empleados");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Empresa emp = new Empresa();
                System.out.print("Ingrese el NIT de la empresa: ");
                emp.setNit(sc.nextInt());
                sc.nextLine(); // Limpiar el buffer
                System.out.print("Ingrese el nombre de la empresa: ");
                emp.setNombre(sc.nextLine());
                System.out.print("Ingrese la dirección de la empresa: ");
                emp.setDireccion(sc.nextLine());
                System.out.print("Ingrese la ciudad de la empresa: ");
                emp.setCiudad(sc.nextLine());
                opEmpresa.agregarEmpresa(emp);
                break;
            case 2:
                Empleado e = new Empleado();
                System.out.print("Documento: ");
                e.setDocumento(sc.nextInt());
                sc.nextLine(); // Limpiar el buffer
                System.out.print("Nombre: ");
                e.setNombre(sc.nextLine());
                System.out.print("Sueldo por hora: ");
                e.setSueldoHora(sc.nextFloat());
                sc.nextLine(); // Limpiar el buffer
                opEmpleado.agregarEmpleado(e);
                break;
            case 3:
                System.out.println(opEmpresa.listarEmpresas());
                break;
            case 4:
                System.out.println(opEmpleado.listarEmpleados());
                break;
            case 5:
                System.out.print("Ingrese el documento: ");
                int documento = sc.nextInt();
                System.out.println(opEmpleado.buscarPorDocumento(documento));
                break;

            case 6:
                System.out.print("Documento: ");
                int docBusqueda = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
                System.out.print("Horas trabajadas: ");
                int horas = sc.nextInt();
                System.out.println("Sueldo: " + opEmpleado.calcularSueldo(docBusqueda, horas));
                break;

            case 7:
                System.out.println("Total de empleados: " + opEmpleado.contarEmpleados());
                break;


        }
        } while (opcion != 0);
        sc.close();
    }
}
