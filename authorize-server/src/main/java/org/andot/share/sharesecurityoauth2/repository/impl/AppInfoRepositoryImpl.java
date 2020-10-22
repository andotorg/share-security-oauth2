package org.andot.share.sharesecurityoauth2.repository.impl;

import org.andot.share.sharesecurityoauth2.domain.AppInfo;
import org.andot.share.sharesecurityoauth2.repository.AppInfoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AppInfoRepositoryImpl implements AppInfoRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public AppInfo findByAppIdAndAuthorizedGrantType(String appId, String authorizedGrantType) {
        return em.find(AppInfo.class, 1);
    }
}
