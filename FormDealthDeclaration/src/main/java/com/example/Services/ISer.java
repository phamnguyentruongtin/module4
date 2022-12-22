package com.example.Services;

import com.example.model.HealthDeclaration;
import com.example.model.HealthDeclarationDto;

import java.util.Map;

public interface ISer {
    void save(Integer id, HealthDeclaration healthDeclaration);

}
