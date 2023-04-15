package com.afifakhan.bookapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.afifakhan.bookapp.databinding.RowCategoryBinding;

import java.util.ArrayList;

public class AdapterCategory extends RecyclerView.Adapter<AdapterCategory.HolderCategory> {

    private Context context;
    private ArrayList<ModelCategory> categoryArrayList;

    //view binding
    private RowCategoryBinding binding;

    public AdapterCategory(Context context, ArrayList<ModelCategory> categoryArrayList) {
        this.context = context;
        this.categoryArrayList = categoryArrayList;
    }

    @NonNull
    @Override
    public HolderCategory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //bind row_category.xml
        binding = RowCategoryBinding.inflate(LayoutInflater.from(context), parent, false);
        return new HolderCategory(binding.getRoot());
    }
    @Override
    public void onBindViewHolder(@NonNull HolderCategory holder, int position) {
        //get data
        ModelCategory model = categoryArrayList.get(position);
        long id = model.getId();
        String category = model.getCategory();
        String uid = model.getUid();
        long timestamp = model.getTimestamp();

        //set data
        holder.categoryTv.setText(category);

        //handle click, delete category
        holder.deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, ""+category, Toast.LENGTH_SHORT).show();
                //will do after showing, let first show categories
            }
        });
    }

    @Override
    public int getItemCount() {

        return categoryArrayList.size();
    }

    /*View holder class to hold UI view for row_category.xml*/
    class HolderCategory extends RecyclerView.ViewHolder{
        //ui views of row_category.xml
        TextView categoryTv;
        ImageButton deleteBtn;

        public HolderCategory(@NonNull View view) {


            super(view);
            //init ui views
            categoryTv = binding.categoryTv;
            deleteBtn = binding.deleteBtn;
        }
    }
}
