package dev.xyzjesper.velocitytemplate.config

import kotlinx.serialization.json.Json
import java.io.File

val json = Json {
    prettyPrint = true
    ignoreUnknownKeys = true
    encodeDefaults = true
}

inline fun <reified T : Any> File.loadConfig(default: T): T {
    return if (exists()) {
        try {
            json.decodeFromString<T>(readText())
        } catch (_: Exception) {
            saveConfig(default)
            default
        }
    } else {
        saveConfig(default)
        default
    }
}

inline fun <reified T : Any> File.saveConfig(config: T) {
    if (!exists() && parentFile != null) parentFile.mkdirs()
    writeText(json.encodeToString(config))
}


inline fun <reified T> loadFromFile(file: File): T {
    return Json.decodeFromString<T>(file.readText())
}
