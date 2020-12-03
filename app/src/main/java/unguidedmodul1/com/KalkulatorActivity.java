package unguidedmodul1.com;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class KalkulatorActivity extends AppCompatActivity {

    private Button tambah, kurang, kali, bagi;
    private TextView hasil;
    private TextInputEditText input1, input2;
    private Float angka1, angka2, hasilku;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);

        hasil = (TextView) findViewById(R.id.hasil);

        input1 = (TextInputEditText) findViewById(R.id.inputan1);
        input2 = (TextInputEditText) findViewById(R.id.inputan2);

        proses();
    }

    private void proses(){
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Float.valueOf(input1.getText().toString());
                angka2 = Float.valueOf(input2.getText().toString());
                hasilku = angka1 + angka2;
                hasil.setText(hasilku.toString());
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Float.valueOf(input1.getText().toString());
                angka2 = Float.valueOf(input2.getText().toString());
                hasilku = angka1 - angka2;
                hasil.setText(hasilku.toString());
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Float.valueOf(input1.getText().toString());
                angka2 = Float.valueOf(input2.getText().toString());
                hasilku = angka1 * angka2;
                hasil.setText(hasilku.toString());
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Float.valueOf(input1.getText().toString());
                angka2 = Float.valueOf(input2.getText().toString());
                hasilku = angka1/angka2;
                hasil.setText(hasilku.toString());
            }
        });
    }

    public void backTo(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}