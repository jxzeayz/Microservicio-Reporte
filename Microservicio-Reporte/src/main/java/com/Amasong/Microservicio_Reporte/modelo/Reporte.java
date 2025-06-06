package com.Amasong.Microservicio_Reporte.modelo;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "reportes")
@Data
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreReporte;

    @Column(nullable = false)
    private String tipoReporte; // "INVENTARIO", "VENTAS", "PAGOS"

    @Column(nullable = false, columnDefinition = "TEXT")
    private String datosReporte; // JSON almacenado como String

    @Column(nullable = false)
    private LocalDate fechaGeneracion;
}

