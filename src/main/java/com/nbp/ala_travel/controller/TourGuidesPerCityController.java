package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TourGuidesPerCityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("tourGuidesPerCityController")
public class TourGuidesPerCityController {

    private final TourGuidesPerCityService service;

    @GetMapping("/view1")
    public String tourGuidesPerCity(Model model,
                                    @RequestParam String city_name) {
        model.addAttribute("tourGuidesPerCity", service.tourGuidesPerCity(city_name));
        model.addAttribute("city_name", city_name);
        model.addAttribute("bodyContent", "tour-guides-per-city");
        return "master-template";
    }
}
