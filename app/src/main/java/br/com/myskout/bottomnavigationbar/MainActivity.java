package br.com.myskout.bottomnavigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    RecyclerView recyclerViewTimes;
    List<Times> lstTimes;

    NotificationsFragment notificationsFragment = new NotificationsFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavView);
        lstTimes = new ArrayList<>();
        lstTimes.add(new Times("Palmeiras", R.drawable.palmeiras, 12));
        lstTimes.add(new Times("Santos", R.drawable.santos, 8));
        lstTimes.add(new Times("Flamengo", R.drawable.flamengo, 8));
        lstTimes.add(new Times("Corinthians", R.drawable.corinthians, 7));
        lstTimes.add(new Times("São Paulo", R.drawable.sao_paulo, 6));
        lstTimes.add(new Times("Cruzeiro", R.drawable.cruzeiro, 4));
        lstTimes.add(new Times("Fluminense", R.drawable.fluminense, 4));
        lstTimes.add(new Times("Vasco", R.drawable.vasco, 4));
        lstTimes.add(new Times("Internacional", R.drawable.interncionl, 3));
        lstTimes.add(new Times("Bahia", R.drawable.bahia, 2));


        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.frmContainer, homeFragment).commit();

        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.mNotifications);
        badgeDrawable.setVisible(true);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mHome:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.frmContainer, homeFragment).commit();
                        configureRecyclerView();

                        return true;
                    case R.id.mNotifications:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.frmContainer, notificationsFragment).commit();
                        return true;
                    case R.id.mSettings:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.frmContainer, settingsFragment).commit();
                        return true;
                }


                return false;
            }
        });
    }

    private void configureRecyclerView() {
        recyclerViewTimes = findViewById(R.id.idRecyclerTimes);
        recyclerViewTimes.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        ListaTimesAdapter adapter = new ListaTimesAdapter(getApplicationContext(), lstTimes);
        recyclerViewTimes.setAdapter(adapter);
    }
}