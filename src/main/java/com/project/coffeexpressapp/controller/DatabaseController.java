package com.project.coffeexpressapp.controller;

import com.project.coffeexpressapp.service.DatabaseConnectionService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DatabaseController {

    @Autowired
    private DatabaseConnectionService databaseConnectionService;

    @GetMapping("/check-connection")
    public String checkDatabaseConnection() {
        if (databaseConnectionService.checkConnection()) {
            return "Conexión exitosa a la base de datos.";
        } else {
            return "Error al conectar a la base de datos.";
        }
    }
}
