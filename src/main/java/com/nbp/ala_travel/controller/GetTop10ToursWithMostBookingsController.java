package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.GetTop10ToursWithMostBookingsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("getTop10ToursWithMostBookings")
public class GetTop10ToursWithMostBookingsController {
    private final GetTop10ToursWithMostBookingsService service;

    @GetMapping("/view2")
    public String getView2(Model model) {
        model.addAttribute("top10CitiesWithMostTours", service.getTop10ToursWithMostBookings());
        model.addAttribute("bodyContent", "get-top-10-tours-with-most-bookings-view");
        return "master-template";
    }
}
