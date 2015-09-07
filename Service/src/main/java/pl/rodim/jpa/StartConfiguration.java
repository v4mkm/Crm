/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rodim.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author rodim
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
public class StartConfiguration {

    @RequestMapping(value = "/" ,  method=RequestMethod.GET)
    public @ResponseBody String sayHello() {
        return "Rodim SERVICE";
    }
        
    public static void main(String[] args) {
        SpringApplication.run(StartConfiguration.class, args);
    }
    
}
