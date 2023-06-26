package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TourInstancesByCityAndDateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@AllArgsConstructor
@RequestMapping("tourInstancesByCityAndDateController")
public class TourInstancesByCityAndDateController {
    private final TourInstancesByCityAndDateService service;

    @GetMapping("/view1")
    public String tourInstancesByCityAndDate(Model model,
                                             @RequestParam Long city_id,
                                             @RequestParam LocalDate date) {
        model.addAttribute("tourInstancesByCityAndDate",
                service.tourInstancesByCityAndStartDate(city_id, date));
        model.addAttribute("city_id", city_id);
        model.addAttribute("date", date);
        model.addAttribute("bodyContent", "tour-instances-by-city-and-date");
        return "master-template";
    }
}
