package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter @Setter
public class CartItemDto {

    @NotNull(message = "상품아디 필수임")
    private Long itemId;

    @Min(value = 1,message = "최소1개임")
    private int count;

}
