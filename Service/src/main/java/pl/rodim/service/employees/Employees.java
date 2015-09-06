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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Employees {

    private static Long lastPK;
    Map<Long, Employee> employees = new HashMap<>();

    public Employees() {
        employees.put(0L, new Employee(0L, "Krzysztof nowak", Division.HEAD, Position.PRESIDENT, new Date(), new Date()));
        employees.put(1L, new Employee(1L, "Jan Kowalski", Division.SALE, Position.JUNIOR, new Date(), new Date()));
        employees.put(2L, new Employee(2L, "John Smith", Division.HR, Position.SPECIALIST, new Date(), new Date()));
        lastPK = 3L;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public @ResponseBody
    Collection<Employee> getEmployee() {
        return employees.values();
    }

    @RequestMapping(value = "/employees/get", method = RequestMethod.GET)
    public @ResponseBody
    Employee get(@RequestParam(value = "id", required = false, defaultValue = "1") Long id) {
        return employees.get(id);
    }

    @RequestMapping(value = "/employees/del", method = RequestMethod.GET)
    public void del(@RequestParam(value = "id", required = true) Long id) throws Exception {
        if (!employees.containsKey(id)) {
            throw new Exception("Nie ma takiego ziomka");
        }
        employees.remove(id);
    }

    @RequestMapping(value = "/employees/add", method = RequestMethod.POST)
    public void add(@RequestBody(required = true) Employee employee) throws Exception {
        employee.setId(lastPK);
        employees.put(employee.getId(), employee);
        lastPK++;
    }

    @RequestMapping(value = "/employees/up", method = RequestMethod.POST)
    public @ResponseBody
    void update(@RequestBody(required = true) Employee employee) throws Exception {
        if (!employees.containsKey(employee.getId())) {
            throw new Exception("Nie ma takiego ziomka");
        }
        Employee get = employees.get(employee.getId());
        get = employee;
    }

}
