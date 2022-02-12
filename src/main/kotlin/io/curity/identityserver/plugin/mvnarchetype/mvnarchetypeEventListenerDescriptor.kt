package io.curity.identityserver.plugin.mvnarchetype

import se.curity.identityserver.sdk.event.EventListener
import se.curity.identityserver.sdk.event.EventListenerCollection
import se.curity.identityserver.sdk.plugin.descriptor.EventListenerPluginDescriptor

class mvnarchetypeEventListenerDescriptor: EventListenerPluginDescriptor<mvnarchetypeEventListenerConfig>
{
    override fun getEventListenerCollection() = mvnarchetypeListenerCollection::class.java

    override fun getPluginImplementationType() =  "mvnarchetype"

    override fun getConfigurationType() = mvnarchetypeEventListenerConfig::class.java
}

class mvnarchetypeListenerCollection(configuration: mvnarchetypeEventListenerConfig): EventListenerCollection
{
    private val listeners: Set<EventListener<*>> = setOf(mvnarchetypeEventListener(configuration))

    override fun getListeners(): Set<EventListener<*>> = listeners
}
