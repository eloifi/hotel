package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Long>
{
}
