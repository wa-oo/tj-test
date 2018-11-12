package com.example.untils;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * 判断是否为空
 * @author Allen
 * @date 2018/11/9
 * @Maill wangtaog@mail.taiji.com.cn
 */

public class EmptyUtils {

    public static boolean isEmpty(Object o) throws IllegalArgumentException {
        if (o == null) {
            return true;
        }
        if ((o instanceof String)) {
            if (((String) o).length() == 0)
                return true;
        } else if ((o instanceof Collection)) {
            if (((Collection) o).isEmpty())
                return true;
        } else if (o.getClass().isArray()) {
            if (Array.getLength(o) == 0)
                return true;
        } else if ((o instanceof Map)) {
            if (((Map) o).isEmpty())
                return true;
        } else {
            return false;
        }

        return false;
    }

    public static boolean isNotEmpty(Object o) {
        return !isEmpty(o);
    }

}
