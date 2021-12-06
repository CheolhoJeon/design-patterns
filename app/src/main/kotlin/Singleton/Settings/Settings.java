package Singleton.Settings;

public class Settings {

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    private Settings() {

    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

}
