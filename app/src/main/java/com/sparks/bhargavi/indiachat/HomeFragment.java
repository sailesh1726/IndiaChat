package com.sparks.bhargavi.indiachat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeFragment extends BaseFragment{
    View rootView;
//    TextView displayTextView;
    EditText sendMessageEditText;
    Button sendButton;
    LinearLayout linearLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_chat_with_me, container, false);

        linearLayout = (LinearLayout) rootView.findViewById(R.id.displayTextView);
        sendMessageEditText = (EditText) rootView.findViewById(R.id.sendMessageEditText);
        sendButton = (Button) rootView.findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempText=sendMessageEditText.getText().toString();
                TextView displayTextView = new TextView(getActivity().getApplicationContext());

                displayTextView.setText(tempText);

                linearLayout.addView(displayTextView);
                sendMessageEditText.setText("");
            }
        });
        return rootView;
    }
}
