package dev.xyzjesper.velocitytemplate.config

import java.io.File
import java.util.*

object ConfigManager {

    private val settingsFile = File("plugins/${UUID.randomUUID()}/config.json")

    var settings = settingsFile.loadConfig(SettingsData)

    fun save() {
        settingsFile.writeText(json.encodeToString(settings))
    }

    fun reload() {
        settings = loadFromFile(settingsFile)
    }

}
