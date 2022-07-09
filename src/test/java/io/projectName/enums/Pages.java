package io.projectName.enums;

import lombok.AllArgsConstructor;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@AllArgsConstructor
public enum Pages {
    HOME_PAGE("Home Page"),
    CART_PAGE("Cart Page"),
    CHECKOUT_PAGE("Checkout page");

    private String pageName;

    public String getPageName() {
        return this.pageName;
    }

    private static final Map<String,Pages> ENUM_MAP;

    static {
        Map<String,Pages> map = new ConcurrentHashMap<String, Pages>();
        for (Pages instance : Pages.values()) {
            map.put(instance.getPageName().toLowerCase(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Pages get (String name) {
        return ENUM_MAP.get(name.toLowerCase());
    }

    @Override
    public String toString() {
        return pageName;
    }
}
