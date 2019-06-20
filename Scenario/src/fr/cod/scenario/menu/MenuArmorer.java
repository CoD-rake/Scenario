package fr.cod.scenario.menu;

import fr.cod.scenario.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class MenuArmorer extends Menu implements Listener {
    private Main main;
    public MenuArmorer(Player player, Main main) {
        super(player, 45, "§7Limite Armorer");
        this.main = main;

        //DIAMOND STUFF

        ItemStack ALLOWDIAMONDHELMET = new ItemStack(Material.DIAMOND_HELMET, -1);
        ItemMeta ALLOWDIAMONDHELMETM = ALLOWDIAMONDHELMET.getItemMeta();
        ALLOWDIAMONDHELMETM.setDisplayName("§aAllow Diamond Helmet");
        ALLOWDIAMONDHELMET.setItemMeta(ALLOWDIAMONDHELMETM);

        ItemStack NoALLOWDIAMONDHELMET = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta NoALLOWDIAMONDHELMETM = NoALLOWDIAMONDHELMET.getItemMeta();
        NoALLOWDIAMONDHELMETM.setDisplayName("§cdisallow Diamond Helmet");
        NoALLOWDIAMONDHELMET.setItemMeta(NoALLOWDIAMONDHELMETM);

        ItemStack ALLOWDIAMONDCHESTPLATE = new ItemStack(Material.DIAMOND_CHESTPLATE, -1);
        ItemMeta ALLOWDIAMONDCHESTPLATEM = ALLOWDIAMONDCHESTPLATE.getItemMeta();
        ALLOWDIAMONDCHESTPLATEM.setDisplayName("§aAllow Diamond Chestplate");
        ALLOWDIAMONDCHESTPLATE.setItemMeta(ALLOWDIAMONDCHESTPLATEM);

        ItemStack NoALLOWDIAMONDCHESTPLATE = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta NoALLOWDIAMONDCHESTPLATEM = NoALLOWDIAMONDCHESTPLATE.getItemMeta();
        NoALLOWDIAMONDCHESTPLATEM.setDisplayName("§cdisallow Diamond Chestplate");
        NoALLOWDIAMONDCHESTPLATE.setItemMeta(NoALLOWDIAMONDCHESTPLATEM);

        ItemStack ALLOWDIAMONDLEGGINGS = new ItemStack(Material.DIAMOND_LEGGINGS, -1);
        ItemMeta ALLOWDIAMONDLEGGINGSM = ALLOWDIAMONDLEGGINGS.getItemMeta();
        ALLOWDIAMONDLEGGINGSM.setDisplayName("§aAllow Diamond leggings");
        ALLOWDIAMONDLEGGINGS.setItemMeta(ALLOWDIAMONDLEGGINGSM);

        ItemStack NoALLOWDIAMONDLEGGINGS = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta NoALLOWDIAMONDLEGGINGSM = NoALLOWDIAMONDLEGGINGS.getItemMeta();
        NoALLOWDIAMONDLEGGINGSM.setDisplayName("§cdisallow Diamond leggings");
        NoALLOWDIAMONDLEGGINGS.setItemMeta(NoALLOWDIAMONDLEGGINGSM);

        ItemStack ALLOWDIAMONDBOOTS = new ItemStack(Material.DIAMOND_BOOTS, -1);
        ItemMeta ALLOWDIAMONDBOOTSM = ALLOWDIAMONDBOOTS.getItemMeta();
        ALLOWDIAMONDBOOTSM.setDisplayName("§aAllow Diamond Boots");
        ALLOWDIAMONDBOOTS.setItemMeta(ALLOWDIAMONDBOOTSM);

        ItemStack NoALLOWDIAMONDBOOTS = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta NoALLOWDIAMONDBOOTSM = NoALLOWDIAMONDBOOTS.getItemMeta();
        NoALLOWDIAMONDBOOTSM.setDisplayName("§cdisallow Diamond Boots");
        NoALLOWDIAMONDBOOTS.setItemMeta(NoALLOWDIAMONDBOOTSM);

        //IRON STUFF

        ItemStack ALLOWIRONHELMET = new ItemStack(Material.IRON_HELMET, -1);
        ItemMeta ALLOWIRONHELMETM = ALLOWIRONHELMET.getItemMeta();
        ALLOWIRONHELMETM.setDisplayName("§aAllow IRON Helmet");
        ALLOWIRONHELMET.setItemMeta(ALLOWIRONHELMETM);

        ItemStack NoALLOWIRONHELMET = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta NoALLOWIRONHELMETM = NoALLOWIRONHELMET.getItemMeta();
        NoALLOWIRONHELMETM.setDisplayName("§cdisallow IRON Helmet");
        NoALLOWIRONHELMET.setItemMeta(NoALLOWIRONHELMETM);

        ItemStack ALLOWIRONCHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, -1);
        ItemMeta ALLOWIRONCHESTPLATEM = ALLOWIRONCHESTPLATE.getItemMeta();
        ALLOWIRONCHESTPLATEM.setDisplayName("§aAllow IRON Chestplate");
        ALLOWIRONCHESTPLATE.setItemMeta(ALLOWIRONCHESTPLATEM);

        ItemStack NoALLOWIRONCHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta NoALLOWIRONCHESTPLATEM = NoALLOWIRONCHESTPLATE.getItemMeta();
        NoALLOWIRONCHESTPLATEM.setDisplayName("§cdisallow IRON Chestplate");
        NoALLOWIRONCHESTPLATE.setItemMeta(NoALLOWIRONCHESTPLATEM);

        ItemStack ALLOWIRONLEGGINGS = new ItemStack(Material.IRON_LEGGINGS, -1);
        ItemMeta ALLOWIRONLEGGINGSM = ALLOWIRONLEGGINGS.getItemMeta();
        ALLOWIRONLEGGINGSM.setDisplayName("§aAllow IRON leggings");
        ALLOWIRONLEGGINGS.setItemMeta(ALLOWIRONLEGGINGSM);

        ItemStack NoALLOWIRONLEGGINGS = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta NoALLOWIRONLEGGINGSM = NoALLOWIRONLEGGINGS.getItemMeta();
        NoALLOWIRONLEGGINGSM.setDisplayName("§cdisallow IRON leggings");
        NoALLOWIRONLEGGINGS.setItemMeta(NoALLOWIRONLEGGINGSM);

        ItemStack ALLOWIRONBOOTS = new ItemStack(Material.IRON_BOOTS, -1);
        ItemMeta ALLOWIRONBOOTSM = ALLOWIRONBOOTS.getItemMeta();
        ALLOWIRONBOOTSM.setDisplayName("§aAllow IRON Boots");
        ALLOWIRONBOOTS.setItemMeta(ALLOWIRONBOOTSM);

        ItemStack NoALLOWIRONBOOTS = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta NoALLOWIRONBOOTSM = NoALLOWIRONBOOTS.getItemMeta();
        NoALLOWIRONBOOTSM.setDisplayName("§cdisallow IRON Boots");
        NoALLOWIRONBOOTS.setItemMeta(NoALLOWIRONBOOTSM);

        //GOLD STUFF

        ItemStack ALLOWGOLDHELMET = new ItemStack(Material.GOLD_HELMET, -1);
        ItemMeta ALLOWGOLDHELMETM = ALLOWGOLDHELMET.getItemMeta();
        ALLOWGOLDHELMETM.setDisplayName("§aAllow GOLD Helmet");
        ALLOWGOLDHELMET.setItemMeta(ALLOWGOLDHELMETM);

        ItemStack NoALLOWGOLDHELMET = new ItemStack(Material.GOLD_HELMET, 1);
        ItemMeta NoALLOWGOLDHELMETM = NoALLOWGOLDHELMET.getItemMeta();
        NoALLOWGOLDHELMETM.setDisplayName("§cdisallow GOLD Helmet");
        NoALLOWGOLDHELMET.setItemMeta(NoALLOWGOLDHELMETM);

        ItemStack ALLOWGOLDCHESTPLATE = new ItemStack(Material.GOLD_CHESTPLATE, -1);
        ItemMeta ALLOWGOLDCHESTPLATEM = ALLOWGOLDCHESTPLATE.getItemMeta();
        ALLOWGOLDCHESTPLATEM.setDisplayName("§aAllow GOLD Chestplate");
        ALLOWGOLDCHESTPLATE.setItemMeta(ALLOWGOLDCHESTPLATEM);

        ItemStack NoALLOWGOLDCHESTPLATE = new ItemStack(Material.GOLD_CHESTPLATE, 1);
        ItemMeta NoALLOWGOLDCHESTPLATEM = NoALLOWGOLDCHESTPLATE.getItemMeta();
        NoALLOWGOLDCHESTPLATEM.setDisplayName("§cdisallow GOLD Chestplate");
        NoALLOWGOLDCHESTPLATE.setItemMeta(NoALLOWGOLDCHESTPLATEM);

        ItemStack ALLOWGOLDLEGGINGS = new ItemStack(Material.GOLD_LEGGINGS, -1);
        ItemMeta ALLOWGOLDLEGGINGSM = ALLOWGOLDLEGGINGS.getItemMeta();
        ALLOWGOLDLEGGINGSM.setDisplayName("§aAllow GOLD leggings");
        ALLOWGOLDLEGGINGS.setItemMeta(ALLOWGOLDLEGGINGSM);

        ItemStack NoALLOWGOLDLEGGINGS = new ItemStack(Material.GOLD_LEGGINGS, 1);
        ItemMeta NoALLOWGOLDLEGGINGSM = NoALLOWGOLDLEGGINGS.getItemMeta();
        NoALLOWGOLDLEGGINGSM.setDisplayName("§cdisallow GOLD leggings");
        NoALLOWGOLDLEGGINGS.setItemMeta(NoALLOWGOLDLEGGINGSM);

        ItemStack ALLOWGOLDBOOTS = new ItemStack(Material.GOLD_BOOTS, -1);
        ItemMeta ALLOWGOLDBOOTSM = ALLOWGOLDBOOTS.getItemMeta();
        ALLOWGOLDBOOTSM.setDisplayName("§aAllow GOLD Boots");
        ALLOWGOLDBOOTS.setItemMeta(ALLOWGOLDBOOTSM);

        ItemStack NoALLOWGOLDBOOTS = new ItemStack(Material.GOLD_BOOTS, 1);
        ItemMeta NoALLOWGOLDBOOTSM = NoALLOWGOLDBOOTS.getItemMeta();
        NoALLOWGOLDBOOTSM.setDisplayName("§cdisallow GOLD Boots");
        NoALLOWGOLDBOOTS.setItemMeta(NoALLOWGOLDBOOTSM);

        //CHAINMAIL STUFF

        ItemStack ALLOWCHAINMAILHELMET = new ItemStack(Material.CHAINMAIL_HELMET, -1);
        ItemMeta ALLOWCHAINMAILHELMETM = ALLOWCHAINMAILHELMET.getItemMeta();
        ALLOWCHAINMAILHELMETM.setDisplayName("§aAllow CHAINMAIL Helmet");
        ALLOWCHAINMAILHELMET.setItemMeta(ALLOWCHAINMAILHELMETM);

        ItemStack NoALLOWCHAINMAILHELMET = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        ItemMeta NoALLOWCHAINMAILHELMETM = NoALLOWCHAINMAILHELMET.getItemMeta();
        NoALLOWCHAINMAILHELMETM.setDisplayName("§cdisallow CHAINMAIL Helmet");
        NoALLOWCHAINMAILHELMET.setItemMeta(NoALLOWCHAINMAILHELMETM);

        ItemStack ALLOWCHAINMAILCHESTPLATE = new ItemStack(Material.CHAINMAIL_CHESTPLATE, -1);
        ItemMeta ALLOWCHAINMAILCHESTPLATEM = ALLOWCHAINMAILCHESTPLATE.getItemMeta();
        ALLOWCHAINMAILCHESTPLATEM.setDisplayName("§aAllow CHAINMAIL Chestplate");
        ALLOWCHAINMAILCHESTPLATE.setItemMeta(ALLOWCHAINMAILCHESTPLATEM);

        ItemStack NoALLOWCHAINMAILCHESTPLATE = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        ItemMeta NoALLOWCHAINMAILCHESTPLATEM = NoALLOWCHAINMAILCHESTPLATE.getItemMeta();
        NoALLOWCHAINMAILCHESTPLATEM.setDisplayName("§cdisallow CHAINMAIL Chestplate");
        NoALLOWCHAINMAILCHESTPLATE.setItemMeta(NoALLOWCHAINMAILCHESTPLATEM);

        ItemStack ALLOWCHAINMAILLEGGINGS = new ItemStack(Material.CHAINMAIL_LEGGINGS, -1);
        ItemMeta ALLOWCHAINMAILLEGGINGSM = ALLOWCHAINMAILLEGGINGS.getItemMeta();
        ALLOWCHAINMAILLEGGINGSM.setDisplayName("§aAllow CHAINMAIL leggings");
        ALLOWCHAINMAILLEGGINGS.setItemMeta(ALLOWCHAINMAILLEGGINGSM);

        ItemStack NoALLOWCHAINMAILLEGGINGS = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
        ItemMeta NoALLOWCHAINMAILLEGGINGSM = NoALLOWCHAINMAILLEGGINGS.getItemMeta();
        NoALLOWCHAINMAILLEGGINGSM.setDisplayName("§cdisallow CHAINMAIL leggings");
        NoALLOWCHAINMAILLEGGINGS.setItemMeta(NoALLOWCHAINMAILLEGGINGSM);

        ItemStack ALLOWCHAINMAILBOOTS = new ItemStack(Material.CHAINMAIL_BOOTS, -1);
        ItemMeta ALLOWCHAINMAILBOOTSM = ALLOWCHAINMAILBOOTS.getItemMeta();
        ALLOWCHAINMAILBOOTSM.setDisplayName("§aAllow CHAINMAIL Boots");
        ALLOWCHAINMAILBOOTS.setItemMeta(ALLOWCHAINMAILBOOTSM);

        ItemStack NoALLOWCHAINMAILBOOTS = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        ItemMeta NoALLOWCHAINMAILBOOTSM = NoALLOWCHAINMAILBOOTS.getItemMeta();
        NoALLOWCHAINMAILBOOTSM.setDisplayName("§cdisallow CHAINMAIL Boots");
        NoALLOWCHAINMAILBOOTS.setItemMeta(NoALLOWCHAINMAILBOOTSM);

        //LEATHER STUFF


        ItemStack ALLOWLEATHERHELMET = new ItemStack(Material.LEATHER_HELMET, -1);
        ItemMeta ALLOWLEATHERHELMETM = ALLOWLEATHERHELMET.getItemMeta();
        ALLOWLEATHERHELMETM.setDisplayName("§aAllow LEATHER Helmet");
        ALLOWLEATHERHELMET.setItemMeta(ALLOWLEATHERHELMETM);

        ItemStack NoALLOWLEATHERHELMET = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta NoALLOWLEATHERHELMETM = NoALLOWLEATHERHELMET.getItemMeta();
        NoALLOWLEATHERHELMETM.setDisplayName("§cdisallow LEATHER Helmet");
        NoALLOWLEATHERHELMET.setItemMeta(NoALLOWLEATHERHELMETM);

        ItemStack ALLOWLEATHERCHESTPLATE = new ItemStack(Material.LEATHER_CHESTPLATE, -1);
        ItemMeta ALLOWLEATHERCHESTPLATEM = ALLOWLEATHERCHESTPLATE.getItemMeta();
        ALLOWLEATHERCHESTPLATEM.setDisplayName("§aAllow LEATHER Chestplate");
        ALLOWLEATHERCHESTPLATE.setItemMeta(ALLOWLEATHERCHESTPLATEM);

        ItemStack NoALLOWLEATHERCHESTPLATE = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta NoALLOWLEATHERCHESTPLATEM = NoALLOWLEATHERCHESTPLATE.getItemMeta();
        NoALLOWLEATHERCHESTPLATEM.setDisplayName("§cdisallow LEATHER Chestplate");
        NoALLOWLEATHERCHESTPLATE.setItemMeta(NoALLOWLEATHERCHESTPLATEM);

        ItemStack ALLOWLEATHERLEGGINGS = new ItemStack(Material.LEATHER_LEGGINGS, -1);
        ItemMeta ALLOWLEATHERLEGGINGSM = ALLOWLEATHERLEGGINGS.getItemMeta();
        ALLOWLEATHERLEGGINGSM.setDisplayName("§aAllow LEATHER leggings");
        ALLOWLEATHERLEGGINGS.setItemMeta(ALLOWLEATHERLEGGINGSM);

        ItemStack NoALLOWLEATHERLEGGINGS = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta NoALLOWLEATHERLEGGINGSM = NoALLOWLEATHERLEGGINGS.getItemMeta();
        NoALLOWLEATHERLEGGINGSM.setDisplayName("§cdisallow LEATHER leggings");
        NoALLOWLEATHERLEGGINGS.setItemMeta(NoALLOWLEATHERLEGGINGSM);

        ItemStack ALLOWLEATHERBOOTS = new ItemStack(Material.LEATHER_BOOTS, -1);
        ItemMeta ALLOWLEATHERBOOTSM = ALLOWLEATHERBOOTS.getItemMeta();
        ALLOWLEATHERBOOTSM.setDisplayName("§aAllow LEATHER Boots");
        ALLOWLEATHERBOOTS.setItemMeta(ALLOWLEATHERBOOTSM);

        ItemStack NoALLOWLEATHERBOOTS = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta NoALLOWLEATHERBOOTSM = NoALLOWLEATHERBOOTS.getItemMeta();
        NoALLOWLEATHERBOOTSM.setDisplayName("§cdisallow LEATHER Boots");
        NoALLOWLEATHERBOOTS.setItemMeta(NoALLOWLEATHERBOOTSM);
        //helmet
        if(main.STUFF.contains("DIAMONDHELMET")){
            inv.setItem(1, ALLOWDIAMONDHELMET);
        }else{
            inv.setItem(1, NoALLOWDIAMONDHELMET);
        }
        if(main.STUFF.contains("IRONHELMET")){
            inv.setItem(2, ALLOWIRONHELMET);
        }else{
            inv.setItem(2, NoALLOWIRONHELMET);
        }
        if(main.STUFF.contains("GOLDHELMET")){
            inv.setItem(4, ALLOWGOLDHELMET);
        }else{
            inv.setItem(4, NoALLOWGOLDHELMET);
        }
        if(main.STUFF.contains("CHAINMAILHELMET")){
            inv.setItem(6, ALLOWCHAINMAILHELMET);
        }else{
            inv.setItem(6, NoALLOWCHAINMAILHELMET);
        }
        if(main.STUFF.contains("LEATHERHELMET")){
            inv.setItem(7, ALLOWLEATHERHELMET);
        }else{
            inv.setItem(7, NoALLOWLEATHERHELMET);
        }
        //CHESTPLATE
        if(main.STUFF.contains("DIAMONDCHESTPLATE")){
            inv.setItem(10, ALLOWDIAMONDCHESTPLATE);
        }else{
            inv.setItem(10, NoALLOWDIAMONDCHESTPLATE);
        }
        if(main.STUFF.contains("IRONCHESTPLATE")){
            inv.setItem(11, ALLOWIRONCHESTPLATE);
        }else{
            inv.setItem(11, NoALLOWIRONCHESTPLATE);
        }
        if(main.STUFF.contains("GOLDCHESTPLATE")){
            inv.setItem(13, ALLOWGOLDCHESTPLATE);
        }else{
            inv.setItem(13, NoALLOWGOLDCHESTPLATE);
        }
        if(main.STUFF.contains("CHAINMAILCHESTPLATE")){
            inv.setItem(15, ALLOWCHAINMAILCHESTPLATE);
        }else{
            inv.setItem(15, NoALLOWCHAINMAILCHESTPLATE);
        }
        if(main.STUFF.contains("LEATHERCHESTPLATE")){
            inv.setItem(16, ALLOWLEATHERCHESTPLATE);
        }else{
            inv.setItem(16, NoALLOWLEATHERCHESTPLATE);
        }
        //LEGGINGS
        if(main.STUFF.contains("DIAMONDLEGGINGS")){
            inv.setItem(19, ALLOWDIAMONDLEGGINGS);
        }else{
            inv.setItem(19, NoALLOWDIAMONDLEGGINGS);
        }
        if(main.STUFF.contains("IRONLEGGINGS")){
            inv.setItem(20, ALLOWIRONLEGGINGS);
        }else{
            inv.setItem(20, NoALLOWIRONLEGGINGS);
        }
        if(main.STUFF.contains("GOLDLEGGINGS")){
            inv.setItem(22, ALLOWGOLDLEGGINGS);
        }else{
            inv.setItem(22, NoALLOWGOLDLEGGINGS);
        }
        if(main.STUFF.contains("CHAINMAILLEGGINGS")){
            inv.setItem(24, ALLOWCHAINMAILLEGGINGS);
        }else{
            inv.setItem(24, NoALLOWCHAINMAILLEGGINGS);
        }
        if(main.STUFF.contains("LEATHERLEGGINGS")){
            inv.setItem(25, ALLOWLEATHERLEGGINGS);
        }else {
            inv.setItem(25, NoALLOWLEATHERLEGGINGS);
        }
        //BOOTS
        if(main.STUFF.contains("DIAMONDBOOTS")){
            inv.setItem(28, ALLOWDIAMONDBOOTS);
        }else{
            inv.setItem(28, NoALLOWDIAMONDBOOTS);
        }
        if(main.STUFF.contains("IRONBOOTS")){
            inv.setItem(29, ALLOWIRONBOOTS);
        }else{
            inv.setItem(29, NoALLOWIRONBOOTS);
        }
        if(main.STUFF.contains("GOLDBOOTS")){
            inv.setItem(31, ALLOWGOLDBOOTS);
        }else{
            inv.setItem(31, NoALLOWGOLDBOOTS);
        }
        if(main.STUFF.contains("CHAINMAILBOOTS")){
            inv.setItem(33, ALLOWCHAINMAILBOOTS);
        }else{
            inv.setItem(33, NoALLOWCHAINMAILBOOTS);
        }
        if(main.STUFF.contains("LEATHERBOOTS")){
            inv.setItem(34, ALLOWLEATHERBOOTS);
        }else{
            inv.setItem(34, NoALLOWLEATHERBOOTS);
        }


    }
    @EventHandler
    public void OnClick(InventoryClickEvent event) {
        //DIAMOND STUFF

        ItemStack ALLOWDIAMONDHELMET = new ItemStack(Material.DIAMOND_HELMET, -1);
        ItemMeta ALLOWDIAMONDHELMETM = ALLOWDIAMONDHELMET.getItemMeta();
        ALLOWDIAMONDHELMETM.setDisplayName("§aAllow Diamond Helmet");
        ALLOWDIAMONDHELMET.setItemMeta(ALLOWDIAMONDHELMETM);

        ItemStack NoALLOWDIAMONDHELMET = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta NoALLOWDIAMONDHELMETM = NoALLOWDIAMONDHELMET.getItemMeta();
        NoALLOWDIAMONDHELMETM.setDisplayName("§cdisallow Diamond Helmet");
        NoALLOWDIAMONDHELMET.setItemMeta(NoALLOWDIAMONDHELMETM);

        ItemStack ALLOWDIAMONDCHESTPLATE = new ItemStack(Material.DIAMOND_CHESTPLATE, -1);
        ItemMeta ALLOWDIAMONDCHESTPLATEM = ALLOWDIAMONDCHESTPLATE.getItemMeta();
        ALLOWDIAMONDCHESTPLATEM.setDisplayName("§aAllow Diamond Chestplate");
        ALLOWDIAMONDCHESTPLATE.setItemMeta(ALLOWDIAMONDCHESTPLATEM);

        ItemStack NoALLOWDIAMONDCHESTPLATE = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta NoALLOWDIAMONDCHESTPLATEM = NoALLOWDIAMONDCHESTPLATE.getItemMeta();
        NoALLOWDIAMONDCHESTPLATEM.setDisplayName("§cdisallow Diamond Chestplate");
        NoALLOWDIAMONDCHESTPLATE.setItemMeta(NoALLOWDIAMONDCHESTPLATEM);

        ItemStack ALLOWDIAMONDLEGGINGS = new ItemStack(Material.DIAMOND_LEGGINGS, -1);
        ItemMeta ALLOWDIAMONDLEGGINGSM = ALLOWDIAMONDLEGGINGS.getItemMeta();
        ALLOWDIAMONDLEGGINGSM.setDisplayName("§aAllow Diamond leggings");
        ALLOWDIAMONDLEGGINGS.setItemMeta(ALLOWDIAMONDLEGGINGSM);

        ItemStack NoALLOWDIAMONDLEGGINGS = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta NoALLOWDIAMONDLEGGINGSM = NoALLOWDIAMONDLEGGINGS.getItemMeta();
        NoALLOWDIAMONDLEGGINGSM.setDisplayName("§cdisallow Diamond leggings");
        NoALLOWDIAMONDLEGGINGS.setItemMeta(NoALLOWDIAMONDLEGGINGSM);

        ItemStack ALLOWDIAMONDBOOTS = new ItemStack(Material.DIAMOND_BOOTS, -1);
        ItemMeta ALLOWDIAMONDBOOTSM = ALLOWDIAMONDBOOTS.getItemMeta();
        ALLOWDIAMONDBOOTSM.setDisplayName("§aAllow Diamond Boots");
        ALLOWDIAMONDBOOTS.setItemMeta(ALLOWDIAMONDBOOTSM);

        ItemStack NoALLOWDIAMONDBOOTS = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta NoALLOWDIAMONDBOOTSM = NoALLOWDIAMONDBOOTS.getItemMeta();
        NoALLOWDIAMONDBOOTSM.setDisplayName("§cdisallow Diamond Boots");
        NoALLOWDIAMONDBOOTS.setItemMeta(NoALLOWDIAMONDBOOTSM);

        //IRON STUFF

        ItemStack ALLOWIRONHELMET = new ItemStack(Material.IRON_HELMET, -1);
        ItemMeta ALLOWIRONHELMETM = ALLOWIRONHELMET.getItemMeta();
        ALLOWIRONHELMETM.setDisplayName("§aAllow IRON Helmet");
        ALLOWIRONHELMET.setItemMeta(ALLOWIRONHELMETM);

        ItemStack NoALLOWIRONHELMET = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta NoALLOWIRONHELMETM = NoALLOWIRONHELMET.getItemMeta();
        NoALLOWIRONHELMETM.setDisplayName("§cdisallow IRON Helmet");
        NoALLOWIRONHELMET.setItemMeta(NoALLOWIRONHELMETM);

        ItemStack ALLOWIRONCHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, -1);
        ItemMeta ALLOWIRONCHESTPLATEM = ALLOWIRONCHESTPLATE.getItemMeta();
        ALLOWIRONCHESTPLATEM.setDisplayName("§aAllow IRON Chestplate");
        ALLOWIRONCHESTPLATE.setItemMeta(ALLOWIRONCHESTPLATEM);

        ItemStack NoALLOWIRONCHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta NoALLOWIRONCHESTPLATEM = NoALLOWIRONCHESTPLATE.getItemMeta();
        NoALLOWIRONCHESTPLATEM.setDisplayName("§cdisallow IRON Chestplate");
        NoALLOWIRONCHESTPLATE.setItemMeta(NoALLOWIRONCHESTPLATEM);

        ItemStack ALLOWIRONLEGGINGS = new ItemStack(Material.IRON_LEGGINGS, -1);
        ItemMeta ALLOWIRONLEGGINGSM = ALLOWIRONLEGGINGS.getItemMeta();
        ALLOWIRONLEGGINGSM.setDisplayName("§aAllow IRON leggings");
        ALLOWIRONLEGGINGS.setItemMeta(ALLOWIRONLEGGINGSM);

        ItemStack NoALLOWIRONLEGGINGS = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta NoALLOWIRONLEGGINGSM = NoALLOWIRONLEGGINGS.getItemMeta();
        NoALLOWIRONLEGGINGSM.setDisplayName("§cdisallow IRON leggings");
        NoALLOWIRONLEGGINGS.setItemMeta(NoALLOWIRONLEGGINGSM);

        ItemStack ALLOWIRONBOOTS = new ItemStack(Material.IRON_BOOTS, -1);
        ItemMeta ALLOWIRONBOOTSM = ALLOWIRONBOOTS.getItemMeta();
        ALLOWIRONBOOTSM.setDisplayName("§aAllow IRON Boots");
        ALLOWIRONBOOTS.setItemMeta(ALLOWIRONBOOTSM);

        ItemStack NoALLOWIRONBOOTS = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta NoALLOWIRONBOOTSM = NoALLOWIRONBOOTS.getItemMeta();
        NoALLOWIRONBOOTSM.setDisplayName("§cdisallow IRON Boots");
        NoALLOWIRONBOOTS.setItemMeta(NoALLOWIRONBOOTSM);

        //GOLD STUFF

        ItemStack ALLOWGOLDHELMET = new ItemStack(Material.GOLD_HELMET, -1);
        ItemMeta ALLOWGOLDHELMETM = ALLOWGOLDHELMET.getItemMeta();
        ALLOWGOLDHELMETM.setDisplayName("§aAllow GOLD Helmet");
        ALLOWGOLDHELMET.setItemMeta(ALLOWGOLDHELMETM);

        ItemStack NoALLOWGOLDHELMET = new ItemStack(Material.GOLD_HELMET, 1);
        ItemMeta NoALLOWGOLDHELMETM = NoALLOWGOLDHELMET.getItemMeta();
        NoALLOWGOLDHELMETM.setDisplayName("§cdisallow GOLD Helmet");
        NoALLOWGOLDHELMET.setItemMeta(NoALLOWGOLDHELMETM);

        ItemStack ALLOWGOLDCHESTPLATE = new ItemStack(Material.GOLD_CHESTPLATE, -1);
        ItemMeta ALLOWGOLDCHESTPLATEM = ALLOWGOLDCHESTPLATE.getItemMeta();
        ALLOWGOLDCHESTPLATEM.setDisplayName("§aAllow GOLD Chestplate");
        ALLOWGOLDCHESTPLATE.setItemMeta(ALLOWGOLDCHESTPLATEM);

        ItemStack NoALLOWGOLDCHESTPLATE = new ItemStack(Material.GOLD_CHESTPLATE, 1);
        ItemMeta NoALLOWGOLDCHESTPLATEM = NoALLOWGOLDCHESTPLATE.getItemMeta();
        NoALLOWGOLDCHESTPLATEM.setDisplayName("§cdisallow GOLD Chestplate");
        NoALLOWGOLDCHESTPLATE.setItemMeta(NoALLOWGOLDCHESTPLATEM);

        ItemStack ALLOWGOLDLEGGINGS = new ItemStack(Material.GOLD_LEGGINGS, -1);
        ItemMeta ALLOWGOLDLEGGINGSM = ALLOWGOLDLEGGINGS.getItemMeta();
        ALLOWGOLDLEGGINGSM.setDisplayName("§aAllow GOLD leggings");
        ALLOWGOLDLEGGINGS.setItemMeta(ALLOWGOLDLEGGINGSM);

        ItemStack NoALLOWGOLDLEGGINGS = new ItemStack(Material.GOLD_LEGGINGS, 1);
        ItemMeta NoALLOWGOLDLEGGINGSM = NoALLOWGOLDLEGGINGS.getItemMeta();
        NoALLOWGOLDLEGGINGSM.setDisplayName("§cdisallow GOLD leggings");
        NoALLOWGOLDLEGGINGS.setItemMeta(NoALLOWGOLDLEGGINGSM);

        ItemStack ALLOWGOLDBOOTS = new ItemStack(Material.GOLD_BOOTS, -1);
        ItemMeta ALLOWGOLDBOOTSM = ALLOWGOLDBOOTS.getItemMeta();
        ALLOWGOLDBOOTSM.setDisplayName("§aAllow GOLD Boots");
        ALLOWGOLDBOOTS.setItemMeta(ALLOWGOLDBOOTSM);

        ItemStack NoALLOWGOLDBOOTS = new ItemStack(Material.GOLD_BOOTS, 1);
        ItemMeta NoALLOWGOLDBOOTSM = NoALLOWGOLDBOOTS.getItemMeta();
        NoALLOWGOLDBOOTSM.setDisplayName("§cdisallow GOLD Boots");
        NoALLOWGOLDBOOTS.setItemMeta(NoALLOWGOLDBOOTSM);

        //CHAINMAIL STUFF

        ItemStack ALLOWCHAINMAILHELMET = new ItemStack(Material.CHAINMAIL_HELMET, -1);
        ItemMeta ALLOWCHAINMAILHELMETM = ALLOWCHAINMAILHELMET.getItemMeta();
        ALLOWCHAINMAILHELMETM.setDisplayName("§aAllow CHAINMAIL Helmet");
        ALLOWCHAINMAILHELMET.setItemMeta(ALLOWCHAINMAILHELMETM);

        ItemStack NoALLOWCHAINMAILHELMET = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        ItemMeta NoALLOWCHAINMAILHELMETM = NoALLOWCHAINMAILHELMET.getItemMeta();
        NoALLOWCHAINMAILHELMETM.setDisplayName("§cdisallow CHAINMAIL Helmet");
        NoALLOWCHAINMAILHELMET.setItemMeta(NoALLOWCHAINMAILHELMETM);

        ItemStack ALLOWCHAINMAILCHESTPLATE = new ItemStack(Material.CHAINMAIL_CHESTPLATE, -1);
        ItemMeta ALLOWCHAINMAILCHESTPLATEM = ALLOWCHAINMAILCHESTPLATE.getItemMeta();
        ALLOWCHAINMAILCHESTPLATEM.setDisplayName("§aAllow CHAINMAIL Chestplate");
        ALLOWCHAINMAILCHESTPLATE.setItemMeta(ALLOWCHAINMAILCHESTPLATEM);

        ItemStack NoALLOWCHAINMAILCHESTPLATE = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        ItemMeta NoALLOWCHAINMAILCHESTPLATEM = NoALLOWCHAINMAILCHESTPLATE.getItemMeta();
        NoALLOWCHAINMAILCHESTPLATEM.setDisplayName("§cdisallow CHAINMAIL Chestplate");
        NoALLOWCHAINMAILCHESTPLATE.setItemMeta(NoALLOWCHAINMAILCHESTPLATEM);

        ItemStack ALLOWCHAINMAILLEGGINGS = new ItemStack(Material.CHAINMAIL_LEGGINGS, -1);
        ItemMeta ALLOWCHAINMAILLEGGINGSM = ALLOWCHAINMAILLEGGINGS.getItemMeta();
        ALLOWCHAINMAILLEGGINGSM.setDisplayName("§aAllow CHAINMAIL leggings");
        ALLOWCHAINMAILLEGGINGS.setItemMeta(ALLOWCHAINMAILLEGGINGSM);

        ItemStack NoALLOWCHAINMAILLEGGINGS = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
        ItemMeta NoALLOWCHAINMAILLEGGINGSM = NoALLOWCHAINMAILLEGGINGS.getItemMeta();
        NoALLOWCHAINMAILLEGGINGSM.setDisplayName("§cdisallow CHAINMAIL leggings");
        NoALLOWCHAINMAILLEGGINGS.setItemMeta(NoALLOWCHAINMAILLEGGINGSM);

        ItemStack ALLOWCHAINMAILBOOTS = new ItemStack(Material.CHAINMAIL_BOOTS, -1);
        ItemMeta ALLOWCHAINMAILBOOTSM = ALLOWCHAINMAILBOOTS.getItemMeta();
        ALLOWCHAINMAILBOOTSM.setDisplayName("§aAllow CHAINMAIL Boots");
        ALLOWCHAINMAILBOOTS.setItemMeta(ALLOWCHAINMAILBOOTSM);

        ItemStack NoALLOWCHAINMAILBOOTS = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        ItemMeta NoALLOWCHAINMAILBOOTSM = NoALLOWCHAINMAILBOOTS.getItemMeta();
        NoALLOWCHAINMAILBOOTSM.setDisplayName("§cdisallow CHAINMAIL Boots");
        NoALLOWCHAINMAILBOOTS.setItemMeta(NoALLOWCHAINMAILBOOTSM);

        //LEATHER STUFF


        ItemStack ALLOWLEATHERHELMET = new ItemStack(Material.LEATHER_HELMET, -1);
        ItemMeta ALLOWLEATHERHELMETM = ALLOWLEATHERHELMET.getItemMeta();
        ALLOWLEATHERHELMETM.setDisplayName("§aAllow LEATHER Helmet");
        ALLOWLEATHERHELMET.setItemMeta(ALLOWLEATHERHELMETM);

        ItemStack NoALLOWLEATHERHELMET = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta NoALLOWLEATHERHELMETM = NoALLOWLEATHERHELMET.getItemMeta();
        NoALLOWLEATHERHELMETM.setDisplayName("§cdisallow LEATHER Helmet");
        NoALLOWLEATHERHELMET.setItemMeta(NoALLOWLEATHERHELMETM);

        ItemStack ALLOWLEATHERCHESTPLATE = new ItemStack(Material.LEATHER_CHESTPLATE, -1);
        ItemMeta ALLOWLEATHERCHESTPLATEM = ALLOWLEATHERCHESTPLATE.getItemMeta();
        ALLOWLEATHERCHESTPLATEM.setDisplayName("§aAllow LEATHER Chestplate");
        ALLOWLEATHERCHESTPLATE.setItemMeta(ALLOWLEATHERCHESTPLATEM);

        ItemStack NoALLOWLEATHERCHESTPLATE = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta NoALLOWLEATHERCHESTPLATEM = NoALLOWLEATHERCHESTPLATE.getItemMeta();
        NoALLOWLEATHERCHESTPLATEM.setDisplayName("§cdisallow LEATHER Chestplate");
        NoALLOWLEATHERCHESTPLATE.setItemMeta(NoALLOWLEATHERCHESTPLATEM);

        ItemStack ALLOWLEATHERLEGGINGS = new ItemStack(Material.LEATHER_LEGGINGS, -1);
        ItemMeta ALLOWLEATHERLEGGINGSM = ALLOWLEATHERLEGGINGS.getItemMeta();
        ALLOWLEATHERLEGGINGSM.setDisplayName("§aAllow LEATHER leggings");
        ALLOWLEATHERLEGGINGS.setItemMeta(ALLOWLEATHERLEGGINGSM);

        ItemStack NoALLOWLEATHERLEGGINGS = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta NoALLOWLEATHERLEGGINGSM = NoALLOWLEATHERLEGGINGS.getItemMeta();
        NoALLOWLEATHERLEGGINGSM.setDisplayName("§cdisallow LEATHER leggings");
        NoALLOWLEATHERLEGGINGS.setItemMeta(NoALLOWLEATHERLEGGINGSM);

        ItemStack ALLOWLEATHERBOOTS = new ItemStack(Material.LEATHER_BOOTS, -1);
        ItemMeta ALLOWLEATHERBOOTSM = ALLOWLEATHERBOOTS.getItemMeta();
        ALLOWLEATHERBOOTSM.setDisplayName("§aAllow LEATHER Boots");
        ALLOWLEATHERBOOTS.setItemMeta(ALLOWLEATHERBOOTSM);

        ItemStack NoALLOWLEATHERBOOTS = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta NoALLOWLEATHERBOOTSM = NoALLOWLEATHERBOOTS.getItemMeta();
        NoALLOWLEATHERBOOTSM.setDisplayName("§cdisallow LEATHER Boots");
        NoALLOWLEATHERBOOTS.setItemMeta(NoALLOWLEATHERBOOTSM);
        Player player = (Player) event.getWhoClicked();
        if (event.getInventory().getTitle().equals("§7Limite Armorer")) {
            ItemStack current = event.getCurrentItem();
            if ((current == null) || (current.getType() == Material.AIR)) {
                return;
            }
            event.setCancelled(true);
            switch (current.getType()){
                case DIAMOND_HELMET:
                    if(main.STUFF.contains("DIAMONDHELMET")){
                        main.STUFF.remove("DIAMONDHELMET");
                        inv.setItem(1, NoALLOWDIAMONDHELMET);
                    }else{
                        main.STUFF.add("DIAMONDHELMET");
                        inv.setItem(1, ALLOWDIAMONDHELMET);
                    }
                    break;
                case DIAMOND_CHESTPLATE:
                    if(main.STUFF.contains("DIAMONDCHESTPLATE")){
                        main.STUFF.remove("DIAMONDCHESTPLATE");
                        inv.setItem(10, NoALLOWDIAMONDCHESTPLATE);
                    }else{
                        main.STUFF.add("DIAMONDCHESTPLATE");
                        inv.setItem(10, ALLOWDIAMONDCHESTPLATE);
                    }
                    break;
                case DIAMOND_LEGGINGS:
                    if(main.STUFF.contains("DIAMONDLEGGINGS")){
                        main.STUFF.remove("DIAMONDLEGGINGS");
                        inv.setItem(19, NoALLOWDIAMONDLEGGINGS);
                    }else{
                        main.STUFF.add("DIAMONDLEGGINGS");
                        inv.setItem(19, ALLOWDIAMONDLEGGINGS);
                    }
                    break;
                case DIAMOND_BOOTS:
                    if(main.STUFF.contains("DIAMONDBOOTS")){
                        main.STUFF.remove("DIAMONDBOOTS");
                        inv.setItem(28, NoALLOWDIAMONDBOOTS);
                    }else{
                        main.STUFF.add("DIAMONDBOOTS");
                        inv.setItem(28, ALLOWDIAMONDBOOTS);
                    }
                    break;
                case IRON_HELMET:
                    if(main.STUFF.contains("IRONHELMET")){
                        main.STUFF.remove("IRONHELMET");
                        inv.setItem(2, NoALLOWIRONHELMET);
                    }else{
                        main.STUFF.add("IRONHELMET");
                        inv.setItem(2, ALLOWIRONHELMET);
                    }
                    break;
                case IRON_CHESTPLATE:
                    if(main.STUFF.contains("IRONCHESTPLATE")){
                        main.STUFF.remove("IRONCHESTPLATE");
                        inv.setItem(11, NoALLOWIRONCHESTPLATE);
                    }else{
                        main.STUFF.add("IRONCHESTPLATE");
                        inv.setItem(11, ALLOWIRONCHESTPLATE);
                    }
                    break;
                case IRON_LEGGINGS:
                    if(main.STUFF.contains("IRONLEGGINGS")){
                        main.STUFF.remove("IRONLEGGINGS");
                        inv.setItem(20, NoALLOWIRONLEGGINGS);
                    }else{
                        main.STUFF.add("IRONLEGGINGS");
                        inv.setItem(20, ALLOWIRONLEGGINGS);
                    }
                    break;
                case IRON_BOOTS:
                    if(main.STUFF.contains("IRONBOOTS")){
                        main.STUFF.remove("IRONBOOTS");
                        inv.setItem(29, NoALLOWIRONBOOTS);
                    }else {
                        main.STUFF.add("IRONBOOTS");
                        inv.setItem(29, ALLOWIRONBOOTS);
                    }
                    break;
                case GOLD_HELMET:
                    if(main.STUFF.contains("GOLDHELMET")){
                        main.STUFF.remove("GOLDHELMET");
                        inv.setItem(4, NoALLOWGOLDHELMET);
                    }else{
                        main.STUFF.add("GOLDHELMET");
                        inv.setItem(4, ALLOWGOLDHELMET);
                    }
                    break;
                case GOLD_CHESTPLATE:
                    if(main.STUFF.contains("GOLDCHESTPLATE")){
                        main.STUFF.remove("GOLDCHESTPLATE");
                        inv.setItem(13, NoALLOWGOLDCHESTPLATE);
                    }else {
                        main.STUFF.add("GOLDCHESTPLATE");
                        inv.setItem(13, ALLOWGOLDCHESTPLATE);
                    }
                    break;
                case GOLD_LEGGINGS:
                    if(main.STUFF.contains("GOLDLEGGINGS")){
                        main.STUFF.remove("GOLDLEGGINGS");
                        inv.setItem(22, NoALLOWGOLDLEGGINGS);
                    }else {
                        main.STUFF.add("GOLDLEGGINGS");
                        inv.setItem(22, ALLOWGOLDLEGGINGS);
                    }
                    break;
                case GOLD_BOOTS:
                    if(main.STUFF.contains("GOLDBOOTS")){
                        main.STUFF.remove("GOLDBOOTS");
                        inv.setItem(31, NoALLOWGOLDBOOTS);
                    }else {
                        main.STUFF.add("GOLDBOOTS");
                        inv.setItem(31, ALLOWGOLDBOOTS);
                    }
                    break;
                case CHAINMAIL_HELMET:
                    if(main.STUFF.contains("CHAINMAILHELMET")){
                        main.STUFF.remove("CHAINMAILHELMET");
                        inv.setItem(6, NoALLOWCHAINMAILHELMET);
                    }else{
                        main.STUFF.add("CHAINMAILHELMET");
                        inv.setItem(6, ALLOWCHAINMAILHELMET);
                    }
                    break;
                case CHAINMAIL_CHESTPLATE:
                    if(main.STUFF.contains("CHAINMAILCHESTPLATE")){
                        main.STUFF.remove("CHAINMAILCHESTPLATE");
                        inv.setItem(15, NoALLOWCHAINMAILCHESTPLATE);
                    }else {
                        main.STUFF.add("CHAINMAILCHESTPLATE");
                        inv.setItem(15, ALLOWCHAINMAILCHESTPLATE);
                    }
                    break;
                case CHAINMAIL_LEGGINGS:
                    if(main.STUFF.contains("CHAINMAILLEGGINGS")){
                        main.STUFF.remove("CHAINMAILLEGGINGS");
                        inv.setItem(24, NoALLOWCHAINMAILLEGGINGS);
                    }else {
                        main.STUFF.add("CHAINMAILLEGGINGS");
                        inv.setItem(24, ALLOWCHAINMAILLEGGINGS);
                    }
                    break;
                case CHAINMAIL_BOOTS:
                    if(main.STUFF.contains("CHAINMAILBOOTS")){
                        main.STUFF.remove("CHAINMAILBOOTS");
                        inv.setItem(33, NoALLOWCHAINMAILBOOTS);
                    }else {
                        main.STUFF.add("CHAINMAILBOOTS");
                        inv.setItem(33, ALLOWCHAINMAILBOOTS);
                    }
                case LEATHER_HELMET:
                    if(main.STUFF.contains("LEATHERHELMET")){
                        main.STUFF.remove("LEATHERHELMET");
                        inv.setItem(7, NoALLOWLEATHERHELMET);
                    }else{
                        main.STUFF.add("LEATHERHELMET");
                        inv.setItem(7, ALLOWLEATHERHELMET);
                    }
                    break;
                case LEATHER_CHESTPLATE:
                    if(main.STUFF.contains("LEATHERCHESTPLATE")){
                        main.STUFF.remove("LEATHERCHESTPLATE");
                        inv.setItem(16, NoALLOWLEATHERCHESTPLATE);
                    }else {
                        main.STUFF.add("LEATHERCHESTPLATE");
                        inv.setItem(16, ALLOWLEATHERCHESTPLATE);
                    }
                    break;
                case LEATHER_LEGGINGS:
                    if(main.STUFF.contains("LEATHERLEGGINGS")){
                        main.STUFF.remove("LEATHERLEGGINGS");
                        inv.setItem(25, NoALLOWLEATHERLEGGINGS);
                    }else {
                        main.STUFF.add("LEATHERLEGGINGS");
                        inv.setItem(25, ALLOWLEATHERLEGGINGS);
                    }
                    break;
                case LEATHER_BOOTS:
                    if(main.STUFF.contains("LEATHERBOOTS")){
                        main.STUFF.remove("LEATHERBOOTS");
                        inv.setItem(34, NoALLOWLEATHERBOOTS);
                    }else {
                        main.STUFF.add("LEATHERBOOTS");
                        inv.setItem(34, ALLOWLEATHERBOOTS);
                    }
                    break;

                   }
        }
    }
}
