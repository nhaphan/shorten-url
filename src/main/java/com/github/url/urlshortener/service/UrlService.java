package com.github.url.urlshortener.service;


import com.github.url.urlshortener.entity.Url;
import com.github.url.urlshortener.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UrlService {
    @Autowired
    private UrlRepository urlRepository;

    public Optional<Url> findById(String id) {
        return urlRepository.findById(id);
    }


    public Url create(Url url) {
        return urlRepository.save(url);
    }

    public List<Url> findAll(){
        return urlRepository.findAll();
    }
}
