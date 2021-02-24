# Dyna科技
我製作一套物品和機器, 使這些東西更加簡單與有趣.
其中大多數可能過於強大或過於不足.

此為**非官方**版本, 請勿在該作者的問題追蹤內回報!
[原專案連結](https://github.com/ProfElements/DynaTech)

## 機器
- **自動廚房** - 如果你安裝了ExoticGarden, 此機器將可使用. 它會自動製作任何設定在內的配方.
- **生長倉** - 自動生長一些植物, 包括樹苗, 仙人掌, 甘蔗和竹子, 支持Exotic Garden附加的樹苗,植物和灌木樹.
- **反重力泡泡** - 通電後, 在45格範圍內暫時的創造飛行.
- **天氣控制器** - 給予關鍵物品來控制天氣 (向日葵 > 晴朗, 紫丁香 > 降雨, 苦力怕頭顱 > 雷雨).
- **藥水灑水器** - 範圍性藥水裝置, 藥水基本上具有耐久度.
- **鐵絲網** - 範圍內推開怪物
- **材質蜂巢** - 一個無限資源產生機, 需要蜜蜂與一個物品輸出堆. 支持的材料在 [這裡](https://github.com/ProfElements/DynaTech/blob/1b6aee96937da31c7bdb84df284392530149ce63/src/main/java/me/profelements/dynatech/items/electric/MaterialHive.java#L169). 對於材質蜂巢, 你投入的每隻蜜蜂都會減少生產材料的時間, 因此128隻蜜蜂會比1隻蜜蜂更好. 請注意, 每種蜜蜂類型的秒數都不同. 檢查蜜蜂部分來獲取更多訊息.
- **無線充電器** - 在16格方塊半徑範圍內充玩家背包內可充電的物品
- **種子採摘機** - 從植物材料中提取種子, 支持Exotic Garden的水果, 但不支持精華.
- **物品戒指管理器** - 管理應用或去除物品戒指.

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

## 蜜蜂
- **蜜蜂** - 天然蜜蜂, 每一隻蜜蜂減少2秒鐘在材質蜂巢內的創建資源時間.
- **機械蜜蜂** - 由神奇魔法與廢料所製成的機械蜜蜂. 減少2秒鐘在材質蜂巢內生產資源的時間.
- **高級機械蜜蜂** - 機械蜜蜂的高級版本. 減少10秒鐘在材質蜂巢內生產資源的時間.

## 物品戒指
- **健康物品戒指** - 當應用於裝備或武器時, 穿戴或手持該物品可獲得4顆額外的心.

## Credits
 [NCBPFluffyBear](https://github.com/ncbpfluffybear) for their autocrafter code since it helped alot with the Auto-Kitchen.

 [Mooy1](https://github.com/mooy1) for their hydro generator code so I could figure out how to do waterlogging right.

 [Seggan](https://github.com/seggan) for showing me how to make a good container class instead of using Slimefun's default.

 [WalshyDev](https://github.com/WalshyDev) for answering my spam in the programming help channel.

 [Slimefun Discord](https://slimefun.dev/discord) for putting up with my outright spam of the programming help channel.

 [Slimefun](https://github.com/slimefun/slimefun4) for being incredibly intuitive to make an addon for and overall being generally helpful when needing examples.
