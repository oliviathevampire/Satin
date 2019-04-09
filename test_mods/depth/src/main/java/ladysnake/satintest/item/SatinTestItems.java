package ladysnake.satintest.item;

import ladysnake.satintest.SatinTest;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SatinTestItems {
    public static Item DEBUG_ITEM;

    public static void init() {
        DEBUG_ITEM = registerItem(new DebugItem(new Item.Settings()), "debug_item");
    }

    private static Item registerItem(Item item, String name) {
        Registry.register(Registry.ITEM, new Identifier(SatinTest.MOD_ID, name), item);
        return item;
    }
}