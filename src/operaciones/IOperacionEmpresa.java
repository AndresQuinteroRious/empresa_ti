package operaciones;

import java.util.List;

import modelos.Empresa;

public interface IOperacionEmpresa {
    void agregarEmpresa(Empresa e);
    List<Empresa> listarEmpresas();
}
