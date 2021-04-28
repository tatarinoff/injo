/*
 * Author: statar
 * Created: 4/27/2021  10:00 PM
 */

package org.tslabs.injo;

import org.tslabs.injo.model.Department;
import org.tslabs.injo.model.Employee;
import org.tslabs.injo.service.JoinService;
import org.tslabs.injo.service.TableReaderService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.tslabs.injo.Constants.FATAL_ERROR_FORMAT;


public class InnerJoinApplication {

    public static void main(String[] args) {
        TableReaderService tableReaderService = new TableReaderService();
        JoinService joinService = new JoinService();
        Map<String, String> departmentMap = new HashMap<>();

        List<Employee> employees = tableReaderService.readTableDataFor(Employee.class);
        List<Department> departments = tableReaderService.readTableDataFor(Department.class);
        if (employees != null && departments != null){
            departments.stream().forEach(d -> departmentMap.put(d.getId(), d.getName()));

            joinService.proceedWithJoin(employees, departmentMap);
        }
        else {
            System.out.println(FATAL_ERROR_FORMAT);
        }

    }
}
