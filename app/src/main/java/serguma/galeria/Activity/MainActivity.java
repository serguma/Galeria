package serguma.galeria.Activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import serguma.galeria.Adapter.PagerAdapter;
import serguma.galeria.Listener.EscuchaBoton;
import serguma.galeria.Modelo.Imagenes;
import serguma.galeria.R;

public class MainActivity extends AppCompatActivity {

    private PagerAdapter pagerAdapter;
    private ViewPager viewPager;
    private Imagenes lasImagenes = new Imagenes();
    private String[] megusta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.galeriavp);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), lasImagenes);
        megusta = new String[pagerAdapter.getCount()];

        viewPager.setAdapter(pagerAdapter);


        //asignamos las funciones a los botones
        ImageButton botonSi = (ImageButton) findViewById(R.id.bsi);
        ImageButton botonNo = (ImageButton) findViewById(R.id.bno);

        EscuchaBoton escuchaboton = new EscuchaBoton(this, megusta);

        botonSi.setOnClickListener(escuchaboton);
        botonNo.setOnClickListener(escuchaboton);

    }

    @Override
    public void onBackPressed() {

        if(viewPager.getCurrentItem() == 0){
            super.onBackPressed();
        }else{
            viewPager.setCurrentItem(viewPager.getCurrentItem()-1);
        }

    }


}
