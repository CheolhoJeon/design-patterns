package Singleton.Settings

fun main() {
    val settingA = Settings.getInstance()
    val settingB = Settings.getInstance()

    println(settingA == settingB)
}