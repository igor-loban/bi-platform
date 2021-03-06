package by.bsu.fpmi.bip.plugin.manager;

import by.bsu.fpmi.bip.common.util.Errors;
import by.bsu.fpmi.bip.plugin.api.PluginDescriptor;

import java.util.Collection;

public final class PluginManagers {
    private PluginManagers() {
        Errors.throwInstantiationError();
    }

    public static PluginManager newPluginManager(Collection<PluginDescriptor> pluginDescriptors) {
        return new PluginManagerImpl(pluginDescriptors);
    }
}
