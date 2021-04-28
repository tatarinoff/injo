/*
 * Author: statar
 * Created: 4/27/2021  10:11 PM
 */

package org.tslabs.injo.service;

import org.junit.Assert;
import org.junit.Test;
import org.tslabs.injo.model.Department;
import org.tslabs.injo.model.Employee;
import org.tslabs.injo.service.TableReaderService;

import java.util.List;

public class TableReaderServiceTest{
    TableReaderService trs = new TableReaderService();

    public TableReaderServiceTest(){}

    @Test
    public void readTableDataForEmployee() {
        List<Employee> employees = trs.readTableDataFor(Employee.class);
        Assert.assertNotNull(employees);
        Assert.assertTrue(employees.size() > 1);
        System.out.println("Testing of \"readTableDataFor\" method for Employee table PASSED!");
    }

    @Test
    public void readTableDataForDepartment() {
        List<Department> departments = trs.readTableDataFor(Department.class);
        Assert.assertNotNull(departments);
        Assert.assertTrue(departments.size() > 1);
        System.out.println("Testing of \"readTableDataFor\" method for Department table PASSED!");
    }
}