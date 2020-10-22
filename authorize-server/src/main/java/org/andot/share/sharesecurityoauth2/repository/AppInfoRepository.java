package org.andot.share.sharesecurityoauth2.repository;

import org.andot.share.sharesecurityoauth2.domain.AppInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 * @author Lucas
 */
public interface AppInfoRepository extends Repository<AppInfo, Long> {
    /**
     *
     * @param appId
     * @param authorizedGrantType
     * @return
     */
    @Query("SELECT id, app_id, app_secret, authorized_grant_type, ip_white_list, access_token_validity,refresh_token_validity,interest_id FROM app_info WHERE app_id = ? AND authorized_grant_type = ?")
    AppInfo findByAppIdAndAuthorizedGrantType(String appId, String authorizedGrantType);
}
