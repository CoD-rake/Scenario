package fr.cod.scenario.commands;

import java.util.Arrays;
import java.util.Random;

import fr.cod.scenario.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class scenario implements CommandExecutor, Listener {

	private Main main;
	
	public scenario(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(sender instanceof Player) {
			
			ItemStack CHAT = new ItemStack(Material.SIGN, 1);
			ItemMeta CHATM = CHAT.getItemMeta();
			CHATM.setDisplayName("\u00a77CHAT");
			CHATM.setLore(Arrays.asList("\u00a77Impossible d'écrire dans le chat"));
			CHAT.setItemMeta(CHATM);
			
			ItemStack HASTEY = new ItemStack(Material.STONE_PICKAXE, 1);
			ItemMeta HASTEYM = HASTEY.getItemMeta();
			HASTEYM.setDisplayName("\u00a77Hastey Boys");
			HASTEYM.setLore(Arrays.asList("\u00a77Lors du craft d'un outil","\u00a77L'item est automatiquement enchanté"));
			HASTEY.setItemMeta(HASTEYM);
			
			ItemStack SHEARS = new ItemStack(Material.SHEARS, 1);
			ItemMeta SHEARSM = SHEARS.getItemMeta();
			SHEARSM.setDisplayName("\u00a77Shears");
			SHEARSM.setLore(Arrays.asList("\u00a7710% de drop une pomme en cassant une feuille"));
			SHEARS.setItemMeta(SHEARSM);
			
			ItemStack CC = new ItemStack(Material.IRON_INGOT, 1);
			ItemMeta CCM = CC.getItemMeta();
			CCM.setDisplayName("\u00a77CutClean");
			CCM.setLore(Arrays.asList("\u00a77Les minerais et nourritures sont cuits automatiquement"));
			CC.setItemMeta(CCM);
			
			ItemStack FIRE = new ItemStack(Material.BLAZE_POWDER, 1);
			ItemMeta FIREM = FIRE.getItemMeta();
			FIREM.setDisplayName("\u00a77FIRE");
			FIREM.setLore(Arrays.asList("\u00a77Enchante fire et flame desactivé"));
			FIRE.setItemMeta(FIREM);
			
			ItemStack ME = new ItemStack(Material.BOOK_AND_QUILL, 1);
			ItemMeta MEM = ME.getItemMeta();
			MEM.setDisplayName("\u00a77ME/TELL");
			MEM.setLore(Arrays.asList("\u00a77Commande /me et /tell désactivé"));
			ME.setItemMeta(MEM);
			
			ItemStack DIAMONDLIMITE = new ItemStack(Material.DIAMOND_ORE, 1);
			ItemMeta DIAMONDLIMITEM = DIAMONDLIMITE.getItemMeta();
			DIAMONDLIMITEM.setDisplayName("\u00a77DIAMOND LIMITE");
			DIAMONDLIMITEM.setLore(Arrays.asList("\u00a77limite de diamond a 17"));
			DIAMONDLIMITE.setItemMeta(DIAMONDLIMITEM);
			
			ItemStack Fastmelting = new ItemStack(Material.FURNACE, 1);
			ItemMeta FastmeltingM = Fastmelting.getItemMeta();
			FastmeltingM.setDisplayName("\u00a77FAST MELTING");
			FastmeltingM.setLore(Arrays.asList("\u00a77[\u00a7EBETA\u00a77]","","\u00a77La cuisson est augmenté"));
			Fastmelting.setItemMeta(FastmeltingM);
			
			Inventory inv = Bukkit.createInventory(null, 27, "\u00a77Scenario");
			player.openInventory(inv);
			if(main.config.contains("FIRE")) {
				inv.addItem(FIRE);
			}
			if(main.config.contains("CutClean")) {
				inv.addItem(CC);
			}
			if(main.config.contains("Hastey Boys")) {
				inv.addItem(HASTEY);
			}
			if(main.config.contains("Shears")) {
				inv.addItem(SHEARS);
			}
			if(main.config.contains("CHAT")) {
				inv.addItem(CHAT);
			}
			if(main.config.contains("ME")) {
				inv.addItem(ME);
			}
			if(main.config.contains("DIAMONDLIMITE")) {
				inv.addItem(DIAMONDLIMITE);
			}
			if(main.config.contains("FASTMELTING")) {
				inv.addItem(Fastmelting);
			}
			
		}
		return false;
	}
	@EventHandler
	public void OnCLick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		Inventory inv = event.getInventory();
		if(inv.getName().equalsIgnoreCase("\u00a77Scenario")) {
		event.setCancelled(true);
		Random random = new Random();
		int chance = random.nextInt(100);
		if(chance == 5) {
			player.sendMessage("\u00a77 CoDrake was here");
		}
		}
	}

}
