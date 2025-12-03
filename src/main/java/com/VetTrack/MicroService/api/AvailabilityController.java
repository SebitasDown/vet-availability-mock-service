package com.VetTrack.MicroService.api;

import com.VetTrack.MicroService.api.dto.AvailabilityRequest;
import com.VetTrack.MicroService.api.dto.AvailabilityResponse;
import com.VetTrack.MicroService.service.AvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/availability")
@RequiredArgsConstructor
public class AvailabilityController {
    private final AvailabilityService availabilityService;


    @PostMapping
    public AvailabilityResponse check (@RequestBody AvailabilityRequest request){

        boolean available = availabilityService.checkAvailability(
                request.getVeterinarianId(),
                request.getDate(),
                request.getHour()
        );

        String reason = available ? "Disponible" : "Agenda ocupada";

        return  new AvailabilityResponse(request.getVeterinarianId(), available, reason);
    }
}
