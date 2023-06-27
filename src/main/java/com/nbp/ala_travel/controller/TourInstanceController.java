package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TourInstanceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        String result = service.saveTourInstance(tourist_id, tour_instance_id);
        if (result.equals("OK")) {
            model.addAttribute("saveTourInstance", result);
            model.addAttribute("touristId", tourist_id);
            model.addAttribute("grade", tour_instance_id);
            model.addAttribute("bodyContent", "saveTourInstance"); //just in case, change later
        } else {
            model.addAttribute("errorMsg", result);
            model.addAttribute("bodyContent","error");
        }

        return "master-template";
    }

    @GetMapping("/createTourInstanceForm/{tourId}")
    public String createTourInstanceForm(Model model,
                                         @PathVariable Long tourId) {
        model.addAttribute("tourId", tourId);
        model.addAttribute("bodyContent", "create-tour-instance-form");
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
        return "redirect:/tourInstancesForTourController/view1/" + new_tour_id;
//        return "/home";
    }

}
