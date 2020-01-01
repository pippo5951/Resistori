package giubotta.gbsoft.resistori;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    Intent it;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   it = new Intent(MainActivity.this, TabelleActivity.class);
                    startActivity( it );
                    return true;

                case R.id.navigation_calcola:
                    it = new Intent(MainActivity.this, CalcolaActivity.class);
                    startActivity( it );
                    return true;

                case R.id.navigation_conoscenza:
                    it = new Intent(MainActivity.this, ScrollingActivity.class);
                    startActivity( it );
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        mTextMessage = (TextView) findViewById( R.id.message );
        BottomNavigationView navigation = (BottomNavigationView) findViewById( R.id.navigation );
        navigation.setOnNavigationItemSelectedListener( mOnNavigationItemSelectedListener );
    }


}
