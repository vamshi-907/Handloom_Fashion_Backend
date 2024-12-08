package com.klef.jfsd.handloomfashion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.jfsd.handloomfashion.model.Artsian;
import com.klef.jfsd.handloomfashion.service.ArtsianService;

@RestController
@RequestMapping("artsian")
public class ArtisanController 
{
    @Autowired
    ArtsianService service;
    
    @PostMapping("signup")
    public String signup(@RequestBody Artsian a) {
        return service.signup(a);    
    }
    
    @PostMapping("login")
    public String login(@RequestBody Artsian a) {
        Artsian artsian = service.login(a.getUsername(), a.getPassword());
        return artsian != null ? "Login Successful" : "Invalid Credentials";
    }
    
    @GetMapping("view")
    public Iterable<Artsian> viewArtisans() {
        return service.getAllArtisans();
    }


    @PutMapping("update/{username}")
    public String updateArtisan(@PathVariable String username, @RequestBody Artsian a) {
        Artsian updatedArtisan = service.updateArtisan(username, a);
        return updatedArtisan != null ? "Artisan updated successfully" : "Artisan not found";
    }

    @DeleteMapping("delete/{username}")
    public String deleteArtisan(@PathVariable String username) {
        return service.deleteArtisan(username);
    }
}
