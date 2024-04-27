# Change Log


### 0.2.4 (in progress)
#### Features
- Added vanilla style slabs for all variants that don't have them
- Added Chiseled Polished Blackstone variants
- Added Cracked Polished Blackstone variants
- Added Chiseled Deeplate variants
- Added Cracked Deepslate Brick variants
- Added Cracked Deepslate Tile variants
- Added Chiseled Stone Brick variants
- Added Cracked Stone Brick variants
- Added Chiseled Sandstone variants
- Added Chiseled Red Sandstone variants
- Added Purpur Pillar Variants
- Added Regions Unexplored Chalk Pillar variants
- Renamed Regions Unexplored Chalk variants to Chalk Block _(this is to allow the Chalk Pillar variants to be added)_
- Added BOP Smooth (Black, Orange, White) Sandstone variants
- Added mod compatibility variants for Create Natural Stone types

[//]: # (- Added mod compatibility variants for Stone Works)
[//]: # (- Added mod compatibility variants for Quark)
[//]: # (- Added mod compatibility variants for Ice and Fire)

#### Bugfixes
- Removed duplicate item models for mod compat variants _(this was causing some items to appear invisible in the inventory)_

---
### 0.2.3
- Downgraded Minimum Forge Version <- 47.1.3 to allow NeoForge 1.20.1 support
- Added missing recipes for Diagonal Beams
- Added Mossy Cobblestone variants
- Added Mossy Stone Brick variants
- Added Smooth Stone variants
- Added Wool and Terracotta Slabs
- Added mod compatibility variants for Biomes O' Plenty
- Added mod compatibility variants for Regions Unexplored
- Added missing translations for en_us
- Added filters for Blockpicker showing vanilla block families (linked to Buildify Config)
- Bugfix: fixed Tall Door Texture Colors
- Bugfix: fixed Polished Granite BlockPicker displaying Granite stairs and walls, (now displays Polished Granite variants)
- Bugfix: fixed ArchBlock textures not displaying correctly in all situations (there may still be some glitches in rare case)

---
### 0.2.2
- Added Diagonal Beam variants for all Stripped Wood

---
### 0.2.1
- Slab variants are now just called Layers (Sorry if this breaks any builds, but it just makes sense to avoid confusion with vanilla slabs)
- Vertical Slab variants are now just called Vertical Layers
- Corner Slab and Vertical Corner Slab variants have new layers functionality (again this may break some builds, but it makes sense to have them function like the other layered blocks)
- Eighth variants have new layers functionality (again this may break some builds, but it makes sense to have them function like the other layered blocks)
- Added check for if dataGen is running
- Added Acacia, Bamboo, Birch, Dark_Oak, Jungle, Mangrove, Oak, Spruce, Crimson and Warped Roof Blocks
- Added Bamboo, Cherry and Mangrove Tall Doors
- Refactored all Tall Doors to better match naming conventions woodname_tall_door.  Sorry for any inconvenience this may cause.
- Removed deprecated BlockRenderLayers and replaced with RenderLayer setting in models
- Removed unused Global Loot Modifiers (moved to Natures Canvas)
- Removed unused Biome Modifier (all world gen is now in Natures Canvas)
- Removed unused Tags
- Removed dulicate wooden Pressure Plate variants
- Added Tags data gen to ensure all Minecraft, Forge and Custom tags are accounted for

---
### 0.2.0
- Added Forge 1.20.1 support
- Removed Sorting Buttons (are included in Buildify now)
- Removed World Gen (is included in Natures Canvas now)
- Updated translations en_us
- Added Bamboo, Bamboo Mosaic, Stripped Bamboo, Cherry, Stripped Cherry, Mangrove, Stripped Mangrove and Mud Bricks Variants
- Updated Dependencies CaliberLib -> 0.1.2. Buildify -> 0.2.3.
- Bugfix: fixed layered slab block collision shape
- Bugfix: fixed black/transparent textures on Tall Doors
- Bugfix: fixed red_sand_layer texture showing as sand
- Bugfix: fixed slab_layer removing block from inventory on placement of double_slab in Slab Mode

---
### 0.1.3
- Updated Buildify Dependency Version to 0.1.3+
- Adjusted placement of Sorting Buttons when using Chest
- Bugfix: fixed issue that was preventing startup of dedicated servers
- Bugfix: fixed villagers not able to use Tall Doors

---
### 0.1.2
- Added a total of 14 new blocks!
- Current Mod Block Count is at 5,820
- Added Inventory Sorting Feature
- Renamed Nethrite Block Variants to Netherite_VARIANT
- Added Tall Doors for Acacia, Birch, Dark Oak, Jungle, Oak, Spruce, Crimson, Warped and their Stained counterparts
- Adjusted texture placement on Arch Block trim
- Adjusted Arch GUI display to include trim
- Bugfix: fixed Stained Doors dropping two doors when broken
- Bugfix: fixed resin not dropping from spruce leaves
- Bugfix: fixed all wooden variants not breaking quickly with axe
- Bugfix: fixed some stone type variants not breaking quickly with pickaxe
- Bugfix: removed wooden wall shaped recipes to avoid conflicts with vanilla recipes (wooden walls can still be crafted in the woodcutter)
- Bugfix: fixed hitbox appearing in wrong place for Quarter Blocks with a single layer facing
- Bugfix: adjusted hitboxes for Layered Blocks to Reduce Ambient Occlusion issues

---
### 0.1.1
- Added a total of 29 new blocks!
- Current Mod Block Count is at 5,806
- Added Mossy Thatch Variants
- Bugfix: fixed trim not appearing on the correct side of block on Large Arch Blocks
- Bugfix: fixed Large Arch Block GUI rotation
- Bugfix: fixed texture glitches on Half Arch Blocks
- Bugfix: fixed texture glitches on Large Half Arch Blocks
- Bugfix: fixed texture glitch on east face of 67 degree roof blocks
- Bugfix: fixed lighting/shading on 67 degree roof blocks
- Bugfix: fixed Sandstone, Red Sandstone, Smooth Sandstone and Quartz Block Pickers showing Black Marble Variants

---
### 0.1.0
- BETA RELEASE
- While this is a beta release, it is still very much a work in progress.  The mod is stable with no known bugs at this point. There are still many blocks to add and some bugs may still exist.
- Added finishing touches on the recipe generation system (this will ensure that now recipes are missed in future updates)

---
### 0.0.31
- Added a total of 1,509 new blocks!
- Current Mod Block Count is at 5,777 !!!!!! (this is a huge update)
  (All Vanilla Variants for 1.18 that will be added have now been added)
- Added all Brick variants
- Added all Calcite variants
- Added all Concrete variants
- Added all Dripstone variants
- Added all End Stone variants
- Added all End Stone Brick variants
- Added all Nethrite variants
- Added all Nether Brick variants
- Added all Red Nether Brick variants
- Added all Obsidian variants
- Added all Prismarine variants
- Added all Prismarine Brick variants
  _ Added all Dark Prismarine variants
- Added all Purpur variants
- Added all Quartz Brick variants
- Added all Terracotta variants
- Added all Tuff variants
- Added all Wool variants
  _ Added all Terracotta Roof variants
- Added all Stained Tudor Variants
- Removed Tudor Plaster Colors (brown, ochre, tan) that just didn't look great.
- Added layered shapes to Tudor Blocks.
- Re-worked Recipe Generation to be more efficient and easier to maintain (this will allow for faster updates in the future, if you find missing recipes please let me know)
- Changed naming conventions for Tudor Blocks to match the rest of Caliber-Mod (This will break any existing Tudor Blocks in the world, sorry)
- Double-checked all English Translations (They are all included, if you would like to contribute other languages please join the discord server)
- Major Bugfix: fixed all block textures (blocks that had different top, bottom, sides were not generating correctly)
- BETA RELEASE IS COMING SOON!

---
### 0.0.30
- Added a total of 645 new blocks!
- Current Mod Block Count is at 4,268
- Added Wood Stain for staining wood blocks
- Added Sap as an ingredient for staining wood blocks
- Added all variants of Acacia, Birch, Dark Oak, Jungle, Oak, Spruce, Crimson and Warped Boards
- Added all variants of Mossy Acacia, Birch, Dark Oak, Jungle, Oak, Spruce, Crimson and Warped Planks, Boards and Shingles
- Added Crimson and Warped Shingle Roof Variants
- Added Crimson and Warped Plank Variants
- Reworked Shingle variants and made them part of the Boards family (going forward planks will have vertical textures and boards will have horizontal textures)
- Added Mossy variants of all Boards, Planks and Shingles
- Added more tags for mod compatibility
- Added all missing recipes? (Let me know if you find any missing ones)
- Lots of code cleanup
- Updated Stained Plank textures
- Updated Naming Conventions for Stained Planks and Stained Stripped Wood and Shingle base blocks (this might break existing use of these blocks in the world, sorry)
- Bugfix: fixed crash when placing modded Stair Blocks
- Bugfix: fixed crash when Pillar Blocks reach 5 layers and were clicked again
- Bugfix: fixed crash when placing another Vertical Quarter Tudor Block on top of an existing one
- Bugfix: fixed hitbox not matching blockstate for E and S facing Vertical Quarter Blocks
- Bugfix: fixed Tudor Block Vertical Quarter models appearing as Vertical Slabs
- Bugfix: fixed placement issue with N facing Lintel Blocks appearing Top on Bottom and Bottom on Top.
- Bugfix: fixed visual glitch with Arrowslit Blocks
- Bugfix: fixed occulsion/shadows on 67 degree roof blocks (this is experimental and may be reworked in the future)

---
### 0.0.29
- BugFix: fixed grass_stems not dropping from grass
- Removed Buildify Features from Caliber-Mod to add greater mod compatibility for Block Picker feature, added as a dependency/library for Caliber-Mod

---
### 0.0.28
- Added a total of 42 new blocks!
- Current Mod Block Count is at 3,623
- Added Bronze Armor and Tools to the Creative Inventory Tabs
- Added Stripped Crimson and Stripped Warped Beams, Door Frames, Posts and Lintels and other variants
- Added Grass Stems that drop from breaking Grass (used to craft Thatch)
- Added Stained Wood Recipes
- Added Stained Planks Recipes
- Added Roofing Recipes

---
### 0.0.27
- Added a total of 214 new blocks!
- Current Mod Block Count is at 3,581
- Renamed Stained Woods to Stained Stripped Woods to account for Stained Planks and better fit naming conventions
- Added the new wood variants to the Planks & Beams tab
- Experimenting with Plank and Shingle Textures in this update, please provide feedback on github or the discord server.
- Added all variants of Stained Acacia Planks, Stained Birch Planks, Stained Dark Oak Planks, Stained Jungle Planks, Stained Oak Planks and Stained Spruce Planks
- Added all stained variants of all Shingle Roofs
- There is a known bug with shadows/occlusion on the 67 degree roof blocks, this will be fixed asap.
- Added all current Kiln recipes
- All missing recipes will be added asap

---
### 0.0.26
- Major Code Optimization (Removed over 10k lines of code and prevented another 30k+ by implementing a new system for registering blocks and generating data/assets.
  This should allow for faster updates and easier maintenance of the mod going forward)
  Added Bronze Armor and Tools
- Added a total of 134 new blocks!
- Current Mod Block Count is at 3,367
- Added more tags for mod compatibility
- Added Thatch
- Added Slate Tile
- Added 6 types of Wood Shingles
- Added all variants of 45 degree roofs
- Added all variants of 22 degree roofs
- Added all variants of 67 degree roofs
- Added all variants of roof peaks

---
### 0.0.25
- Bugfix: fixed major bug preventing startup of dedicated servers on last update 0.0.24

---
### 0.0.24
- Added a total of 261 new blocks!
- Current Mod Block Count is at 3,233
- Added Woodcutter (for cutting wood blocks into various new shapes)
- Added Kiln (for alloying metals)
- Added recipes for Woodcutter and Kiln
- Updated COPY BLOCK keybind to also include (CTRL + Middle Mouse Button), you can continue to use the old keybind if you wish.
- Added DoorFrameBlock and 3 new variant states
- Added DoorFrameLintelBlock and 4 new variant states
- Added BeamPostsBlock and 3 new variant states
- Added BeamLintelBlock and 4 new variant states
- Added HorizontalBeamBlock and 6 new variant states
- Added VerticalBeamBlock and 7 new variant states
- Added Stripped Acacia, Stripped Birch, Stripped Dark Oak, Stripped Jungle, Stripped Oak and Stripped Spruce beams, door frames, posts and lintels
- Added all variants of Stained Acacia, Stained Birch, Stained Dark Oak, Stained Jungle, Stained Oak, Stained Spruce
- Added all current Woodcutting recipes
- Added missing shaped recipes
- Added new tags and updated existing tags
- Updated stonecutter texture
- Updated Acacia, Birch, Jungle and Oak textures to better match the mod theme
- Bugfix: adjusted inventory logic for Slab Buildmode.  When placing slab thickness blocks the correct inventory amounts will be consumed.
- Bugfix: fixed double eighth blocks not placing correctly

---
### 0.0.23
- Updated Block Picker GUI textures
- Updated Blackstone textures
- Added Bronze Block and Bronze Ingots
- Bugfix: fixed crash when placing blocks too close to the player in quick succession.
- Bugfix: fixed QuarterLayerBlock hitboxes and textures
- Bugfix: fixed Polished Blackstone Bricks and Polished Blackstone QuarterLayerBlock models (top models were placing on bottom)

---
### 0.0.22
- Added a total of 341 new blocks!
- Current Mod Block Count is at 2,972
- Added all variants of Andesite and Polished Andesite
- Added all variants of Basalt, Polished Basalt and Smooth Basalt
- Added all variants of Blackstone, Gilded Blackstone, Polished Blackstone, Polished Blackstone Bricks
- Added all variants of Diorite and Polished Diorite
- Added all variants of Quartz and Smooth Quartz
- Added all variants of Smooth Dark Limestone, Smooth Light Limestone, Smooth Limestone, Smooth Pink Limesotne & Smooth Tan Limestone

---
### 0.0.21
- Improved performance of slab/layer buildmodes
- Reworked ArchBlock and LargeArchBlock blockstates, models, textures, hitboxes
- Added corner blockstates for LargeArchBlock
- Bugfix: fixed lighting issues with ArchBlock and LargeArchBlock
- Bugfix: fixed ArchBlock T placement/update logic
- Bugfix: fixed crash when using Hammer Item on layered blocks
- Bugfix: fixed "out of nails" message when using Hammer in Creative Mode.

---
### 0.0.20
- Added sounds for Hammer Item
- Added buildmode command to change behaviour of all Layered Blocks (caliber.buildmode)
- Added 2 Modes for Layered Blocks (Slab Mode & Layer Mode)
  - Slab Mode: Only slab thickness blocks will be placed when placing layered blocks. Use the keybind (m) to place layered blocks.
  - Layer Mode: Only layered blocks will be placed when placing layered blocks. Use the keybind (m) to place slab thickness blocks.
- Added Nails Item to use with Hammer Item for cycling blockstate conditions in survival mode
  - Creative: left click to change property and right click to cycle states
  - Survival: sneak+right click to change blockstate property and right click to cycle states (1 nail per interaction will be consumed)

---
### 0.0.19
- Added a total of 1,067 new blocks!
- Current Mod Block Count is at 2,631
- Added Hammer Item for cycling blockstate conditions (caliber.hammer
- Added all variants of Beige Plaster
- Added all variants of Brown Plaster
- Added all variants of Ochre Plaster
- Added all variants of Tan Plaster
- Added all variants of White Plaster
- Added all variants of Half Timbered Beige Plaster
- Added all variants of Half Timbered Brown Plaster
- Added all variants of Half Timbered Ochre Plaster
- Added all variants of Half Timbered Tan Plaster
- Added all variants of Half Timbered White Plaster
- Added all variants of Deepslate
- Added all variants of Deepslate Bricks
- Added all variants of Deepslate Tiles
- Added all variants of Cobbled Deepslate
- Added all variants of Polished Deepslate
- Added all block variants of Pillar Block
- Removed unused texture files
- Updated Silver and Tin Textures

---
### 0.0.18
- Current Mod Block Count is at 1,564
- Added new trimmed BlockState for Arch Blocks to prevent most texture issues
- Added all existing stone variants of Large Arches (2m)
- Added all wood plank variants of Half-Timbered Plaster in Beige, Brown, Ochre, Tan and White
- Added Dirt (Coarse, Dirt, Rooted) Layers (experimental)
- Added Grass Block Layers (experimental)
- Added Gravel Layers (experimental)
- Added Podzol Layers (experimental)
- Added Mycelium Layers (experimental)
- Added Nylium (Crimson, Warped) Layers (experimental)
- Added Sand (Black, Brown, Orange, Red, Soul, Tan, White) Layers (experimental)
- Added Layers to Corner Blocks
- Added Layers to Quarter Blocks
- Added Layers to Vertical Quarter Blocks
- Added Layers to Slab Blocks
- Added Layers to Vertical Slab Blocks
- Added ptime command to change time of day for the client side only (caliber.ptime)
- Added pweather command to change weather for the client side only (caliber.pweather)
  all commands perfaced with a "p" are client side only should only be used when playing on a server. Requires LuckPerms for permissions.
- Adjusted recipes for new layered versions of blocks
- Bugfix: fixed Grass Layer texture
- Bugfix: fixed Corner Slab hitboxes
- Bugfix: fixed pressure plate tags

---
### 0.0.17
- Added all Mossy Cobbled Limestone variants (were missing from last update)
- Added Mod Compat to all Creative Tabs via Tags (modders can now add their blocks to CaliberMod Tabs)
- Lots of code cleanup
- Bugfix: adjusted particle textures for all Arch Block variants

---
### 0.0.16
- Added all existing block variants of HalfWindow
- Added all Mossy Stone Brick variants
- Added all Mossy Cobbled Limestone variants

---
### 0.0.15
- Added all block variants of Cut Sandstone and Smooth Sandstone
- Block Picker overhaul allowing for shift+click, right click and dropping blocks onto GUI to remove

---
### 0.0.14
- Bugfix: Copy Block key now only works in Creative Mode

---
### 0.0.13
- Added HalfWindow Shape
- Added all shape variants for all vanilla wood planks
- Bugfix: waterlogged blocks now function properly

---
### 0.0.12
- Added tags for all existing blocks
- Bugfix: fixed server sync issue with Block Picker
- Bugfix: config not working for enabling custom creative inventory
- Bugfix: added all missing model files, corrected blockstates, fixed textures
- Bugfix: added new enums to fix missing blockstate errors in console

---
### 0.0.11
- Added Block Picker GUI
- Added Custom Creative Inventory
- Added Reach Adjustment Key
- dded Block/BlockState Copy Key
- Bugfix: Added missing Limestone Wall

---
### 0.0.10
- Added Arch Blocks!
- Added all Natural Stone variants of Arch Block
- Added new dynamic shape for Window Blocks
- Added all missing loot tables
- Bug Fix: Fixed rotation of all blocks in GUI display
- Bug Fix: Added missing Tan Limestone Brick blockstate
- Bug Fix: Sand Blocks now function like sand
- Bug Fix: Adjusted ArrowSlit Blocks hitboxes and outlines
- Cleaned up a bunch of code!

---
### 0.0.9
- Added all Natural Stone variants of CornerSlab and VerticalCornerSlab.

---
### 0.0.8
- Added all Natural Stone Variants of Arrow Slit Block, Balustrade Block, Capital Block and Window Block -Added All current custom blocks to Red Sandstone & Sandstone
- Fixed Textures on Custom Sandstone blocks
- Added translations and loot for all current blocks

---
### 0.0.7
- Added Corner Block
- Added all except cobble and sandstone Corner Blocks (will be included in the next update)

---
### 0.0.6
- Bug Fix: Adjusted rotation of Vertical Quarters

---
### 0.0.5
- Added World Gen for Natural Stones
- Added all variations of Natural Stone Vertical Slab, Quarter, Vertical Quarter and Eighth Blocks.
- Added Loot Tables for all existing blocks
- Lots of code optimizations
- Bug Fixes

---
### 0.0.4
- not released

---
### 0.0.3
- not released

---
### 0.0.2
- Initial Alpha Release
- This mod is in the early development phase










































































