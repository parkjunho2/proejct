package com.kh.topgunFinal.dto;

import lombok.Data;

@Data
public class PaymentDetailDto {
    private int paymentDetailNo;
    private String paymentDetailName;
    private int paymentDetailPrice;
    private int paymentDetailQty;
    private int paymentDetailSeatsNo;
    private int paymentDetailOrigin;
    private String paymentDetailStatus;
}
