package by.bsu.fpmi.bip.plugin.oms;

import by.bsu.fpmi.bip.plugin.api.ApiDescriptor;
import by.bsu.fpmi.bip.plugin.api.ApiDescriptors;
import by.bsu.fpmi.bip.plugin.api.Plugin;
import by.bsu.fpmi.bip.plugin.api.PluginContext;
import by.bsu.fpmi.bip.plugin.api.PluginDescriptor;

import java.util.Collections;
import java.util.Set;

public final class OlapMultidimensionalStoragePluginDescriptor implements PluginDescriptor {
    private final Set<ApiDescriptor> providedApiDescriptors;
    private final OlapMultidimensionalStoragePlugin plugin = new OlapMultidimensionalStoragePlugin();

    public OlapMultidimensionalStoragePluginDescriptor() {
        this.providedApiDescriptors = Collections.singleton(ApiDescriptors
                .getProvidedApiDescriptor("by.bsu.fpmi.bip.plugin.oms.api.spi.OmsApiProvider", "0.1",
                        new OmsApiProviderImpl()));
    }

    @Override
    public String getName() {
        return "by.bsu.fpmi.bip.plugin.oms.OlapMultidimensionalStoragePlugin";
    }

    @Override
    public String getDescription() {
        return "OLAP Multidimensional Storage";
    }

    @Override
    public Set<ApiDescriptor> getRequiredApiDescriptors() {
        return Collections.emptySet();
    }

    @Override
    public Set<ApiDescriptor> getProvidedApiDescriptors() {
        return providedApiDescriptors;
    }

    @Override
    public Plugin getPlugin(PluginContext pluginContext) {
        return plugin;
    }
}
