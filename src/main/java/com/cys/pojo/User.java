package com.cys.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import sun.util.resources.cldr.mg.LocaleNames_mg;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author chenyushi
 * @date 2018/11/15
 */
@Data
@Table(name = "cys_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private Integer age;
    private String sex;

}
