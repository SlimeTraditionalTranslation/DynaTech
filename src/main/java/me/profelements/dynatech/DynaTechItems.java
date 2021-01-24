package me.profelements.dynatech;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class DynaTechItems {

    private DynaTechItems() {}

    public static final Category DynaTechGeneral = new Category(new NamespacedKey(DynaTech.getInstance(),
            "dynatech"),
            new CustomItem(Material.CONDUIT, "&bDyna科技")
    );

    public static final RecipeType DynaTechScoop = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "dt_scoop"),
            new CustomItem(Material.IRON_SHOVEL, "&b使用勺子鏟蜜蜂")
    );

    public static final RecipeType DynaTechStarDustMeteor = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "dt_stardust_meteor"),
            new CustomItem(Material.FIRE_CHARGE, "&b從流星上掉落的星塵.")
    );

    //Materials
    public static final SlimefunItemStack STAINLESS_STEEL = new SlimefunItemStack("STAINLESS_STEEL", Material.IRON_INGOT, "&6不銹鋼錠");
    public static final SlimefunItemStack STAINLESS_STEEL_ROTOR = new SlimefunItemStack("STAINLESS_STEEL_ROTOR", Material.IRON_BLOCK, "&6不銹鋼轉子");
    public static final SlimefunItemStack ANCIENT_MACHINE_CORE = new SlimefunItemStack("ANCIENT_MACHINE_CORE", Material.LAPIS_BLOCK, "&6古代機器核心");
    public static final SlimefunItemStack VEX_GEM = new SlimefunItemStack("VEX_GEM", SkullItem.fromHash("b91aeca7c17e66d867231b36d96e83c1ede75eaf67ccf3a88dca15d4114ae167"), "&6惱鬼寶石");
    public static final SlimefunItemStack MACHINE_SCRAP = new SlimefunItemStack("MACHINE_SCRAP", SkullItem.fromHash("13ea401c7e02d13cea1de6835ee9f5c47757d399dae5c2b9c3efde6ae63ea4a2"), "&6機器廢料");
    public static final SlimefunItemStack ADVANCED_MACHINE_SCRAP = new SlimefunItemStack("ADVANCED_MACHINE_SCRAP",SkullItem.fromHash("4b57a4c68d1d2c5de978ea6de4db91ef387ca6c37966bb8e7c8826f937e6c3"), "&6高級機器廢料");
    public static final SlimefunItemStack STAR_DUST = new SlimefunItemStack("STAR_DUST", Material.NETHER_STAR, "&6星塵");

    //Bees
    public static final SlimefunItemStack BEE = new SlimefunItemStack("BEE", SkullItem.fromHash("12724a9a4cdd68ba49415560e5be40b4a1c47cb5be1d66aedb52a30e62ef2d47"), "&6蜜蜂");
    public static final SlimefunItemStack ROBOTIC_BEE = new SlimefunItemStack("ROBOTIC_BEE", SkullItem.fromHash("16f728c89904b2cb57f853d31d0e2061f52917981fedccb1e949528e08eb4140"), "&6機械蜜蜂");
    public static final SlimefunItemStack ADVANCED_ROBOTIC_BEE = new SlimefunItemStack("ADVANCED_ROBOTIC_BEE", SkullItem.fromHash("c1c96e8cf83cbade55ffa667197ea6990290e5c7dc679104332caead97eef09"), "&6高級機械蜜蜂");

    //Backpacks
    public static final SlimefunItemStack PICNIC_BASKET = new SlimefunItemStack("PICNIC_BASKET",
            new CustomItem(SkullItem.fromHash("7a6bf916e28ccb80b4ebfacf98686ad6af7c4fb257e57a8cb78c71d19dccb2")),
            "&6野餐籃",
            "",
            "&f可儲存食物",
            "&f當你餓的時候自動餵食",
            "&f必須在你的背包內",
            "",
            "&f大小: &e27",
            "",
            "&7ID: <ID>",
            "",
            "&e右鍵點擊 &7打開."
            );

    //Tools
    public static final SlimefunItemStack INVENTORY_FILTER = new SlimefunItemStack("INVENTORY_FILTER",
            Material.IRON_BARS,
            "&6背包過濾器",
            "",
            "&f過濾掉地板上的物品在這背包中",
            "",
            "&7ID: <ID>",
            "",
            "&e右鍵點擊 &7打開."
            );

    public static final SlimefunItemStack ELECTRICAL_STIMULATOR = new SlimefunItemStack("ELECTRICAL_STIMULATOR",
            new CustomItem(SkullItem.fromHash("82a319cf66a4de12e3330e8bc4c82c985ccc3cb2230868c336a88fc4a22082a")),
            "&6電流刺激器",
            "",
            "&f自動餵食你能量",
            "",
            "&f&o刺激你的感官.",
            "",
            LoreBuilder.powerCharged(0, 1024)
            );

    public static final SlimefunItemStack ANGEL_GEM = new SlimefunItemStack("ANGEL_GEM",
            Material.NETHERITE_BLOCK, 
            "&6飛行寶石",
            "",
            "&f永久性創造飛行.",
            "&f有些速度調整設定.",
            "",
            "&f&o像鳥一樣飛翔~",
            "",
            "&7飛行: <enabled>",
            "&7飛行速度: <speed>"
            );

    public static final SlimefunItemStack SCOOP = new SlimefunItemStack("SCOOP", 
            Material.IRON_SHOVEL,
            "&6勺子",
            "",
            "&f用於抓蜜蜂.",
            "",
            "&f&o請記得別被螫",
            "",
            LoreBuilder.powerCharged(0, 512)
            );

    public static final SlimefunItemStack DIMENSIONAL_HOME = new SlimefunItemStack("DIMENSIONAL_HOME",
            new CustomItem(SkullItem.fromHash("eb18cf9e1bf7ec57304ae92f2b00d91643cf0b65067dead34fb48baf18e3c385")),
            "&6維度之家",
            "",
            "&f將你傳送到一個獨立的家並返回",
            "",
            "&f&o家 甜蜜的家",
            "",
            "&7區塊ID: <id>"
            );
    
    //Machines
    public static final SlimefunItemStack AUTO_KITCHEN = new SlimefunItemStack("AUTO_KITCHEN",
            Material.SMOKER,
            "&6自動廚房",
            "",
            "&f自動製作廚房的配方",
            "",
            "&f&o聞起來像餅乾",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(16)
            );

    public static final SlimefunItemStack GROWTH_CHAMBER = new SlimefunItemStack("GROWTH_CHAMBER",
            Material.GREEN_STAINED_GLASS,
            "&6生長倉",
            "",
            "&f自動生長一些植物.",
            "",
            "&f&o就像是一個小溫室!",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(32)
            );

    public static final SlimefunItemStack ANTIGRAVITY_BUBBLE = new SlimefunItemStack("ANTIGRAVITY_BUBBLE",
            Material.OBSIDIAN,
            "&6反重力泡泡",
            "",
            "&f 創造飛行在45格方塊範圍內",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(128)
            );

    public static final SlimefunItemStack WEATHER_CONTROLLER = new SlimefunItemStack("WEATHER_CONTROLLER",
            Material.BLUE_STAINED_GLASS,
            "&6天氣控制器",
            "",
            "&f給予特定的物品來控制天氣.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(32)
            );

    public static final SlimefunItemStack POTION_SPRINKLER = new SlimefunItemStack("POTION_SPRINKLER",
            new CustomItem(SkullItem.fromHash("8d302104180cb79d5f4cf423649ddfa8ffb31a1875fa02a983cd248c72dfb0ea")),
            "&6藥水灑水器",
            "",
            "&f範圍性添加多人效果的藥水裝置.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(32)
            );
    
    public static final SlimefunItemStack BARBED_WIRE = new SlimefunItemStack("BARBED_WIRE",
            new CustomItem(SkullItem.fromHash("b2ac6c219004d82dfa627ffab664f29c53ecc112d91c9d7a9c915c426832412")),
            "&6鐵絲網",
            "",
            "&f在範圍內推開怪物.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16)
            );        
    
    public static final SlimefunItemStack MATERIAL_HIVE = new SlimefunItemStack("MATERIAL_HIVE",
            Material.BEEHIVE,
            "&6材質蜂巢",
            "",
            "&f使用電力與蜜蜂, 慢慢產生物質.",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(1024)
            );

    public static final SlimefunItemStack WIRELESS_CHARGER = new SlimefunItemStack("WIRELESS_CHARGER",
            Material.CLAY,
            "&6無線充電器",
            "",
            "&f無線充電背包內的物品",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16)
            );

    //Generators
    public static final SlimefunItemStack WATER_MILL = new SlimefunItemStack("WATER_MILL",
            Material.COBBLESTONE_WALL,
            "&6水輪發電機",
            "",
            "&f通過流動的水來產生能源",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(128),
            LoreBuilder.powerPerSecond(16)
            );

    public static final SlimefunItemStack DRAGON_GENERATOR = new SlimefunItemStack("DRAGON_GENERATOR",
            Material.GRAY_CONCRETE
            ,"&6龍蛋發電機",
            "",
            "&f從龍蛋的溫暖中產生能源",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(32)
            );

    public static final SlimefunItemStack CHIPPING_GENERATOR = new SlimefunItemStack("CHIPPING_GENERATOR",
            Material.SPRUCE_WOOD,
            "&6切屑發電機",
            "",
            "&f從損壞的物品提取能源 (物品必須有耐久度)",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.power(8, " 每個耐久度")
            );

    public static final SlimefunItemStack CULINARY_GENERATOR = new SlimefunItemStack("CULINARY_GENERATOR",
            Material.BLAST_FURNACE,
            "&6烹飪發電機",
            "",
            "&f從食物中提取能源",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(8)
            );

    public static final SlimefunItemStack STARDUST_REACTOR = new SlimefunItemStack("STARDUST_REACTOR",
            Material.IRON_BLOCK,
            "&6星塵反應爐",
            "",
            "&6使用星塵來產生大量的能源.",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(32768),
            LoreBuilder.powerPerSecond(1024)
            );
}
