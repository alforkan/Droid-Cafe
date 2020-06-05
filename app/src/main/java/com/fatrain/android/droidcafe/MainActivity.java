package com.fatrain.android.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    
    public static final String EXTRA_MESSAGE = "com.fatrain.android.droidcafe.extra.MESSAGE";
    private String mOrdermessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();


                Intent intent =
                        new Intent(MainActivity.this, OrderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, mOrdermessage);
                startActivity(intent);
            }
        });
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    /**
     * Shows a message that the donut image was clicked.
     */
    public void showDonutOrder(View view) {
        mOrdermessage = getString(R.string.donut_order_message);
        displayToast(mOrdermessage);
    }

    /**
     * Shows a message that the ice cream sandwich image was clicked.
     */
    public void showIceCreamOrder(View view) {
        mOrdermessage = getString(R.string.ice_cream_order_message);
        displayToast(mOrdermessage);
    }

    /**
     * Shows a message that the froyo image was clicked.
     */
    public void showFroyoOrder(View view) {
        mOrdermessage = getString(R.string.froyo_order_message);
        displayToast(mOrdermessage);
    }




//    public void checkOrder() {
//        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
//        startActivity(intent);
//    }
}
