package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TourService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("tourController")
public class TourController {
    private final TourService service;

    @GetMapping("/createTourForm")
    public String createTourForm(Model model) {
        model.addAttribute("bodyContent", "create-tour-form");
        return "master-template";
    }

    @PostMapping("/createTour")
    public String createTour(Model model,
                             @RequestParam Long new_starting_point,
                             @RequestParam Long new_tour_guide_id,
                             @RequestParam Long new_city_id,
                             @RequestParam String new_title,
                             @RequestParam String new_desc,
                             @RequestParam Integer new_duration,
                             @RequestParam Integer new_max_participants) {
        model.addAttribute("createTour",
                service.createTour(new_starting_point, new_tour_guide_id, new_city_id, new_title, new_desc,
                        new_duration, new_max_participants));
        return "redirect:/personController/loginForm";
    }
}

