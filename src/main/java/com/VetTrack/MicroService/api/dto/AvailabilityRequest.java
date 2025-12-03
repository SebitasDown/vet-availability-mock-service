package com.VetTrack.MicroService.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvailabilityRequest {
    private long veterinarianId;
    private String date;
    private String hour;
}
