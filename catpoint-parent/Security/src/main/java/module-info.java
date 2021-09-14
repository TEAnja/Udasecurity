module SecurityModule {
    requires java.desktop;
    requires java.prefs;
    requires miglayout;
    requires ImageModule;
    requires com.google.gson;
    requires com.google.common;
    opens com.udacity.catpoint.data;
    opens com.udacity.catpoint.service;
}