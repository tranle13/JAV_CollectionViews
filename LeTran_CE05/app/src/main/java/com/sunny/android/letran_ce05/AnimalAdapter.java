
    // Name: Tran Le
    // JAV1 - 1808
    // File name: AnimalAdapter.java

package com.sunny.android.letran_ce05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalAdapter extends BaseAdapter {

    // Member variables
    private static final long BASE_ID = 0x00001;
    private Context aContext = null;
    private ArrayList<Animal> animals = null;

    // Constructor
    public AnimalAdapter(Context _context, ArrayList<Animal> _animals) {
        aContext = _context;
        animals = _animals;
    }

    // Override functions
    @Override
    public int getCount() {
        if (animals != null) {
            return animals.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (animals != null && position >= 0 || position < animals.size()) {
            return animals.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return BASE_ID + position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;

        if (convertView == null) {
            convertView = LayoutInflater.from(aContext).inflate(R.layout.listview_custom, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder)convertView.getTag();
        }

        Animal animal = (Animal)getItem(position);
        if (animal != null) {
            vh.txt_Name.setText(animal.getName());
            String age = animal.getAge() + " years old";
            vh.txt_Age.setText(age);
        }

        return convertView;
    }

    // Optimize with ViewHolder
    static class ViewHolder {
        TextView txt_Name;
        TextView txt_Age;

        ViewHolder(View _layout) {
            txt_Name = (TextView)_layout.findViewById(R.id.txt_CustomName);
            txt_Age = (TextView)_layout.findViewById(R.id.txt_CustomAge);
        }
    }
}
