package com.Amasong.Microservicio_Reporte.servicio;

import com.Amasong.Microservicio_Reporte.modelo.Reporte;
import com.Amasong.Microservicio_Reporte.repositorio.ReporteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteServicio {

    @Autowired
    private ReporteRepositorio repositorio;

    public Reporte guardar(Reporte reporte) {
        return repositorio.save(reporte);
    }

    public List<Reporte> obtenerTodos() {
        return repositorio.findAll();
    }

    public List<Reporte> obtenerPorTipo(String tipo) {
        return repositorio.findByTipo(tipo);
    }
}
