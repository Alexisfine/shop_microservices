package com.alex.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_sale_attr")
public class ProductSaleAttr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "sale_attr_id")
    private Long saleAttrId;

    @Size(max = 20)
    @Column(name = "sale_attr_name", length = 20)
    private String saleAttrName;

}