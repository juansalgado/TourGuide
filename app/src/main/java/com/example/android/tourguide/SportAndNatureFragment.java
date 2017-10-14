package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of tourism objects.
 */
public class SportAndNatureFragment extends Fragment {


    public SportAndNatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);


        // Create a list of objects
        final ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Object(R.string.sport0, R.string.text_sport0,
                R.drawable.sport0, 14));
        objects.add(new Object(R.string.sport1, R.string.text_sport1,
                R.drawable.sport1, 15));
        objects.add(new Object(R.string.sport2, R.string.text_sport2,
                R.drawable.sport2, 16));
        objects.add(new Object(R.string.sport3, R.string.text_sport3,
                R.drawable.sport3, 17));
        objects.add(new Object(R.string.sport4, R.string.text_sport4,
                R.drawable.sport4, 18));
        objects.add(new Object(R.string.sport5, R.string.text_sport5,
                R.drawable.sport5, 19));
        objects.add(new Object(R.string.sport6, R.string.text_sport6,
                R.drawable.sport6, 20));
        objects.add(new Object(R.string.sport7, R.string.text_sport7,
                R.drawable.sport7, 21));


        // Create an {@link ObjectAdapter}, whose data source is a list of {@link Object}s. The
        // adapter knows how to create list items for each item in the list.
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), objects, R.color.category_sport);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // object_list.xmlml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ObjectAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Object} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to put text and image when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                // Get the {@link Object} object at the given position the user clicked on
                Object object = objects.get(position);

                //  I launch an activity, which I passed an integer,
                // which I take from a field of the adapter
                Intent i = new Intent(getActivity(), SpotActivity.class);
                i.putExtra("NUMBER", object.getResourceId());
                startActivity(i);

            }
        });

        return rootView;
    }


}
