/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rodim.service.employees;

import java.util.Date;

public class Employee {

    private Long id;
    private String name;
    private Division division;
    private Position position;
    private Date hire;
    private Date fire;

    public Employee(Long id, String name, Division division, Position position, Date hire, Date fire) {
        this.id = id;
        this.name = name;
        this.division = division;
        this.position = position;
        this.hire = hire;
        this.fire = fire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Date getHire() {
        return hire;
    }

    public void setHire(Date hire) {
        this.hire = hire;
    }

    public Date getFire() {
        return fire;
    }

    public void setFire(Date fire) {
        this.fire = fire;
    }
    
    
}
