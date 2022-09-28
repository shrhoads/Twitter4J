/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package twitter4j.conf;

import twitter4j.AuthorizationConfiguration;
import twitter4j.HttpClientConfiguration;

/**
 * @author Yusuke Yamamoto - yusuke at mac.com
 */
public interface Configuration extends AuthorizationConfiguration, java.io.Serializable {
    static Configuration getInstance(){
        return new PropertyConfiguration();
    }

    boolean isApplicationOnlyAuthEnabled();

    @Override
    String getUser();

    @Override
    String getPassword();

    // methods for HttpClientConfiguration
    HttpClientConfiguration getHttpClientConfiguration();

    int getHttpStreamingReadTimeout();

    // oauth related setter/getters

    @Override
    String getOAuthConsumerKey();

    @Override
    String getOAuthConsumerSecret();

    @Override
    String getOAuthAccessToken();

    @Override
    String getOAuthAccessTokenSecret();

    @Override
    String getOAuth2TokenType();

    @Override
    String getOAuth2AccessToken();

    String getOAuth2Scope();

    String getRestBaseURL();

    String getUploadBaseURL();

    String getStreamBaseURL();

    String getOAuthRequestTokenURL();

    String getOAuthAuthorizationURL();

    String getOAuthAccessTokenURL();

    String getOAuthAuthenticationURL();

    String getOAuth2TokenURL();

    String getOAuthInvalidateTokenURL();

    String getOAuth2InvalidateTokenURL();

    boolean isIncludeMyRetweetEnabled();

    boolean isJSONStoreEnabled();

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    boolean isMBeanEnabled();

    boolean isStallWarningsEnabled();

    long getContributingTo();

    boolean isIncludeEntitiesEnabled();

    boolean isTrimUserEnabled();

    boolean isIncludeExtAltTextEnabled();

    boolean isTweetModeExtended();

    boolean isIncludeEmailEnabled();

    String getStreamThreadName();
}
