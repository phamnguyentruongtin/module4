package com.example.Services;

import com.example.model.HealthDeclaration;
import com.example.repo.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ser implements ISer {
    @Autowired
    IDao dao;

    @Override
    public void save(Integer id, HealthDeclaration healthDeclaration) {
        dao.save(healthDeclaration);
    }
}
