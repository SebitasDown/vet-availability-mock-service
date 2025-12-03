package com.VetTrack.MicroService.service;

import org.springframework.stereotype.Service;

@Service
public class AvailabilityService {

    public boolean checkAvailability(Long vetId, String date, String hour) {
        String key = vetId + date + hour;
        int hash = key.hashCode();
        return hash % 2 == 0; // Recordar si es par sale true o disponible
    }
}
