package org.andot.share.sharesecurityoauth2.domain;

import lombok.Data;
import org.springframework.data.repository.NoRepositoryBean;

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
    private String ipWhiteList;
    private Long accessTokenValidity;
    private Long refreshTokenValidity;
    private Long interestId;
}
