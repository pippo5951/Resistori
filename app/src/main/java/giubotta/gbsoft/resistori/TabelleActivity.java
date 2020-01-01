package giubotta.gbsoft.resistori;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TabelleActivity extends AppCompatActivity {

    Button btnTab1,btnTab2,btnTab3;
     LinearLayout sfondo_tabella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tabelle );

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        btnTab1 = (Button)findViewById( R.id.btnTab1 );
        btnTab2 = (Button)findViewById( R.id.btnTab2 );
        btnTab3 = (Button)findViewById( R.id.btnTab3 );

        btnTab1.setText( "4 Anelli Colorati" );
        btnTab2.setText( "5 Anelli Colorati" );
        btnTab3.setText( "6 Anelli Colorati" );


        sfondo_tabella = (LinearLayout)findViewById( R.id.sfondo_tabella );

        FloatingActionButton fab = (FloatingActionButton) findViewById( R.id.fab );
        fab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(TabelleActivity.this, MainActivity.class);
                startActivity( it );
            }
        } );

        btnTab1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               nascondiBtn();
                sfondo_tabella.setBackground(getResources().getDrawable(R.drawable.anelli_4));
            }
        } );

        btnTab2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nascondiBtn();
                sfondo_tabella.setBackground(getResources().getDrawable(R.drawable.anelli_5));
            }
        } );

        btnTab3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nascondiBtn();
                sfondo_tabella.setBackground(getResources().getDrawable(R.drawable.anelli_6));
            }
        } );
    }
    private void  nascondiBtn(){
        btnTab1.setVisibility(View.GONE);
        btnTab2.setVisibility(View.GONE);
        btnTab3.setVisibility(View.GONE);
    }
}
