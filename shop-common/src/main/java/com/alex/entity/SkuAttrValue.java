package com.alex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sku_attr_value")
public class SkuAttrValue {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "attr_id")
    private Long attrId;

    @Column(name = "value_id")
    private Long valueId;

    @Column(name = "sku_id")
    private Long skuId;

}