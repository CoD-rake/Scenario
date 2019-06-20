package fr.cod.scenario.commands;

import fr.cod.scenario.Lag;
import fr.cod.scenario.Main;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {
    public ping(Main main) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            long RAM_TOTAL = Runtime.getRuntime().maxMemory();
            long RAM_FREE = Runtime.getRuntime().freeMemory();
            long RAM_USED = RAM_TOTAL - RAM_FREE;
            double RAM_USED_PERCENTAGE = Math.round(RAM_USED * 1.0D / RAM_TOTAL * 100.0D);

            player.sendMessage("\u00a7cSCENARIO :");
            player.sendMessage("\u00a7eTPS : \u00a7cSOON");
            player.sendMessage("\u00a7eRAM : \u00a7a"+ (RAM_USED /1000000) + " \u00a77MO /\u00a7A " + (RAM_TOTAL/1000000) +" \u00a77MO (\u00a7a"+(RAM_USED_PERCENTAGE ) +"\u00a77%)");
//			 player.sendMessage("\u00a7eRAM\u00a7b " + (RAM_USED /1000000) + " \u00a77MO \u00a7e/\u00a7b " + (RAM_TOTAL/1000000) +" \u00a77MO \u00a77(\u00a7b"+(RAM_USED_PERCENTAGE ) +"%\u00a77)");
            EntityPlayer nmsPlayer = ((CraftPlayer) player).getHandle();
            int ping = nmsPlayer.ping;
            if(ping <= 40) {
                player.sendMessage("\u00a7ePING : \u00a7a" +ping);
            }if(ping >= 90) {
                player.sendMessage("\u00a7ePING : \u00a7c" +ping);
            }if(ping >= 41 && ping <= 89) {
                player.sendMessage("\u00a7ePING : \u00a76" +ping);
            }
            player.sendMessage("\u00a7ePLAYER : \u00a7a" + Bukkit.getOnlinePlayers().size());
            player.sendMessage("\u00a7ePlugin by CoDrake");


        }
        return false;
    }
}
