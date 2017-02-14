package com.snapown.android.jobqueue;

import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

/**
 * Created by smritibharti on 10/02/17.
 */

public class PreviewPhotoJob extends Job
{
    public PreviewPhotoJob(JobParameters parameters)
    {
        super(JobParameters.newBuilder().create());
    }

    @Override
    public void onAdded()
    {

    }

    @Override
    public void onRun() throws Exception
    {

    }

    @Override
    public boolean onShouldRetry(Exception e)
    {
        return false;
    }

    @Override
    public void onCanceled()
    {

    }
}
