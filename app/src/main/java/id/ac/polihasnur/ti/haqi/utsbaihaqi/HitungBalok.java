package id.ac.polihasnur.ti.haqi.utsbaihaqi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HitungBalok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_balok);

    }
    public void hitung(View view){
        EditText panjang = findViewById(R.id.nin1);
        EditText lebar = findViewById(R.id.nin2);
        EditText tinggi = findViewById(R.id.nin3);
        TextView HasilLuas = findViewById(R.id.Luas);
        TextView Volume = findViewById(R.id.Volume);
        int p = Integer.parseInt(panjang.getText().toString()) ;
        int l = Integer.parseInt(lebar.getText().toString()) ;
        int t = Integer.parseInt(tinggi.getText().toString()) ;
        int luas = 2 * ((p * l) + (p * t) + (l * t));
        HasilLuas.setText("Luas Permukaan : "+ String.valueOf(luas));
        int volume = p*l*t;
        Volume.setText("Volume : "+ String.valueOf(volume));
    }
    public void Resetbalok(View view){
        EditText panjang = findViewById(R.id.nin1);
        EditText lebar = findViewById(R.id.nin2);
        EditText tinggi = findViewById(R.id.nin3);
        TextView HasilLuas = findViewById(R.id.Luas);
        TextView Volume = findViewById(R.id.Volume);

        panjang.setText(""); lebar.setText(""); tinggi.setText(""); HasilLuas.setText("Luas Permukaan : ");
        Volume.setText("Volume : ");
    }

}