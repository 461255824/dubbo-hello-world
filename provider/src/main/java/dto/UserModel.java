/**
 * Licensed to CMIOV.Inc. under the terms of the CMIOV
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date           Author               Version        Comments
 * 26/10/2019     Yang-QiYan           1.0            Initial Version
 */
package dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserModel implements Serializable {
    private int id;
    private String user;
    private int age;
}
