package com.klef.jfsd.handloomfashion.service;

import java.util.List;

import com.klef.jfsd.handloomfashion.model.Artsian;

public interface ArtsianService 
{
    public String signup(Artsian a);
    Artsian login(String username , String password);
    
    public Iterable<Artsian> getAllArtisans() ;
    Artsian updateArtisan(String username, Artsian a);
    String deleteArtisan(String username);
    
}
