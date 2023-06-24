package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TourService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("tourController")
public class TourController {
    private final TourService service;

    @PostMapping
    public String createTour(Model model,
                             @RequestParam Long new_starting_point,
                             @RequestParam Long new_tour_guide_id,
                             @RequestParam Long new_city_id,
                             @RequestParam String new_title,
                             @RequestParam String new_desc,
                             @RequestParam Integer new_duration,
                             @RequestParam Integer new_max_participants) {
        model.addAttribute("insertIntoReviewAndCheck",
                service.createTour(new_starting_point, new_tour_guide_id, new_city_id, new_title, new_desc,
                        new_duration, new_max_participants));
        model.addAttribute("new_starting_point", new_starting_point);
        model.addAttribute("new_tour_guide_id", new_tour_guide_id);
        model.addAttribute("new_city_id", new_city_id);
        model.addAttribute("new_desc", new_desc);
        model.addAttribute("new_duration", new_duration);
        model.addAttribute("new_max_participants", new_max_participants);
        model.addAttribute("bodyContent", "review");
        return "master-template";
    }
}

