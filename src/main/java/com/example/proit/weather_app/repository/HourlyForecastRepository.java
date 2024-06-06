package com.example.proit.weather_app.repository;
import com.example.proit.weather_app.model.HourlyForecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HourlyForecastRepository extends JpaRepository<HourlyForecast, Long> {
    List<HourlyForecast> findByDailyForecastId(Long dailyForecastId);
}

