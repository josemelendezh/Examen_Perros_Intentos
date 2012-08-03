package jose.app;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class IntentosJoseActivity extends Activity {
    /** Called when the activity is first created. */
	Button btnEnviar;
	EditText edit_label;
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btnEnviar = (Button)findViewById(R.id.btn_enviar);
        
        edit_label = (EditText)findViewById(R.id.edit_label);
        
        
        btnEnviar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				cambiarPantalla();
				
			}
		});

        
    }

	public void cambiarPantalla()
	{
		Intent i = new Intent(this, pantalla2.class);
		i.putExtra("id", edit_label.getText().toString());
		startActivity(i);
	}
}