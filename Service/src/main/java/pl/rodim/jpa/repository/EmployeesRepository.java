/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rodim.jpa.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.rodim.jpa.domain.Employees;

/**
 *
 * @author rodim
 */
@Repository
public interface EmployeesRepository extends CrudRepository<Employees,Integer> {
    

}
