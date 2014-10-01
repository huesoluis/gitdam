package com.hueso.c21intent2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UsingIntentActivity extends Activity {
    int request_Code = 1;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onClick(View view) {
        //startActivity(new Intent("net.learn2develop.SecondActivity"));	
        //or
       startActivity(new Intent("com.hueso.c21intent2.SecondActivity"));
        
       // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebookfrenzy.com"));
	    //startActivity(intent);
    	//startActivityForResult(new Intent("com.hueso.SecondActivity"), request_Code);
    }
    

}