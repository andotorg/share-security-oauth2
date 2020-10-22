package org.andot.share.sharesecurityoauth2.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {
    private String createdBy;
    private Date createdTime;
    private String updatedBy;
    private Date updatedTime;
    private Integer delFlag;
}
