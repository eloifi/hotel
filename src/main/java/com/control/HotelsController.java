package com.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.HotelDao;
import com.model.Hotel;

@RestController
public class HotelsController
{
    @Autowired
    private HotelDao HotelDao;

    @PostMapping("/saveHotel")
    public @ResponseBody Hotel saveHotel(String ref, String type, String designation, String adresse, String photo)
    {

        Hotel Hotel = new Hotel(ref, type, designation, adresse, photo);
        return HotelDao.save(Hotel);
    }

    @GetMapping("/getHotels")
    public @ResponseBody List<Hotel> getHotels()
    {
        return HotelDao.findAll();
    }
}
