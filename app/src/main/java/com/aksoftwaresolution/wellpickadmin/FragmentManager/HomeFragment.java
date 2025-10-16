package com.aksoftwaresolution.wellpickadmin.FragmentManager;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aksoftwaresolution.wellpickadmin.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;


public class HomeFragment extends Fragment {

FloatingActionButton actionButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View categoryView=inflater.inflate(R.layout.fragment_home, container, false);
        if (container!=null)container.removeAllViews();

        actionButton=categoryView.findViewById(R.id.addCategoryData);

       actionButton.setOnClickListener(v ->{
           setCategoryData(getContext());
       } );




        return  categoryView;
    }//============================================================================================


    private void setCategoryData(Context context) {
        // Inflate custom layout
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog, null);

        // Initialize views
        TextInputEditText editCategory = dialogView.findViewById(R.id.edit_category_name);
        Button btnOk = dialogView.findViewById(R.id.btn_ok);
        Button btnCancel = dialogView.findViewById(R.id.btn_cancel);

        // Build dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(dialogView);

        AlertDialog dialog = builder.create();
        dialog.show();

        // Handle buttons
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = editCategory.getText().toString().trim();
                if (!category.isEmpty()) {
                    // TODO: তোমার ডেটা সংরক্ষণ বা অন্য কিছু করো
                    Toast.makeText(context, "Category: " + category, Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                } else {
                    editCategory.setError("Enter category name");
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

    }



}//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++