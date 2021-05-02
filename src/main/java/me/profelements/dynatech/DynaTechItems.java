package me.profelements.dynatech;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
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
    
    //Categories
    public static final MultiCategory DT_GENERAL = new MultiCategory(new NamespacedKey(DynaTech.getInstance(), "DT_GENERAL"), new CustomItem(Material.CONDUIT, "&bDyna科技"));
    public static final SubCategory DT_RESOURCES = new SubCategory(new NamespacedKey(DynaTech.getInstance(), "DT_RESOURCES"), DT_GENERAL, new CustomItem(Material.PUFFERFISH, "&bDyna科技 資源"));
    public static final SubCategory DT_TOOLS = new SubCategory(new NamespacedKey(DynaTech.getInstance(), "DT_TOOLS"), DT_GENERAL, new CustomItem(Material.DIAMOND_AXE, "&bDyna科技 工具"));
    public static final SubCategory DT_MACHINES = new SubCategory(new NamespacedKey(DynaTech.getInstance(), "DT_MACHINES"), DT_GENERAL, new CustomItem(Material.SEA_LANTERN, "&bDyna科技 機器"));
    public static final SubCategory DT_GENERATORS = new SubCategory(new NamespacedKey(DynaTech.getInstance(), "DT_GENERATORS"), DT_GENERAL, new CustomItem(Material.PRISMARINE_BRICKS, "&bDyna科技 發電機"));

    public static final Category DynaTechGeneral = new Category(new NamespacedKey(DynaTech.getInstance(), "dynatech"),
        new CustomItem(Material.CONDUIT, "&bDyna科技")
    );

    public static final RecipeType DynaTechScoop = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "dt_scoop"),
        new CustomItem(Material.IRON_SHOVEL, "&b使用勺子鏟蜜蜂")
    );


    //RecipeTypes
    // #TODO: Make Orechid use RecipeType + Standard Conversions
    public static final RecipeType DT_SCOOP = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "DT_SCOOP"), new CustomItem(Material.IRON_SHOVEL, "&b使用勺子鏟蜜蜂"));
    //public static final RecipeType DT_ORECHID = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "DT_ORECHID"), new CustomItem(Material.END_ROD, "&BTransmuted using the Orechid"));

    //General

    //Resources
    public static final SlimefunItemStack STAINLESS_STEEL = new SlimefunItemStack("STAINLESS_STEEL", Material.IRON_INGOT, "&6不銹鋼錠");
    public static final SlimefunItemStack STAINLESS_STEEL_ROTOR = new SlimefunItemStack("STAINLESS_STEEL_ROTOR", Material.IRON_BLOCK, "&6不銹鋼轉子");
    public static final SlimefunItemStack ANCIENT_MACHINE_CORE = new SlimefunItemStack("ANCIENT_MACHINE_CORE", Material.LAPIS_BLOCK, "&6古代機器核心");
    public static final SlimefunItemStack VEX_GEM = new SlimefunItemStack("VEX_GEM", SkullItem.fromHash("b91aeca7c17e66d867231b36d96e83c1ede75eaf67ccf3a88dca15d4114ae167"), "&6惱鬼寶石");
    public static final SlimefunItemStack MACHINE_SCRAP = new SlimefunItemStack("MACHINE_SCRAP", SkullItem.fromHash("13ea401c7e02d13cea1de6835ee9f5c47757d399dae5c2b9c3efde6ae63ea4a2"), "&6機器廢料");
    public static final SlimefunItemStack ADVANCED_MACHINE_SCRAP = new SlimefunItemStack("ADVANCED_MACHINE_SCRAP",SkullItem.fromHash("4b57a4c68d1d2c5de978ea6de4db91ef387ca6c37966bb8e7c8826f937e6c3"), "&6高級機器廢料");
    public static final SlimefunItemStack STAR_DUST = new SlimefunItemStack("STAR_DUST", Material.NETHER_STAR, "&6星塵");
    public static final SlimefunItemStack GHOSTLY_ESSENCE = new SlimefunItemStack("GHOSTLY_ESSENCE", Material.WHITE_DYE, "&6幽靈精華");
    public static final SlimefunItemStack TESSERACTING_OBJ = new SlimefunItemStack("TESSERACTING_OBJ", Material.MUSHROOM_STEM, "&6光學物件", "&f&o它在你手中閃爍與移動");
    public static final SlimefunItemStack BEE = new SlimefunItemStack("BEE", SkullItem.fromHash("12724a9a4cdd68ba49415560e5be40b4a1c47cb5be1d66aedb52a30e62ef2d47"), "&6蜜蜂");
    public static final SlimefunItemStack ROBOTIC_BEE = new SlimefunItemStack("ROBOTIC_BEE", SkullItem.fromHash("16f728c89904b2cb57f853d31d0e2061f52917981fedccb1e949528e08eb4140"), "&6機械蜜蜂");
    public static final SlimefunItemStack ADVANCED_ROBOTIC_BEE = new SlimefunItemStack("ADVANCED_ROBOTIC_BEE", SkullItem.fromHash("c1c96e8cf83cbade55ffa667197ea6990290e5c7dc679104332caead97eef09"), "&6高級機械蜜蜂");

    //Tools
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
        "&f將你傳送到一個",
        "&f分開的世界家並返回",
        "",
        "&f&o家 甜蜜的家",
        "",
        "&7區塊ID: <id>"
    );

    public static final SlimefunItemStack ITEM_BAND_HEALTH = new SlimefunItemStack("ITEM_BAND_HEALTH",
        new CustomItem(SkullItem.fromHash("f1e2428cb359988f4c4ff0e61de21385c62269de19a69762d773223b75dd1666")),
        "&6健康物品戒指",
        "",
        "&f當應用在裝備或工具時",
        "&f將為你提供二級的生命值提升",
        "",
        "&f&o力量提升!"
    );

    public static final SlimefunItemStack ITEM_BAND_HASTE = new SlimefunItemStack("ITEM_BAND_HASTE",
        new CustomItem(SkullItem.fromHash("4f01ec6331a3bc30a8204ec56398d08ca38788556bca9b81d776f6238d567367")),
        "&6挖掘加速戒指",
        "",
        "&f當應用在裝備或工具時",
        "&f將為你提供二級的挖掘加速",
        "",
        "&f&o力量提升!"
    ); 
            
    public static final SlimefunItemStack TESSERACT_BINDER = new SlimefunItemStack("TESSERACT_BINDER",
        Material.NETHERITE_HOE,
        "&6光學綁定儀",
        "",
        "&f 用於綁定兩個光學傳輸器.",
        "",
        "&f右鍵點擊獲取光學傳輸器的位置",
        "&f蹲下右鍵以將位置綁定至光學傳輸器",
        ""
    );

    public static final SlimefunItemStack LIQUID_TANK = new SlimefunItemStack("LIQUID_TANK",
        Material.BUCKET,
        "&6隨身液體儲存罐",
        "",
        "&f簡單的液體掠奪者.",
        "",
        "&f裝載液體: NO_FLUID",
        "&f容量: 0mb / 16000",
        ""
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
        "&f自動生長&e植物&f.",
        "",
        "&f&o就像是一個小溫室!",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_MK2",
        Material.LIME_STAINED_GLASS,
        "&6生長倉 MK2",
        "",
        "&f自動生長&e植物&f.",
        "",
        "&f&o就像是一個小溫室!",
        "",
        "&c3x 生產速度.",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(3),
        LoreBuilder.powerPerSecond(128)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_END = new SlimefunItemStack("GROWTH_CHAMBER_END",
        Material.MAGENTA_STAINED_GLASS,
        "&d終界生長倉",
        "",
        "&f自動生長&d歌萊花.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_END_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_END_MK2",
        Material.PURPLE_STAINED_GLASS,
        "&d終界生長倉 MK2",
        "",
        "&f自動生長&d歌萊花.",
        "",
        "&c3x 生產速度.",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(3),
        LoreBuilder.powerPerSecond(128)      
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_NETHER = new SlimefunItemStack("GROWTH_CHAMBER_NETHER",
        Material.RED_STAINED_GLASS,
        "&c地獄生長倉",
        "",
        "&f自動生長&c地獄&f植物.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_NETHER_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_NETHER_MK2",
        Material.RED_STAINED_GLASS,
        "&c地獄生長倉 MK2",
        "",
        "&f自動生長&c地獄&f植物.",
        "",
        "&c3x 生產速度.",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(3),
        LoreBuilder.powerPerSecond(128)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_OCEAN = new SlimefunItemStack("GROWTH_CHAMBER_OCEAN",
    Material.CYAN_STAINED_GLASS,
        "&b海洋生長倉",
        "",
        "&f自動生長&9水中&f植物.",
        "可以使死亡的珊瑚復活!",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_OCEAN_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_OCEAN_MK2",
        Material.LIGHT_BLUE_STAINED_GLASS,
        "&b海洋生長倉 MK2",
        "",
        "&f自動生長&9水中&f植物.",
        "可以使死亡的珊瑚復活!",
        "",
        "&c3x 生產速度.",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(3),
        LoreBuilder.powerPerSecond(128)
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

    public static final SlimefunItemStack SEED_PLUCKER = new SlimefunItemStack("SEED_PLUCKER",
        Material.ORANGE_STAINED_GLASS,
        "&6種子採摘機",
        "",
        "&f從植物中取出種子.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack BANDAID_MANAGER = new SlimefunItemStack("BANDAID_MANAGER",
        Material.LAPIS_BLOCK,
        "&6物品戒指管理器",
        "",
        "&f管理物品戒指",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(48)
    );

    public static final SlimefunItemStack ORECHID = new SlimefunItemStack("ORECHID",
        Material.END_ROD,
        "&6礦物花",
        "",
        "&f使用石頭或地獄石和電力, 可以製造它們各自的礦物.",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.power(1024, " 每個方塊轉換.")
   );

    public static final SlimefunItemStack WIRELESS_ENERGY_POINT = new SlimefunItemStack("WIRELESS_ENERGY_POINT",
        new CustomItem(SkullItem.fromHash("335a21d95e8597759fb259c951ea68e1ad3374ca41e56ef126ffabfe03c1e0")),
        "&6無線能量點",
        "",
        "&f無線傳輸能源",
        "&f來自無線能量庫",
        "右鍵點擊在無線能量庫來連接!",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerBuffer(5120),
        LoreBuilder.powerPerSecond(1024),
        ""
    );
    public static final SlimefunItemStack WIRELESS_ENERGY_BANK = new SlimefunItemStack("WIRELESS_ENERGY_BANK",
        Material.SNOW_BLOCK,
        "&6無線能量庫",
        "",
        "&f儲存能源給",
        "&f無線能量點使用.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
        LoreBuilder.powerBuffer(10240),
        LoreBuilder.powerPerSecond(1024),
        ""
    );

    public static final SlimefunItemStack WIRELESS_ITEM_INPUT = new SlimefunItemStack("WIRELESS_ITEM_INPUT",
        new CustomItem(SkullItem.fromHash("abb55560c695d976b346e188d3df2bcd8c5aa32b933141a9715c42f64cb6cee")),
        "&6無線物品輸入",
        "",
        "&f以無線的方式傳輸物品",
        "&f 到無線物品輸出",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerBuffer(1024),
        LoreBuilder.power(8, " 每組物品"),
        ""
    );

    public static final SlimefunItemStack WIRELESS_ITEM_OUTPUT = new SlimefunItemStack("WIRELESS_ITEM_OUTPUT",
        new CustomItem(SkullItem.fromHash("c510d9b61ca333d2946c61a26cb17e374d4adb573b46afdebaf89f65ba5d4ae2")),
        "&6無線物品輸出",
        "",
        "&f以無線的方式傳輸物品",
        "&f從無線物品輸入",
        "右鍵點擊無線物品輸出來連接!",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), 
        LoreBuilder.powerBuffer(1024),
        LoreBuilder.power(8, " 每組物品"),
        ""
    );

    public static final SlimefunItemStack TESSERACT = new SlimefunItemStack("TESSERACT",
        Material.PURPUR_BLOCK,
        "&6光學傳輸器",
        "",
        "&f無線傳輸物品與能源",
        "&f甚至可以雙向傳輸!",
        "右鍵另一個光學傳輸器來連接!",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.powerBuffer(65535),
        LoreBuilder.powerPerSecond(1024),
        ""  
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

    public static final SlimefunItemStack WATER_TURBINE = new SlimefunItemStack("WATER_TURBINE",
        Material.PRISMARINE_WALL,
        "&6水力渦輪機",
        "",
        "&f通過流動的水來產生能源",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(512),
        LoreBuilder.powerPerSecond(64)
    );

    public static final SlimefunItemStack DRAGON_GENERATOR = new SlimefunItemStack("DRAGON_GENERATOR",
        Material.GRAY_CONCRETE,
        "&6龍蛋發電機",
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
        "&f從損壞的物品提取能源",
        "&f(基於有耐久度的物品)",
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
