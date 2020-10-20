package org.andot.share.sharesecurityoauth2.service;

import org.andot.share.sharesecurityoauth2.domain.AppInfo;

public interface AppInfoService {
    AppInfo getAppInfoByAppIdAndType(String appId, String type);
}
