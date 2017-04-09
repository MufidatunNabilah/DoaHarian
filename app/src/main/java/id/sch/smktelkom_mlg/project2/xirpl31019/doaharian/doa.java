package id.sch.smktelkom_mlg.project2.xirpl31019.doaharian;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Hyung on 4/6/2017.
 */

public class doa extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awal);

        View gambar = findViewById(R.id.gambar);
        gambar.setOnClickListener(this);

    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.gambar:
                Intent menu = new Intent (this, menu.class);
                startActivity(menu);
                break;
        }
    }
}
