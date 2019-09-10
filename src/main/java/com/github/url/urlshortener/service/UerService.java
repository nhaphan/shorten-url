package com.github.url.urlshortener.service;


import com.github.url.urlshortener.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UerService {
    @Autowired
    private UserRepository userRepository;



}
