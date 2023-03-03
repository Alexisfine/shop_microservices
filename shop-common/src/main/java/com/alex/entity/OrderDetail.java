package com.alex.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Size(max = 64)
    @Column(name = "order_sn", length = 64)
    private String orderSn;

    @Column(name = "product_id")
    private Long productId;

    @Size(max = 500)
    @Column(name = "product_pic", length = 500)
    private String productPic;

    @Size(max = 200)
    @Column(name = "product_name", length = 200)
    private String productName;

    @Size(max = 200)
    @Column(name = "product_brand", length = 200)
    private String productBrand;

    @Size(max = 64)
    @Column(name = "product_sn", length = 64)
    private String productSn;

    @Column(name = "product_price", precision = 10, scale = 2)
    private BigDecimal productPrice;

    @Column(name = "product_quantity")
    private Integer productQuantity;

    @Column(name = "product_sku_id")
    private Long productSkuId;

    @Size(max = 50)
    @Column(name = "product_sku_code", length = 50)
    private String productSkuCode;

    @Column(name = "product_category_id")
    private Long productCategoryId;

    @Size(max = 100)
    @Column(name = "sp1", length = 100)
    private String sp1;

    @Size(max = 100)
    @Column(name = "sp2", length = 100)
    private String sp2;

    @Size(max = 100)
    @Column(name = "sp3", length = 100)
    private String sp3;

    @Size(max = 200)
    @Column(name = "promotion_name", length = 200)
    private String promotionName;

    @Column(name = "promotion_amount", precision = 10, scale = 2)
    private BigDecimal promotionAmount;

    @Column(name = "coupon_amount", precision = 10, scale = 2)
    private BigDecimal couponAmount;

    @Column(name = "integration_amount", precision = 10, scale = 2)
    private BigDecimal integrationAmount;

    @Column(name = "real_amount", precision = 10, scale = 2)
    private BigDecimal realAmount;

    @Column(name = "gift_integration")
    private Integer giftIntegration;

    @Column(name = "gift_growth")
    private Integer giftGrowth;

    @Size(max = 500)
    @Column(name = "product_attr", length = 500)
    private String productAttr;

}