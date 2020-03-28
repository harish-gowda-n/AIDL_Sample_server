package com.example.aidl_sample_server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import androidx.annotation.Nullable;

public class CalcService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return inner;
    }

    Inner inner = new Inner();

    class Inner extends Calculator.Stub{

        @Override
        public int add(int a, int b) throws RemoteException {
            return a + b;
        }

        @Override
        public int sub(int a, int b) throws RemoteException {
            return a - b;
        }

        @Override
        public int mul(int a, int b) throws RemoteException {
            return a * b;
        }

        @Override
        public int div(int a, int b) throws RemoteException {
            return a / b;
        }
    }
}
