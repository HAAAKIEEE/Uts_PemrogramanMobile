package id.ac.polihasnur.ti.haqi.utsbaihaqi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void hitungbalok(View view){
        Intent balok = new Intent(MainActivity.this,HitungBalok.class);
        startActivity(balok);
    }
    public void belanja(View view){
        Intent balok = new Intent(MainActivity.this,HitungDiskon.class);
        startActivity(balok);
    }
}