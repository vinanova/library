package com.vino.preference;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

public final class AGDContract {
    public static final String QUERY_GET = "get";
    public static final String QUERY_GET_ALL = "getall";
    public static final String QUERY_CONTAINS = "contains";
    public static final String PARAM_CLEAR = "clear";
    public static final String PARAM_IMMEDIATELY = "immediately";
    public static final String UPDATE = "update";
    public static final String REGISTER = "register";
    public static final String UNREGISTER = "unregister";

    private static String sAuthority;
    private static Uri sAuthorityUri;

    static synchronized String getAuthority(Context context) {
        if (TextUtils.isEmpty(sAuthority)) {
            sAuthority = context.getString(R.string.vino_author);
        }
        return sAuthority;
    }

    public static synchronized Uri getAuthorityUri(Context context) {
        if (sAuthorityUri == null) {
            sAuthorityUri = Uri.parse("content://" + getAuthority(context));
        }
        return sAuthorityUri;
    }
}
