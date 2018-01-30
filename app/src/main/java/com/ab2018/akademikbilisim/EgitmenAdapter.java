package com.ab2018.akademikbilisim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EDA on 30.01.2018.
 */

public class EgitmenAdapter extends ArrayAdapter<Ogrenci>
{
    public EgitmenAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Ogrenci> objects) {
        super(context, resource, objects);
    }



    public View getView(int position, View convertView, ViewGroup parent) {
        Ogrenci ogrenci= getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.egitmen_item,parent,false);
        }

        TextView name =  convertView.findViewById(R.id.ogrenciName);


        name.setText(ogrenci.getIsim());


        return  convertView;
    }
}
