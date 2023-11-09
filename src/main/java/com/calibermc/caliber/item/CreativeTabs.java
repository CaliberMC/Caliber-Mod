package com.calibermc.caliber.item;


import com.calibermc.caliber.data.ModBlockFamilies;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.config.CaliberClientConfigs;

import com.calibermc.caliber.util.ModTags;
import com.google.common.collect.Lists;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.data.BlockFamilies;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.datafix.fixes.EntityPaintingItemFrameDirectionFix;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.ForgeRegistries;

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
            return new ItemStack(ModBlocks.POLISHED_PINK_MARBLE.get());
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
        new ModifiedTab("cobble_brick", () -> new ItemStack(ModBlocks.COBBLED_DARK_LIMESTONE.get())) {

            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                boolean b = ModBlockFamilies.getAllFamilies().anyMatch(p -> p.getBaseBlock() == Block.byItem(item));

                if ((key.getPath().startsWith("cobbled")
                        || key.getPath().contains("cobblestone")
                        || key.getPath().contains("brick")
                        || key.getPath().startsWith("cut")
                        || key.getPath().startsWith("chiseled")
                        || key.getPath().startsWith("smooth")
                        || key.getPath().startsWith("polished")

                )) {
                    return b;
                }
                return false;
            }
        };
        new ModifiedTab("planks_beams", () -> new ItemStack(Blocks.OAK_PLANKS)) {

            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return key.getPath().endsWith("_planks");
            }
        };
        new ModifiedTab("roofs", () -> new ItemStack(Blocks.AIR)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                for(Item item : ModifiedTab.getItems()) {
                    if (Block.byItem(item) instanceof CraftingTableBlock || Block.byItem(item) instanceof FurnaceBlock) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("plaster_stucco", () -> new ItemStack(Blocks.AIR)) {

        };

        new ModifiedTab("half_timbered_walls", () -> new ItemStack(Blocks.AIR)) {

        };

        new ModifiedTab("tiles_flooring", () -> new ItemStack(Blocks.AIR)) {

        };
        new ModifiedTab("glass_windows", () -> new ItemStack(Blocks.GLASS)) {

            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return Block.byItem(item) instanceof AbstractGlassBlock;
            }
        };
        new ModifiedTab("lighting", () -> new ItemStack(Blocks.CANDLE)) {
            ;
            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return key.getPath().contains("torch")
                        || key.getPath().contains("candle")
                        || key.getPath().contains("lantern")
                        || key.getPath().contains("lamp")
                        || key.getPath().equals("glowstone")
                        || key.getPath().contains("sea_lantern")
                        || key.getPath().contains("jack_o_lantern")
                        || key.getPath().contains("campfire")
                        ;
            }
        };
        new ModifiedTab("crafting", () -> new ItemStack(Items.CRAFTING_TABLE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                for(Item item : ModifiedTab.getItems()) {
                    if (Block.byItem(item) instanceof CraftingTableBlock
                            || Block.byItem(item) instanceof FurnaceBlock
                            || Block.byItem(item) instanceof BarrelBlock
                            || Block.byItem(item) instanceof LecternBlock
                            || Block.byItem(item) instanceof CartographyTableBlock
                            || Block.byItem(item) instanceof ComposterBlock
                            || Block.byItem(item) instanceof FletchingTableBlock
                            || Block.byItem(item) instanceof SmithingTableBlock
                            || Block.byItem(item) instanceof LoomBlock
                            || Block.byItem(item) instanceof GrindstoneBlock
                            || Block.byItem(item) instanceof BlastFurnaceBlock
                            || Block.byItem(item) instanceof SmokerBlock
                            || Block.byItem(item) instanceof StonecutterBlock
                            || Block.byItem(item) instanceof AnvilBlock
                            || Block.byItem(item) instanceof EnchantmentTableBlock
                            || Block.byItem(item) instanceof BrewingStandBlock
                            || Block.byItem(item) instanceof CauldronBlock
                            || Block.byItem(item) instanceof BeehiveBlock
                            || Block.byItem(item) instanceof BellBlock)
                    {
                        pItems.add(new ItemStack(item));
                    }
                }
            }
        };
        new ModifiedTab("stone", () -> new ItemStack(Blocks.STONE)) {
            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                boolean b = ModBlockFamilies.getAllFamilies().anyMatch(p -> p.getBaseBlock() == Block.byItem(item));

                if ((key.getPath().equals("black_granite")
                        || key.getPath().equals("brown_granite")
                        || key.getPath().equals("gray_granite")
                        || key.getPath().equals("pink_granite")
                        || key.getPath().equals("granite")
                        || key.getPath().equals("white_granite")

                        || key.getPath().equals("dark_limestone")
                        || key.getPath().equals("light_limestone")
                        || key.getPath().equals("stone")
                        || key.getPath().equals("pink_limestone")
                        || key.getPath().equals("tan_limestone")

                        || key.getPath().equals("black_marble")
                        || key.getPath().equals("gray_marble")
                        || key.getPath().equals("pink_marble")
                        || key.getPath().equals("red_marble")
                        || key.getPath().equals("white_marble")

                        || key.getPath().equals("brown_sandstone")
                        || key.getPath().equals("orange_sandstone")
                        || key.getPath().equals("red_sandstone")
                        || key.getPath().equals("sandstone")
                )) {
                    return b;
                }
                return false;
            }
        };
        new ModifiedTab("sand_gravel", () -> new ItemStack(Blocks.SAND)) {

            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return key.getPath().endsWith("sand") || key.getPath().endsWith("gravel");
            }
        };
        new ModifiedTab("grass_dirt", () -> new ItemStack(Blocks.GRASS_BLOCK)) {

            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return key.getPath().endsWith("grass_block") || key.getPath().contains("dirt");
            }
        };
        new ModifiedTab("metals_ores", () -> new ItemStack(Blocks.GOLD_ORE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                for(Item item : ModifiedTab.getItems()) {
                    if (Block.byItem(item) instanceof OreBlock
                            ) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }

        };
        new ModifiedTab("logs", () -> new ItemStack(Blocks.OAK_LOG)) {

            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return key.getPath().endsWith("_log");
            }
        };
        new ModifiedTab("leaves", () -> new ItemStack(Blocks.ACACIA_LEAVES)) {

            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return Block.byItem(item) instanceof LeavesBlock;
            }
        };
        new ModifiedTab("flowers", () -> new ItemStack(Blocks.AZURE_BLUET)) {

            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return Block.byItem(item) instanceof FlowerBlock;
            }
        };
        new ModifiedTab("crops", () -> new ItemStack(Blocks.WHEAT)) {

            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return Block.byItem(item) instanceof CropBlock;
            }
        };
        new ModifiedTab("decor", () -> new ItemStack(Blocks.BLUE_BANNER)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                for(Item item : ModifiedTab.getItems()) {
                    if (Block.byItem(item) instanceof CarpetBlock
                            || Block.byItem(item) instanceof BannerBlock
                            || Block.byItem(item) instanceof WallBannerBlock
                            // TODO: ADD PAINTINGS & ITEM FRAMES & MIRROR

                            || Block.byItem(item) instanceof FlowerPotBlock
                            || Block.byItem(item) instanceof SkullBlock
                            || Block.byItem(item) instanceof BarrelBlock
                            || Block.byItem(item) instanceof LecternBlock
                            || Block.byItem(item) instanceof BellBlock) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }

        };
        new ModifiedTab("furniture", () -> new ItemStack(Blocks.BROWN_BED)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                for(Item item : ModifiedTab.getItems()) {
                    if (Block.byItem(item) instanceof BedBlock
                    ) {
                        pItems.add(new ItemStack(item));
                    }
                }
            }


        };
        new ModifiedTab("storage", () -> new ItemStack(Blocks.CHEST)) {
            @Override
            public boolean keyIsCorrect(Item item, ResourceLocation key) {
                return key.getPath().contains("storage")
                        || key.getPath().endsWith("chest")
                        || key.getPath().endsWith("barrel")
                        || key.getPath().endsWith("shulker_box")
                        || key.getPath().endsWith("hopper")
                        || key.getPath().endsWith("dispenser")
                        || key.getPath().endsWith("dropper");
            }

        };
        new ModifiedTab("redstone", () -> new ItemStack(Items.REDSTONE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                for(Item item : ModifiedTab.getItems()) {
                    item.fillItemCategory(TAB_REDSTONE, pItems);
                }
            }
        };
        new ModifiedTab("food", () -> new ItemStack(Items.APPLE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                for(Item item : ModifiedTab.getItems()) {
                    item.fillItemCategory(TAB_FOOD, pItems);
                }
            }
        };
        new ModifiedTab("tools_weapons", () -> new ItemStack(Items.IRON_SWORD)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                for(Item item : ForgeRegistries.ITEMS) {
                    if (!(item instanceof ArmorItem || item instanceof EnchantedBookItem)) {
                        item.fillItemCategory(TAB_COMBAT, pItems);
                        item.fillItemCategory(TAB_TOOLS, pItems);
                    }
                }
            }
        };
        new ModifiedTab("armor", () -> new ItemStack(Items.IRON_CHESTPLATE)) {
            @Override
            public void fillItemList(NonNullList<ItemStack> pItems) {
                for(Item item : ModifiedTab.getItems()) {
                    if (item instanceof ArmorItem
                            || item instanceof HorseArmorItem) {
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

        // example with mc families
//        new ModifiedTab("example", () -> new ItemStack(Items.CRAFTING_TABLE)) {
//            @Override
//            public void fillItemList(NonNullList<ItemStack> pItems) {
//                for (Block value : BlockFamilies.ACACIA_PLANKS.getVariants().values()) {
//                    pItems.add(new ItemStack(value));
//                }
//            }
//        };

        // adding other mods tabs
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

        public boolean tabTag(TagKey tag) {
            return tag.equals(ModTags.Items.armorTab)
                    || tag.equals(ModTags.Items.brewingTab)
                    || tag.equals(ModTags.Items.cobbleBricksTab)
                    || tag.equals(ModTags.Items.craftingTab)
                    || tag.equals(ModTags.Items.cropsTab)
                    || tag.equals(ModTags.Items.decorTab)
                    || tag.equals(ModTags.Items.flowersTab)
                    || tag.equals(ModTags.Items.foodTab)
                    || tag.equals(ModTags.Items.furnitureTab)
                    || tag.equals(ModTags.Items.glassWindowsTab)
                    || tag.equals(ModTags.Items.grassDirtTab)
                    || tag.equals(ModTags.Items.halfTimberedWallTab)
                    || tag.equals(ModTags.Items.leavesTab)
                    || tag.equals(ModTags.Items.lightingTab)
                    || tag.equals(ModTags.Items.logsTab)
                    || tag.equals(ModTags.Items.metalsOresTab)
                    || tag.equals(ModTags.Items.miscTab)
                    || tag.equals(ModTags.Items.planksBeamsTab)
                    || tag.equals(ModTags.Items.plasterStuccoTab)
                    || tag.equals(ModTags.Items.redstoneTab)
                    || tag.equals(ModTags.Items.sandGravelTab)
                    || tag.equals(ModTags.Items.stoneTab)
                    || tag.equals(ModTags.Items.storageTab)
                    || tag.equals(ModTags.Items.tilesFlooringTab)
                    || tag.equals(ModTags.Items.toolsWeaponsTab);

        }


        // Orignal
//        @Override
//        public void fillItemList(NonNullList<ItemStack> pItems) {
//            for(Item item : ModifiedTab.getItems()) {
//                ResourceLocation key = ForgeRegistries.ITEMS.getKey(item);
//                if (key != null && keyIsCorrect(item, key)) {
//                    pItems.add(new ItemStack(item));
//                }
//            }
//        }

        // via Tags
        @Override
        public void fillItemList(NonNullList<ItemStack> pItems) {
            for(Item item : ModifiedTab.getItems()) {
                ModTags tag = ForgeRegistries.ITEMS.getKey(item).getNamespace().equals("caliber") ? ModTags.Items.class;
                ResourceLocation key = ForgeRegistries.ITEMS.getKey(item);
                if (key != null && tabTag(tag)) {
                    pItems.add(new ItemStack(item));
                }
            }
        }

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
