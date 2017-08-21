package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by asus on 2017/7/2.
 */
@RestController
@RequestMapping(value="/hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
//    @RequestMapping(value={"/say/{id}"},method= RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@PathVariable("id") Integer id){
        return "id: "+id;
    }
}
