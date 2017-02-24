package org.asaunin.socialnetwork.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public final class Constants {

    public static final String URI_API_PREFIX = "/api";
    public static final String URI_MESSAGES = "/messages";

    public static String AVATAR_FOLDER;

    @Value("${resources.avatar-folder}")
    public void setImageFolder(String path) {
        AVATAR_FOLDER = path;
    }

    private Constants() {}

}
