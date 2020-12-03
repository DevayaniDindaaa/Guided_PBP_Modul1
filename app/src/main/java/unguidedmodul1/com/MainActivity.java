package unguidedmodul1.com;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        String message = "";
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int rbc = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(rbc);
        message = radioButton.getText().toString();

        if(message.equalsIgnoreCase("Profil")){
            Intent intent = new Intent(this, ProfilActivity.class);
            startActivity(intent);
        }
        else if(message.equalsIgnoreCase("Kalkulator")) {
            Intent intent = new Intent(this, KalkulatorActivity.class);
            startActivity(intent);
        }
    }
}