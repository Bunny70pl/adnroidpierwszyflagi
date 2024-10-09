package pl.zabrze.zs10.flagi3a;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int licznik = 0;
    private int liczbaPomylek = 0;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tekst);
    }

    public void zlaOdpowiedz(View view) {
        Toast.makeText(this, "Ten kolor jest we fladze polski", Toast.LENGTH_SHORT).show();
        liczbaPomylek++;
    }

    public void dobraOdpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if(licznik == 4){
            textView.setText("To jest flaga Polski\n Pomyliłeś/aś się: " + liczbaPomylek+ " razy");
        }
    }
}