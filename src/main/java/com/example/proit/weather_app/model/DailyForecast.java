package com.example.proit.weather_app.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;


@Entity
@Table(name = "daily_forecast")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyForecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @Column(nullable = false)
    private String date;

    private Double temperature;
    private Double surfaceWind;
    private Double rain;

    @OneToMany(mappedBy = "dailyForecast", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HourlyForecast> hourlyForecasts;
}
