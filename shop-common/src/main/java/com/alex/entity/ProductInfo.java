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
@Table(name = "product_info")
public class ProductInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 200)
    @Column(name = "product_name", length = 200)
    private String productName;

    @Size(max = 1000)
    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "catalog3_id")
    private Long catalog3Id;

    @Column(name = "tm_id")
    private Long tmId;

}