package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TourInstanceService;
import lombok.AllArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
@AllArgsConstructor
@RequestMapping("tourInstanceController")
public class TourInstanceController {

    private final TourInstanceService service;

    @PostMapping("/saveTourInstance")
    public String saveTourInstance(Model model,
                                   @RequestParam Long tourist_id,
                                   @RequestParam Long tour_instance_id) {
        model.addAttribute("saveTourInstance",
                service.saveTourInstance(tourist_id, tour_instance_id));
        model.addAttribute("touristId", tourist_id);
        model.addAttribute("grade", tour_instance_id);
        model.addAttribute("bodyContent", "saveTourInstance"); //just in case, change later
        return "master-template";
    }

    @PostMapping("/createTourInstance")
    public String createTourInstance(Model model,
                                     @RequestParam Long new_tour_id,
                                     @RequestParam Long new_tour_guide_id,
                                     @RequestParam Long new_language_id,
                                     @RequestParam LocalTime new_time,
                                     @RequestParam LocalDate new_date) {
        model.addAttribute("createTourInstance",
                service.createTourInstance(new_tour_id, new_tour_guide_id, new_language_id, new_time, new_date));
        model.addAttribute("touristId", new_tour_id);
        model.addAttribute("grade", new_tour_guide_id);
        model.addAttribute("touristId", new_language_id);
        model.addAttribute("grade", new_time);
        model.addAttribute("touristId", new_date);
        model.addAttribute("bodyContent", "createTourInstance");
        return "master-template";
    }

}
