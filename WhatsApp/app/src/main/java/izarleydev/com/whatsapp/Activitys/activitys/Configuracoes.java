package izarleydev.com.whatsapp.Activitys.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import izarleydev.com.whatsapp.R;

public class Configuracoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Configurações");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}