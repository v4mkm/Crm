/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rodim.service.employees;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/employees")
public class Employees {
    
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Employee getEmployee(@RequestParam(value="id", required=false, defaultValue="1") Long id) {
        return new Employee(id, "Damian Midor", Division.HEAD, Position.PRESIDENT, new Date(), new Date());
    }
    
}
