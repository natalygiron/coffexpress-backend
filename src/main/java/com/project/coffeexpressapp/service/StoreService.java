package com.project.coffeexpressapp.service;

import com.project.coffeexpressapp.model.Store;
import com.project.coffeexpressapp.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    public Store getStoreById(int id) {
        return storeRepository.findById(id).orElseThrow( ()-> new RuntimeException("Store not found."));
    }

    public Store createStore(Store store) {
        if( storeRepository.existsByEmail(store.getEmail())) {
            throw new IllegalArgumentException("The email " + store.getEmail() + " is already in use.");
        }
        return storeRepository.save(store);
    }

    public Store updateStore(int id, Store dataStore) {
        Store store = getStoreById(id);
        store.setName(dataStore.getName());
        store.setPassword(dataStore.getPassword());
        store.setEmail(dataStore.getEmail());
        store.setDescription(dataStore.getDescription());
        store.setLocation(dataStore.getLocation());
        store.setPicture(dataStore.getPicture());
        return storeRepository.save(store);
    }

    public void deleteStore(int id) {
        storeRepository.deleteById(id);
    }




}
