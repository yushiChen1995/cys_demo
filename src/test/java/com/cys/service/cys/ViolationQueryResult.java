package com.cys.service.cys;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author chenyushi
 * @date 2018/12/27
 */
@Data
@Slf4j
public class ViolationQueryResult implements Serializable {


    public static final Byte YNF_NO = 0;
    public static final Byte YNF_YES = 1;
    /**
     * 0:成功
     * 1:车辆信息有误
     * 2:其他错误，都归于忙
     */
    public static Integer CODE_SUCCESS = 0;
    public static Integer CODE_ERROR = 1;
    public static Integer CODE_BUSY = 2;


    private List<CarViolation> myViolationList = new ArrayList<>();
    /**
     * 新违章号码
     */
    private Integer newViolationNumber = 0;

    public void add(CarViolation value) {
        myViolationList.add(value);
    }

    public List<CarViolation> getMyViolationList() {
        return myViolationList;
    }


    @Data
    public static class CarViolation implements Serializable {

        private static final long serialVersionUID = 1913281212L;
        /* 按违章时间排序 ,属性含义与MyCar相同  */
        /**
         * carId
         */
        private Long id;
        /**
         * 车型ID
         */
        private Integer brandTypeId;
        /**
         * 行驶里程
         */
        private Integer mileage;
        /**
         * 车牌号
         */
        private String carNumber;
        /**
         * 购车日期
         */
        private Date buyDate;
        /**
         * 车辆类型，01为大型汽车；02为小型汽车
         */
        private String carType;
        /**
         * 发动机号
         */
        private String engineNumber;
        /**
         * 车架号
         */
        private String vin;
        /**
         * 车主姓名
         */
        private String ownerName;
        /**
         * 登记证书编号
         */
        private String registerNumber;
        /**
         * 车主身份证号
         */
        private String idNumber;
        /**
         * 违章查询多个城市地域id，json字符串:{10101,10201}
         */
        private String placeIds;
        /**
         * 车管所登记手机号
         */
        private String regPhone;
        /**
         * 最后一次查询返回code
         */
        private Integer code;
        /**
         * 最后一次违章查询返回信息，JSON格式
         */
        private String message;
        /**
         * 违章时间
         */
        private Long latestViolationTime;
        /**
         * 违章查询动态参数类(NULL - 不需要,0 - 需要完整输入 N - 需要输入前N位  -N - 需要输入后N位 )
         */
        /**
         * 是有可代缴违章
         */
        private Boolean canProcess = false;
        /**
         * 是否需要再次去第三方查询
         */
        private Boolean needReQuery = false;
        /**
         * 城市名称
         */
        private String cityName;

        /**
         * 是否支付查询(0-支持查询   1-城市不支持查询(返回的数据是省份中需要最多数据的城市-暂时不适用) 2-省份不支持查询(返回的是输入全部参数))
         */
        private Byte queryStatus;
        /**
         * 车型描述
         */
        private String carTypeName = "";
        /**
         * 购车时间
         */
        private String yearType = "";
        /**
         * 车名称
         */
        private String name = "";
        /**
         * 车图片
         */
        private String imgUrl;
        /**
         * 总违章条数
         */
        private Long totalCount = 0L;
        /**
         * 总扣分
         */
        private Long totalPoint = 0L;
        /**
         * 总罚款
         */
        private Long totalMoney = 0L;
        /**
         * 是否标识(0: 否  1:是)
         */
        private Short isHave = 0;
        /**
         * 创建时间
         */
        private Long createTime;
        /**
         * 新违章
         */
        private Integer newViolationNumber = 0;


//        public static CarViolation createWithoutViolation(MyCarExt car) {
//
//            CarViolation result = new CarViolation();
//            result.setCarInfo(car);
//            result.code = 0;
//
//            return result;
//        }


//        public CarViolation(MyCarExt car, ViolationInfo info) {
//            setCarInfo(car);
//            this.code = info.getCode();
//            this.message = "success".equals(info.getMessage()) ? "查询成功" : info.getMessage();
//            add(info.getList());
//        }

        public CarViolation() {
        }


        public boolean isOnlyMtnCar() {
            if (this.mileage != null && this.brandTypeId != null) {
                //违章车一定会有车牌
                if (StringUtils.isEmpty(this.carNumber)) {
                    return true;
                }
            }
            return false;
        }

        /**
         * 是否有违章,排序用
         */

        public boolean hasViolationInfo() {

            return StringUtils.isNotBlank(this.placeIds);
        }


    }


}
