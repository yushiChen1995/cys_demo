package com.cys.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author chenyushi
 * @date 2019/1/24
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class B extends A {
    private String s;
}
