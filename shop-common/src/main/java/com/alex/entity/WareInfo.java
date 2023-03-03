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
@Table(name = "ware_info")
public class WareInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 200)
    @Column(name = "name", length = 200)
    private String name;

    @Size(max = 200)
    @Column(name = "address", length = 200)
    private String address;

    @Size(max = 20)
    @Column(name = "areacode", length = 20)
    private String areacode;

}