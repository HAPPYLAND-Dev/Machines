package xyz.xenondevs.nova.machines.registry

import xyz.xenondevs.nova.item.behavior.Damageable
import xyz.xenondevs.nova.item.behavior.Enchantable
import xyz.xenondevs.nova.item.behavior.Extinguishing
import xyz.xenondevs.nova.item.behavior.Flattening
import xyz.xenondevs.nova.item.behavior.Stripping
import xyz.xenondevs.nova.item.behavior.Tilling
import xyz.xenondevs.nova.item.behavior.Tool
import xyz.xenondevs.nova.machines.Machines
import xyz.xenondevs.nova.machines.item.MobCatcherBehavior
import xyz.xenondevs.nova.material.NovaMaterialRegistry.registerDefaultItem

@Suppress("unused")
object Items {
    
    val MOB_CATCHER = registerDefaultItem(Machines, "mob_catcher", MobCatcherBehavior)
    
    // Tools
    val STAR_SWORD = registerDefaultItem(Machines, "star_sword", Tool, Damageable, Enchantable)
    val STAR_SHOVEL = registerDefaultItem(Machines, "star_shovel", Tool, Damageable, Enchantable, Flattening, Extinguishing)
    val STAR_PICKAXE = registerDefaultItem(Machines, "star_pickaxe", Tool, Damageable, Enchantable)
    val STAR_AXE = registerDefaultItem(Machines, "star_axe", Tool, Damageable, Enchantable, Stripping)
    val STAR_HOE = registerDefaultItem(Machines, "star_hoe", Tool, Damageable, Enchantable, Tilling)
    
    // Plates
    val IRON_PLATE = registerDefaultItem(Machines, "iron_plate")
    val GOLD_PLATE = registerDefaultItem(Machines, "gold_plate")
    val DIAMOND_PLATE = registerDefaultItem(Machines, "diamond_plate")
    val NETHERITE_PLATE = registerDefaultItem(Machines, "netherite_plate")
    val EMERALD_PLATE = registerDefaultItem(Machines, "emerald_plate")
    val REDSTONE_PLATE = registerDefaultItem(Machines, "redstone_plate")
    val LAPIS_PLATE = registerDefaultItem(Machines, "lapis_plate")
    val COPPER_PLATE = registerDefaultItem(Machines, "copper_plate")
    
    // Gears
    val IRON_GEAR = registerDefaultItem(Machines, "iron_gear")
    val GOLD_GEAR = registerDefaultItem(Machines, "gold_gear")
    val DIAMOND_GEAR = registerDefaultItem(Machines, "diamond_gear")
    val NETHERITE_GEAR = registerDefaultItem(Machines, "netherite_gear")
    val EMERALD_GEAR = registerDefaultItem(Machines, "emerald_gear")
    val REDSTONE_GEAR = registerDefaultItem(Machines, "redstone_gear")
    val LAPIS_GEAR = registerDefaultItem(Machines, "lapis_gear")
    val COPPER_GEAR = registerDefaultItem(Machines, "copper_gear")
    
    // Dusts
    val IRON_DUST = registerDefaultItem(Machines, "iron_dust")
    val GOLD_DUST = registerDefaultItem(Machines, "gold_dust")
    val DIAMOND_DUST = registerDefaultItem(Machines, "diamond_dust")
    val NETHERITE_DUST = registerDefaultItem(Machines, "netherite_dust")
    val EMERALD_DUST = registerDefaultItem(Machines, "emerald_dust")
    val LAPIS_DUST = registerDefaultItem(Machines, "lapis_dust")
    val COAL_DUST = registerDefaultItem(Machines, "coal_dust")
    val COPPER_DUST = registerDefaultItem(Machines, "copper_dust")
    val STAR_DUST = registerDefaultItem(Machines, "star_dust")
    
    // Crafting components
    val STAR_SHARDS = registerDefaultItem(Machines, "star_shards")
    val STAR_CRYSTAL = registerDefaultItem(Machines, "star_crystal")
    val NETHERITE_DRILL = registerDefaultItem(Machines, "netherite_drill")
    val SCAFFOLDING = registerDefaultItem(Machines, "scaffolding")
    val SOLAR_CELL = registerDefaultItem(Machines, "solar_cell")

    val MOON_STONE = registerDefaultItem(Machines, "moon_stone")
    val OPINIUM_A = registerDefaultItem(Machines, "opinium_a")
    val OPINIUM_B = registerDefaultItem(Machines, "opinium_b")
    val OPINIUM_C = registerDefaultItem(Machines, "opinium_c")
    val OPINIUM_D = registerDefaultItem(Machines, "opinium_d")
    val OPINIUM_E = registerDefaultItem(Machines, "opinium_e")
    val OPINIUM_F = registerDefaultItem(Machines, "opinium_f")
    val OPINIUM_G = registerDefaultItem(Machines, "opinium_g")
    val OPINIUM_H = registerDefaultItem(Machines, "opinium_h")
    val OPINIUM_MAX = registerDefaultItem(Machines, "opinium_max")
    val UNSTABLE_NUGGET = registerDefaultItem(Machines, "unstable_nugget")
    val UNSTABLE_INGOT = registerDefaultItem(Machines, "unstable_ingot")
    
    fun init() = Unit
    
}