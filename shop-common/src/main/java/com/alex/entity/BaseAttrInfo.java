package com.alex.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "base_attr_info")
public class BaseAttrInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 100)
    @NotNull
    @Column(name = "attr_name", nullable = false, length = 100)
    private String attrName;

    @Column(name = "catalog3_id")
    private Long catalog3Id;

    @Size(max = 1)
    @Column(name = "is_enabled", length = 1)
    private String isEnabled;

}