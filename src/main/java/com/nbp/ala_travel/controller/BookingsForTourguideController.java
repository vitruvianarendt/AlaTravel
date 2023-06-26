package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.BookingsForTourguideService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("getBookingsForTourguide")
public class BookingsForTourguideController {
    private final BookingsForTourguideService service;

    @GetMapping("/view1/{tourguideId}")
    public String getBookingsForTourguide(Model model,
                                          @PathVariable Long tourguideId) {
        model.addAttribute("getBookingsForTourist", service.getBookingsForTourguide(tourguideId));
        model.addAttribute("tourguideId", tourguideId);
        model.addAttribute("bodyContent", "get-bookings-for-tourguide");
        return "master-template";
    }
}
