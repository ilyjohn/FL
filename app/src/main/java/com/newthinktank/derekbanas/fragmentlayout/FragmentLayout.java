package com.newthinktank.derekbanas.fragmentlayout;

import android.app.Activity;
import android.os.Bundle;

public class FragmentLayout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for fragment_layout.xml
        setContentView(R.layout.fragment_layout);
    }

}
