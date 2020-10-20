package org.andot.share.sharesecurityoauth2.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class AppInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String appId;
    private String appSecret;
    private String authorizedGrantType;
}
