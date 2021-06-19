package me.zaochen.helloworld;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class craft {
    /*
        aaa
        aba
        aaa
        a：黑色羊毛
        b：鸡蛋
         */
    ShapedRecipe craft = new ShapedRecipe(new ItemStack(Material.DRAGON_EGG)).shape("aaa","aba","aaa")
            .setIngredient('a',Material.COAL)
            .setIngredient('b',Material.EGG);
}
