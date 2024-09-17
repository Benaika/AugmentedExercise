package com.example.augmentedexercise.bmi_module;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.augmentedexercise.Navigation_Drawer;
import com.example.augmentedexercise.R;
import com.example.augmentedexercise.model.Progress;
import com.example.augmentedexercise.workout.Abs_Exercises_Obese;
import com.example.augmentedexercise.workout.Chest_Exercises_Obese;
import com.example.augmentedexercise.workout.Fullbody_Exercises_Obese;
import com.example.augmentedexercise.workout.Leg_and_Butt_Exercises_Obese;
import com.example.augmentedexercise.workout.Shoulder_Exercises_Obese;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class BMI_Obese extends AppCompatActivity {

    FirebaseFirestore fStore;
    DocumentReference documentReference;
    ImageView btnOB, btnON, btnBack;
    ImageButton btnfullBody, btnAbs, btnChest, btnLowerBody, btnShoulder;
    ProgressBar pbFBObese, pbAbsObese, pbChestObese, pbLegsObese, pbShoulderObese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_obese);

        fStore = FirebaseFirestore.getInstance();

        btnfullBody = (ImageButton) findViewById(R.id.fullbody);
        btnAbs = (ImageButton) findViewById(R.id.abs);
        btnChest = (ImageButton) findViewById(R.id.chest);
        btnLowerBody = (ImageButton) findViewById(R.id.leg);
        btnShoulder = (ImageButton) findViewById(R.id.shoulder);

        Obese_Fullbody();
        Obese_Abs();
        Obese_Chest();
        Obese_Leg();
        Obese_Shoulder();

        btnBack = (ImageView) findViewById(R.id.backbtn);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Obese.this, Navigation_Drawer.class);
                startActivity(intent);
            }
        });

        btnOB = (ImageView) findViewById(R.id.btnOBack);
        btnOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Obese.this, BMI_Overweight.class);
                startActivity(intent);
            }
        });

        btnON = (ImageView) findViewById(R.id.btnONext);
        btnON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Obese.this, BMI_Senior.class);
                startActivity(intent);
            }
        });

        //Intent to Fullbody Exercises
        btnfullBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Obese.this, Fullbody_Exercises_Obese.class);
                startActivity(intent);
            }
        });

        //Intent to Abs Exercises
        btnAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Obese.this, Abs_Exercises_Obese.class);
                startActivity(intent);
            }
        });

        //Intent to Chest Exercises
        btnChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Obese.this, Chest_Exercises_Obese.class);
                startActivity(intent);
            }
        });

        //Intent to Lowerbody Exercises
        btnLowerBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Obese.this, Leg_and_Butt_Exercises_Obese.class);
                startActivity(intent);
            }
        });

        //Intent to Shoulder Exercises
        btnShoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMI_Obese.this, Shoulder_Exercises_Obese.class);
                startActivity(intent);
            }
        });
    }

    private void Obese_Fullbody(){
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbFBObese = (ProgressBar) findViewById(R.id.pbFullbodyObese);

        documentReference = fStore.collection("fullbody_obese").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot document = task.getResult();
                    if(document.exists()){
                        Progress progress = document.toObject(Progress.class);
                        pbFBObese.setProgress(progress.getFullbody_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }
    private void Obese_Abs() {
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbAbsObese = (ProgressBar) findViewById(R.id.pbAbsObese);

        documentReference = fStore.collection("abs_obese").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Progress progress = document.toObject(Progress.class);
                        pbAbsObese.setProgress(progress.getAbs_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }
    private void Obese_Chest() {
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbChestObese = (ProgressBar) findViewById(R.id.pbChestObese);

        documentReference = fStore.collection("chest_obese").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Progress progress = document.toObject(Progress.class);
                        pbChestObese.setProgress(progress.getChest_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }
    private void Obese_Leg() {
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbLegsObese = (ProgressBar) findViewById(R.id.pbLegsObese);

        documentReference = fStore.collection("leg_obese").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Progress progress = document.toObject(Progress.class);
                        pbLegsObese.setProgress(progress.getLeg_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }
    private void Obese_Shoulder() {
        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");
        Log.d("MY_APP", "User ID: " + userID);

        pbShoulderObese = (ProgressBar) findViewById(R.id.pbShoulderObese);

        documentReference = fStore.collection("shoulder_obese").document(userID);
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Progress progress = document.toObject(Progress.class);
                        pbShoulderObese.setProgress(progress.getShoulder_progress());
                        Log.d("MY_APP", "User ID: " + userID);
                    }
                }
            }
        });
    }
}