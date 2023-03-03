package com.alex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ware_sku")
public class WareSku {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "warehouse_id")
    private Long warehouseId;

    @Column(name = "stock")
    private Integer stock;

    @Size(max = 200)
    @Column(name = "stock_name", length = 200)
    private String stockName;

    @Column(name = "stock_locked")
    private Integer stockLocked;

}