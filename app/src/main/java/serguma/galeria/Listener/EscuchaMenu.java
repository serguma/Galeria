package serguma.galeria.Listener;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import serguma.galeria.Activity.MainActivity;
import serguma.galeria.R;

/**
 * Created by sergu on 14/03/2017.
 */

public class EscuchaMenu implements MenuItem.OnMenuItemClickListener {

    private Context ctx;

    public EscuchaMenu(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.reinicia:
                Intent inicio = new Intent(ctx, MainActivity.class);
                ctx.startActivity(inicio);
                break;
        }
        return false;
    }
}
