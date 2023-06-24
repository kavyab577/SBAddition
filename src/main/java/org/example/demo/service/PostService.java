package org.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    public int add(int a, int b) {
        return a + b;
    }
}