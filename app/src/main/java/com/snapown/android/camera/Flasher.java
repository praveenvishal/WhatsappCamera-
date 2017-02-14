package com.snapown.android.camera;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class Flasher {

    private final static int DURATION_OFFSET = 300;
    private final static int DURATION_FADEIN = 0;
    private final static int DURATION_FADEOUT = 200;
    private Animation fadein;
    private Animation fadeout;
    private RelativeLayout flash;
    private RelativeLayout view;
    private int count;


    public Flasher(Context context, RelativeLayout rootView) {
        fadein = new AlphaAnimation(0, 1);
        fadein.setStartOffset(DURATION_OFFSET);
        fadein.setDuration(DURATION_FADEIN);
        fadein.setAnimationListener(new AnimationListener() {
            @Override public void onAnimationStart(Animation anim) {}
            @Override public void onAnimationRepeat(Animation anim) {}
            @Override public void onAnimationEnd(Animation anim) {
                flash.startAnimation(fadeout);
            }
        });
        fadeout = new AlphaAnimation(1, 0);
        fadeout.setDuration(DURATION_FADEOUT);
        fadeout.setAnimationListener(new AnimationListener() {
            @Override public void onAnimationStart(Animation anim) {}
            @Override public void onAnimationRepeat(Animation anim) {}
            @Override public void onAnimationEnd(Animation anim) {
                if(count > 1) {
                    flash(count - 1);
                } else {
                    cancel();
                }
            }
        });
        LayoutParams params = new LayoutParams(-1, -1);
        flash = new RelativeLayout(context);
        flash.setLayoutParams(params);
        flash.setBackgroundColor(0x90ffffff);
        flash.setVisibility(View.INVISIBLE);
        view = new RelativeLayout(context);
        view.setLayoutParams(params);
        view.addView(flash);
        rootView.addView(view);
    }


    public final void flash(int count) {
        this.count = count;
        flash.startAnimation(fadein);
    }


    public final void cancel() {
    }


}