package com.snapown.android.camera;

/**
 * Created by smritibharti on 09/02/17.
 */

public interface CameraInterface
{

    void onCaptureButtonClicked();
    void onCaptureButtonTouched();
    void onFlashButtonClicked();
    void onCameraFlipButtonClicked(int currentCameraId);
    void makeFlashAnimation();

}
