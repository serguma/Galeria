package serguma.galeria.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import serguma.galeria.Adapter.AdapterResultado;
import serguma.galeria.Listener.EscuchaMenu;
import serguma.galeria.R;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //Recojo el array

        Intent intent = getIntent();
        String[] megusta = intent.getStringArrayExtra("megusta");

        //asigno el adpter

        AdapterResultado adapterResultado = new AdapterResultado(this,R.layout.fila, megusta);
        ListView resultados = (ListView) findViewById(R.id.listaresultado);

        resultados.setAdapter(adapterResultado);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflo el menu
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Con escuchamenu ejecuto las acciones de los item del menú
        EscuchaMenu escuchaMenu = new EscuchaMenu(this);
        item.setOnMenuItemClickListener(escuchaMenu);
        return true;
    }
}
