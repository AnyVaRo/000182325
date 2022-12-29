package com.example._000182325final.domain.services;


import com.example._000182325final.domain.models.Reporte;

import java.util.List;


public interface ReporteService {
    Reporte create(Reporte reporte);
    List<Reporte> getAll();
    Reporte update(Reporte reporte);
}
