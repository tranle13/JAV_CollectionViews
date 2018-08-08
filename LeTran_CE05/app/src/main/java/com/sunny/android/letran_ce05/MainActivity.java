
    // Name: Tran Le
    // JAV1 - 1808
    // File name: MainActivity.java

package com.sunny.android.letran_ce05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {

    private ArrayList<Animal> animals = new ArrayList<>();
    private ListView aListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateData();

        aListView = (ListView)findViewById(R.id.lvw_ListView);
    }

    // Create function to populate data collection
    private void populateData() {
        animals.add(new Animal("Bear Arlan", 10, true, "Student",
                "Watch cartoons"));
        animals.add(new Animal("Marten Chrisst", 15, true, "McDonald employee",
                "Play video games"));
        animals.add(new Animal("Octopus Tentacles", 18, false, "Ink producer",
                "Camouflage and attack jellyfish"));
        animals.add(new Animal("Ostrich Mellow", 19, false, "Zoo runner",
                "Peck other animals"));
        animals.add(new Animal("Raccoon Garack", 21, true, "Office worker",
                "Build diagrams for statistics"));
        animals.add(new Animal("Rooster Billo", 16, true, "Early waker",
                "Fly and chirp in morning"));
        animals.add(new Animal("Seagull Ranch", 23, false, "Scout",
                "Practice carrying water in mouth"));
        animals.add(new Animal("Seal Arlan", 25, true, "Security",
                "Work on belly muscles"));
        animals.add(new Animal("Tiger Stitch", 30, false, "Hunter",
                "Make soup"));
        animals.add(new Animal("Zebra Dillian", 6, true, "Student",
                "Watch movies about zebras"));
    }
}
