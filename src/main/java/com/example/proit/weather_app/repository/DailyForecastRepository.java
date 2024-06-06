package com.example.proit.weather_app.repository;
import com.example.proit.weather_app.model.DailyForecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DailyForecastRepository extends JpaRepository<DailyForecast, Long> {
    List<DailyForecast> findByLocationId(Long locationId);
}

