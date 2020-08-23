# Osu Sync
Osu玩家更換電腦時，或是有兩台以上電腦需要經常切換，可以利用此程式同步歌曲。

Osu players who change computer or have two computers switching frequently can use Osu Sync to sync your songs.
## 緣起
想方便更新osu歌曲資料，順便練習設計模式。
## 使用方式(Usage)
**注意:** 執行osu_sync.jar需要**jdk 14.02**

**NOTICE:** You need **jdk 14.02** to execute osu_sync.jar

情境:同步A電腦的歌曲至B電腦。

Scenario: sync the songs in Computer A to Computer B

1. 
    於B電腦用[OsuSync功能](#OsuSync)匯出OsuSync檔案，此動作確保 於A電腦時不會重複複製B電腦已經有的檔案。

    Use [OsuSync](#OsuSync) at Computer B to export OsuSync File. This ensures that Computer A won't copy the songs that Computer B already has.
2. 
    於A電腦用[匯出功能](#匯出)，指定上述OsuSync檔案，並指定歌曲來源資料夾以及欲輸出資料夾位置。
    
    歌曲來源預設為:
    **C:\Users\\{username}\AppData\Local\osu!\Songs**

    Use [Export](#匯出) at Computer A. You need specify the path of the above-mentioned OsuSync File, and specify the path of source, destination directory of your osu songs. 
    
    The default song source directory is: 
    **C:\Users\\{username}\AppData\Local\osu!\Songs**
3. 
    於B電腦用[匯入功能](#匯入)，指定歌曲來源資料夾以及歌曲欲輸出資料夾位置。

    歌曲輸入預設為:
    **C:\Users\\{username}\AppData\Local\osu!\Songs**

    Use [Import](#匯入) at Computer B. Specify the path of source and destination of your osu songs.

    The default song destination is:
    **C:\Users\\{username}\AppData\Local\osu!\Songs**
## 功能
### OsuSync
匯出OsuSync檔案至指定的資料夾。
### 匯出
需要一個**目的地電腦**的.osusync檔，去除該檔中已有的歌曲，匯出剩下歌曲。若無該檔案則匯出所有的歌曲。
### 匯入
將歌曲匯入至指定資料夾。