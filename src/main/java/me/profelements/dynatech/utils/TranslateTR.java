package me.profelements.dynatech.utils;

public class TranslateTR {
    public static String BeeVanillaItemName (String Name) {
        switch (Name) {
            case "[Iron Ingot]":
                return "[鐵]";
            case "[Gold Ingot]":
                return "[金]";
            case "[Netherite Ingot]":
                return "[獄髓]";
            case "[Diamond]":
                return "[鑽石]";
            case "[Emerald]":
                return "[綠寶石]";
            case "[Lapis Lazuli]":
                return "[青金石]";
            case "[Nether Quartz]":
                return "[地獄石英]";
            case "[Redstone Dust]":
                return "[紅石]";
            case "[Coal]":
                return "[煤炭]";
            default:
                return "錯誤！" + Name;
        }
    }
}
