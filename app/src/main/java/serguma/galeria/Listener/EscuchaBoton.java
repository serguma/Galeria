package serguma.galeria.Listener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import serguma.galeria.Utils.MueveGuarda;
import serguma.galeria.R;
import serguma.galeria.Activity.Resultado;


/**
 * Created by sergu on 14/03/2017.
 */

public class EscuchaBoton implements View.OnClickListener {

    private Context ctx;
    private String[] megusta;

    public EscuchaBoton(Context ctx, String[] megusta ) {
        this.ctx = ctx;
        this.megusta = megusta;
    }

    @Override
    public void onClick(View v) {

        Activity activity = (Activity) ctx;
        ViewPager viewPager = (ViewPager) activity.findViewById(R.id.galeriavp);
        int id = viewPager.getCurrentItem(); //este es el mismo indice que para las imágenes


        switch (v.getId()) {

            case R.id.bsi:
                Log.d(getClass().getCanonicalName(), "He pulsado el botón si " );
                megusta[id] = "Sí";
                break;

            case R.id.bno:
                Log.d(getClass().getCanonicalName(), "He pulsado el botón no " );
                megusta[id] = "No";
                break;

        }

        if(id == megusta.length -1 ){
            Intent intent = new Intent(ctx, Resultado.class);
            intent.putExtra("megusta", megusta);
            activity.startActivity(intent);
        }

        MueveGuarda.mueve(viewPager);
    }
}
