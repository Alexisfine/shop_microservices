package com.alex.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sku_image")
public class SkuImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Size(max = 200)
    @Column(name = "img_name", length = 200)
    private String imgName;

    @Size(max = 200)
    @Column(name = "img_url", length = 200)
    private String imgUrl;

    @Column(name = "product_img_id")
    private Long productImgId;

    @Size(max = 4000)
    @Column(name = "is_default", length = 4000)
    private String isDefault;

}