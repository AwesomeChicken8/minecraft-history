package europe;

import main.MinecraftHistory;
import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;

public class DefenistrationOfPrauge {

    private static MinecraftHistory mainclass;
    public DefenistrationOfPrauge(MinecraftHistory instance) {
        mainclass = instance;
    }

    public static void runAction(Player player){


        final int[] n = {0};
        int scheduler;

        ArrayList<Villager> crowd = new ArrayList<>();

        Villager theCount = null;
        List<Entity> nearbyEntities = (List<Entity>) player.getWorld().getNearbyEntities(player.getLocation(), 15, 15, 15);

        for(Entity e : player.getWorld().getEntities()){
            if(nearbyEntities.contains(e)){
                if(e.getScoreboardTags().contains("count")){
                    theCount = (Villager) e;
                } else if (e.getScoreboardTags().contains("crowd")){
                    crowd.add((Villager) e);
                }
            }
        }

        player.sendMessage(ChatColor.GREEN + "Hello you have run the test command!");
        Location defenestrate = new Location(player.getWorld(), 1924.5, 135, -2220.5);
        Location count = new Location(player.getWorld(), 1924, 135, -2216);
        count.setYaw((float) -180);
        theCount.teleport(count);

        defenestrate.setYaw((float) 0);
        player.teleport(defenestrate);

        Villager finalTheCount = theCount;
        Villager finalTheCount1 = theCount;
        Villager finalTheCount2 = theCount;
        scheduler = Bukkit.getScheduler().scheduleSyncRepeatingTask(mainclass, new Runnable() {
            public void run() {
                if (n[0] ==  10){
                    player.setVelocity(new Vector(0, 5, -25));
                } else if (n[0] == 9){
                    Location glass = new Location(player.getWorld(), 1924, 135, -2224);
                    glass.getBlock().setType(Material.AIR);
                    glass.add(0, 1, 0);
                    glass.getBlock().setType(Material.AIR);
                    glass.add(0, 1, 0);
                    glass.getBlock().setType(Material.AIR);
                    glass.add(0, 1, 0);
                    glass.getBlock().setType(Material.AIR);
                    player.spawnParticle(Particle.EXPLOSION_HUGE, new Location(player.getWorld(), 1924, 136, -2226), 15);
                    player.playSound(new Location(player.getWorld(), 1924, 136, -2223), Sound.ENTITY_GENERIC_EXPLODE, 1F, 10F);
                    player.playSound(new Location(player.getWorld(), 1924, 136, -2223), Sound.ENTITY_GENERIC_EXPLODE, 1F, 10F);
                    player.playSound(new Location(player.getWorld(), 1924, 136, -2223), Sound.ENTITY_GENERIC_EXPLODE, 1F, 10F);

                    for(int i = 0; i < 30; i++){
                        player.spawnParticle(Particle.CLOUD, player.getLocation().add(0, 0, -.5), 3);
                    }
                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXTINGUISH_FIRE, 1F, 1F);
                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXTINGUISH_FIRE, 1F, 1F);
                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXTINGUISH_FIRE, 1F, 1F);

                    player.setVelocity(new Vector(0, 2, -7));
                    //original velocity is -7
                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXTINGUISH_FIRE, 1F, 1F);
                } else if (n[0] == 8){
                    defenestrate.setYaw((float) 180);
                    player.teleport(defenestrate);
                } else if (n[0] == 2){
                    Villager finalTheCount = finalTheCount1;

                    count.setYaw((float) 120);
                    finalTheCount.teleport(count);

                    for (int i = 0; i < crowd.size(); i++) {
                        Villager crowdperson = crowd.get(i);
                        Location crowdlocation = crowdperson.getLocation();
                        crowdlocation.setYaw((float) -50);
                        crowdperson.teleport(crowdlocation);
                    }

                    player.sendMessage("");
                    player.sendMessage("Were we to keep these men alive, then we would lose the " +
                            "Letter of Majesty and our religion ... for there can be no justice to " +
                            "be gained from or by them");
                } else if (n[0] == 2){
                    player.sendMessage("You are enemies of us and of our religion, have desired" +
                            " to deprive us of our Letter of Majesty, have horribly plagued your Protestant" +
                            " subjects and have tried to force them to adopt your religion against their wills" +
                            " or have had them expelled for this reason.");
                } else if (n[0] == 0){
                    for (int i = 0; i < crowd.size(); i++) {
                        Villager crowdperson = crowd.get(i);
                        Location crowdlocation = crowdperson.getLocation();
                        crowdlocation.setYaw((float) -95);
                        crowdperson.teleport(crowdlocation);
                    }
                } else if (n[0] == 14){
                    Location glass = new Location(player.getWorld(), 1924, 135, -2224);
                    glass.getBlock().setType(Material.GLASS_PANE);
                    glass.add(0, 1, 0);
                    glass.getBlock().setType(Material.GLASS_PANE);
                    glass.add(0, 1, 0);
                    glass.getBlock().setType(Material.GLASS_PANE);
                    glass.add(0, 1, 0);
                    glass.getBlock().setType(Material.GLASS_PANE);
                } else if (n[0] == 12){

                } else if(n[0] == 6){
                    Location loc = finalTheCount2.getLocation();
                    loc.setYaw(180);
                    finalTheCount2.teleport(loc);

                    loc.setX(1924);
                    loc.setY(135);
                    loc.setZ(-2219);

                    finalTheCount2.teleport(loc);
                }
                n[0]++;
            }
        }, 0, 30);
    }
}
