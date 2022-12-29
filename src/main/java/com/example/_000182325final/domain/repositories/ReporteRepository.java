package com.example._000182325final.domain.repositories;


import com.example._000182325final.domain.models.Reporte;

import java.util.List;

public interface ReporteRepository {
    Reporte save(Reporte reporte);
    List<Reporte> getAll();
    Reporte getOne(Long id);
    void delete(Long id);
}
