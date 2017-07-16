package com.example.tony.gearratioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class AddActivity extends AppCompatActivity {
    public EditText nameInput;
    public EditText tireSizeInput;
    public EditText cassetteinput;
    public EditText cassetteinput2;
    public EditText crankinput1;
    public EditText crankinput2;
    public EditText crankinput3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Spinner spinner1 = (Spinner) findViewById(R.id.tireSpinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.tires_array, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = (Spinner) findViewById(R.id.cassetteInput);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.cassetteMin_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = (Spinner) findViewById(R.id.cassetteInput2);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.cassetteMax_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) findViewById(R.id.crankInput1);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.crankMin_array, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        Spinner spinner5 = (Spinner) findViewById(R.id.crankInput2);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.crankMid_array, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        Spinner spinner6 = (Spinner) findViewById(R.id.crankInput3);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this, R.array.crankMax_array, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);
    }
    public void onClickAdd(View view){

        //Hent data fra inputfelt
       /*
        nameInput = (EditText) view.findViewById(R.id.nameInput);
        tireSizeInput = (EditText) view.findViewById(R.id.tireInput);
        cassetteinput = (EditText) view.findViewById(R.id.cassetteInput);
        cassetteinput2 = (EditText) view.findViewById(R.id.cassetteInput2);
        crankinput1 = (EditText) view.findViewById(R.id.crankInput1);
        crankinput2 = (EditText) view.findViewById(R.id.crankInput2);
        crankinput3 = (EditText) view.findViewById(R.id.crankInput3);
        String inputs = nameInput.getText() + "," + tireSizeInput.getText() + "," + cassetteinput.getText() + "," + cassetteinput2.getText() + "," + crankinput1.getText() + "," + crankinput2.getText() + "," + crankinput3.getText();
        */Intent intent = new Intent();
        intent.putExtra("DATA", "");
        setResult(RESULT_OK, intent);
        finish();
    }
}
