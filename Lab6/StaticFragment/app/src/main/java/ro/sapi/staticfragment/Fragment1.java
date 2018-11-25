package ro.sapi.staticfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {

    final String TAG = "Status: ";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "Fragment1: onCreate()");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "Fragment1: onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "Fragment1: onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "Fragment1: onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Fragment1: onDestroy()");
    }
}
