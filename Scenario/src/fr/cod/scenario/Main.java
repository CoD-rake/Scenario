package fr.cod.scenario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import fr.cod.scenario.commands.config;
import fr.cod.scenario.commands.ping;
import fr.cod.scenario.commands.scenario;
import fr.cod.scenario.menu.MenuArmorer;
import fr.cod.scenario.menu.MenuPrincipale;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.block.Block;
import org.bukkit.block.Furnace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

@SuppressWarnings("deprecation")
public class Main extends JavaPlugin implements Listener{

	public ArrayList<String> config = new ArrayList<>();
	ArrayList<Player> Join = new ArrayList<>();
	public ArrayList<String> STUFF = new ArrayList<>();
	ArrayList<Player> OP = new ArrayList<>();
	public int  diamondlimite = 17;
	HashSet<Block> furnaces = new HashSet<Block>();
	
	@Override
	public void onEnable() {
		getCommand("config").setExecutor(new config(this));
		getCommand("ping").setExecutor(new ping(this));
		getCommand("scenario").setExecutor(new scenario(this));
		getServer().getPluginManager().registerEvents(new config(this), this);
		getServer().getPluginManager().registerEvents(new MenuArmorer(null, this), this);
		getServer().getPluginManager().registerEvents(new MenuPrincipale(null,this), this);
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(new scenario(this), this);
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Lag(), 100L, 1L);

