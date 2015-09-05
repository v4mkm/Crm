/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rodim.service.employees;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Employees {
    
    Map<Long , Employee> employees = new HashMap<>();

    public Employees() {
        employees.put(0L , new Employee(0L, "Damian Midor", Division.HEAD, Position.PRESIDENT, new Date(), new Date()));
    }
    
    @RequestMapping(value = "/employees" , method=RequestMethod.GET)
    public @ResponseBody Collection<Employee> getEmployee() {
        return employees.values();
    }
    
    @RequestMapping(value = "/employees/get" ,   method=RequestMethod.GET)
    public @ResponseBody Employee get(@RequestParam(value="id", required=false, defaultValue="1") Long id) {
        return employees.get(id);
    }
    
    @RequestMapping(value = "/employees/add" ,   method=RequestMethod.POST)
    public @ResponseBody void add(Employee employee) throws Exception {
        if(employees.containsKey(employee.getId())){
            throw new Exception("Juz jest taki ziomek");
        }
        employees.put(employee.getId() , employee);
    }
    
    
    @RequestMapping(value = "/employees/up" ,   method=RequestMethod.POST)
    public @ResponseBody void update(Employee employee) throws Exception {
        if(!employees.containsKey(employee.getId())){
            throw new Exception("Nie ma takiego ziomka");
        }
        Employee get = employees.get(employee.getId());
        get = employee;
    }
    
}
