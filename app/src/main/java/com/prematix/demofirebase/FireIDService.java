package com.prematix.demofirebase;

import android.util.Log;

import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;


public class FireIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        Task<InstanceIdResult> tkn = FirebaseInstanceId.getInstance().getInstanceId();
        Log.d("Not","Token ["+tkn+"]");
    }
}