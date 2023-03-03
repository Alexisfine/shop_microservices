package com.alex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "product_vertify_record")
public class ProductVertifyRecord {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "create_time")
    private Instant createTime;

    @Size(max = 64)
    @Column(name = "vertify_man", length = 64)
    private String vertifyMan;

    @Column(name = "status")
    private Integer status;

    @Size(max = 255)
    @Column(name = "detail")
    private String detail;

}