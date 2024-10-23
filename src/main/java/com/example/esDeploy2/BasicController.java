package com.example.esDeploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/es")
public class BasicController {

    @GetMapping("/num")
    public Integer number(){
        Random random = new Random();
        Integer num1 = random.nextInt(Integer.MAX_VALUE / 2);
        Integer num2 = random.nextInt(Integer.MAX_VALUE / 2);
        return num1 + num2;
    }
}
