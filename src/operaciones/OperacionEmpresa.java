package operaciones;

import java.util.ArrayList;
import java.util.List;

import modelos.Empresa;

public class OperacionEmpresa implements IOperacionEmpresa {
    private List<Empresa> empresas = new ArrayList<>();

    @Override
    public void agregarEmpresa(Empresa e) {
        empresas.add(e);
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return empresas;
    }

}
