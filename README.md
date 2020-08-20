# Osu Sync
osu玩家更換電腦時，或是有兩台以上電腦需要經常切換，可以利用此程式同步歌曲。
## 緣起
想方便更新osu歌曲資料，順便練習一下設計模式
## 功能
### 初始化
產生 **.{電腦名稱}.osusync** 檔案，儲存歌曲資料。
### 更新
產生 **.{電腦名稱}.osusync** 檔案內的歌曲資料。
### 查看.osusync
查看目前已經同步哪些歌曲
### 匯出
需要一個**目的地電腦**的.osusync檔，去除該檔中已有的歌曲，匯出剩下歌曲。若無該檔案則匯出所有的歌曲。
### 匯入
將歌曲匯入，並更新本地的.osusync檔。
## 功能規劃
* **.{電腦名稱}.osusync**: 儲存該電腦有哪些歌曲，不需要複製。(初始化後放在osu資料夾中)。可以匯出到其他電腦使用。

* 匯出.osusync檔，拿到其他電腦使用。

* 選擇OSU歌曲資料夾路徑(可以先預設某個路徑，如果找不到再手動指定?)
    * 路徑格式:  C:\Users\{username}\AppData\Local\osu!\Songs
    * 路徑範例:  C:\Users\FlyotLin\AppData\Local\osu!\Songs

* 選擇將歌曲匯出到哪個路徑


