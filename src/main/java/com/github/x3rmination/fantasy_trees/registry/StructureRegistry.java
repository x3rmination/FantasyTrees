package com.github.x3rmination.fantasy_trees.registry;

import com.github.x3rmination.fantasy_trees.FantasyTrees;
import com.github.x3rmination.fantasy_trees.common.structures.LargeTreeStructures;
import com.github.x3rmination.fantasy_trees.common.structures.MediumTreeStructures;
import com.github.x3rmination.fantasy_trees.common.structures.SmallTreeStructures;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class StructureRegistry {

    public static final DeferredRegister<StructureFeature<?>> STRUCTURE_FEATURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, FantasyTrees.MOD_ID);

    public static final RegistryObject<StructureFeature<?>> SMALL_TREE_STRUCTURES = STRUCTURE_FEATURES.register("small_tree_structures", SmallTreeStructures::new);
    public static final RegistryObject<StructureFeature<?>> MEDIUM_TREE_STRUCTURES = STRUCTURE_FEATURES.register("medium_tree_structures", MediumTreeStructures::new);
    public static final RegistryObject<StructureFeature<?>> LARGE_TREE_STRUCTURES = STRUCTURE_FEATURES.register("large_tree_structures", LargeTreeStructures::new);
}
