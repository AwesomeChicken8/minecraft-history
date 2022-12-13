package misc;

import main.MinecraftHistory;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class MoonLanding {
    private static MinecraftHistory mainclass;
    public MoonLanding(MinecraftHistory instance) {
        mainclass = instance;
    }

    public static void wait(int seconds){
        int ticks = seconds*20;
        mainclass.getServer().getScheduler().scheduleSyncRepeatingTask(mainclass, new Runnable() {
            public void run() {
            }
        }, 0, ticks);
    }

    public static void startScene(Player player){
        player.getWorld().setTime(14000);
        player.teleport(new Location(player.getWorld(), 150, 256, 150));
        wait(2);
        player.sendMessage("Neil Armstrong: The eagle has landed!");
        player.teleport(new Location(player.getWorld(), 150, -32, 150));
        wait(1);
        player.sendMessage("Crowd: yesss, yay, lets goooo");
        wait(1);
        player.teleport(new Location(player.getWorld(), 150, 256, 150));
        player.sendMessage("Mission Control: You have permission to disembark");
        wait(1);
        player.sendMessage("Buzz Aldrin: Confirmed");
    }

}
