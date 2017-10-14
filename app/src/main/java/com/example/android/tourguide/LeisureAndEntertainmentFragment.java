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
 * {@link Fragment} that displays a list of phrases.
 */
public class LeisureAndEntertainmentFragment extends Fragment {
    ArrayList<Object> objects = new ArrayList<Object>();

    public LeisureAndEntertainmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);


        // Create a list of objects
        final ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Object(R.string.leisure0, R.string.text_leisure0,
                R.drawable.leisure0, 22));
        objects.add(new Object(R.string.leisure1, R.string.text_leisure1,
                R.drawable.leisure1, 23));
        objects.add(new Object(R.string.leisure2, R.string.text_leisure2,
                R.drawable.leisure2, 24));
        objects.add(new Object(R.string.leisure3, R.string.text_leisure3,
                R.drawable.leisure3, 25));
        objects.add(new Object(R.string.leisure4, R.string.text_leisure4,
                R.drawable.leisure4, 26));
        objects.add(new Object(R.string.leisure5, R.string.text_leisure5,
                R.drawable.leisure5, 27));
        objects.add(new Object(R.string.leisure6, R.string.text_leisure6,
                R.drawable.leisure6, 28));
        objects.add(new Object(R.string.leisure7, R.string.text_leisure7,
                R.drawable.leisure7, 29));
        objects.add(new Object(R.string.leisure8, R.string.text_leisure8,
                R.drawable.leisure8, 30));
        objects.add(new Object(R.string.leisure9, R.string.text_leisure9,
                R.drawable.leisure9, 31));
        objects.add(new Object(R.string.leisure10, R.string.text_leisure10,
                R.drawable.leisure10, 32));


        // Create an {@link ObjectAdapter}, whose data source is a list of {@link Object}s. The
        // adapter knows how to create list items for each item in the list.
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), objects, R.color.category_leisure);

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
