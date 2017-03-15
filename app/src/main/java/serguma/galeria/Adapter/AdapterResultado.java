package serguma.galeria.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import serguma.galeria.Modelo.Imagenes;
import serguma.galeria.R;

/**
 * Created by sergu on 14/03/2017.
 */

public class AdapterResultado extends ArrayAdapter<Imagenes> {

    private Context ctx;
    private Imagenes imagenes = new Imagenes();
    private String [] megusta = new String[imagenes.tamImagen()];

    public AdapterResultado(@NonNull Context ctx, @LayoutRes int resource, String[] megusta) {
        super(ctx, resource);
        this.ctx = ctx;
        this.megusta = megusta;
    }

    @Override
    public int getCount() {
        return imagenes.tamImagen();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        if(convertView == null){

            Activity activity = (Activity) ctx;
            LayoutInflater lista = activity.getLayoutInflater();
            view = lista.inflate(R.layout.fila, parent, false);

        }else{
            view = convertView;
        }

        //seteo valores

        ImageView imagen = (ImageView) view.findViewById(R.id.imagen);
        TextView resultado = (TextView) view.findViewById(R.id.texto);

        imagen.setImageResource(imagenes.getImagen(position));
        resultado.setText(megusta[position]);

        return view;
    }
}
