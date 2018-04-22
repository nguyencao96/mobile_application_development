package com.example.thanhcao.currencyconverter.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanhcao.currencyconverter.View.MainActivity;
import com.example.thanhcao.currencyconverter.Model.Country;
import com.example.thanhcao.currencyconverter.R;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<String> {

    private Activity activity;
    private ArrayList data;
    Country spinnerValue = null;
    LayoutInflater inflater;

    public CountryAdapter(MainActivity activitySpinner, int resource, ArrayList data) {
        super(activitySpinner, resource, data);

        this.activity = activitySpinner;
        this.data = data;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = inflater.inflate(R.layout.spinner_rows, parent, false);
        spinnerValue = (Country) data.get(position);

        TextView currencyName = (TextView)row.findViewById(R.id.currencyName);
        TextView currencyCode = (TextView)row.findViewById(R.id.currencyCode);

        currencyName.setText("");
        currencyCode.setText(spinnerValue.getCode());

        return row;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = inflater.inflate(R.layout.spinner_rows, parent, false);
        spinnerValue = (Country) data.get(position);

        TextView currencyName = (TextView)row.findViewById(R.id.currencyName);
        TextView currencyCode = (TextView)row.findViewById(R.id.currencyCode);
        // ImageView countryImage = (ImageView)row.findViewById(R.id.countryImage);

        currencyName.setText(spinnerValue.getName() + " - ");
        currencyCode.setText(spinnerValue.getCode());
        //countryImage.setImageResource(res.getIdentifier("com.example.thanhcao.currencyconverter:drawable/" + spinnerValue.getImage(), null, null));

        return row;
    }
}
