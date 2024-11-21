package com.project.coffeexpressapp.repository;

import com.project.coffeexpressapp.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Integer> {

    boolean existsByEmail(String email);

}
