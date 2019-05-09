package com.example.generatename.controller;


import com.example.generatename.dto.FileType;
import com.example.generatename.service.GenerateNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TestController {

    @Autowired
    GenerateNameService generateNameService;

    @GetMapping
    public String generate() {
        LocalDate localDate = LocalDate.now();
        return generateNameService.getNameForEcms(localDate, FileType.PDF);
    }

}
