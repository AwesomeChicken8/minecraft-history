package main;

import europe.DefenistrationOfPrauge;
import misc.MoonLanding;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {


    @EventHandler
    public void onClick(InventoryClickEvent e){
        if(ChatColor.translateAlternateColorCodes('&', e.getView().getTitle()).equals(ChatColor.DARK_AQUA.toString() + ChatColor.BOLD + "Pick a location to go to!")
        && e.getCurrentItem() != null){
            Player player = (Player) e.getWhoClicked();
            switch(e.getRawSlot()){
                case 10:
                    player.closeInventory();
                    DefenistrationOfPrauge.runAction(player);
                    break;
                case 11:
                    player.closeInventory();
                    MoonLanding.startScene(player);
                default:
                    return;
            }
            e.setCancelled(true);


            player.closeInventory();

        }
    }
}
