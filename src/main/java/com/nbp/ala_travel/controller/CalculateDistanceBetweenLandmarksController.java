package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.CalculateDistanceBetweenLandmarksService;
import lombok.AllArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("calculateDistanceController")
public class CalculateDistanceBetweenLandmarksController {

    private final CalculateDistanceBetweenLandmarksService service;

    @GetMapping("/getForm")
    public String getCalculateDistanceForm(Model model) {
        model.addAttribute("landmarksDto", service.getLandmarkDto());
        model.addAttribute("submitted", 0);
        model.addAttribute("bodyContent", "calculate-distance-form");
        return "master-template";
    }

    @PostMapping("/calculate-distance")
    public String calculateDistance(Model model,
                                    @RequestParam Long landmarkid1,
                                    @RequestParam Long landmarkid2) {
        model.addAttribute("landmarksDto", service.getLandmarkDto());
        model.addAttribute("result", service.calculateDistance(landmarkid1,landmarkid2));
        model.addAttribute("submitted", 1);
        model.addAttribute("bodyContent", "calculate-distance-form");
        return "master-template";
    }
}
