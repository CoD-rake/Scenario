package fr.cod.scenario.menu;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public abstract class Menu implements Listener{


        public Player player;
        public int size;
        public InventoryType type;
        public String name;
        public static Inventory inv;

        public Menu(Player player, int size, String name)
        {
            this.player = player;
            this.size = size;
            this.name = name;
            inv = Bukkit.createInventory(null, size, name);
        }

        public Menu(Player player, InventoryType type, String name)
        {
            this.player = player;
            this.type = type;
            this.name = name;
            inv = Bukkit.createInventory(null, type, name);
        }

        public void show()
        {
            this.player.openInventory(inv);
        }

        public Player getPlayer()
        {
            return this.player;
        }

        public void setPlayer(Player player)
        {
            this.player = player;
        }

        public int getSize()
        {
            return this.size;
        }

        public void setSize(int size)
        {
            this.size = size;
        }

        public InventoryType getType()
        {
            return this.type;
        }

        public void setType(InventoryType type)
        {
            this.type = type;
        }

        public String getName()
        {
            return this.name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public Inventory getInventory()
        {
            return inv;
        }

        public void setInventory(Inventory inventory)
        {
            inventory = inventory;
        }



}
