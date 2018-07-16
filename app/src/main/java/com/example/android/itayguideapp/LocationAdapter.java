package com.example.android.itayguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    private static class ViewHolder{
        ImageView imageResourceId;
        TextView title;
        TextView description;
        TextView address;
        TextView time;
        TextView phoneNumber;
    }


    public LocationAdapter(Context context, ArrayList<Location> words) {
        super(context, 0, words);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get the data item for this position
        Location location = getItem(position);

        //view lookup cache stored in tag
        ViewHolder viewHolder;

        //Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            viewHolder.imageResourceId = (ImageView) convertView.findViewById(R.id.img);
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            viewHolder.address = (TextView) convertView.findViewById(R.id.address);
            viewHolder.time = (TextView) convertView.findViewById(R.id.time);
            viewHolder.phoneNumber = (TextView) convertView.findViewById(R.id.phone);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //Edit list items
        viewHolder.imageResourceId.setImageResource(location.getImageResourceId());
        viewHolder.title.setText(location.getTitle());
        viewHolder.description.setText(location.getDescription());
        viewHolder.address.setText(location.getAddress());
        viewHolder.time.setText(location.getTime());
        viewHolder.phoneNumber.setText(location.getPhoneNumber());


        return convertView;
    }
}
