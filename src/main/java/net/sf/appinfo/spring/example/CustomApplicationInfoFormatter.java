package net.sf.appinfo.spring.example;

import net.sf.appinfo.ApplicationInfo;
import net.sf.appinfo.formatter.AbstractApplicationInfoFormatter;

/**
 * Custom formatter example.
 *
 * @author Marcin Zajączkowski, 2013-12-16
 */
public class CustomApplicationInfoFormatter extends AbstractApplicationInfoFormatter {

    private final ApplicationInfo applicationInfo;

    public CustomApplicationInfoFormatter(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
    }

    public String getInfo() {
        return applicationInfo.getVersion();
    }
}
