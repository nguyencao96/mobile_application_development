package com.example.thanhcao.currencyconverter.View;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListPopupWindow;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thanhcao.currencyconverter.Adapter.CountryAdapter;
import com.example.thanhcao.currencyconverter.Model.Country;
import com.example.thanhcao.currencyconverter.R;
import com.google.gson.Gson;

import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Country> countriesListFrom = new ArrayList<Country>();
    CountryAdapter adapter;
    private Country fromCurrency, toCurrency;
    private TextView exchangeRate, baseCurrency, output;
    private TextInputEditText input;
    private DecimalFormat rateFormat = new DecimalFormat("0.##########");
    private DecimalFormat outputFormat = new DecimalFormat("0.###");
    private Button reversed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinnerFrom = findViewById(R.id.spinnerFrom);
        final Spinner spinnerTo = findViewById(R.id.spinnerTo);
        exchangeRate = findViewById(R.id.exchangeRate);
        baseCurrency = findViewById(R.id.baseCurrency);
        reversed = findViewById(R.id.reverse);
        output = findViewById(R.id.convertTo);
        input = findViewById(R.id.input);
        rateFormat.setGroupingUsed(true);
        rateFormat.setGroupingSize(3);
        outputFormat.setGroupingUsed(true);
        outputFormat.setGroupingSize(3);

        if (PreferenceManager.getDefaultSharedPreferences(this)
                .getAll().size() <= 1)
            Utils.initialExchangeRate(this);
        loadListCountry();

        adapter = new CountryAdapter(this, R.layout.spinner_rows, countriesListFrom);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);
        spinnerFrom.setSelection(40);
        spinnerTo.setSelection(137);
        fromCurrency = (Country) spinnerFrom.getSelectedItem();
        toCurrency = (Country) spinnerTo.getSelectedItem();

        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                updateConverter(((TextView) view.findViewById(R.id.currencyCode)).getText().toString(), null);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                updateConverter(null, ((TextView) view.findViewById(R.id.currencyCode)).getText().toString());
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        try {
            Field popup = Spinner.class.getDeclaredField("mPopup");
            popup.setAccessible(true);
            android.widget.ListPopupWindow popupFrom = (android.widget.ListPopupWindow) popup.get(spinnerFrom);
            android.widget.ListPopupWindow popupTo = (android.widget.ListPopupWindow) popup.get(spinnerTo);
            popupFrom.setHeight(500);
            popupTo.setHeight(500);
        }
        catch (NoClassDefFoundError | ClassCastException | NoSuchFieldException | IllegalAccessException e){}

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0){
                    double value = Double.parseDouble(s.toString());
                    if (value > 0)
                        output.setText(outputFormat.format(value*toCurrency.getRate()/fromCurrency.getRate()));
                    else
                        output.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        reversed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fromToReverse = spinnerFrom.getSelectedItemPosition();
                spinnerFrom.setSelection(spinnerTo.getSelectedItemPosition());
                spinnerTo.setSelection(fromToReverse);
//                input.setText(output.getText());
            }
        });
    }

    public void loadListCountry() {
        SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        Map<String, ?> listEntry = new TreeMap<>(appSharedPrefs.getAll());
        for (Map.Entry<String, ?> entry : listEntry.entrySet()) {
            String json = (String) entry.getValue();
            Country obj= gson.fromJson(json, Country.class);
            countriesListFrom.add(obj);
        }
    }

    private void updateConverter(String convertFrom, String convertTo){
        SharedPreferences storage = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        if (convertFrom != null) {
            fromCurrency = gson.fromJson(storage.getString(convertFrom, ""), Country.class);
        }
        if (convertTo != null) {
            toCurrency = gson.fromJson(storage.getString(convertTo, ""), Country.class);
        }
        baseCurrency.setText("1 " + fromCurrency.getName() + " equals");
        exchangeRate.setText(rateFormat.format(toCurrency.getRate()/fromCurrency.getRate()) + " " + toCurrency.getName());
    }
}
