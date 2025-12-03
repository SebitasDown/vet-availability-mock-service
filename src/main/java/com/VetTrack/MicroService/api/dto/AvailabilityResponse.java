package com.VetTrack.MicroService.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvailabilityResponse {
    private Long veterinarianId;
    private boolean available;
    private String reason;
}
