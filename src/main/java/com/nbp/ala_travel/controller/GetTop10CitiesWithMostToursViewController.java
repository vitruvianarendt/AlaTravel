package com.example.ala_travel.controller;

import com.example.ala_travel.service.GetTop10CitiesWithMostToursViewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("getTop10CitiesWithMostTours")
public class GetTop10CitiesWithMostToursViewController {

    private final GetTop10CitiesWithMostToursViewService service;

    @GetMapping("/view1")
    public String getView1(Model model){
        model.addAttribute("top10CitiesWithMostTours", service.getTop10CitiesWithMostTours());
        model.addAttribute("bodyContent", "get-top-10-cities-with-most-tours-view");
        return "master-template";
    }
}


