package com.alex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "undo_log")
public class UndoLog {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "branch_id", nullable = false)
    private Long branchId;

    @Size(max = 100)
    @NotNull
    @Column(name = "xid", nullable = false, length = 100)
    private String xid;

    @Size(max = 128)
    @NotNull
    @Column(name = "context", nullable = false, length = 128)
    private String context;

    @NotNull
    @Column(name = "rollback_info", nullable = false)
    private byte[] rollbackInfo;

    @NotNull
    @Column(name = "log_status", nullable = false)
    private Integer logStatus;

    @NotNull
    @Column(name = "log_created", nullable = false)
    private Instant logCreated;

    @NotNull
    @Column(name = "log_modified", nullable = false)
    private Instant logModified;

    @Size(max = 100)
    @Column(name = "ext", length = 100)
    private String ext;

}