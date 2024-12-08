package com.klef.jfsd.handloomfashion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.handloomfashion.model.Artsian;
import com.klef.jfsd.handloomfashion.repository.ArtsianRepository;

@Service
public class ArtsianServiceImpl implements ArtsianService 
{
    @Autowired
    ArtsianRepository repository;

    @Override
    public String signup(Artsian a) {
        repository.save(a);
        return "Artsian added successfully";
    }

    @Override
    public Artsian login(String username, String password) {
        return repository.findById(username)
                .filter(a -> a.getPassword().equals(password))
                .orElse(null);
    }

    @Override
    public Iterable<Artsian> getAllArtisans() {
        return repository.findAll();
    }

    
    
    @Override
    public Artsian updateArtisan(String username, Artsian a) {
        Artsian existingArtisan = repository.findById(username).orElse(null);
        if (existingArtisan != null) {
            // Update the fields that are allowed to be changed
            existingArtisan.setPassword(a.getPassword());
            existingArtisan.setEmail(a.getEmail());
            existingArtisan.setMobile(a.getMobile());
            // Add any other fields to update
            repository.save(existingArtisan);
            return existingArtisan;
        }
        return null; // Artisan not found
    }

    // Implement delete method
    @Override
    public String deleteArtisan(String username) {
        Artsian existingArtisan = repository.findById(username).orElse(null);
        if (existingArtisan != null) {
            repository.delete(existingArtisan);
            return "Artsian deleted successfully";
        }
        return "Artsian not found";
    }
}
