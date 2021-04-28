/*
 * Author: statar
 * Created: 4/27/2021  10:08 PM
 */

package org.tslabs.injo.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;
import lombok.Setter;

public class Employee {

    @Getter
    @Setter
    @CsvBindByPosition(position = 0)
    private String id;

    @Getter
    @Setter
    @CsvBindByPosition(position = 1)
    private String name;

    @Getter
    @Setter
    @CsvBindByPosition(position = 2)
    private String surname;

    @Getter
    @Setter
    @CsvBindByPosition(position = 3)
    private String department_id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department_id=" + department_id +
                '}';
    }
}
