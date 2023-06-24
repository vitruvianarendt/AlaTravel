package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TouristSavedTourInstancesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@AllArgsConstructor
@RequestMapping("touristSavedTourInstancesController")
public class TouristSavedTourInstancesController {

    private final TouristSavedTourInstancesService service;

    @GetMapping("/view1/{touristId}")
    public String getView1(Model model,
                           @PathVariable Long touristId,
                           @RequestParam String city_name,
                           @RequestParam LocalDate tour_date1) {
        model.addAttribute("touristSavedTourInstances",
                service.touristSavedTourInstances(touristId, city_name, tour_date1));
        model.addAttribute("touristId", touristId);
        model.addAttribute("city_name", city_name);
        model.addAttribute("tour_date1", tour_date1);
        model.addAttribute("bodyContent", "touristSavedTourInstances");
        return "master-template";
    }
}
