package com.example.suratha_converter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SurathaConverter extends Activity {
	
    public final static String OUTPUT_TEXT = "com.example.suratha_converter.MESSAGE";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suratha_converter);
        
        Button LoadButton = (Button) findViewById(R.id.LoadButton);
        LoadButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText TextArea = (EditText) findViewById(R.id.EditText1);
				
				ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				String TextIn = clipboard.getText().toString();
				
				TextArea.setText(TextIn);

			}
		});
        
        Button CopyButton = (Button) findViewById(R.id.CopyButton);
        CopyButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText TextArea = (EditText) findViewById(R.id.EditText1);
				String TextData = TextArea.getText().toString();
				ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clipboard.setText(TextData);
				
				Context context = getApplicationContext();
				CharSequence text = "Text has loaded into clipboard";
				int duration = Toast.LENGTH_LONG;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();

			}
		});
        
        
        Button ClearButton = (Button) findViewById(R.id.ClearButton);
        ClearButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText TextArea = (EditText) findViewById(R.id.EditText1);
				TextArea.setText("");

			}
		});
        
        Button BaminiButton = (Button) findViewById(R.id.BaminiButton);
		BaminiButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				
				EditText TextArea = (EditText) findViewById(R.id.EditText1);
				String TextData = TextArea.getText().toString();
			
				Intent intent = new Intent(SurathaConverter.this, DisplayOutputActivity.class);
				intent.putExtra(OUTPUT_TEXT, BaminiToUni.ConvertBamini(TextData));
				startActivity(intent);
	

			}
		});
		
		
		Button TsciiButton = (Button) findViewById(R.id.TsciiButton);
		TsciiButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText TextArea = (EditText) findViewById(R.id.EditText1);
				String TextData = TextArea.getText().toString();
				
				Intent intent = new Intent(SurathaConverter.this, DisplayOutputActivity.class);
				intent.putExtra(OUTPUT_TEXT, TsciiToUni.ConvertTscii(TextData));
				startActivity(intent);

			}
		});
		
		Button AnjalButton = (Button) findViewById(R.id.AnjalButton);
		AnjalButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText TextArea = (EditText) findViewById(R.id.EditText1);
				String TextData = TextArea.getText().toString();
				
				Intent intent = new Intent(SurathaConverter.this, DisplayOutputActivity.class);
				intent.putExtra(OUTPUT_TEXT, AnjalToUni.ConvertAnjal(TextData));
				startActivity(intent);

			}
		});
		
		Button TabButton = (Button) findViewById(R.id.TabButton);
		TabButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText TextArea = (EditText) findViewById(R.id.EditText1);
				String TextData = TextArea.getText().toString();
				
				Intent intent = new Intent(SurathaConverter.this, DisplayOutputActivity.class);
				intent.putExtra(OUTPUT_TEXT, TabToUni.ConvertTab(TextData));
				startActivity(intent);

			}
		});
		
		Button TamButton = (Button) findViewById(R.id.TamButton);
		TamButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText TextArea = (EditText) findViewById(R.id.EditText1);
				String TextData = TextArea.getText().toString();
				
				Intent intent = new Intent(SurathaConverter.this, DisplayOutputActivity.class);
				intent.putExtra(OUTPUT_TEXT, TamToUni.ConvertTam(TextData));
				startActivity(intent);

			}
		});
		
		
		
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_suratha_converter, menu);
        return true;
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    
  

}





