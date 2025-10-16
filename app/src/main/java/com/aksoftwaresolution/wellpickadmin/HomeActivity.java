package com.aksoftwaresolution.wellpickadmin;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.aksoftwaresolution.wellpickadmin.Contract.DataContract;
import com.aksoftwaresolution.wellpickadmin.FragmentManager.HomeFragment;
import com.aksoftwaresolution.wellpickadmin.FragmentManager.PopularFragment;
import com.aksoftwaresolution.wellpickadmin.FragmentManager.PremiumFragment;
import com.aksoftwaresolution.wellpickadmin.Model.DataModel;
import com.aksoftwaresolution.wellpickadmin.Presenter.DataPresenter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity  {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.statusBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bottomNavigationView=findViewById(R.id.bottomnavigation);

        setFragmentManager(new HomeFragment());

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId()==R.id.home){
                    setFragmentManager(new HomeFragment());
                }else if (menuItem.getItemId()==R.id.Premium){
                    setFragmentManager(new PremiumFragment());
                }else if (menuItem.getItemId()==R.id.Popular){
                    setFragmentManager(new PopularFragment());
                }




                return true;
            }
        });













    }//===========onCreate end here =============================================================

    private void setFragmentManager(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.FrameLayout,fragment);
        fragmentTransaction.commit();
    }




}//===========public class end here =============================================================