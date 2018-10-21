package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dao.HotelDao;
import com.model.Hotel;

@SpringBootApplication
public class HotelApplication
{

    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(HotelApplication.class, args);
        HotelDao hotelDao = (HotelDao) ctx.getBean(HotelDao.class);
        hotelDao.save(new Hotel("ref1", "5*", "farah", "rabat", "c://"));
        hotelDao.save(new Hotel("ref2", "5*", "the hotel", "bruxelles", "c://"));
    }
}
