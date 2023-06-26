package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TourInstancesForTourService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("tourInstancesForTourController")
public class TourInstancesForTourController {
    private final TourInstancesForTourService service;

    @GetMapping("/view1/{tourId}")
    public String tourInstancesForTour(Model model,
                                       @PathVariable Long tourId) {
        model.addAttribute("tourInstancesForTour", service.getTourInstancesForTour(tourId));
        model.addAttribute("tourId", tourId);
        model.addAttribute("bodyContent", "tour-instances-for-tour");
        return "master-template";
    }
}
