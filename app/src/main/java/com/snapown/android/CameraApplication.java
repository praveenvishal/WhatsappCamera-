package com.snapown.android;

import android.app.Application;

import org.whispersystems.jobqueue.JobManager;

/**
 * Created by Praveen Vishal on 10/02/17.
 */

public class CameraApplication extends Application
{
    private JobManager jobManager;

    @Override
    public void onCreate() {
        initializeJobManager();
    }

    private void initializeJobManager() {
        this.jobManager = JobManager.newBuilder(this)
                .withName("CameraJobManager")
                .withConsumerThreads(5)
                .build();
    }







}
