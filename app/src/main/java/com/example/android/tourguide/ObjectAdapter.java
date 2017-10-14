package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link ObjectAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Object} objects.
 */
public class ObjectAdapter extends ArrayAdapter<Object> {

    /**
     * Resource ID for the background color for this list of objects
     */
    private int mColorResourceId;

    /**
     * Create a new {@link ObjectAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param objects         is the list of {@link Object}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of objects
     */
    public ObjectAdapter(Context context, ArrayList<Object> objects, int colorResourceId) {
        super(context, 0, objects);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the {@link Object} object located at this position in the list
        Object currentObject = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID tourism_text_view.
        TextView tourismTextView = (TextView) listItemView.findViewById(R.id.tourism_text_view);
        // Get the Tourism translation from the currentObject object and set this text on
        // the Tourism TextView.
        tourismTextView.setText(currentObject.getTourismId());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the currentObject object and set this text on
        // the default TextView.
        defaultTextView.setText(currentObject.getTitleId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentObject.getImageResourceId());
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}