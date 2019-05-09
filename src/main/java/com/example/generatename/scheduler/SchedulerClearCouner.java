package com.example.generatename.scheduler;


import com.example.generatename.dto.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class SchedulerClearCouner {

    @Autowired
    Counter counter;

    @Scheduled(fixedRate = 5000)
    public void clearCounter() {
        counter.clearCounter();
    }

}
