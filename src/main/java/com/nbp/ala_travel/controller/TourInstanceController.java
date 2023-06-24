package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TourInstanceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("tourInstanceController")
public class TourInstanceController {

    private final TourInstanceService service;

    @PostMapping
    public String saveTourInstance(Model model,
                                   @RequestParam Long tourist_id,
                                   @RequestParam Long tour_instance_id) {
        model.addAttribute("insertIntoReviewAndCheck",
                service.saveTourInstance(tourist_id, tour_instance_id));
        model.addAttribute("touristId", tourist_id);
        model.addAttribute("grade", tour_instance_id);
        model.addAttribute("bodyContent", "saveTourInstance"); //just in case, change later
        return "master-template";
    }

}
