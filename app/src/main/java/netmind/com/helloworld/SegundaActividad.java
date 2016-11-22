package netmind.com.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class SegundaActividad extends Activity {

    public static final String TAG = SegundaActividad.class.getSimpleName();
    public static final int PICK_CONTACT_REQUEST = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate --> Cuando se crea
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        Intent myIntent = new Intent(this, MainActivity.class);//Mensaje para activar un componente (quien lo lanza, qué lanza)

        //Button mButton = (Button) findViewById(R.id.button);
        Log.e(SegundaActividad.TAG, savedInstanceState == null ? "Es null" : "Not null"); //If
        Log.e(SegundaActividad.TAG, "onCreate()");
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();
        //startActivity(myIntent);//Método para lanzar actividad
        startActivityForResult(myIntent, 0);
        }

    @Override
    protected void onStart() { //onStart --> Cuando empieza
        super.onStart();
        Log.e(SegundaActividad.TAG, "onStart()");
        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() { //onStart --> Cuando empieza
        super.onResume();
        Log.e(SegundaActividad.TAG, "onResume()");
        Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(SegundaActividad.TAG, "onPause()");
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(SegundaActividad.TAG, "onStop()");
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(SegundaActividad.TAG, "onDestroy()");
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(SegundaActividad.TAG, "onSaveInstanceState()");
        Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        outState.putString("myString", "Hello World");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode == PICK_CONTACT_REQUEST){
//            if(requestCode == RESULT_OK){
//
//            }
//        }
        Toast.makeText(this, "Todo controlado, resultado devuelto", Toast.LENGTH_SHORT).show();
    }
}

