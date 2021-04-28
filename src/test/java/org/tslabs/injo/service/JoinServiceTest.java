/*
 * Author: statar
 * Created: 4/27/2021  10:12 PM
 */

package org.tslabs.injo.service;

import org.junit.Assert;
import org.junit.Test;

import org.tslabs.injo.Constants;
import org.tslabs.injo.model.Employee;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

public class JoinServiceTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private JoinService joinService = new JoinService();

    public JoinServiceTest () {}

    @Test
    public void proceedWithJoin() {
        List<Employee> employees = new ArrayList<>();

        Employee empl1 = new Employee();
        empl1.setId("1");
        empl1.setName("James");
        empl1.setSurname("Belushi");
        empl1.setDepartment_id("1");

        Employee empl2 = new Employee();
        empl2.setId("2");
        empl2.setName("Abessalom");
        empl2.setSurname("Abjang");
        empl2.setDepartment_id("6");

        Employee empl3 = new Employee();
        empl3.setId("3");
        empl3.setName("Arnold");
        empl3.setSurname("Schwarzenegger");
        empl3.setDepartment_id("1");

        Employee empl4= new Employee();
        empl4.setId("4");
        empl4.setName("");
        empl4.setSurname("Eminem");
        empl4.setDepartment_id("2");

        Employee empl5= new Employee();
        empl5.setId("5");
        empl5.setName("Simone");

        employees.addAll(Arrays.asList(new Employee[]{empl1, empl2, empl3, empl4, empl5}));

        Map<String, String> departments = new HashMap<>();
        departments.put("1","Film actors");
        departments.put("2","Singers");
        departments.put("3","Directorate");

        System.setOut(new PrintStream(outputStreamCaptor));
        joinService.proceedWithJoin(employees, departments);
        System.setOut(standardOut);

        Assert.assertEquals("James     Belushi             Film actors\n" +
                "\tArnold    Schwarzenegger      Film actors\n" +
                "\t          Eminem              Singers", outputStreamCaptor.toString().trim());

        System.out.println("Testing of \"proccedWithJoin\" method PASSED!");
    }
}