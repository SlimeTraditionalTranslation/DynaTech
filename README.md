# Dyna科技
我製作一套物品和機器, 使這些東西更加簡單與有趣.
其中大多數可能過於強大或過於不足.

**該插件需求JAVA 11**
> 此為**非官方**版本, 請勿在該作者問題追蹤內回報! <br>
> [原作連結](https://github.com/ProfElements/DynaTech) | [非官方Discord](https://discord.gg/GF4CwjFXT9)

| 非官方繁體中文版 | 官方英文版 |
| -------- | -------- |
| 點下方圖片下載 | 點下方圖片下載 |
| [![Build Status](https://xmikux.github.io/builds/SlimeTraditionalTranslation/DynaTech/master/badge.svg)](https://xmikux.github.io/builds/SlimeTraditionalTranslation/DynaTech/master) | [![Build Status](https://thebusybiscuit.github.io/builds/ProfElements/DynaTech/master/badge.svg)](https://thebusybiscuit.github.io/builds/ProfElements/DynaTech/master) |

## 機器
- **自動廚房** - 如果你安裝了ExoticGarden, 此機器將可使用. 它會自動製作任何設定在內的配方.
- **生長倉** - 自動生長一些植物. 我們有多個種類滿足你的需求. 支持Exotic Garden附加的樹苗,植物和灌木樹.
- **反重力泡泡** - 通電後, 在45格範圍內暫時的創造飛行.
- **天氣控制器** - 給予關鍵物品來控制天氣 (向日葵 > 晴朗, 紫丁香 > 降雨, 苦力怕頭顱 > 雷雨).
- **藥水灑水器** - 範圍性藥水裝置, 藥水基本上具有耐久度.
- **鐵絲網** - 範圍內推開怪物.
- **材質蜂巢** - 一個無限資源產生機, 需要蜜蜂與一個物品輸出堆. 支持的材料在 [這裡](https://github.com/ProfElements/DynaTech/blob/1b6aee96937da31c7bdb84df284392530149ce63/src/main/java/me/profelements/dynatech/items/electric/MaterialHive.java#L169). 對於材質蜂巢, 你投入的每隻蜜蜂都會減少生產材料的時間, 因此128隻蜜蜂會比1隻蜜蜂更好. 請注意, 每種蜜蜂類型的秒數都不同. 檢查蜜蜂部分來獲取更多訊息.
- **無線充電器** - 在16格方塊半徑範圍內充玩家背包內可充電的物品
- **種子採摘機** - 從植物材料中提取種子, 支持Exotic Garden的水果, 但不支持精華.
- **物品戒指管理器** - 管理應用或去除物品戒指.
- **礦物花** - 將石頭與地獄石分別轉化成主世界和地獄的礦物
- **無線能量庫** - 儲存能源來無線傳輸, 用無線能量點
- **無線能量點** - 使用無線能量庫的能源傳輸無線能源
- **無線物品輸入** - 輸入單方向性無線傳輸物品
- **無線物品輸出** - 輸出單方向性無線傳輸物品
- **光學傳輸器** - 雙向物品與能源傳輸.
- **外部加熱器** - 從外部加熱類似熔爐的方塊.

## 發電機
- **水輪發電機** - 從流動的水中產生能量 (將水淹入發電機)
- **龍蛋發電機** - 從龍蛋的溫暖中產生能量. (將龍蛋放置在上方)
- **切屑發電機** - 從損壞或有耐久的物品中產生能量
- **烹飪發電機** - 從食物中產生能量, 支持Exotic Garden附加食物類別內的食物.
- **星塵反應爐** - 從星塵中產生能源, 非常多的能源

## 工具
- **野餐籃** - 它是升級版的冰箱. 可以吃任何ExoticGarden的自定義食物, 也可以只吃原版食物, 並且可以在items.yml內配置黑名單
- **電流刺激器** - 餵食玩家能源. 
- **背包過濾器** - 撿起物品後, 如果物品與背包過濾器中的過濾物品相同, 則該物品將會丟入虛空之中.
- **飛行寶石** - 永久性創造飛行, 有些速度調整設定.
- **勺子** - 獲得天然蜜蜂的唯一方法. 勺子它們成為物品形式.
- **維度之家** - 在另一個維度空間提供你一個家, 以往返其他地方. (如果你在維度中, 他將會發送你回去你的床重生點位置.)
- **光學綁定儀** - 以更好的方式綁定光學傳輸器, 並直接連結
- **隨身液體儲存罐** - 可容納16桶任何液體. 也可以把它們放回去

## 蜜蜂
- **蜜蜂** - 天然蜜蜂, 每一隻蜜蜂減少2秒鐘在材質蜂巢內的創建資源時間.
- **機械蜜蜂** - 由神奇魔法與廢料所製成的機械蜜蜂. 減少2秒鐘在材質蜂巢內生產資源的時間.
- **高級機械蜜蜂** - 機械蜜蜂的高級版本. 減少10秒鐘在材質蜂巢內生產資源的時間.

## 物品戒指
- **健康物品戒指** - 當應用於裝備或武器時, 穿戴或手持該物品可獲得四顆額外的心.
- **挖掘加速戒指** - 當應用在裝備或武器時, 穿戴或手持該物品將獲得等級二加速.

## 整合 
 - **惱鬼怪物資料卡** - 如果有安裝 InfinityExpansion (無限附加), 那麼你將會有惱鬼怪物資料卡, 來幫助你獲取幽靈精華與惱鬼寶石
 - **夜魅怪物資料卡** - 如果有安裝 InfinityExpansion (無限附加), 那麼你將會有夜魅怪物資料卡, 來幫助你生產夜魅皮膜

## Credits
 [NCBPFluffyBear](https://github.com/ncbpfluffybear) for their autocrafter code since it helped alot with the Auto-Kitchen.

 [Mooy1](https://github.com/mooy1) for their hydro generator code so I could figure out how to do waterlogging right.

 [Seggan](https://github.com/seggan) for showing me how to make a good container class instead of using Slimefun's default.

 [WalshyDev](https://github.com/WalshyDev) for answering my spam in the programming help channel.

 [Slimefun Discord](https://slimefun.dev/discord) for putting up with my outright spam of the programming help channel.

 [Slimefun](https://github.com/slimefun/slimefun4) for being incredibly intuitive to make an addon for and overall being generally helpful when needing examples.
