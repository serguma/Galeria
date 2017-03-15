package serguma.galeria.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import serguma.galeria.R;


/**
 * Created by sergu on 12/03/2017.
 */

public class FragmentImg extends Fragment {

    private Integer itemData;
    private ImageView imagen;

    public FragmentImg(int imagen) {
        this.itemData = imagen;
    }

    public static FragmentImg crea(int position) {
        FragmentImg fragment = new FragmentImg(position);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Creo un view para acceder a los objetos que contiene

         View view = inflater.inflate(R.layout.fragment_img, container, false);

        //Todas la imágenes deben tener el mismo tamaño, sino se desborda la memoria ¿?
        //TODO (ver bitmap para controlar el tamaño y setearlo al ImageView)

        imagen = (ImageView) view.findViewById(R.id.laimagen);
        imagen.setImageResource(itemData);

        return view;

    }



}
