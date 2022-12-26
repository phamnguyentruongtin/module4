package com.example.repository;

import com.example.model.HealthDeclaration;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class HealthDeclarationRepository implements IHealthDeclarationRepository {
    Map<Integer,HealthDeclaration> healthDeclarationList = new HashMap<>();
    @Override
    public void save(HealthDeclaration healthDeclaration) {
        healthDeclarationList.put(healthDeclaration.getId(),healthDeclaration);
    }
}
