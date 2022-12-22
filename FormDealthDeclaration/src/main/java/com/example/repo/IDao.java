package com.example.repo;

import com.example.model.HealthDeclaration;

import java.util.HashMap;
import java.util.Map;

public interface IDao {
    void save(HealthDeclaration healthDeclaration);
}
