package com.dblibproject.dblibproject;

import com.dblibproject.dblibproject.RandomSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class RandomSumController {

    @Autowired
    private RandomSumService randomSumService;

    @GetMapping
    public int getRandomSum() {
        return randomSumService.getRandomSum();
    }
}
