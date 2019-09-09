package com.github.url.urlshortener.service;


import com.github.url.urlshortener.entity.Url;
import com.github.url.urlshortener.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
