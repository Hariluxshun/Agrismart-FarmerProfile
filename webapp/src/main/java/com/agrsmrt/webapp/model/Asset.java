package com.agrsmrt.webapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "asset")
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asset_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "type", length = 50)
    private String type;

    @Size(max = 100)
    @Column(name = "model", length = 100)
    private String model;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "warranty_due")
    private Integer warrantyDue;

    @Column(name = "warranty_end_date")
    private LocalDate warrantyEndDate;

    @Size(max = 50)
    @Column(name = "current_status", length = 50)
    private String currentStatus;

    @Column(name = "cost", precision = 12, scale = 2)
    private BigDecimal cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private AssetManager manager;


}