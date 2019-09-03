package com.example.wuziqi_module.ai;

/**
 * 游戏相关回调
 */

public interface GameCallBack {
    //游戏结束回调
    void GameOver(int winner);
    //游戏更换执子回调
    void ChangeGamer(boolean isWhite);
}
