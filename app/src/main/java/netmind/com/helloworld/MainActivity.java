package netmind.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.ActivityUnitTestCase;
import android.util.Log;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("", this.getResources().getString(R.string.app_name));

        this.setResult(Activity.RESULT_OK);
        this.finish(); //Acabo



    }
}
