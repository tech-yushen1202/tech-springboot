package org.tech.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.type.YesNoConverter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity<ID> {

    public abstract ID getId();

    @Convert(converter = YesNoConverter.class)
    @ColumnDefault("'N'")
    @Column(name = "DELETE_FLAG")
    private Boolean deleteFlag = false;

    @CreatedDate
    @Column(name = "CREATED_TIME")
    private LocalDateTime createdTime;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @LastModifiedDate
    @Column(name = "UPDATED_TIME")
    private LocalDateTime updatedTime;

    @LastModifiedBy
    @Column(name = "UPDATED_BY")
    private String updatedBy;

}
