package com.calibermc.caliber.item;


import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.data.ModBlockFamily;
import com.calibermc.caliber.util.ModTags;
import com.google.common.collect.Lists;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.tags.ITagManager;
import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;


public class CreativeTabs {
    public static CreativeModeTab[] TABS;
    public static final CreativeModeTab CALIBER_TAB = new CreativeModeTab("caliber") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.POLISHED_PINK_MARBLE.baseBlock());
        }
    };

    private static final List<CreativeModeTab> MAIN_TABS = Lists.newArrayList(CreativeModeTab.TAB_SEARCH, CreativeModeTab.TAB_INVENTORY, CreativeModeTab.TAB_HOTBAR);

    private static final String[] GRANITE = new String[]{"black_granite", "brown_granite", "gray_granite", "pink_granite",
            "granite", "red_granite", "white_granite"};
    private static final String[] LIMESTONE = new String[]{"dark_limestone", "light_limestone", "pink_limestone",
            "tan_limestone", "stone", "limestone"};
    private static final String[] MARBLE = new String[]{"black_marble", "gray_marble", "pink_marble",
            "red_marble", "white_marble"};
    private static final String[] SANDSTONE = new String[]{"brown_sandstone", "orange_sandstone", "red_sandstone", "sandstone"};

    //public static void setupCreativeTabs()
    public static void setupCreativeTabs() {
        TABS = new CreativeModeTab[CreativeModeTab.TABS.length];
        System.arraycopy(CreativeModeTab.TABS, 0, TABS, 0, CreativeModeTab.TABS.length);
        boolean removeMCTabs = CaliberClientConfigs.CUSTOM_CREATIVE_INVENTORY.get();
        if (removeMCTabs) {
            CreativeModeTab.TABS = new CreativeModeTab[32]; //12
        }
        for (CreativeModeTab mainTab : MAIN_TABS) {
            CreativeTabs.addGroupSafe(mainTab.getId(), mainTab);
        }
        new ModifiedTab("cobble_brick", () -> new ItemStack(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock())) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.cobbleBricksTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("planks_beams", () -> new ItemStack(Blocks.OAK_PLANKS)) {

            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.planksBeamsTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("roofing", () -> new ItemStack(ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_45))) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.roofingTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("plaster_stucco", () -> new ItemStack(ModBlocks.BEIGE_PLASTER.baseBlock())) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.plasterStuccoTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("half_timbered_walls", () -> new ItemStack(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER.get(ModBlockFamily.Variant.CROSS))) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.halfTimberedWallTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("tiles_flooring", () -> new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.tilesFlooringTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("glass_windows", () -> new ItemStack(Blocks.GLASS)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.glassWindowsTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("lighting", () -> new ItemStack(Blocks.LANTERN)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.lightingTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("crafting", () -> new ItemStack(Items.CRAFTING_TABLE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.craftingTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("stone", () -> new ItemStack(Blocks.STONE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.stoneTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("sand_gravel", () -> new ItemStack(Blocks.SAND)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.sandGravelTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("grass_dirt", () -> new ItemStack(Blocks.GRASS_BLOCK)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.grassDirtTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("metals_ores", () -> new ItemStack(Blocks.GOLD_ORE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.metalsOresTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
//            @Override
//            public void fillItemList(NonNullList<ItemStack> pItems) {
//                for(Item item : ModifiedTab.getItems()) {
//                    if (Block.byItem(item) instanceof OreBlock
//                            ) {
//                        pItems.add(new ItemStack(item));
//                    }
//                }
//            }

        };
        new ModifiedTab("logs", () -> new ItemStack(Blocks.OAK_LOG)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.logsTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return key.getPath().endsWith("_log");
            }
        };
        new ModifiedTab("leaves", () -> new ItemStack(Blocks.ACACIA_LEAVES)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.leavesTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("flowers_plants", () -> new ItemStack(Blocks.POPPY)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.flowersPlantsTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return Block.byItem(item) instanceof FlowerBlock;
            }
        };
        new ModifiedTab("crops", () -> new ItemStack(Blocks.WHEAT)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.cropsTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("decor", () -> new ItemStack(Blocks.BLUE_BANNER)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.decorTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("furniture", () -> new ItemStack(Blocks.BROWN_BED)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.furnitureTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("storage", () -> new ItemStack(Blocks.CHEST)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.storageTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("redstone", () -> new ItemStack(Items.REDSTONE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.redstoneTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("food", () -> new ItemStack(Items.APPLE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.foodTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("tools_weapons", () -> new ItemStack(Items.IRON_SWORD)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.toolsWeaponsTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
//            @Override
//            public void fillItemList(NonNullList<ItemStack> pItems) {
//                for(Item item : ForgeRegistries.ITEMS) {
//                    if (!(item instanceof ArmorItem || item instanceof EnchantedBookItem)) {
//                        item.fillItemCategory(TAB_COMBAT, pItems);
//                        item.fillItemCategory(TAB_TOOLS, pItems);
//                    }
//                }
//            }
        };
        new ModifiedTab("armor", () -> new ItemStack(Items.IRON_CHESTPLATE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
                if (tags != null) {
                    for (Item item : tags.getTag(ModTags.Items.armorTab)) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };

        // copy mc tabs
        if (removeMCTabs) {
            new ReplicaTab(CreativeModeTab.TAB_BREWING);
            new ReplicaTab(CreativeModeTab.TAB_MISC);
        }

        // add other mods tabs
        List<CreativeModeTab> tabs = Lists.newArrayList(TABS);
        tabs.removeAll(getVanillaGroups());
        for (CreativeModeTab modTab : tabs) {
            if (modTab != CALIBER_TAB || !removeMCTabs) {
                ReplicaTab tab = new ReplicaTab(modTab);
                CreativeTabs.addGroupSafe(tab.getId(), tab);
            }
        }
    }

    private static synchronized void addGroupSafe(int index, CreativeModeTab newGroup) {
        if (index >= CreativeModeTab.TABS.length) {
            int i = index - CreativeModeTab.TABS.length;
            CreativeModeTab[] tmp = new CreativeModeTab[index + i];
            System.arraycopy(TABS, 0, tmp, 0, CreativeModeTab.TABS.length);
            CreativeModeTab.TABS = tmp;
        }
        CreativeModeTab.TABS[index] = newGroup;
    }

    private static List<CreativeModeTab> getVanillaGroups() {
        List<CreativeModeTab> tabs = Lists.newArrayList();
        for (Field field : CreativeModeTab.class.getFields()) {
            if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers()) && field.getType() == CreativeModeTab.class) {
                try {
                    tabs.add((CreativeModeTab) field.get(null));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return tabs;
    }

    private static int getGroupIndex() {
        int index = -1;
        for (int i = 0; i < CreativeModeTab.TABS.length - 1; i++) {
            if (CreativeModeTab.TABS[i] == null) {
                index = i;
                break;
            }
        }
        return index == -1 ? CreativeModeTab.TABS.length : index;
    }
    
    private static class ModifiedTab extends CreativeModeTab {

        private final Supplier<ItemStack> iconStack;
        
        public ModifiedTab(String label, Supplier<ItemStack> iconStack) {
            super(getGroupIndex(), label);
            this.iconStack = iconStack;
        }

        @Override
        public ItemStack makeIcon() {
            return this.iconStack.get();
        }
        
        public boolean keyIsCorrect(Item item, ResourceLocation key) {
            return true;
        }

        // Orignal
        @Override
        public void fillItemList(NonNullList<ItemStack> pItems) {
            for(Item item : ModifiedTab.getItems()) {
                ResourceLocation key = ForgeRegistries.ITEMS.getKey(item);
                if (key != null && keyIsCorrect(item, key)) {
                    pItems.add(new ItemStack(item));
                }
            }
        }

            // Sorted or Not Sorted via Config
//        private static List<Item> getItems() {
//            boolean shouldSort = CaliberClientConfigs.SORT_CREATIVE_INVENTORY.get();
////            boolean shouldSort = false;
//
//            // Retrieve all registered items as a stream of Map.Entry objects.
//            List<Item> items = ForgeRegistries.ITEMS.getEntries().stream()
//                    // Map each Map.Entry to its associated item.
//                    .map(Map.Entry::getValue)
//                    // Collect the items into a list.
//                    .toList();
//
//            // Conditionally sort the list if shouldSort is true.
//            if (shouldSort) {
//                items.sort((item1, item2) -> {
//                    ResourceLocation loc1 = ForgeRegistries.ITEMS.getKey(item1);
//                    ResourceLocation loc2 = ForgeRegistries.ITEMS.getKey(item2);
//
//                    // Use compareTo to compare the ResourceLocation strings.
//                    assert loc1 != null && loc2 != null;
//                    return loc1.compareTo(loc2);
//                });
//            }
//
//            return items;
//        }

        // Sorted
        private static List<Item> getItems() {
            return ForgeRegistries.ITEMS.getEntries().stream().map(Map.Entry::getValue).sorted((o, o1) -> {
                ResourceLocation str1 = ForgeRegistries.ITEMS.getKey(o);
                ResourceLocation str2 = ForgeRegistries.ITEMS.getKey(o1);
                assert str1 != null && str2 != null;
                return str1.compareTo(str2);
            }).toList();
        }
        // Unsorted
//        private static List<Item> getItems() {
//            // Retrieve all registered items as a stream of Map.Entry objects.
//            return ForgeRegistries.ITEMS.getEntries().stream()
//                    // Map each Map.Entry to its associated item.
//                    .map(Map.Entry::getValue)
//                    // Collect the items into a list without sorting.
//                    .toList();
//        }

        private static boolean blockIs(ResourceLocation location, String... keys) {
            return blockIs(location, (s) -> s, keys);
        }

        private static boolean blockIs(ResourceLocation location, Function<String, String> key, String... keys) {
            boolean b = false;
            for (String key1 : keys) {
                if (location.getPath().startsWith(key.apply(key1))) {
                    b = true;
                }
            }
            return b;
        }
    }

    public static class ReplicaTab extends CreativeModeTab {

        private final CreativeModeTab group;

        ReplicaTab(CreativeModeTab group) {
            super(getGroupIndex(), group.getRecipeFolderName());
            this.group = group;
        }

        @Override
        public String getRecipeFolderName() {
            return this.group.getRecipeFolderName();
        }

        @Override
        public Component getDisplayName() {
            return this.group.getDisplayName();
        }

        @Override
        public ItemStack getIconItem() {
            return this.group.getIconItem();
        }

        @Override
        public ItemStack makeIcon() {
            return this.group.makeIcon();
        }

        @Override
        public String getBackgroundSuffix() {
            return this.group.getBackgroundSuffix();
        }

        @Override
        public CreativeModeTab setBackgroundSuffix(String texture) {
            return this.group.setBackgroundSuffix(texture);
        }

        @Override
        public CreativeModeTab setRecipeFolderName(String pathIn) {
            return this.group.setRecipeFolderName(pathIn);
        }

        @Override
        public boolean showTitle() {
            return this.group.showTitle();
        }

        @Override
        public CreativeModeTab hideTitle() {
            return this.group.hideTitle();
        }

        @Override
        public boolean canScroll() {
            return this.group.canScroll();
        }

        @Override
        public CreativeModeTab hideScroll() {
            return this.group.hideScroll();
        }

        @Override
        public EnchantmentCategory[] getEnchantmentCategories() {
            return this.group.getEnchantmentCategories();
        }

        @Override
        public CreativeModeTab setEnchantmentCategories(EnchantmentCategory... types) {
            return this.group.setEnchantmentCategories(types);
        }

        @Override
        public boolean hasEnchantmentCategory(@Nullable EnchantmentCategory enchantmentType) {
            return this.group.hasEnchantmentCategory(enchantmentType);
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            this.group.fillItemList(items);
        }

        @Override
        public boolean hasSearchBar() {
            return this.group.hasSearchBar();
        }

        @Override
        public int getSearchbarWidth() {
            return this.group.getSearchbarWidth();
        }

        @Override
        public ResourceLocation getBackgroundImage() {
            return this.group.getBackgroundImage();
        }

        @Override
        public ResourceLocation getTabsImage() {
            return this.group.getTabsImage();
        }

        @Override
        public int getLabelColor() {
            return this.group.getLabelColor();
        }

        @Override
        public int getSlotColor() {
            return this.group.getSlotColor();
        }
    }
}
