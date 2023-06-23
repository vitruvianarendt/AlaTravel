package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.GetToursByCityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("getToursByCity")
public class GetToursByCityController {
    private final GetToursByCityService service;

    @GetMapping("/view1/{cityId}")
    public String getView1(@PathVariable Long cityId, Model model) {
        model.addAttribute("getToursByCity", service.getToursByCity(cityId));
        model.addAttribute("cityId", cityId);
        model.addAttribute("bodyContent", "get-tours-by-city");
        return "master-template";
    }
}
