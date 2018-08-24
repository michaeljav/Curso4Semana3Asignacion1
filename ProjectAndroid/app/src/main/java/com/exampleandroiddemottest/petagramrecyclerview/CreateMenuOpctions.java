package com.exampleandroiddemottest.petagramrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;



public class CreateMenuOpctions extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

       getMenuInflater().inflate(R.menu.menu_opciones,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()){

            case R.id.mAbout:
                 intent = new Intent(this,Aboutme.class);
                startActivity(intent);
//                Toast.makeText(getApplicationContext(),"abourt",Toast.LENGTH_SHORT).show();
                break;

            case  R.id.mContact:
                 intent = new Intent(this,Contact.class);
                startActivity(intent);
                //   Toast.makeText(getApplicationContext(),"contactos",Toast.LENGTH_SHORT).show();
                break;

            case R.id.mactionView:
                Toast.makeText(this,"Pulsaste un action view",Toast.LENGTH_SHORT).show();
               // Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_SHORT).show();
//                 intent = new Intent(getApplicationContext(),DetallePets.class);
//                startActivity(intent);

              //  Toast.makeText(getApplicationContext(),"Refresh",Toast.LENGTH_SHORT).show();
                break;

            case  R.id.mConfigurarCuenta:
                intent = new Intent(this,ConfigurarCuenta.class);
                startActivity(intent);
                //   Toast.makeText(getApplicationContext(),"contactos",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
