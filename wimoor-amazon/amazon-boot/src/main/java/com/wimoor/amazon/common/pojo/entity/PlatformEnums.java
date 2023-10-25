package com.wimoor.amazon.common.pojo.entity;

/**
 * @Author: zeno
 * @Date: 2023/10/25 15:27
 * @Description：
 */
public enum PlatformEnums {
    AMAZON(10, "亚马逊"),
    OZON(20, "OZON"),
    ;

    private int code;
    private String description;

    PlatformEnums(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
