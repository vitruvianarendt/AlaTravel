package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.FavouriteTourService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("favouriteTourController")
public class FavouriteTourController {

    private final FavouriteTourService service;

    @PostMapping("/savedFavouriteTour/{touristId}")
    public String savedFavouriteTour(Model model,
                                     @PathVariable Long touristId,
                                     @RequestParam Long tourid) {
        model.addAttribute("insertIntoReviewAndCheck", service.savedFavouriteTour(touristId, tourid));
        model.addAttribute("touristId", touristId);
        model.addAttribute("tourid", tourid);
        model.addAttribute("bodyContent", "savedFavouriteTour");
        return "master-template";
    }
}
