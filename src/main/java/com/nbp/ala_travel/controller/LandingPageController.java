package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.GetTop10CitiesWithMostToursViewService;
import com.nbp.ala_travel.service.GetTop10ToursWithMostBookingsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/home")
public class LandingPageController {

    private final GetTop10CitiesWithMostToursViewService getTop10CitiesWithMostToursViewService;
    private final GetTop10ToursWithMostBookingsService getTop10ToursWithMostBookingsService;

    @GetMapping
    public String getLandingPage(Model model) {
        model.addAttribute("top10ToursWithMostBookings", getTop10ToursWithMostBookingsService.getTop10ToursWithMostBookings());
        model.addAttribute("top10CitiesWithMostTours", getTop10CitiesWithMostToursViewService.getTop10CitiesWithMostTours());
        model.addAttribute("bodyContent", "home-page");
        return "master-template";
    }
}
