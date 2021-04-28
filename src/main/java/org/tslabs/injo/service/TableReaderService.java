/*
 * Author: statar
 * Created: 4/27/2021  10:02 PM
 */

package org.tslabs.injo.service;

import com.opencsv.bean.CsvToBeanBuilder;
import org.tslabs.injo.Constants;
import org.tslabs.injo.model.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import static org.tslabs.injo.Constants.ERROR_FORMAT;

public class TableReaderService {

    public TableReaderService() {}

    public List readTableDataFor(Class<?> className) {
        String fileName = className.getName().contains(Employee.class.getName()) ? Constants.EMPLOYEE_FILE : Constants.DEPARTMENT_FILE;
        File f = new File(fileName);
        if (f.exists() && !f.isDirectory()) {
            try {
                List<Employee> employees = new CsvToBeanBuilder(new FileReader(fileName))
                        .withSeparator(';')
                        .withSkipLines(1)
                        .withType(className)
                        .build()
                        .parse();
                return employees;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.printf(ERROR_FORMAT, fileName);
        }

        return null;
    }

}
