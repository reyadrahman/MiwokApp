package com.example.android.miwok;

import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorID;

    public WordAdapter(Context context, ArrayList<Word> object, int colorID) {
        super(context, 0, object);
        mColorID = colorID;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_list, parent, false);
        }

        Word singleWord = getItem(position);

        TextView miwokTextView = itemView.findViewById(R.id.miwokTextView);
        miwokTextView.setText(singleWord.getMiwokTranslation());

        TextView defaultTextView = itemView.findViewById(R.id.defaultTextView);
        defaultTextView.setText(singleWord.getDefaultTranslation());

        LinearLayout horizontalLinearLayout = itemView.findViewById(R.id.horizontal_layout);
        int color= ContextCompat.getColor(getContext(),mColorID);
        horizontalLinearLayout.setBackgroundColor(color);


        ImageView imageView = itemView.findViewById(R.id.image);
        if (singleWord.hasImage()) {
            imageView.setImageResource(singleWord.getImageID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return itemView;
    }

}
