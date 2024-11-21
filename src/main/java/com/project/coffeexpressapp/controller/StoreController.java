package com.project.coffeexpressapp.controller;

import com.project.coffeexpressapp.model.Store;
import com.project.coffeexpressapp.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/{id}")
    public Store getStoreById(@PathVariable int id) {
        return storeService.getStoreById(id);
    }

    @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }

    @PostMapping
    public Store createStore(@RequestBody Store store) {
        return storeService.createStore(store);
    }

    @PutMapping("/{id}")
    public Store updateStore(@PathVariable int id, @RequestBody Store dataStore) {
        return storeService.updateStore(id, dataStore);
    }

    @DeleteMapping("/{id}")
    public String deleteStore(@PathVariable int id) {
        storeService.deleteStore(id);
        return "Store with id- "+id+" has been deleted";
    }

}
