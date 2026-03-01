package com.agrsmrt.webapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "crop_recommendation_log")
public class CropRecommendationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id", nullable = false)
    private Integer id;

    @Column(name = "score", precision = 5, scale = 2)
    private BigDecimal score;

    @Size(max = 100)
    @Column(name = "recommended_crop", length = 100)
    private String recommendedCrop;

    @Column(name = "recommendation_date")
    private Instant recommendationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plot_id")
    private LandPlot plot;


}