package com.example.augmentedexercise.bmi_module;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.augmentedexercise.Navigation_Drawer;
import com.example.augmentedexercise.R;
import com.example.augmentedexercise.model.Progress;
import com.example.augmentedexercise.workout.Abs_Exercises_Underweight;
import com.example.augmentedexercise.workout.Chest_Exercises_Underweight;
import com.example.augmentedexercise.workout.Fullbody_Exercises_Underweight;
import com.example.augmentedexercise.workout.LegAndButt_Exercises_Underweight;
import com.example.augmentedexercise.workout.Shoulder_Exercises_Underweight;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class BMI_Underweight extends AppCompatActivity {

    FirebaseFirestore fStore;
    CollectionReference collectionReference;
    DocumentReference documentReference;
    ProgressBar pbFullbody,
                pbAbs,
                pbChest,
                pbLeg,
                pbShoulder;
    ImageView btnUWB, btnUWN, btnBack;

    ImageButton btnfullBody, btnAbs, btnChest, btnLowerBody, btnShoulder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_underweight);

        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");

        fStore = FirebaseFirestore.getInstance();

        btnUWB = (ImageView) findViewById(R.id.btnUWBack);
        btnUWN = (ImageView) findViewById(R.id.btnUWNext);
        btnBack = (ImageView) findViewById(R.id.backbtn);

        pbFullbody = (ProgressBar) findViewById(R.id.pbFullbodyUnderweight);
        pbAbs = (ProgressBar) findViewById(R.id.pbAbsUnderweight);
        pbChest = (ProgressBar) findViewById(R.id.pbChestUnderweight);
        pbLeg = (ProgressBar) findViewById(R.id.pbLegsUnderweight);
        pbShoulder = (ProgressBar) findViewById(R.id.pbShoulderUnderweight);

        btnfullBody = (ImageButton) findViewById(R.id.fullbody);
        btnAbs = (ImageButton) findViewById(R.id.abs);
        btnChest = (ImageButton) findViewById(R.id.chest);
        btnLowerBody = (ImageButton) findViewById(R.id.leg);
        btnShoulder = (ImageButton) findViewById(R.id.shoulder);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Underweight.this, Navigation_Drawer.class);
                startActivity(intent);
            }
        });

        Underweight_Fullbody();
        Underweight_Abs();
        Underweight_Chest();
        Underweight_Leg();
        Underweight_Shoulder();


        btnUWB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Underweight.this, BMI_Senior.class);
                startActivity(intent);
            }
        });

        btnUWN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Underweight.this, BMI_Normal.class);
                startActivity(intent);
            }
        });

        //Intent to Fullbody Exercises
        btnfullBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Underweight.this, Fullbody_Exercises_Underweight.class);
                startActivity(intent);
            }
        });

        //Intent to Abs Exercises
        btnAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Underweight.this, Abs_Exercises_Underweight.class);
                startActivity(intent);
            }
        });

        //Intent to Chest Exercises
        btnChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Underweight.this, Chest_Exercises_Underweight.class);
                startActivity(intent);
            }
        });

        //Intent to Lowerbody Exercises
        btnLowerBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Underweight.this, LegAndButt_Exercises_Underweight.class);
                startActivity(intent);
            }
        });

        //Intent to Shoulder Exercises
        btnShoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Underweight.this, Shoulder_Exercises_Underweight.class);
                startActivity(intent);
            }
        });

    }
    private void Underweight_Fullbody(){
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbFullbody = (ProgressBar) findViewById(R.id.pbFullbodyUnderweight);

        documentReference = fStore.collection("fullbody_underweight").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot document = task.getResult();
                    if(document.exists()){
                        Progress progress = document.toObject(Progress.class);
                        pbFullbody.setProgress(progress.getFullbody_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }
    private void Underweight_Abs() {
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbAbs = (ProgressBar) findViewById(R.id.pbAbsUnderweight);

        documentReference = fStore.collection("abs_underweight").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Progress progress = document.toObject(Progress.class);
                        pbAbs.setProgress(progress.getAbs_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }
    private void Underweight_Chest() {
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbChest = (ProgressBar) findViewById(R.id.pbChestUnderweight);

        documentReference = fStore.collection("chest_underweight").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Progress progress = document.toObject(Progress.class);
                        pbChest.setProgress(progress.getChest_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }
    private void Underweight_Leg() {
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbLeg = (ProgressBar) findViewById(R.id.pbLegsUnderweight);

        documentReference = fStore.collection("leg_underweight").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Progress progress = document.toObject(Progress.class);
                        pbLeg.setProgress(progress.getLeg_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }
    private void Underweight_Shoulder() {
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbShoulder = (ProgressBar) findViewById(R.id.pbShoulderUnderweight);

        documentReference = fStore.collection("shoulder_underweight").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Progress progress = document.toObject(Progress.class);
                        pbShoulder.setProgress(progress.getShoulder_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }

}