package com.agrsmrt.webapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "soil_data")
public class SoilDatum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id", nullable = false)
    private Integer id;

    @Column(name = "phosphorus_val", precision = 8, scale = 2)
    private BigDecimal phosphorusVal;

    @Column(name = "potassium_val", precision = 8, scale = 2)
    private BigDecimal potassiumVal;

    @Column(name = "nitrogen_val", precision = 8, scale = 2)
    private BigDecimal nitrogenVal;

    @Column(name = "ph_val", precision = 5, scale = 2)
    private BigDecimal phVal;

    @Column(name = "rainfall_val", precision = 8, scale = 2)
    private BigDecimal rainfallVal;

    @Column(name = "humidity_val", precision = 8, scale = 2)
    private BigDecimal humidityVal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plot_id")
    private LandPlot plot;

    @Column(name = "test_date")
    private LocalDate testDate;


}