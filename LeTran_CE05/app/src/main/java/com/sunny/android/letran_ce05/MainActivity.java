
    // Name: Tran Le
    // JAV1 - 1808
    // File name: MainActivity.java

package com.sunny.android.letran_ce05;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Animal> animals = null;
    private ListView aListView = null;
    private final int defaultIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animals = new ArrayList<>();
        populateData();
        helpPopulate(defaultIndex);
    }

    // Function to detect orientation change
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        helpPopulate(defaultIndex);
    }

    // Create function to populate data collection
    private void populateData() {
        animals.add(new Animal("Bear Arlan", 10, true, "Student",
                "Watch cartoons", R.drawable.bear));
        animals.add(new Animal("Marten Chrisst", 15, true, "McDonald employee",
                "Play video games", R.drawable.marten));
        animals.add(new Animal("Octopus Tenta", 18, false, "Ink producer",
                "Camouflage and attack jellyfish", R.drawable.octopus));
        animals.add(new Animal("Ostrich Mellow", 19, false, "Zoo runner",
                "Peck other animals", R.drawable.ostrich));
        animals.add(new Animal("Raccoon Garack", 21, true, "Office worker",
                "Build diagrams for statistics", R.drawable.racoon));
        animals.add(new Animal("Rooster Billo", 16, true, "Early waker",
                "Fly and chirp in morning", R.drawable.rooster));
        animals.add(new Animal("Seagull Ranch", 23, false, "Scout",
                "Practice carrying water in mouth", R.drawable.seagull));
        animals.add(new Animal("Seal Arlan", 25, true, "Security",
                "Work on belly muscles", R.drawable.seal));
        animals.add(new Animal("Tiger Stitch", 30, false, "Hunter",
                "Make soup", R.drawable.tiger));
        animals.add(new Animal("Zebra Dillian", 6, true, "Student",
                "Watch movies about zebras", R.drawable.zebra));
    }

    // Create function to populate the details view
    private void populateDetails(int index, int imageView, int name, int age, int friendly,
                                 int job, int hobby) {
        if (animals.size() > 0) {

            ImageView ivw = (ImageView)findViewById(imageView);
            TextView _name = (TextView)findViewById(name);
            TextView _age = (TextView)findViewById(age);
            TextView _friendly = (TextView)findViewById(friendly);
            TextView _job = (TextView)findViewById(job);
            TextView _hobby = (TextView)findViewById(hobby);

            ivw.setImageResource(animals.get(index).getImageID());
            _name.setText(animals.get(index).getName());
            String strAge = animals.get(index).getAge() + " years old";
            _age.setText(strAge);
            if (animals.get(index).getFriendly()) {
                _friendly.setText(R.string._friendly);
            } else {
                _friendly.setText(R.string._unfriendly);
            }

            _job.setText(animals.get(index).getJob());
            _hobby.setText(animals.get(index).getHobby());
        }
    }

    // Create function to help populate depending on orientation
    private void helpPopulate(int _position) {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            populateDetails(_position, R.id.imageView, R.id.txt_Name, R.id.txt_Age, R.id.txt_Friendly,
                    R.id.txt_Occupation, R.id.txt_Hobby);

            aListView = (ListView)findViewById(R.id.lvw_ListView);
            setupCustomAdapter();
            aListView.setOnItemClickListener(new ListView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    populateDetails(position, R.id.imageView, R.id.txt_Name, R.id.txt_Age, R.id.txt_Friendly,
                            R.id.txt_Occupation, R.id.txt_Hobby);
                }
            });
        } else {
            Spinner dropdown = (Spinner)findViewById(R.id.spn_Dropdown);
            dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    populateDetails(position, R.id.imageView2, R.id.txt_Land_Name, R.id.txt_Land_Age,
                            R.id.txt_Land_Friendly, R.id.txt_Land_Job, R.id.txt_Land_Hobby);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    populateDetails(defaultIndex, R.id.imageView2, R.id.txt_Land_Name, R.id.txt_Land_Age,
                            R.id.txt_Land_Friendly, R.id.txt_Land_Job, R.id.txt_Land_Hobby);
                }
            });
        }
    }

    // Create function to setup adapterview
    private void setupCustomAdapter() {
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        aListView.setAdapter(adapter);
    }
}
