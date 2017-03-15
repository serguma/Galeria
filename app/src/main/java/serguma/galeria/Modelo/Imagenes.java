package serguma.galeria.Modelo;

import java.util.ArrayList;

import serguma.galeria.R;

/**
 * Created by sergu on 14/03/2017.
 */

public class Imagenes {

    private ArrayList<Integer> imagenId;

    public Imagenes(){
        imagenId = new ArrayList<Integer>();
        imagenId.add(R.drawable.f01);
        imagenId.add(R.drawable.f02);
        imagenId.add(R.drawable.f03);
        imagenId.add(R.drawable.f04);
        imagenId.add(R.drawable.f05);
        imagenId.add(R.drawable.f06);
        imagenId.add(R.drawable.f07);
        imagenId.add(R.drawable.f08);
        imagenId.add(R.drawable.f09);
        imagenId.add(R.drawable.f10);

    }

    public int tamImagen() {
        return imagenId.size();
    }

    public int getImagen(int position){
        return imagenId.get(position);
    }

    public ArrayList<Integer> getImagenes() {
        return imagenId;
    }
}
