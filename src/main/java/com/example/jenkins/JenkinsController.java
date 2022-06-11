package com.example.jenkins;

import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JenkinsController {

    @GetMapping("hello")
    public String index() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "Hello Jenkins! " + sdf.format(new java.util.Date(System.currentTimeMillis()));
    }
}
