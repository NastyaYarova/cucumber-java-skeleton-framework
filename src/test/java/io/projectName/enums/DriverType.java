package io.projectName.enums;

import lombok.AllArgsConstructor;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@AllArgsConstructor
public enum DriverType {
    FIREFOX("firefox"),
    CHROME("chrome"),
    INTERNETEXPLORER("edge");

    private String driverName;

    public String getDriverName() {
        return this.driverName;
    }

    private static final Map<String, DriverType> ENUM_MAP;

    static {
        Map<String, DriverType> map = new ConcurrentHashMap<String, DriverType>();
        for (DriverType instance : DriverType.values()) {
            map.put(instance.getDriverName().toLowerCase(), instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static DriverType get(String name) {
        return ENUM_MAP.get(name.toLowerCase());
    }

    @Override
    public String toString() {
        return driverName;
    }
}
