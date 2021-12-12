package it.aleallegretti.codfiscale;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText txt = new EditText(this);
        txt.setSingleLine();
        txt.setText("Immettere i dati della persona");
        txt.setOnEditorActionListener(this::myHandle);
        setContentView(txt);
    }

    private boolean myHandle(TextView textView, int actionId, KeyEvent keyEvent) {
        if(actionId != EditorInfo.IME_ACTION_DONE) return false;
        String line = textView.getText().toString();
        String[] args = line.split("\\s+");
        Person persona = new Person();
        persona.setSurname(args[1]);
        persona.setName(args[0]);
        persona.setDay(args[2]); persona.setMonth(args[3]); persona.setYear(args[4]);
        persona.setSex(args[5]);
        persona.setBornCity(args[6]);
        String codice = "";
        try {
            codice = new Engine(persona).getCode();
        } catch (IOException e) {
            e.printStackTrace();
        }

        textView.setText(codice);
        return true;
    }
}