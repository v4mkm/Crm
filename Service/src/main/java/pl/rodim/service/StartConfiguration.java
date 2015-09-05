/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rodim.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author rodim
 */
@SpringBootApplication
@Controller
public class StartConfiguration {

    @RequestMapping(value = "/" ,  method=RequestMethod.GET)
    public @ResponseBody String sayHello() {
        return "Rodim SERVICE";
    }
        
    public static void main(String[] args) {
        SpringApplication.run(StartConfiguration.class, args);
    }
    
}
