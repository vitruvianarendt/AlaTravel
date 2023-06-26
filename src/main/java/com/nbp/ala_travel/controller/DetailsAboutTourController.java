package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.DetailsAboutTourService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("detailsAboutTourController")
public class DetailsAboutTourController {
    private final DetailsAboutTourService service;

    @GetMapping("/view1")
    public String detailsAboutTour(Model model,
                                   @RequestParam String city_name,
                                   @RequestParam("tour_name") String tour_name) {
        model.addAttribute("detailsAboutTour",
                service.viewDetailsAboutTour(city_name, tour_name));
        model.addAttribute("city_name", city_name);
        model.addAttribute("tour_name", tour_name);
        model.addAttribute("bodyContent", "details-about-tour");
        return "master-template";
    }
}
