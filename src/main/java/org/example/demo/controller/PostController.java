package org.example.demo.controller;

import org.example.demo.model.Result;
import org.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/add")
    public Result addNumbers(@RequestParam("a") int a, @RequestParam("b") int b) {
        int result = postService.add(a, b);
        return new Result(a, b, result);
    }


}