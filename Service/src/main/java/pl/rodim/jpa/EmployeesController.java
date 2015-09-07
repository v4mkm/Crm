/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rodim.jpa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.rodim.jpa.repository.EmployeesRepository;
import pl.rodim.jpa.domain.Employees;

@Controller
public class EmployeesController {

    @Autowired(required = true)
    private EmployeesRepository employeesRepository;

    public EmployeesController() {
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public @ResponseBody
    Collection<Employees> getEmployee() {
        List<Employees> ret = new ArrayList<>();
        for (Employees e : employeesRepository.findAll()) {
            ret.add(e);
        }
        return ret;
    }

    @RequestMapping(value = "/employees/get", method = RequestMethod.GET)
    public @ResponseBody
    Employees get(@RequestParam(value = "id", required = false, defaultValue = "1") Integer id) {
        return employeesRepository.findOne(id);
    }

    @RequestMapping(value = "/employees/del", method = RequestMethod.GET)
    public void del(@RequestParam(value = "id", required = true) Integer id) throws Exception {
        employeesRepository.delete(id);
    }

    @RequestMapping(value = "/employees/add", method = RequestMethod.POST)
    public void add(@RequestBody(required = true) Employees employee) throws Exception {
        employeesRepository.save(employee);
    }

}
