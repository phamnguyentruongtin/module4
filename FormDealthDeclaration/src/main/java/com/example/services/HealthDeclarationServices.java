package com.example.services;

import com.example.model.HealthDeclaration;
import com.example.repository.IHealthDeclarationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthDeclarationServices implements IHealthDeclarationServices {
    @Autowired
    IHealthDeclarationRepository healthDeclarationRepository;

    @Override
    public void save(Integer id, HealthDeclaration healthDeclaration) {
        healthDeclarationRepository.save(healthDeclaration);
    }
}
