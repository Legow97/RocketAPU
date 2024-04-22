package com.pxp.SQLite.demo.controller;

import com.pxp.SQLite.demo.entity.LogEntity;
import com.pxp.SQLite.demo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    @Autowired
    private LogService logService;

    // API para obtener un LogEntity por ID
    @GetMapping("/log")
    public LogEntity getLog(@RequestParam String id) {
        // Llamar al servicio para obtener el LogEntity con el ID especificado
        LogEntity log = logService.getLog(id);
        return log;
    }
}
