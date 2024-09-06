package com.bibliosenaiTres.bibliosenaiTres.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibliosenaiTres.bibliosenaiTres.service.TimeFutebolService;

@RestController
@RequestMapping("/time-futebol")
public class TimeFutebolController {

    @Autowired
    TimeFutebolService timefutebolService;

    @GetMapping

    public ResponseEntity<?> getTimes() {

        var times = timefutebolService.getAllTimes();

        return ResponseEntity.ok(times);

    }

}
