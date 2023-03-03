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
@Table(name = "product_image")
public class ProductImage {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Size(max = 200)
    @Column(name = "img_name", length = 200)
    private String imgName;

    @Size(max = 200)
    @Column(name = "img_url", length = 200)
    private String imgUrl;

}