package com.alex.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ware_order_task_detail")
public class WareOrderTaskDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Size(max = 200)
    @Column(name = "sku_name", length = 200)
    private String skuName;

    @Column(name = "sku_nums")
    private Integer skuNums;

    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "ware_id")
    private Long wareId;

    @Column(name = "lock_status")
    private Integer lockStatus;

}