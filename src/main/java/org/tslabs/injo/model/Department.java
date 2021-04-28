/*
 * Author: statar
 * Created: 4/27/2021  10:09 PM
 */

package org.tslabs.injo.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;
import lombok.Setter;

public class Department {
    @Getter
    @Setter
    @CsvBindByPosition(position = 0)
    private String id;

    @Getter
    @Setter
    @CsvBindByPosition(position = 1)
    private String name;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
