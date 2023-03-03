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
@Table(name = "company_address")
public class CompanyAddress {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 200)
    @Column(name = "address_name", length = 200)
    private String addressName;

    @Column(name = "send_status")
    private Integer sendStatus;

    @Column(name = "receive_status")
    private Integer receiveStatus;

    @Size(max = 64)
    @Column(name = "name", length = 64)
    private String name;

    @Size(max = 64)
    @Column(name = "phone", length = 64)
    private String phone;

    @Size(max = 64)
    @Column(name = "province", length = 64)
    private String province;

    @Size(max = 64)
    @Column(name = "city", length = 64)
    private String city;

    @Size(max = 64)
    @Column(name = "region", length = 64)
    private String region;

    @Size(max = 200)
    @Column(name = "detail_address", length = 200)
    private String detailAddress;

}