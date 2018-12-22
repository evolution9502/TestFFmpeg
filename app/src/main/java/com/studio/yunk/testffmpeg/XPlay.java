package com.studio.yunk.testffmpeg;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;

/**
 * Created by Administrator on 2018-02-05.
 */

public class XPlay extends GLSurfaceView implements Runnable,SurfaceHolder.Callback {
    String path=android.os.Environment.getExternalStorageDirectory().getPath()+"/Movies/007.mp4";
    String RTSP_Path = "rtsp://yun-chiao.tsai@qq.com:057830126@192.168.1.207/CH3";

    public XPlay(Context context, AttributeSet attrs) {
        super( context,attrs );
    }

    @Override
    public void run() {
        Open(path,getHolder().getSurface());
    }
    @Override
    public void surfaceCreated(SurfaceHolder var1){
        new Thread( this ).start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder var1, int var2, int var3, int var4){

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder var1){

    }
    public native void Open(String url,Object surface);
}
