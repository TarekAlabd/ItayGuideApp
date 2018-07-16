package com.example.android.itayguideapp;


import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.pyramids, getString(R.string.Pyramids), getString(R.string.pyr_des), getString(R.string.pyr_ad), getString(R.string.time), getString(R.string.tel)));
        locations.add(new Location(R.drawable.cairo, getString(R.string.Cairo), getString(R.string.cairo_des), getString(R.string.cairo_ad), getString(R.string.time), getString(R.string.tel)));
        locations.add(new Location(R.drawable.statue, getString(R.string.Oasis), getString(R.string.oasis_des), getString(R.string.egy), getString(R.string.time), getString(R.string.tel)));
        locations.add(new Location(R.drawable.luxor, getString(R.string.temple), getString(R.string.temple_des), getString(R.string.temple_ad), getString(R.string.time), getString(R.string.tel)));


        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called listView, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
