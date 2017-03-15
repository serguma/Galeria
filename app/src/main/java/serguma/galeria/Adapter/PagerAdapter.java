package serguma.galeria.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import serguma.galeria.Fragment.FragmentImg;
import serguma.galeria.Modelo.Imagenes;

/**
 * Created by sergu on 12/03/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    //lista de imágenes
    private Imagenes lasImagenes;

    public PagerAdapter(FragmentManager fm, Imagenes lasImagenes) {
        super(fm);
        this.lasImagenes = lasImagenes;
    }

    @Override
    public Fragment getItem(int position) {
        FragmentImg fragmentImg = FragmentImg.crea(lasImagenes.getImagen(position));
        return fragmentImg;

    }

    @Override
    public int getCount() {
        return lasImagenes.tamImagen();
    }


}
