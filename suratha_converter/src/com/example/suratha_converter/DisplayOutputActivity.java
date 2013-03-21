package com.example.suratha_converter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DisplayOutputActivity extends Activity {


	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_output); 
        
        
        Button DisplayCopyButton = (Button) findViewById(R.id.displayCopyButton);
        DisplayCopyButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText OutputTextArea = (EditText) findViewById(R.id.outputText);
				String OutputTextData = OutputTextArea.getText().toString();
				ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clipboard.setText(OutputTextData);
				
				Context context = getApplicationContext();
				CharSequence text = "Text has loaded into clipboard";
				int duration = Toast.LENGTH_LONG;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();

			}
		});
        
        EditText OutputTextArea = (EditText) findViewById(R.id.outputText);        
        Intent intent = getIntent();
        String output_text = intent.getStringExtra(SurathaConverter.OUTPUT_TEXT);        
        OutputTextArea.setText(output_text);        

    }


}
