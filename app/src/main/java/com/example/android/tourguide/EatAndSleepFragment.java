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
 * {@link Fragment} that displays a list of color vocabulary objects.
 */
public class EatAndSleepFragment extends Fragment {


    public EatAndSleepFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);


        // Create a list of objects
        final ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Object(R.string.eat0, R.string.text_eat0,
                R.drawable.eat0, 33));
        objects.add(new Object(R.string.eat1, R.string.text_eat1,
                R.drawable.eat1, 34));
        objects.add(new Object(R.string.eat2, R.string.text_eat2,
                R.drawable.eat2, 35));
        objects.add(new Object(R.string.eat3, R.string.text_eat3,
                R.drawable.eat3, 36));
        objects.add(new Object(R.string.eat4, R.string.text_eat4,
                R.drawable.eat4, 37));
        objects.add(new Object(R.string.eat5, R.string.text_eat5,
                R.drawable.eat5, 38));
        objects.add(new Object(R.string.eat6, R.string.text_eat6,
                R.drawable.eat6, 39));
        objects.add(new Object(R.string.eat7, R.string.text_eat7,
                R.drawable.eat7, 40));
        objects.add(new Object(R.string.eat8, R.string.text_eat8,
                R.drawable.eat8, 41));
        objects.add(new Object(R.string.eat9, R.string.text_eat9,
                R.drawable.eat9, 42));
        objects.add(new Object(R.string.eat10, R.string.text_eat10,
                R.drawable.eat10, 43));
        objects.add(new Object(R.string.eat11, R.string.text_eat11,
                R.drawable.eat11, 44));


        // Create an {@link ObjectAdapter}, whose data source is a list of {@link Object}s. The
        // adapter knows how to create list items for each item in the list.
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), objects, R.color.category_eat);

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