		super.onEnable();
		
	}
	
	@Override
	public void onDisable() {
		
		super.onDisable();
	}

	@EventHandler
	public void onLoot(LeavesDecayEvent event){
	if(config.contains("moreloot")) {
		Random random = new Random();
		if (random.nextInt(100) < 5) {
			event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.APPLE, 1));
		}
	}
	}
	@EventHandler
	public void onItemSpawnloot(ItemSpawnEvent event) {
		if(config.contains("moreloot")) {
			Random random = new Random();
			if (random.nextInt(100) < 80 && event.getEntity().getItemStack().getType().equals(Material.GRAVEL)) {
				event.getEntity().setItemStack(new ItemStack(Material.FLINT));
			}
		}
	}
	

	
	@EventHandler
	public void craftitem(CraftItemEvent event) {
		Player player = (Player) event.getWhoClicked();
		Material item = event.getRecipe().getResult().getType();
		if(config.contains("Hastey Boys")) {

			//HATEYBOYS

			if (item.equals(Material.GOLD_AXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.GOLD_PICKAXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.GOLD_SPADE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.IRON_AXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.IRON_PICKAXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.IRON_SPADE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.STONE_AXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.STONE_PICKAXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.STONE_SPADE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.WOOD_AXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.WOOD_PICKAXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.WOOD_SPADE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.DIAMOND_AXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.DIAMOND_PICKAXE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
			if (item.equals(Material.DIAMOND_SPADE)) {
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DURABILITY, 3);
				event.getCurrentItem().addEnchantment(org.bukkit.enchantments.Enchantment.DIG_SPEED, 3);
			}
		}
		    //LIMITE ARMORER

			if(config.contains("DiamondArmorerLimite")){

				//DIAMS
				if(STUFF.contains("DIAMONDHELMET") && item.equals(Material.DIAMOND_HELMET)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b DIAMOND HELMET §7= §c OFF");
				}
				if(STUFF.contains("DIAMONDCHESTPLATE") && item.equals(Material.DIAMOND_CHESTPLATE)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b DIAMOND CHESTPLATE §7= §c OFF");
				}
				if(STUFF.contains("DIAMONDLEGGINGS") && item.equals(Material.DIAMOND_LEGGINGS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b DIAMOND LEGGINGS §7= §c OFF");
				}
				if(STUFF.contains("DIAMONDBOOTS") && item.equals(Material.DIAMOND_BOOTS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b DIAMOND BOOTS §7= §c OFF");
				}

				//IRON

				if(STUFF.contains("IRONHELMET") && item.equals(Material.IRON_HELMET)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b IRON HELMET §7= §c OFF");
				}
				if(STUFF.contains("IRONCHESTPLATE") && item.equals(Material.IRON_CHESTPLATE)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b IRON CHESTPLATE §7= §c OFF");
				}
				if(STUFF.contains("IRONLEGGINGS") && item.equals(Material.IRON_LEGGINGS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b IRON LEGGINGS §7= §c OFF");
				}
				if(STUFF.contains("IRONBOOTS") && item.equals(Material.IRON_BOOTS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b IRON BOOTS §7= §c OFF");
				}

				//GOLD

				if(STUFF.contains("GOLDHELMET") && item.equals(Material.GOLD_HELMET)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b GOLD HELMET §7= §c OFF");
				}
				if(STUFF.contains("GOLDCHESTPLATE") && item.equals(Material.GOLD_CHESTPLATE)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b GOLD CHESTPLATE §7= §c OFF");
				}
				if(STUFF.contains("GOLDLEGGINGS") && item.equals(Material.GOLD_LEGGINGS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b GOLD LEGGINGS §7= §c OFF");
				}
				if(STUFF.contains("GOLDBOOTS") && item.equals(Material.GOLD_BOOTS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b GOLD BOOTS §7= §c OFF");
				}

				//CHAINMAIL

				if(STUFF.contains("CHAINMAILHELMET") && item.equals(Material.CHAINMAIL_HELMET)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b CHAINMAIL HELMET §7= §c OFF");
				}
				if(STUFF.contains("CHAINMAILCHESTPLATE") && item.equals(Material.CHAINMAIL_CHESTPLATE)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b CHAINMAIL CHESTPLATE §7= §c OFF");
				}
				if(STUFF.contains("CHAINMAILLEGGINGS") && item.equals(Material.CHAINMAIL_LEGGINGS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b CHAINMAIL LEGGINGS §7= §c OFF");
				}
				if(STUFF.contains("CHAINMAILBOOTS") && item.equals(Material.CHAINMAIL_BOOTS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b CHAINMAIL BOOTS §7= §c OFF");
				}

				//LEATHER

				if(STUFF.contains("LEATHERHELMET") && item.equals(Material.LEATHER_HELMET)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b LEATHER HELMET §7= §c OFF");
				}
				if(STUFF.contains("LEATHERCHESTPLATE") && item.equals(Material.LEATHER_CHESTPLATE)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b LEATHER CHESTPLATE §7= §c OFF");
				}
				if(STUFF.contains("LEATHERLEGGINGS") && item.equals(Material.LEATHER_LEGGINGS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b LEATHER HELMET §7= §c OFF");
				}
				if(STUFF.contains("LEATHERBOOTS") && item.equals(Material.LEATHER_BOOTS)){
					event.setCancelled(true);
					player.sendMessage("§7[§cScénario§7] §b LEATHER BOOTS §7= §c OFF");
				}


			}else{
				System.out.println("???zaeze");
			}


}
	
	@EventHandler
	public void onChat(PlayerChatEvent event) {
		Player player = event.getPlayer();
		if(config.contains("CHAT")) {			
			player.sendMessage("§7[§fScénario§7] le Chat est désactivé");
			event.setCancelled(true);
		}
		
	}
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent  event) {
		Player player = event.getPlayer();
		if(config.contains("ME")) {
			if(event.getMessage().contains("me") || event.getMessage().contains("ME") || event.getMessage().equalsIgnoreCase("Me") || event.getMessage().contains("mE")) {
			event.setCancelled(true);
			player.sendMessage("§7[§fScénario§7] la commande §b/me §7et §b/tell ?7est désactivé, vous pouvez utiliser §b/helpop §7pour contacter un modérateur");
			}
			if(event.getMessage().contains("tell") || event.getMessage().contains("Tell") || event.getMessage().contains("TEll") || event.getMessage().contains("TELl") ||event.getMessage().contains("TELL") ||event.getMessage().contains("tEll") || event.getMessage().contains("tELl") || event.getMessage().contains("tELL") || event.getMessage().contains("teLl") ||event.getMessage().contains("teLL") ||event.getMessage().contains("telL")) {
				event.setCancelled(true);
				player.sendMessage("§7[§fScénario§7] la commande §b/me §7et §b/tell ?7est désactivé, vous pouvez utiliser §b/helpop §7pour contacter un modérateur");
				}
		}
	}
	
	
	@EventHandler
	public void Entitydeath(EntityDeathEvent event) {
		if (config.contains("CutClean")) {


			List<ItemStack> loots = event.getDrops();
			for (int i = loots.size() - 1; i >= 0; i--) {
				ItemStack is = (ItemStack) loots.get(i);
				if (is == null) {
					return;
				}
				switch (is.getType()) {
					case RAW_BEEF:
						loots.remove(i);
						loots.add(new ItemStack(Material.COOKED_BEEF));
						break;
					case PORK:
						loots.remove(i);
						loots.add(new ItemStack(Material.GRILLED_PORK));
						break;
					case RAW_CHICKEN:
						loots.remove(i);
						loots.add(new ItemStack(Material.COOKED_CHICKEN));
						if(config.contains("moreloot")){
						loots.add(new ItemStack(Material.FEATHER));
						}
						break;
					case MUTTON:
						loots.remove(i);
						loots.add(new ItemStack(Material.COOKED_MUTTON));
						break;
					case RABBIT:
						loots.remove(i);
						loots.add(new ItemStack(Material.COOKED_RABBIT));
					default:
						break;
				}

			}
		}
		if (config.contains("moreloot")) {
			List<ItemStack> loots = event.getDrops();
			for (int i = loots.size() - 1; i >= 0; i--) {
				ItemStack is = (ItemStack) loots.get(i);
				if (is == null) {
					return;
				}
				switch (is.getType()) {
					case RAW_CHICKEN:
						loots.add(new ItemStack(Material.FEATHER));
						break;
				}

			}
		}
	
	
	 
	/*  private void handleCookingTime(final Furnace f)
	  {
	    new BukkitRunnable()
	    {
	      int id = 40;
	      
	      public void run()
	      {
	        f.setCookTime((short)(f.getCookTime() + 40));
	        f.update();
	        
	        this.id -= 1;
	        if (this.id == 0) {
	          cancel();
	        }
	      }
	    }.runTaskTimer(this, 1L, 1L);
	
*/
	}
	  @EventHandler
	  public void onBurn(FurnaceBurnEvent e)
	  {
		  if(config.contains("FASTMELTING")) {
	   
	    //100
	    if(e.getFuel().getType().equals(Material.LAVA_BUCKET)) {
	    	 Block b = e.getBlock();
		    	Furnace r = (Furnace)b.getState();	    
			    e.setBurnTime(2000);
			    handleCookingTime100(r);
	    }
	    // 12
	    else if(e.getFuel().getType().equals(Material.COAL_BLOCK)) {
	    	 Block b = e.getBlock();
		    	Furnace r = (Furnace)b.getState();	    
			    e.setBurnTime(230);
			    handleCookingTime12(r);
	    }
	    // 6 
	    else if(e.getFuel().getType().equals(Material.COAL)) {
	    	 Block b = e.getBlock();
	    	Furnace r = (Furnace)b.getState();	    
		    e.setBurnTime(115);
		    handleCookingTime6(r);
	    }
	    // - 1
	    else if(e.getFuel().getType().equals(Material.STICK) || e.getFuel().getType().equals(Material.WOOD_BUTTON) || e.getFuel().getType().equals(Material.WOOL) || e.getFuel().getType().equals(Material.CARPET) || e.getFuel().getType().equals(Material.SAPLING) || e.getFuel().getType().equals(Material.BOWL )) {
	    	 Block b = e.getBlock();
		    	Furnace f = (Furnace)b.getState();	    
			    e.setBurnTime(10);
			    handleCookingTime05(f);
	    }
	    //1
	    else {
	    	 Block b = e.getBlock();
	    	Furnace f = (Furnace)b.getState();	    
		    e.setBurnTime(20);
		    handleCookingTime(f);
	    }
	    }
	    
	  }
	  private void handleCookingTime100(final Furnace r)
	  {
	    new BukkitRunnable()
	    {
	      int id = 1800;
	      
	      public void run()
	      {
	        r.setCookTime((short)(r.getCookTime() + 10));
	        r.update();
	        
	        this.id -= 1;
	        if (this.id == 0) {
	          cancel();
	        }
	      }
	    }.runTaskTimer(this, 1L, 1L);
	  }
	  
	  private void handleCookingTime12(final Furnace r)
	  {
	    new BukkitRunnable()
	    {
	      int id = 240;
	      
	      public void run()
	      {
	        r.setCookTime((short)(r.getCookTime() + 10));
	        r.update();
	        
	        this.id -= 1;
	        if (this.id == 0) {
	          cancel();
	        }
	      }
	    }.runTaskTimer(this, 1L, 1L);
	  }
		private void handleCookingTime6(final Furnace r)
		  {
		    new BukkitRunnable()
		    {
		      int id = 120;
		      
		      public void run()
		      {
		        r.setCookTime((short)(r.getCookTime() + 10));
		        r.update();
		        
		        this.id -= 1;
		        if (this.id == 0) {
		          cancel();
		        }
		      }
		    }.runTaskTimer(this, 1L, 1L);
		  }
	
	  private void handleCookingTime(final Furnace f)
	  {
	    new BukkitRunnable()
	    {
	      int id = 18;
	      
	      public void run()
	      {
	        f.setCookTime((short)(f.getCookTime() + 10));
	        f.update();
	        
	        this.id -= 1;
	        if (this.id == 0) {
	          cancel();
	        }
	      }
	    }.runTaskTimer(this, 1L, 1L);
	  }
	  private void handleCookingTime05(final Furnace f)
	  {
	    new BukkitRunnable()
	    {
	      int id = 9;
	      
	      public void run()
	      {
	        f.setCookTime((short)(f.getCookTime() + 10));
	        f.update();
	        
	        this.id -= 1;
	        if (this.id == 0) {
	          cancel();
	        }
	      }
	    }.runTaskTimer(this, 1L, 1L);
	  }
	
	/*
	  @EventHandler
	  public void onBurn(FurnaceBurnEvent e)
	  {
	    Block b = e.getBlock();
	    Furnace f = (Furnace)b.getState();	    
		    e.setBurnTime(115);
		    handleCookingTime(f);
	    
	  }
	*/  

	
	
	
	@EventHandler
	public void onEnchante(EnchantItemEvent event) {
				
		Player player = event.getEnchanter();
		if(config.contains("FIRE")) {
		
	if(event.getEnchantsToAdd().containsKey(org.bukkit.enchantments.Enchantment.FIRE_ASPECT) || event.getEnchantsToAdd().containsKey(org.bukkit.enchantments.Enchantment.ARROW_FIRE)) {
		player.sendMessage("§7[§fScénario§7] §cFIRE_ASPECT §fet §cFLAME §fdésactivé");
			event.setCancelled(true);
	}
	}
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		Block block = event.getBlock();
		Player player = event.getPlayer();
		if(config.contains("CutClean")) {
		
		if (block.getType().equals(Material.GOLD_ORE)) {
			Location loc = event.getBlock().getLocation();
        	ExperienceOrb xp = (ExperienceOrb)block.getWorld().spawnEntity(loc, EntityType.EXPERIENCE_ORB);
        	xp.setExperience((int) 1);
				}
		if (block.getType().equals(Material.IRON_ORE)) {
        	Location loc = event.getBlock().getLocation();
        	ExperienceOrb xp = (ExperienceOrb)block.getWorld().spawnEntity(loc, EntityType.EXPERIENCE_ORB);
        	xp.setExperience((int) 1);	
        	}	
		
		}
		if(config.contains("DIAMONDLIMITE")) {
			if(block.getType().equals(Material.DIAMOND_ORE)) {
				int diamond = player.getStatistic(Statistic.MINE_BLOCK, Material.DIAMOND_ORE);
				if(diamondlimite <= diamond) {
					block.setType(Material.AIR);
					player.sendMessage("§7[§fScénario§7] Vous avez dépassé la Diamond limite");
					Random random = new Random();
					Location loc = event.getBlock().getLocation();
		        	ExperienceOrb xp = (ExperienceOrb)block.getWorld().spawnEntity(loc, EntityType.EXPERIENCE_ORB);
		        	xp.setExperience((int) 1);
					switch (random.nextInt(2)) {
					case 0:
						event.getBlock().setType(Material.GOLD_ORE);
						break;
						case 1:
						break;

					default:
						break;
					}
					
				}else {
					player.sendMessage("§7[§fScénario§7] Diamond miné : §b"+ (diamond+1) + "§7/§b17");
				}
			}
		}
	
			
		}
	
	
	@EventHandler
	  public void onItemSpawn(ItemSpawnEvent event){
		if(config.contains("CutClean")) {
		ItemStack is2 = event.getEntity().getItemStack();
	    if (is2 == null) {
	      return;
	    }
	    
	    ItemStack is = event.getEntity().getItemStack();
	    if (is == null) {
	      return;
	    }
	    ItemStack replace = null;
	    switch (is.getType())
	    {
	    case IRON_ORE: 
	      replace = new ItemStack(Material.IRON_INGOT);
	      
	      break;
	    case GOLD_ORE: 
	      replace = new ItemStack(Material.GOLD_INGOT);
	      break;
		default:
			break;	    
	    
	    }
	    
	    if (replace != null) {
	      event.getEntity().setItemStack(replace);
	    }
	    
		}
		if(config.contains("DIAMONDLIMITE")) {
			
		}
		if(config.contains("Shears")) {		   
		    
		    ItemStack is = event.getEntity().getItemStack();
		    if (is == null) {
		      return;
		    }
		    ItemStack replace = null;
		    switch (is.getType())
		    {
		    case LEAVES:
		    	Random random = new Random();
				int alea = random.nextInt(10);
				
				switch(alea){
				case 0:
					replace = new ItemStack(Material.APPLE);
				    break;
				case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: 
			      break;
		
		    }case LEAVES_2: 
		    	Random random1 = new Random();
				int alea1 = random1.nextInt(10);
				
				switch(alea1){
				case 0:
					replace = new ItemStack(Material.APPLE);
				    break;
				case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
			      break;
				
				}
			default:
				break;
	
		}if (replace != null) {
		      event.getEntity().setItemStack(replace);
		    }
}
	}
}
	
	
	    
	    
	



