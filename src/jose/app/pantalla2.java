package jose.app;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class pantalla2 extends Activity {
	TextView textoLargo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Bundle b = getIntent().getExtras();
		
		
			setContentView(R.layout.pantalla_2);
		
		
		textoLargo = (TextView) findViewById(R.id.text_label);
		
		textoLargo.append(b.getString("id"));
		
		Log.e("mensaje","entro al cambio de pantalla");
		
	}

}