package com.example.proit.weather_app.repository;
import com.example.proit.weather_app.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findByNameContaining(String name);
}
