package smartmenu.mms.api.request;

import android.content.Context;
import android.support.design.widget.Snackbar;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public interface Request {

    public Context getContext();

    public String getUrl();

    public void sendRequest();

}
