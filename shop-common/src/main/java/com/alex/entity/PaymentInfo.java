package com.alex.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "payment_info")
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "order_sn")
    private String orderSn;

    @Size(max = 50)
    @Column(name = "order_id", length = 50)
    private String orderId;

    @Size(max = 50)
    @Column(name = "alipay_trade_no", length = 50)
    private String alipayTradeNo;

    @Column(name = "total_amount", precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Size(max = 200)
    @Column(name = "subject", length = 200)
    private String subject;

    @Size(max = 20)
    @Column(name = "payment_status", length = 20)
    private String paymentStatus;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "confirm_time")
    private Instant confirmTime;

    @Size(max = 4000)
    @Column(name = "callback_content", length = 4000)
    private String callbackContent;

    @Column(name = "callback_time")
    private Instant callbackTime;

}