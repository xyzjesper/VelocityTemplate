package dev.xyzjesper.velocitytemplate

import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import java.util.logging.Logger
import javax.inject.Inject


@Plugin(
    id = "velocitytemplate", name = "VelocityTemplate", version = "1.0.0"
)
class Main @Inject constructor(val logger: Logger, val server: ProxyServer) {

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {
    }
}
