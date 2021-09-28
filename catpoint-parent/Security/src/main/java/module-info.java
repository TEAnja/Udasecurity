module SecurityModule {
    requires transitive java.desktop;
    requires transitive java.prefs;
    requires transitive java.sql;
    requires transitive miglayout.swing;
    requires transitive gson;
    requires transitive com.google.common;
    requires transitive ImageModule;
    opens com.udacity.catpoint.security.data to com.google.gson;
    opens com.udacity.catpoint.security.service;
}