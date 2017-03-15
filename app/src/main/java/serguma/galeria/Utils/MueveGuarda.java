package serguma.galeria.Utils;

import android.content.Context;
import android.support.v4.view.ViewPager;

/**
 * Created by sergu on 14/03/2017.
 */

public class MueveGuarda {

    public Context ctx;

    public MueveGuarda(Context ctx) {
        this.ctx = ctx;
    }

    public static void mueve(ViewPager viewPager){
        //me muevo por los fragment
        viewPager.setCurrentItem(viewPager.getCurrentItem()+1, true);
    }

}
