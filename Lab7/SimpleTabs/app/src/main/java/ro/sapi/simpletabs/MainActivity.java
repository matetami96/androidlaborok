package ro.sapi.simpletabs;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout mTabLayout = (TabLayout) findViewById(R.id.tablayout); // find tablayout

        //replace default fragment
        //replaceFragment(new Fragment1());

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Toast.makeText(getApplicationContext(), "Tapped " + position, Toast.LENGTH_SHORT).show();
                if (tab.getPosition() == 0) {
                    replaceFragment(new Fragment1());
                } else if (tab.getPosition() == 1) {
                    replaceFragment(new Fragment2());
                } else if (tab.getPosition() == 2) {
                    replaceFragment(new Fragment3());
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
}
