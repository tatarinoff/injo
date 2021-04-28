/*
 * Author: statar
 * Created: 4/27/2021  10:05 PM
 */

package org.tslabs.injo.service;

import org.tslabs.injo.Constants;
import org.tslabs.injo.model.Employee;

import java.util.List;
import java.util.Map;

public class JoinService {
    public JoinService() {}

    public void proceedWithJoin(List<Employee> employees, Map<String, String> departments) {
        employees.stream().forEach(e -> {
            String d = departments.get(e.getDepartment_id());
            if (d != null) {
                System.out.printf(Constants.PRINT_FORMAT, e.getName(), e.getSurname(), d);
            }
        });
    }
}
