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
@Table(name = "product_sale_attr_value")
public class ProductSaleAttrValue {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "sale_attr_id")
    private Long saleAttrId;

    @Size(max = 20)
    @Column(name = "sale_attr_value_name", length = 20)
    private String saleAttrValueName;

}