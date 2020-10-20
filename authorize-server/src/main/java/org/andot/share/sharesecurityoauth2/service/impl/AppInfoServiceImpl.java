package org.andot.share.sharesecurityoauth2.service.impl;

import lombok.AllArgsConstructor;
import org.andot.share.sharesecurityoauth2.domain.AppInfo;
import org.andot.share.sharesecurityoauth2.repository.AppInfoRepository;
import org.andot.share.sharesecurityoauth2.service.AppInfoService;
import org.springframework.stereotype.Service;

@Service("appInfoService")
@AllArgsConstructor
public class AppInfoServiceImpl implements AppInfoService {

    private final AppInfoRepository appInfoRepository;

    @Override
    public AppInfo getAppInfoByAppIdAndType(String appId, String type) {
        return appInfoRepository.findByAppIdAndAuthorizedGrantType(appId, type);
    }
}
