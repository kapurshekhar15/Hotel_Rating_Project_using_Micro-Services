package com.lcwd.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
