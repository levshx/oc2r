/* SPDX-License-Identifier: MIT */

package li.cil.oc2r.common.bus.device.provider.item;

import li.cil.oc2r.api.bus.device.ItemDevice;
import li.cil.oc2r.api.bus.device.provider.ItemDeviceQuery;
import li.cil.oc2r.common.Config;
import li.cil.oc2r.common.bus.device.provider.util.AbstractItemDeviceProvider;
import li.cil.oc2r.common.bus.device.vm.item.NetworkInterfaceCardDevice;
import li.cil.oc2r.common.item.Items;

import java.util.Optional;

public final class NetworkInterfaceCardItemDeviceProvider extends AbstractItemDeviceProvider {
    public NetworkInterfaceCardItemDeviceProvider() {
        super(Items.NETWORK_INTERFACE_CARD);
    }

    ///////////////////////////////////////////////////////////////////

    @Override
    protected Optional<ItemDevice> getItemDevice(final ItemDeviceQuery query) {
        return Optional.of(new NetworkInterfaceCardDevice(query.getItemStack()));
    }

    @Override
    protected int getItemDeviceEnergyConsumption(final ItemDeviceQuery query) {
        return Config.networkInterfaceEnergyPerTick;
    }
}
