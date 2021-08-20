package com.github.ronaldsvale.citiesapi.countries.repository;

import com.github.ronaldsvale.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
