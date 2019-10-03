package br.com.etecia.app_notas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.m_cadastrar:
                //abrindo janela
                startActivity(new Intent(getApplicationContext(), cadastrar_activity.class));

                break;

            case R.id.delete:
                Toast.makeText(getApplicationContext(),"Cliquei no deletar", Toast.LENGTH_SHORT).show();

                break;

            case R.id.save:
                Toast.makeText(getApplicationContext(),"Cliquei no salvar", Toast.LENGTH_SHORT).show();

                break;
            case R.id.search:
                Toast.makeText(getApplicationContext(), "Cliquei no pesquisar", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}



