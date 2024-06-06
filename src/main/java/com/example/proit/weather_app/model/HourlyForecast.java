package com.example.proit.weather_app.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "hourly_forecast")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HourlyForecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "daily_forecast_id", nullable = false)
    private DailyForecast dailyForecast;

    @Column(nullable = false)
    private String time;

    private Double temperature;
    private Double surfaceWind;
    private Double rain;
}
