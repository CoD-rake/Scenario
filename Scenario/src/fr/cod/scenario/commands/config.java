package fr.cod.scenario.commands;

import java.util.Arrays;

import fr.cod.scenario.Main;
import fr.cod.scenario.menu.MenuPrincipale;
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

public class config implements CommandExecutor, Listener {

	private Main main;

	public config(Main main) {
		this.main = main;
	}


	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player && sender.isOp()) {
			MenuPrincipale mp = new MenuPrincipale(player, main);
			mp.show();
			/*
			System.out.println(main.config);
			ItemStack GlassGrayPane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)8);
			ItemMeta GlassGrayPaneM = GlassGrayPane.getItemMeta();
			GlassGrayPaneM.setDisplayName(" ");
			GlassGrayPane.setItemMeta(GlassGrayPaneM);
			
			ItemStack GlassBlackPane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)8);
			ItemMeta GlassBlackPaneM = GlassGrayPane.getItemMeta();
			GlassBlackPaneM.setDisplayName("CoDrake");
			GlassBlackPane.setItemMeta(GlassBlackPaneM);

			ItemStack CHAT = new ItemStack(Material.SIGN, 1);
			ItemMeta CHATM = CHAT.getItemMeta();
			CHATM.setDisplayName("§7CHAT");
			CHAT.setItemMeta(CHATM);
			
			ItemStack NOCHAT = new ItemStack(Material.SIGN, -1);
			ItemMeta NOCHATM = NOCHAT.getItemMeta();
			NOCHATM.setDisplayName("§7CHAT");
			NOCHAT.setItemMeta(NOCHATM);
			
			ItemStack HASTEY = new ItemStack(Material.STONE_PICKAXE, 1);
			ItemMeta HASTEYM = HASTEY.getItemMeta();
			HASTEYM.setDisplayName("§7Hastey Boys");
			HASTEY.setItemMeta(HASTEYM);
			
			ItemStack NOHASTEY = new ItemStack(Material.STONE_PICKAXE, -1);
			ItemMeta NOHASTEYM = NOHASTEY.getItemMeta();
			NOHASTEYM.setDisplayName("§7Hastey Boys");
			NOHASTEY.setItemMeta(NOHASTEYM);
			
			ItemStack SHEARS = new ItemStack(Material.SHEARS, 1);
			ItemMeta SHEARSM = SHEARS.getItemMeta();
			SHEARSM.setDisplayName("§7Shears");
			SHEARS.setItemMeta(SHEARSM);
			
			ItemStack NOSHEARS = new ItemStack(Material.SHEARS, -1);
			ItemMeta NOSHEARSM = NOSHEARS.getItemMeta();
			NOSHEARSM.setDisplayName("§7Shears");
			NOSHEARS.setItemMeta(NOSHEARSM);
			
			ItemStack CC = new ItemStack(Material.IRON_INGOT, 1);
			ItemMeta CCM = CC.getItemMeta();
			CCM.setDisplayName("§7CutClean");
			CC.setItemMeta(CCM);
			
			ItemStack NOCC = new ItemStack(Material.IRON_INGOT, -1);
			ItemMeta NOCCM = NOCC.getItemMeta();
			NOCCM.setDisplayName("§7CutClean");
			NOCC.setItemMeta(NOCCM);
			
			ItemStack FIRE = new ItemStack(Material.BLAZE_POWDER, 1);
			ItemMeta FIREM = FIRE.getItemMeta();
			FIREM.setDisplayName("§7FIRE");
			FIRE.setItemMeta(FIREM);
			
			ItemStack NOFIRE = new ItemStack(Material.BLAZE_POWDER, -1);
			ItemMeta NOFIREM = NOFIRE.getItemMeta();
			NOFIREM.setDisplayName("§7FIRE");
			NOFIRE.setItemMeta(NOFIREM);
			
			ItemStack ME = new ItemStack(Material.BOOK_AND_QUILL, 1);
			ItemMeta MEM = ME.getItemMeta();
			MEM.setDisplayName("§7ME/TELL");
			ME.setItemMeta(MEM);
			
			ItemStack NOME = new ItemStack(Material.BOOK_AND_QUILL, -1);
			ItemMeta NOMEM = NOME.getItemMeta();
			NOMEM.setDisplayName("§7ME/TELL");
			NOME.setItemMeta(NOMEM);
			
			ItemStack DIAMONDLIMITE = new ItemStack(Material.DIAMOND_ORE, 1);
			ItemMeta DIAMONDLIMITEM = DIAMONDLIMITE.getItemMeta();
			DIAMONDLIMITEM.setDisplayName("§7DIAMOND LIMITE");
			DIAMONDLIMITE.setItemMeta(DIAMONDLIMITEM);
			
			ItemStack NODIAMONDLIMITE = new ItemStack(Material.DIAMOND_ORE, -1);
			ItemMeta NODIAMONDLIMITEM = NODIAMONDLIMITE.getItemMeta();
			NODIAMONDLIMITEM.setDisplayName("§7DIAMOND LIMITE");
			NODIAMONDLIMITE.setItemMeta(NODIAMONDLIMITEM);
			
			ItemStack Fastmelting = new ItemStack(Material.FURNACE, 1);
			ItemMeta FastmeltingM = Fastmelting.getItemMeta();
			FastmeltingM.setDisplayName("§7FAST MELTING");
			FastmeltingM.setLore(Arrays.asList("§7[§EBETA§7]","","§7La cuisson est augmenté"));
			Fastmelting.setItemMeta(FastmeltingM);
			
			ItemStack NoFastmelting = new ItemStack(Material.FURNACE, -1);
			ItemMeta NoFastmeltingM = NoFastmelting.getItemMeta();
			NoFastmeltingM.setDisplayName("§7FAST MELTING");
			NoFastmeltingM.setLore(Arrays.asList("§7[§EBETA§7]","","§7La cuisson est augmenté"));
			NoFastmelting.setItemMeta(NoFastmeltingM);
			
		Inventory inv = Bukkit.createInventory(null, 27, "§7Config");
		player.openInventory(inv);
		if(!main.config.contains("Hastey Boys")) {
			inv.setItem(0, NOHASTEY);
			}if(main.config.contains("Hastey Boys")) {
				inv.setItem(0, HASTEY);
			}
		if(!main.config.contains("Shears")) {
		inv.setItem(1, NOSHEARS);
		}if(main.config.contains("Shears")) {
			inv.setItem(1, SHEARS);
		}
		if(!main.config.contains("CutClean")) {
			inv.setItem(2, NOCC);
			}if(main.config.contains("CutClean")) {
				inv.setItem(2, CC);
			}
			if(!main.config.contains("FIRE")) {
				inv.setItem(3, NOFIRE);
				}if(main.config.contains("FIRE")) {
					inv.setItem(3, FIRE);
				}
				if(!main.config.contains("CHAT")) {
					inv.setItem(4, NOCHAT);
					}if(main.config.contains("CHAT")) {
						inv.setItem(4, CHAT);
					}if(!main.config.contains("ME")) {
						inv.setItem(5, NOME);
						}if(main.config.contains("ME")) {
							inv.setItem(5, ME);
						}
						if(!main.config.contains("DIAMONDLIMITE")) {
							inv.setItem(6, NODIAMONDLIMITE);
							}if(main.config.contains("DIAMONDLIMITE")) {
								inv.setItem(6, DIAMONDLIMITE);
							}
							if(!main.config.contains("FASTMELTING")) {
								inv.setItem(7, NoFastmelting);
								}if(main.config.contains("FASTMELTING")) {
									inv.setItem(7, Fastmelting);
								}
		inv.setItem(8, GlassGrayPane);
		inv.setItem(9, GlassGrayPane);
		inv.setItem(10, GlassGrayPane);
		inv.setItem(11, GlassGrayPane);
		inv.setItem(12, GlassGrayPane);
		inv.setItem(13, GlassGrayPane);
		inv.setItem(14, GlassGrayPane);
		inv.setItem(15, GlassGrayPane);
		inv.setItem(16, GlassGrayPane);
		inv.setItem(17, GlassGrayPane);
		inv.setItem(18, GlassGrayPane);
		inv.setItem(19, GlassGrayPane);
		inv.setItem(20, GlassGrayPane);
		inv.setItem(21, GlassGrayPane);
		inv.setItem(22, GlassGrayPane);
		inv.setItem(23, GlassGrayPane);
		inv.setItem(24, GlassGrayPane);
		inv.setItem(25, GlassGrayPane);
		inv.setItem(26, GlassBlackPane);
		
		}
		
		
		return false;
		*/

		}
		return false;
		/*
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		ItemStack CC = new ItemStack(Material.IRON_INGOT, 1);
		ItemMeta CCM = CC.getItemMeta();
		CCM.setDisplayName("§7CutClean");
		CC.setItemMeta(CCM);
		
		ItemStack NOCC = new ItemStack(Material.IRON_INGOT, -1);
		ItemMeta NOCCM = NOCC.getItemMeta();
		NOCCM.setDisplayName("§7CutClean");
		NOCC.setItemMeta(NOCCM);
		
		ItemStack SHEARS = new ItemStack(Material.SHEARS, 1);
		ItemMeta SHEARSM = SHEARS.getItemMeta();
		SHEARSM.setDisplayName("§7Shears");
		SHEARS.setItemMeta(SHEARSM);
		ItemStack HASTEY = new ItemStack(Material.STONE_PICKAXE, 1);
		ItemMeta HASTEYM = HASTEY.getItemMeta();
		HASTEYM.setDisplayName("§7Hastey Boys");
		HASTEY.setItemMeta(HASTEYM);
		
		ItemStack NOHASTEY = new ItemStack(Material.STONE_PICKAXE, -1);
		ItemMeta NOHASTEYM = NOHASTEY.getItemMeta();
		NOHASTEYM.setDisplayName("§7Hastey Boys");
		NOHASTEY.setItemMeta(NOHASTEYM);
		
		ItemStack FIRE = new ItemStack(Material.BLAZE_POWDER, 1);
		ItemMeta FIREM = FIRE.getItemMeta();
		FIREM.setDisplayName("§7FIRE");
		FIRE.setItemMeta(FIREM);
		
		ItemStack NOFIRE = new ItemStack(Material.BLAZE_POWDER, -1);
		ItemMeta NOFIREM = NOFIRE.getItemMeta();
		NOFIREM.setDisplayName("§7FIRE");
		NOFIRE.setItemMeta(NOFIREM);
		
		ItemStack CHAT = new ItemStack(Material.SIGN, 1);
		ItemMeta CHATM = CHAT.getItemMeta();
		CHATM.setDisplayName("§7CHAT");
		CHAT.setItemMeta(CHATM);
		
		ItemStack NOCHAT = new ItemStack(Material.SIGN, -1);
		ItemMeta NOCHATM = NOCHAT.getItemMeta();
		NOCHATM.setDisplayName("§7CHAT");
		NOCHAT.setItemMeta(NOCHATM);
		
		ItemStack NOSHEARS = new ItemStack(Material.SHEARS, -1);
		ItemMeta NOSHEARSM = NOSHEARS.getItemMeta();
		NOSHEARSM.setDisplayName("§7Shears");
		NOSHEARS.setItemMeta(NOSHEARSM);
		
		ItemStack ME = new ItemStack(Material.BOOK_AND_QUILL, 1);
		ItemMeta MEM = ME.getItemMeta();
		MEM.setDisplayName("§7ME/TELL");
		ME.setItemMeta(MEM);
		
		ItemStack NOME = new ItemStack(Material.BOOK_AND_QUILL, -1);
		ItemMeta NOMEM = NOME.getItemMeta();
		NOMEM.setDisplayName("§7ME/TELL");
		NOME.setItemMeta(NOMEM);
		
		ItemStack DIAMONDLIMITE = new ItemStack(Material.DIAMOND_ORE, 1);
		ItemMeta DIAMONDLIMITEM = DIAMONDLIMITE.getItemMeta();
		DIAMONDLIMITEM.setDisplayName("§7DIAMOND LIMITE");
		DIAMONDLIMITE.setItemMeta(DIAMONDLIMITEM);
		
		ItemStack NODIAMONDLIMITE = new ItemStack(Material.DIAMOND_ORE, -1);
		ItemMeta NODIAMONDLIMITEM = NODIAMONDLIMITE.getItemMeta();
		NODIAMONDLIMITEM.setDisplayName("§7DIAMOND LIMITE");
		NODIAMONDLIMITE.setItemMeta(NODIAMONDLIMITEM);
		
		ItemStack Fastmelting = new ItemStack(Material.FURNACE, 1);
		ItemMeta FastmeltingM = Fastmelting.getItemMeta();
		FastmeltingM.setDisplayName("§7FAST MELTING");
		FastmeltingM.setLore(Arrays.asList("§7[§EBETA§7]","","§7La cuisson est augmenté"));
		Fastmelting.setItemMeta(FastmeltingM);
		
		ItemStack NoFastmelting = new ItemStack(Material.FURNACE, -1);
		ItemMeta NoFastmeltingM = NoFastmelting.getItemMeta();
		NoFastmeltingM.setDisplayName("§7FAST MELTING");
		NoFastmeltingM.setLore(Arrays.asList("§7[§EBETA§7]","","§77La cuisson est augmenté"));
		NoFastmelting.setItemMeta(NoFastmeltingM);
		
		Inventory inv = event.getInventory();
		Player player = (Player) event.getWhoClicked();
		ItemStack current = event.getCurrentItem();
		if(current == null) return;
		
		if (inv.getName().equalsIgnoreCase("§7Config")){
			if ((current == null) || (current.getType()== Material.AIR) ) {
                return;
            }
			event.setCancelled(true);
			if(current.getItemMeta().getDisplayName() == "§7FIRE") {
				if(main.config.contains("FIRE")) {
					main.config.remove("FIRE");
					inv.setItem(3, NOFIRE);
					player.sendMessage("§7[§cScenario§7]§f scénario désactivé");
				}else {
					main.config.add("FIRE");
					inv.setItem(3, FIRE);
					player.sendMessage("§7[§cScenario§7]§f scénario activé");
				}
			}
			if(current.getItemMeta().getDisplayName() == "§7CutClean") {
				if(main.config.contains("CutClean")) {
					main.config.remove("CutClean");
					inv.setItem(2, NOCC);
					player.sendMessage("§7[§cScenario§7]§f scénario désactivé");
				}else {
					main.config.add("CutClean");
					inv.setItem(2, CC);
					player.sendMessage("§7[§cScenario§7]§f scénario activé");
				}
			}
			if(current.getItemMeta().getDisplayName() == "§7Hastey Boys") {
				if(main.config.contains("Hastey Boys")) {
					main.config.remove("Hastey Boys");
					inv.setItem(0, NOHASTEY);
					player.sendMessage("§7[§cScenario§7]§f scénario désactivé");
				}else {
					main.config.add("Hastey Boys");
					inv.setItem(0, HASTEY);
					player.sendMessage("§7[§cScenario§7]§f scénario activé");
				}
			}
			if(current.getItemMeta().getDisplayName() == "§7Shears") {
				if(main.config.contains("Shears")) {
					main.config.remove("Shears");
					player.sendMessage("§7[§cScenario§7]§f scénario désactivé");
					inv.setItem(1, NOSHEARS);
				}else {
					main.config.add("Shears");
					inv.setItem(1, SHEARS);
					player.sendMessage("§7[§cScenario§7]§f scénario activé");
				}
			}
			if(current.getItemMeta().getDisplayName() == "§7CHAT") {
				if(main.config.contains("CHAT")) {
					main.config.remove("CHAT");
					player.sendMessage("§7[§cScenario§7]§f scénario désactivé");
					inv.setItem(4, NOCHAT);
				}else {
					main.config.add("CHAT");
					inv.setItem(4, CHAT);
					player.sendMessage("§7[§cScenario§7]§f scénario activé");
				}
			}
			if(current.getItemMeta().getDisplayName() == "§7ME/TELL") {
				if(main.config.contains("ME")) {
					main.config.remove("ME");
					player.sendMessage("§7[§cScenario§7]§f scénario désactivé");
					
					inv.setItem(5, NOME);
				}else {
					main.config.add("ME");
					inv.setItem(5, ME);
					player.sendMessage("§7[§cScenario§7]§f scénario activé");
				}
			}
			if(current.getItemMeta().getDisplayName() == "§7DIAMOND LIMITE") {
				if(main.config.contains("DIAMONDLIMITE")) {
					main.config.remove("DIAMONDLIMITE");
					player.sendMessage("§7[§cScenario§7]§f scénario désactivé");
					
					inv.setItem(6, NODIAMONDLIMITE);
				}else {
					main.config.add("DIAMONDLIMITE");
					inv.setItem(6, DIAMONDLIMITE);
					player.sendMessage("§7[§cScenario§7]§f scénario activé");
				}
			}
			if(current.getItemMeta().getDisplayName() == "§7FAST MELTING") {
				if(main.config.contains("FASTMELTING")) {
					main.config.remove("FASTMELTING");
					player.sendMessage("§7[§cScenario§7]§f scénario désactivé");
					
					inv.setItem(7, NoFastmelting);
				}else {
					main.config.add("FASTMELTING");
					inv.setItem(7, Fastmelting);
					player.sendMessage("§7[§cScenario§7]§f scénario activé");
				}
			}
						
					
			}
		

		
	}
	*/
	}

}
