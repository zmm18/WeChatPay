package com.zmm.sell.enums;

import lombok.Getter;

/**
 * @Name ProductStatusEnum
 * @Author 900045
 * @Created by 2019/5/24 0024
 */
@Getter
public enum ProductStatusEnum {

    /**
     * 商品相关的状态
     */
    UP(0,"上架"),
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
