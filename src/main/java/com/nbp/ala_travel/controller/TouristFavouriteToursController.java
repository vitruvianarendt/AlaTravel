package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.TouristFavouriteToursService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("touristFavouriteTours")
public class TouristFavouriteToursController {

    private final TouristFavouriteToursService service;

    @GetMapping("/view1/{touristId}")
    public String touristFavouriteTours(Model model,
                                        @PathVariable Long touristId,
                                        @RequestParam String city_name) {
        model.addAttribute("touristFavouriteTours",
                service.filter_favourite_tours(touristId, city_name));
        model.addAttribute("touristId", touristId);
        model.addAttribute("city_name", city_name);
        model.addAttribute("bodyContent", "touristFavouriteTours");
        return "master-template";
    }
}
