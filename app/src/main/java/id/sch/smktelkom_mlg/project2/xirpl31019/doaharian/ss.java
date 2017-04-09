package id.sch.smktelkom_mlg.project2.xirpl31019.doaharian;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Hyung on 4/8/2017.
 */

public class ss extends AppCompatActivity {
    private static int splashInterval = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.ss);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(ss.this, menu.class);
                startActivity(i);
                this.finish();
            }
            private void finish() {
            }
        }, splashInterval);
    };
}

