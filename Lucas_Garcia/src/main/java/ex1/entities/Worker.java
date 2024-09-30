/*
 * Copyright (C) 2024 Lucas Garcia <lucas.garciadelacerda@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ex1.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Lucas Garcia <lucas.garciadelacerda@gmail.com>
 * @date 29/09/2024
 * @brief Class Worker
 *
 **/

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();
    
    public Worker(){
        
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }
    
    public void addContract(HourContract contract){
        
        contracts.add(contract);
    }
    
    public void removeContract(HourContract contract){
        
        contracts.remove(contract);
    }
    
    public double income(int year, int month){
        
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        
        for(HourContract c: contracts){
            
            cal.setTime(c.getDate());
            
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }            
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDepartment: " + department.getName();
    }
    
    
}