package com.arsvisions.library.utils;


import com.arsvisions.library.cnst.Flags;
import com.arsvisions.library.model.ConfigSplash;

/**
 * Created by varsovski on 27-Sep-15.
 */
public class ValidationUtil {

    public static int hasPath(ConfigSplash cs) {
        if (cs.getPathSplash().isEmpty())
            return Flags.WITH_LOGO;
        else
            return Flags.WITH_PATH;
    }
}
