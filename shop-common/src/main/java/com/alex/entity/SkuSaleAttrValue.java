package com.alex.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sku_sale_attr_value")
public class SkuSaleAttrValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "sale_attr_id")
    private Long saleAttrId;

    @Size(max = 20)
    @Column(name = "sale_attr_name", length = 20)
    private String saleAttrName;

    @Column(name = "sale_attr_value_id")
    private Long saleAttrValueId;

    @Size(max = 20)
    @Column(name = "sale_attr_value_name", length = 20)
    private String saleAttrValueName;

}