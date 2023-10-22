package org.javatop.basic.annotation.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-21 23:43
 * @description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer{

    private int id;

    private String name;
}
