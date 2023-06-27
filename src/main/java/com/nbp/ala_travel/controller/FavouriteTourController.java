package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.FavouriteTourService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("favouriteTourController")
public class FavouriteTourController {

    private final FavouriteTourService service;

    @PostMapping("/savedFavouriteTour/{touristId}")
    public String savedFavouriteTour(Model model,
                                     @PathVariable Long touristId,
                                     @RequestParam Long tourid) {
        String result = service.savedFavouriteTour(touristId, tourid);
        if (result.equals("OK")) {
            model.addAttribute("insertIntoReviewAndCheck", service.savedFavouriteTour(touristId, tourid));
            model.addAttribute("touristId", touristId);
            model.addAttribute("tourid", tourid);
            model.addAttribute("bodyContent", "savedFavouriteTour");
        } else  {
            model.addAttribute("errorMsg", result);
            model.addAttribute("bodyContent","error");
        }

        return "master-template";
    }
}
