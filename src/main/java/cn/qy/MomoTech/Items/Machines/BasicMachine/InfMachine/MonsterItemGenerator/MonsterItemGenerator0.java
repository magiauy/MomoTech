package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine.MonsterItemGenerator;

import cn.qy.MomoTech.GUI.MonsterItemGenerator;
import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.utils.Maths;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MonsterItemGenerator0 extends MonsterItemGenerator implements RecipeDisplayItem {
    private final Material[] it = {Material.BONE, Material.CARROT, Material.POTATO, Material.STRING, Material.IRON_INGOT,
            Material.GUNPOWDER, Material.ROTTEN_FLESH, Material.SPIDER_EYE, Material.GLOWSTONE_DUST, Material.REDSTONE,
            Material.STICK, Material.GLASS_BOTTLE};

    public MonsterItemGenerator0(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "MOMOTECH_MONSTER_GENERATOR0";
    }

    @Override
    public Material getItems() {
        return this.it[Maths.GetRandom(11)];
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> item = new ArrayList<>(30);
        for (Material i : this.it) {
            item.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, MomoTech.languageManager.getRecipeDescription("possible_productions")));
            item.add(new ItemStack(i, 32));
        }
        return item;
    }
}
