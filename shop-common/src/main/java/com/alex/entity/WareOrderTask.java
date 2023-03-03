package com.alex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "ware_order_task")
public class WareOrderTask {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 64)
    @Column(name = "order_sn", length = 64)
    private String orderSn;

    @Column(name = "order_id")
    private Long orderId;

    @Size(max = 100)
    @Column(name = "consignee", length = 100)
    private String consignee;

    @Size(max = 20)
    @Column(name = "consignee_tel", length = 20)
    private String consigneeTel;

    @Size(max = 1000)
    @Column(name = "delivery_address", length = 1000)
    private String deliveryAddress;

    @Size(max = 200)
    @Column(name = "order_comment", length = 200)
    private String orderComment;

    @Size(max = 2)
    @Column(name = "payment_way", length = 2)
    private String paymentWay;

    @Size(max = 20)
    @Column(name = "task_status", length = 20)
    private String taskStatus;

    @Size(max = 200)
    @Column(name = "order_body", length = 200)
    private String orderBody;

    @Size(max = 200)
    @Column(name = "tracking_no", length = 200)
    private String trackingNo;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "ware_id")
    private Long wareId;

    @Size(max = 500)
    @Column(name = "task_comment", length = 500)
    private String taskComment;

}