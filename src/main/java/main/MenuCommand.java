package main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class MenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            Inventory inventory = Bukkit.createInventory(player, 45, ChatColor.DARK_AQUA.toString() + ChatColor.BOLD + "Pick a location to go to!");

            ItemStack defofPrauge = new ItemStack(Material.LEAD, 1);
            ItemMeta defofPraugemeta = defofPrauge.getItemMeta();
            defofPraugemeta.setDisplayName(ChatColor.GOLD + "The Defenestration of Prauge");
            defofPraugemeta.setLore(Arrays.asList(
                    "The Defenistration of Prauge sparked\n",
                    "the Thirty Years war! See how it all\n",
                    "went down by clicking this."
            ));
            defofPrauge.setItemMeta(defofPraugemeta);

            ItemStack moonLanding = new ItemStack(Material.FEATHER, 1);
            ItemMeta moonLandingMeta = moonLanding.getItemMeta();
            moonLandingMeta.setDisplayName(ChatColor.DARK_GRAY + "The Apollo 11 Moon Landing");
            moonLandingMeta.setLore(Arrays.asList(
                    "The Apollo 11 Moon Landing was the\n",
                    "first time humans stepped on the Moon!\n",
                    "Click to watch it!"
            ));
            moonLanding.setItemMeta(moonLandingMeta);

            inventory.setItem(10, defofPrauge);
            inventory.setItem(11, moonLanding);

            ItemStack background = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, 1);
            ItemMeta backgroundMeta = background.getItemMeta();
            backgroundMeta.setDisplayName(" ");
            background.setItemMeta(backgroundMeta);

            for(int i : new int[]{0,1,2,3,4,5,6,7,8,9,17,18,26,27,35,36,37,38,39,40,41,42,43,44}){
                inventory.setItem(i, background);
            }



            player.openInventory(inventory);

        }
        return false;
    }
}
