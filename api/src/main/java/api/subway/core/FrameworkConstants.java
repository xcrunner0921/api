package api.subway.core;

import api.subway.property.PropertyFactory;

/**
 * Date: 2009. 6. 1, 오후 1:03:32
 *
 * @author jeongtak
 */
public final class FrameworkConstants {

    public static class Cache {
        public static final String CODE_INSTANCE = "CODE_INSTANCE";
    }

    public static class Servlet {
        public static final String METHOD_GET = "GET";
        public static final String METHOD_POST = "POST";
    }

    public static class Str {
        public static final String DOT = ".";
    }

    public static class Message {

        public static final String ERROR = "error";
        public static final String HANDLE = "handle";

    }

    public static class Exception {

        public static final String SERVICE = "service";
        public static final String APPLICATION = "app";
        public static final String FRAMEWORK = "framework";

    }

    public static class Encoding {

        public static final String ISO_8859_1 = "ISO-8859-1";
        public static final String EUC_KR = "UTF-8";

    }

    public static class Paging {

        public static final int ROW = Integer.parseInt(PropertyFactory.getProperty("paging.row"));
        public static final int COLUMN = Integer.parseInt(PropertyFactory.getProperty("paging.column"));

    }

    public static class Combo {

        public static final String ALL = "전체";
        public static final String CHOICE = "선택";
        public static final String NONE = "해당무";
        
    }
}
