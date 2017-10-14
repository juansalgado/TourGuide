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
 * {@link Fragment} that displays a list of number vocabulary objects.
 */
public class ArtAndMuseumsFragment extends Fragment {
    ArrayList<Object> objects = new ArrayList<Object>();

    public ArtAndMuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);


        // Create a list of objects
        final ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Object(R.string.art0, R.string.text_art0,
                R.drawable.art0, 0));
        objects.add(new Object(R.string.art1, R.string.text_art1,
                R.drawable.art1, 1));
        objects.add(new Object(R.string.art2, R.string.text_art2,
                R.drawable.art2, 2));
        objects.add(new Object(R.string.art3, R.string.text_art3,
                R.drawable.art3, 3));
        objects.add(new Object(R.string.art4, R.string.text_art4,
                R.drawable.art4, 4));
        objects.add(new Object(R.string.art5, R.string.text_art5,
                R.drawable.art5, 5));
        objects.add(new Object(R.string.art6, R.string.text_art6,
                R.drawable.art6, 6));
        objects.add(new Object(R.string.art7, R.string.text_art7,
                R.drawable.art7, 7));
        objects.add(new Object(R.string.art8, R.string.text_art8,
                R.drawable.art8, 8));
        objects.add(new Object(R.string.art9, R.string.text_art9,
                R.drawable.art9, 9));
        objects.add(new Object(R.string.art10, R.string.text_art10,
                R.drawable.art10, 10));
        objects.add(new Object(R.string.art11, R.string.text_art11,
                R.drawable.art11, 11));
        objects.add(new Object(R.string.art12, R.string.text_art12,
                R.drawable.art12, 12));
        objects.add(new Object(R.string.art13, R.string.text_art13,
                R.drawable.art13, 13));


        // Create an {@link ObjectAdapter}, whose data source is a list of {@link Object}s. The
        // adapter knows how to create list items for each item in the list.
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), objects, R.color.category_art);

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
