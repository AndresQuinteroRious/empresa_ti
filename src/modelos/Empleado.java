package modelos;

public class Empleado {
    private int documento;
    private String nombre;
    private float sueldoHora;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(float sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("documento=").append(documento);
        sb.append(", nombre=").append(nombre);
        sb.append(", sueldoHora=").append(sueldoHora);
        sb.append('}');
        return sb.toString();
    }

    

    




    
    



}