package com.example.administrator.broadcasttest;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.WindowManager;

/**
 * Created by Administrator on 2016/7/28.
 */
public class BroadcastReceive extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {

        AlertDialog.Builder  dialog = new AlertDialog.Builder(context);
        dialog.setTitle("Warning");
        dialog.setMessage("Please try to login again ");
        dialog.setCancelable(false);
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ActivityCollector.finishAll();
                Intent intent1 = new Intent(context,MainActivity.class);
                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);
            }
        });

        AlertDialog  alertDialog = dialog.create();
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alertDialog.show();


    }
}
