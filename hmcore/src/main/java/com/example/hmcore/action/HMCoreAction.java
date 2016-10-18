package com.example.hmcore.action;

import android.app.Application;
import android.content.Context;

/**
 * Created by gxm on 16/10/18.
 * des  核心包操作入口
 */

public class HMCoreAction {

    private Context mcontext;

    public void initHMCore(Application mapplication){
        mcontext = mapplication;
    }

}
