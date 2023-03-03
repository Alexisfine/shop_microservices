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
@Table(name = "sku_info")
public class SkuInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "price")
    private Double price;

    @Size(max = 200)
    @Column(name = "sku_name", length = 200)
    private String skuName;

    @Size(max = 2000)
    @Column(name = "sku_desc", length = 2000)
    private String skuDesc;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "tm_id")
    private Long tmId;

    @Column(name = "catalog3_id")
    private Long catalog3Id;

    @Size(max = 200)
    @Column(name = "sku_default_img", length = 200)
    private String skuDefaultImg;

}