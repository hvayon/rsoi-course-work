package ru.hvayon.StatisticsService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hvayon.StatisticsService.model.LogMessage;
import ru.hvayon.StatisticsService.service.StatisticsService;

import java.util.List;

@RestController
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @RequestMapping("/stats")
    public List<LogMessage> stat() {
        return statisticsService.select();
    }
}
