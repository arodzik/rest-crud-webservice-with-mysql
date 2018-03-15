package com.javahelps.restservice.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractTimestampEntity {

    @Column(name = "created", nullable = false, updatable = false)
    @CreatedDate
    private Date created = new Date();

    @Column(name = "modified")
    @LastModifiedDate
    @Version
    private Date modified;


    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}