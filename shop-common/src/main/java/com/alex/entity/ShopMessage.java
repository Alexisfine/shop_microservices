package com.alex.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "shop_message")
public class ShopMessage {
    @Id
    @Column(name = "messagae_id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "message_content")
    private String messageContent;

    @Size(max = 200)
    @Column(name = "exchange_name", length = 200)
    private String exchangeName;

    @Size(max = 200)
    @Column(name = "message_routing_key", length = 200)
    private String messageRoutingKey;

    @Size(max = 200)
    @Column(name = "exchange_routing_key", length = 200)
    private String exchangeRoutingKey;

    @Column(name = "message_status")
    private Integer messageStatus;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

}