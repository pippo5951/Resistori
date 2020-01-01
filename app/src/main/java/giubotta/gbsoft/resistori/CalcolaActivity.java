package giubotta.gbsoft.resistori;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class CalcolaActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1_0,btn_1_1,btn_1_2,btn_1_3,btn_1_4,btn_1_5,btn_1_6,btn_1_7,btn_1_8,btn_1_9;
    Button btn_2_0,btn_2_1,btn_2_2,btn_2_3,btn_2_4,btn_2_5,btn_2_6,btn_2_7,btn_2_8,btn_2_9;
    Button btn_3_0,btn_3_1,btn_3_2,btn_3_3,btn_3_4,btn_3_5,btn_3_6,btn_3_7,btn_3_8,btn_3_9;
    Button btn_per_0,btn_per_1,btn_per_2,btn_per_3,btn_per_4,btn_per_5,btn_per_6,btn_per_7,btn_per_8,btn_per_9;
    Button btn_toll_0,btn_toll_1, btn_toll_2, btn_toll_3,btn_toll_4,btn_toll_5,btn_toll_6,btn_toll_7,btn_toll_8,btn_toll_9;
    Button btnAnello1,btnAnello2,btnAnello3,btnAnello4,btn_reset;
    Button btn_tolleranza,btn_calcola,btn_5_anelli;
    TextView tv_valore,tv_moltiplicatore,tv_3cifra,tv_spia;
    String val1="",val2="",val3="",zer="";
    Double temp=0.0;
     int moltiplica;
    String result="", tolleranza="",Homs="homs",zeri="",valore="",diviso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_calcola );


        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        tv_spia=(TextView)findViewById( R.id.tv_spia );
        tv_3cifra=(TextView)findViewById( R.id.tv_3cifra );
        tv_valore=(TextView)findViewById( R.id.tv_valore );
        tv_moltiplicatore=(TextView)findViewById( R.id.tv_moltiplicatore );
        btn_calcola=(Button)findViewById( R.id.btn_calcola );
        btn_reset=(Button)findViewById( R.id.btn_reset );
        btn_5_anelli=(Button)findViewById( R.id.btn_5_anelli );

        btn_1_0 = (Button) findViewById(R.id.btn_1_0);
        btn_1_1 = (Button) findViewById(R.id.btn_1_1);
        btn_1_2 = (Button) findViewById(R.id.btn_1_2);
        btn_1_3 = (Button) findViewById(R.id.btn_1_3);
        btn_1_4 = (Button) findViewById(R.id.btn_1_4);
        btn_1_5 = (Button) findViewById(R.id.btn_1_5);
        btn_1_6 = (Button) findViewById(R.id.btn_1_6);
        btn_1_7 = (Button) findViewById(R.id.btn_1_7);
        btn_1_8 = (Button) findViewById(R.id.btn_1_8);
        btn_1_9 = (Button) findViewById(R.id.btn_1_9);

        btn_2_0 = (Button) findViewById(R.id.btn_2_0);
        btn_2_1 = (Button) findViewById(R.id.btn_2_1);
        btn_2_2 = (Button) findViewById(R.id.btn_2_2);
        btn_2_3 = (Button) findViewById(R.id.btn_2_3);
        btn_2_4 = (Button) findViewById(R.id.btn_2_4);
        btn_2_5 = (Button) findViewById(R.id.btn_2_5);
        btn_2_6 = (Button) findViewById(R.id.btn_2_6);
        btn_2_7 = (Button) findViewById(R.id.btn_2_7);
        btn_2_8 = (Button) findViewById(R.id.btn_2_8);
        btn_2_9 = (Button) findViewById(R.id.btn_2_9);

        btn_3_0 = (Button) findViewById(R.id.btn_3_0);
        btn_3_1 = (Button) findViewById(R.id.btn_3_1);
        btn_3_2 = (Button) findViewById(R.id.btn_3_2);
        btn_3_3 = (Button) findViewById(R.id.btn_3_3);
        btn_3_4 = (Button) findViewById(R.id.btn_3_4);
        btn_3_5 = (Button) findViewById(R.id.btn_3_5);
        btn_3_6 = (Button) findViewById(R.id.btn_3_6);
        btn_3_7 = (Button) findViewById(R.id.btn_3_7);
        btn_3_8 = (Button) findViewById(R.id.btn_3_8);
        btn_3_9 = (Button) findViewById(R.id.btn_3_9);

        btn_per_0= (Button) findViewById( R.id.btn_per_0 );
        btn_per_1= (Button) findViewById( R.id.btn_per_1 );
        btn_per_2= (Button) findViewById( R.id.btn_per_2 );
        btn_per_3= (Button) findViewById( R.id.btn_per_3 );
        btn_per_4= (Button) findViewById( R.id.btn_per_4 );
        btn_per_5= (Button) findViewById( R.id.btn_per_5 );
        btn_per_6= (Button) findViewById( R.id.btn_per_6 );
        btn_per_7= (Button) findViewById( R.id.btn_per_7 );
        btn_per_8= (Button) findViewById( R.id.btn_per_8 );
        btn_per_9= (Button) findViewById( R.id.btn_per_9 );

        btn_toll_0= (Button) findViewById( R.id.btn_toll_0 );
        btn_toll_1= (Button) findViewById( R.id.btn_toll_1 );
        btn_toll_2= (Button) findViewById( R.id.btn_toll_2 );
        btn_toll_3= (Button) findViewById( R.id.btn_toll_3 );
        btn_toll_4= (Button) findViewById( R.id.btn_toll_4 );
        btn_toll_5= (Button) findViewById( R.id.btn_toll_5 );
        btn_toll_6= (Button) findViewById( R.id.btn_toll_6 );
        btn_toll_7= (Button) findViewById( R.id.btn_toll_7 );
        btn_toll_8= (Button) findViewById( R.id.btn_toll_8 );
        btn_toll_9= (Button) findViewById( R.id.btn_toll_9 );

        btnAnello1= (Button) findViewById( R.id.btnAnello1 );
        btnAnello2= (Button) findViewById( R.id.btnAnello2 );
        btnAnello3= (Button) findViewById( R.id.btnAnello3 );
        btnAnello4= (Button) findViewById( R.id.btnAnello4 );

        nascondiTerzoAnello();

        btn_tolleranza= (Button) findViewById( R.id.btn_tolleranza );

        //delegate
        btn_1_0.setOnClickListener(this);
        btn_1_1.setOnClickListener(this);
        btn_1_2.setOnClickListener(this);
        btn_1_3.setOnClickListener(this);
        btn_1_4.setOnClickListener(this);
        btn_1_5.setOnClickListener(this);
        btn_1_6.setOnClickListener(this);
        btn_1_7.setOnClickListener(this);
        btn_1_8.setOnClickListener(this);
        btn_1_9.setOnClickListener(this);

        btn_2_0.setOnClickListener(this);
        btn_2_1.setOnClickListener(this);
        btn_2_2.setOnClickListener(this);
        btn_2_3.setOnClickListener(this);
        btn_2_4.setOnClickListener(this);
        btn_2_5.setOnClickListener(this);
        btn_2_6.setOnClickListener(this);
        btn_2_7.setOnClickListener(this);
        btn_2_8.setOnClickListener(this);
        btn_2_9.setOnClickListener(this);

        btn_3_0.setOnClickListener(this);
        btn_3_1.setOnClickListener(this);
        btn_3_2.setOnClickListener(this);
        btn_3_3.setOnClickListener(this);
        btn_3_4.setOnClickListener(this);
        btn_3_5.setOnClickListener(this);
        btn_3_6.setOnClickListener(this);
        btn_3_7.setOnClickListener(this);
        btn_3_8.setOnClickListener(this);
        btn_3_9.setOnClickListener(this);

        btn_per_0.setOnClickListener(this);
        btn_per_1.setOnClickListener(this);
        btn_per_2.setOnClickListener(this);
        btn_per_3.setOnClickListener(this);
        btn_per_4.setOnClickListener(this);
        btn_per_5.setOnClickListener(this);
        btn_per_6.setOnClickListener(this);
        btn_per_7.setOnClickListener(this);
        btn_per_8.setOnClickListener(this);
        btn_per_9.setOnClickListener(this);

        btn_toll_1.setOnClickListener(this);
        btn_toll_2.setOnClickListener(this);
        btn_toll_3.setOnClickListener(this);
        btn_toll_5.setOnClickListener(this);
        btn_toll_6.setOnClickListener(this);
        btn_toll_7.setOnClickListener(this);
        btn_toll_8.setOnClickListener(this);
        btn_toll_9.setOnClickListener(this);
        btn_calcola.setOnClickListener( this );
        btn_reset.setOnClickListener( this );
        btn_5_anelli.setOnClickListener( this );


        FloatingActionButton fab = (FloatingActionButton) findViewById( R.id.fab );
        fab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(CalcolaActivity.this, MainActivity.class);
                startActivity( it );
            }
        } );
    }

    @Override
    public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn_5_anelli:
                    mostraTerzoAnello();
                    cancAnelli();
                    tv_spia.setText( "" );
                    break;
                // primo anello
                case R.id.btn_1_0:
                    btnAnello1.setBackgroundResource( R.color.nero );
                    val1 = "";
                    break;
                case R.id.btn_1_1:
                    btnAnello1.setBackgroundResource( R.color.marrone );
                    val1 = "1";
                    break;
                case R.id.btn_1_2:
                    btnAnello1.setBackgroundResource( R.color.rosso );
                    val1 = "2";
                    break;
                case R.id.btn_1_3:
                    btnAnello1.setBackgroundResource( R.color.arancio );
                    val1 = "3";
                    break;
                case R.id.btn_1_4:
                    btnAnello1.setBackgroundResource( R.color.giallo );
                    val1 = "4";
                    break;
                case R.id.btn_1_5:
                    btnAnello1.setBackgroundResource( R.color.verde );
                    val1 = "5";
                    break;
                case R.id.btn_1_6:
                    btnAnello1.setBackgroundResource( R.color.blu );
                    val1 = "6";
                    break;
                case R.id.btn_1_7:
                    btnAnello1.setBackgroundResource( R.color.viola );
                    val1 = "7";
                    break;
                case R.id.btn_1_8:
                    btnAnello1.setBackgroundResource( R.color.grigio );
                    val1 ="8";
                    break;
                case R.id.btn_1_9:
                    btnAnello1.setBackgroundResource( R.color.bianco );
                    val1 = "9";
                    break;
                // secondo anello
                case R.id.btn_2_0:
                    btnAnello2.setBackgroundResource( R.color.nero );
                    val2 = "0";
                    break;
                case R.id.btn_2_1:
                    btnAnello2.setBackgroundResource( R.color.marrone );
                    val2 = "1";
                    break;
                case R.id.btn_2_2:
                    btnAnello2.setBackgroundResource( R.color.rosso );
                    val2="2";
                    break;
                case R.id.btn_2_3:
                    btnAnello2.setBackgroundResource( R.color.arancio );
                    val2 = "3";
                    break;
                case R.id.btn_2_4:
                    btnAnello2.setBackgroundResource( R.color.giallo );
                    val2 = "4";
                    break;
                case R.id.btn_2_5:
                    btnAnello2.setBackgroundResource( R.color.verde );
                    val2 = "5";
                    break;
                case R.id.btn_2_6:
                    btnAnello2.setBackgroundResource( R.color.blu );
                    val2 = "6";
                    break;
                case R.id.btn_2_7:
                    btnAnello2.setBackgroundResource( R.color.viola );
                    val2 = "7";
                    break;
                case R.id.btn_2_8:
                    btnAnello2.setBackgroundResource( R.color.grigio );
                    val2 = "8";
                    break;
                case R.id.btn_2_9:
                    btnAnello2.setBackgroundResource( R.color.bianco );
                    val2 = "9";
                    break;
                // resetta i valori
                case R.id.btn_reset:
                    val1 = "";
                    val2 = "";
                    val3 = "";
                    diviso="";
                    moltiplica = 0;
                    valore = "";
                    temp =0.0;
                    tv_spia.setText( "" );
                    tv_valore.setText( "Scegli i colori" );
                    cancAnelli();
                    nascondiTerzoAnello();
                    break;
                // terzo anello
                    case R.id.btn_3_0:
                            btnAnello3.setBackgroundResource( R.color.nero );
                            val3 = "0";
                        break;
                    case R.id.btn_3_1:
                            btnAnello3.setBackgroundResource( R.color.marrone );
                            val3 = "1";
                        break;
                    case R.id.btn_3_2:
                            btnAnello3.setBackgroundResource( R.color.rosso );
                            val3 = "2";
                        break;
                    case R.id.btn_3_3:
                            btnAnello3.setBackgroundResource( R.color.arancio );
                            val3 = "3";
                        break;
                    case R.id.btn_3_4:

                            btnAnello3.setBackgroundResource( R.color.giallo );
                            val3 = "4";
                        break;
                    case R.id.btn_3_5:
                            btnAnello3.setBackgroundResource( R.color.verde );
                            val3 = "5";
                        break;
                    case R.id.btn_3_6:
                            btnAnello3.setBackgroundResource( R.color.blu );
                            val3 = "6";
                            break;
                            case R.id.btn_3_7:
                                btnAnello3.setBackgroundResource( R.color.viola );
                                val3 = "7";
                        break;
                    case R.id.btn_3_8:
                            btnAnello3.setBackgroundResource( R.color.grigio );
                            val3 = "8";
                        break;
                    case R.id.btn_3_9:
                            btnAnello3.setBackgroundResource( R.color.bianco );
                            val3 = "9";
                        break;

                // moltiplicatore 4 anello
                case R.id.btn_per_0:
                    btnAnello4.setBackgroundResource(R.color.nero);
                    zeri="";
                    break;
                case R.id.btn_per_1:
                    btnAnello4.setBackgroundResource(R.color.marrone);
                    zeri="0";
                    break;
                case R.id.btn_per_2:
                    btnAnello4.setBackgroundResource(R.color.rosso);
                    zeri="00";
                    break;
                case R.id.btn_per_3:
                    btnAnello4.setBackgroundResource(R.color.arancio);
                    zeri="000";
                    moltiplica=3;
                    break;
                case R.id.btn_per_4:
                    btnAnello4.setBackgroundResource(R.color.giallo);
                    zeri="0000";
                    break;
                case R.id.btn_per_5:
                    btnAnello4.setBackgroundResource(R.color.verde);
                    zeri="00000";
                    break;
                case R.id.btn_per_6:
                    btnAnello4.setBackgroundResource(R.color.blu);
                    zeri="000000";
                    break;
                case R.id.btn_per_7:
                    btnAnello4.setBackgroundResource(R.color.viola);
                    zeri="0000000";
                    break;
                case R.id.btn_per_8:
                    btnAnello4.setBackgroundResource(R.color.oro);
                    diviso=val1+val2;
                    temp = parseDouble( diviso ) ;
                    temp=temp/10;

         //*********                   // *****************************
                    break;
                case R.id.btn_per_9:
                    btnAnello4.setBackgroundResource(R.color.argento);
                    diviso=val1+val2;
                    temp = parseDouble( diviso ) ;
                    temp=temp/100;
                    break;
                    // tolleranza quinto anello
                case R.id.btn_toll_1:
                    btn_tolleranza.setBackgroundResource(R.color.marrone);
                    tolleranza="+/-1%";
                    break;
                case R.id.btn_toll_2:
                    btn_tolleranza.setBackgroundResource(R.color.rosso);
                    tolleranza="+/2%";
                    break;
                case R.id.btn_toll_3:
                    btn_tolleranza.setBackgroundResource(R.color.arancio);
                    tolleranza="+/-3%";
                    break;
                case R.id.btn_toll_5:
                    btn_tolleranza.setBackgroundResource(R.color.verde);
                    tolleranza="+/-0,5%";
                    break;
                case R.id.btn_toll_6:
                    btn_tolleranza.setBackgroundResource(R.color.blu);
                    tolleranza="+/-0,25%";
                    break;
                case R.id.btn_toll_7:
                    btn_tolleranza.setBackgroundResource(R.color.viola);
                    tolleranza="+/-0,1%";
                    break;
                case R.id.btn_toll_8:
                    btn_tolleranza.setBackgroundResource(R.color.oro);
                    tolleranza="+/-5%";
                    break;
                case R.id.btn_toll_9:
                    btn_tolleranza.setBackgroundResource(R.color.argento);
                    tolleranza="+/-10%";
                    break;
                    //  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
                case R.id.btn_calcola:

                        valore = valore + val1 + val2 + val3 ;
                        stampaResult();
                    break;
                }
        }
        private void stampaResult(){
            result = valore+zeri;
            if (zeri.equals( "000" )){Homs="Khoms";
                     tv_spia.setText( "convert: "+val1+val2+val3+" "+Homs );}

            if (zeri.equals( "0000" )){Homs="Khoms";
                    tv_spia.setText( "convert: "+val1+val2+"0,"+val3+" "+Homs );}

                if (zeri.equals( "00000" )){Homs="Khoms";
                    tv_spia.setText( "convert: "+val1+val2+"00,"+val3+" "+Homs );}

            if (zeri.equals( "000000" )){Homs="Mhoms";
                    tv_spia.setText( "convert: "+val1+val2+val3+" "+Homs );}

            if (zeri.equals( "0000000" )){Homs="Mhoms";
                    tv_spia.setText( "convert: "+val1+val2+"0,"+val3+" "+Homs );}



            if (tolleranza.equals( "" )){

                tv_valore.setText( ""+result+ " " + "homs" + ", ");

            } else {
                tv_valore.setText( result + " " +  "homs" + ", " + tolleranza );
            }
            if (temp > 0.0){tv_valore.setText( temp + " " +  "homs" + ", " + tolleranza );}
            val1=""; val2=""; val3=""; valore="";zer="";
        }
        private void cancAnelli() {
            btn_tolleranza.setBackgroundResource(R.color.resistenza);
            btnAnello1.setBackgroundResource( R.color.resistenza );
            btnAnello2.setBackgroundResource( R.color.resistenza );
            btnAnello3.setBackgroundResource( R.color.resistenza );
            btnAnello4.setBackgroundResource( R.color.resistenza );
        }
    private void mostraTerzoAnello() {
        btn_3_0.setVisibility( View.VISIBLE );
        btn_3_1.setVisibility( View.VISIBLE );
        btn_3_2.setVisibility( View.VISIBLE );
        btn_3_3.setVisibility( View.VISIBLE );
        btn_3_4.setVisibility( View.VISIBLE );
        btn_3_5.setVisibility( View.VISIBLE );
        btn_3_6.setVisibility( View.VISIBLE );
        btn_3_7.setVisibility( View.VISIBLE );
        btn_3_8.setVisibility( View.VISIBLE );
        btn_3_9.setVisibility( View.VISIBLE );

        btn_toll_1.setVisibility( View.VISIBLE );
        btn_toll_2.setVisibility( View.VISIBLE );
        btn_toll_3.setVisibility( View.VISIBLE );

        btn_toll_5.setVisibility( View.VISIBLE );
        btn_toll_6.setVisibility( View.VISIBLE );
        btn_toll_7.setVisibility( View.VISIBLE );
        tv_3cifra.setVisibility( View.VISIBLE );
    }
    public void nascondiTerzoAnello() {
        btn_3_0.setVisibility( View.GONE );
        btn_3_1.setVisibility( View.GONE );
        btn_3_2.setVisibility( View.GONE );
        btn_3_3.setVisibility( View.GONE );
        btn_3_4.setVisibility( View.GONE );
        btn_3_5.setVisibility( View.GONE );
        btn_3_6.setVisibility( View.GONE );
        btn_3_7.setVisibility( View.GONE );
        btn_3_8.setVisibility( View.GONE );
        btn_3_9.setVisibility( View.GONE );
        btn_toll_0.setVisibility( View.GONE );
        btn_toll_1.setVisibility( View.GONE );
        btn_toll_2.setVisibility( View.GONE );
        btn_toll_3.setVisibility( View.GONE );
        btn_toll_4.setVisibility( View.GONE );
        btn_toll_5.setVisibility( View.GONE );
        btn_toll_6.setVisibility( View.GONE );
        btn_toll_7.setVisibility( View.GONE );
        tv_3cifra.setVisibility( View.GONE );

    }
}
