package com.cys.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ViolPlaceMap implements Serializable {
    private Integer placeId;// 乐车邦地域Id<省市ID>
    private String province;// 省市<格式:省名>

}