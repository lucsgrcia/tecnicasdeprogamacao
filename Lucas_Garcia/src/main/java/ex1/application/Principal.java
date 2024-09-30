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

package ex1.application;
import ex1.entities.Department;
import ex1.entities.HourContract;
import java.util.Scanner;
import ex1.entities.Worker;
import ex1.entities.WorkerLevel;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Lucas Garcia <lucas.garciadelacerda@gmail.com>
 * @date 29/09/2024
 * @brief Class Principal
 *
 **/

public class Principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        WorkerLevel level;
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
        
        System.out.print("Enter department's name: ");
        String departmentName= sc.nextLine();
        Department department = new Department(departmentName);

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String workerlevel = sc.nextLine();

        if(workerlevel == "JUNIOR"){
            level = WorkerLevel.JUNIOR;
        }else if(workerlevel == "MID_LEVEL"){
            level = WorkerLevel.MID_LEVEL;
        }else{
            level = WorkerLevel.SENIOR;
        }

        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name,level,baseSalary,department);
        System.out.print("How many contracts to this worker? ");
        int nContracts = sc.nextInt();

        for (int i = 0; i < nContracts; i++) {
            System.out.println("Enter contract #"+(i+1)+" data:");
            sc.nextLine();
            System.out.print("Date (dd/MM/yyyy): ");
            String date = sc.nextLine();
            LocalDate date1 = LocalDate.parse(date, fmt1);
            Date date2 = Date.from(date1.atStartOfDay(ZoneId.systemDefault()).toInstant());
            System.out.print("Valuer per hour: ");
            Double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            HourContract hourContract = new HourContract(date2,value,duration);
            worker.addContract(hourContract);
        }
        
        sc.nextLine();
        System.out.print("\nEnter month and year to calculate the income (MM/yyyy): ");
        String date = sc.nextLine();
        
        YearMonth yearMonth = YearMonth.parse(date, fmt2);
        int mes = yearMonth.getMonthValue();
        int ano = yearMonth.getYear();
        
        System.out.println("\n"+worker);
        System.out.print("Income for "+date);
        System.out.println(String.format(": %.2f", worker.income(ano, mes)));
    }
}