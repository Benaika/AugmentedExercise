package com.example.augmentedexercise.workout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.augmentedexercise.R;
import com.example.augmentedexercise.ui.login.Login;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Fullbody_Exercises_Underweight extends AppCompatActivity {

    FirebaseFirestore fStore;
    DocumentReference documentReference;

    public int uwfb_Progress = 0;

    CardView btnJumpingJack, btnBurpees, btnHighKnees, btnMountainClimbing, btnSideBend, btnStandingSideBend
            ,btnFlutterKick, btnVsitBicycle, btnPilatesHundred, btnSpidermanPlank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullbody_exercises_underweight);

        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");

        fStore = FirebaseFirestore.getInstance();
        documentReference = fStore.collection("user_progress").document(userID);

        btnJumpingJack = (CardView) findViewById(R.id.cdJumpingJack);
        btnBurpees = (CardView) findViewById(R.id.cdBurpees);
        btnHighKnees= (CardView) findViewById(R.id.cdHighKnees);
        btnMountainClimbing = (CardView) findViewById(R.id.cdMountainClimbing);
        btnSideBend = (CardView) findViewById(R.id.cdSidebend);
        btnStandingSideBend = (CardView) findViewById(R.id.cdStandingSideBend);
        btnFlutterKick = (CardView) findViewById(R.id.cdFlutterKickSquat);
        btnVsitBicycle = (CardView) findViewById(R.id.cdVSitBicycle);
        btnPilatesHundred = (CardView) findViewById(R.id.cdPilatesHundred);
        btnSpidermanPlank = (CardView) findViewById(R.id.cdSpidermanPlank);

        //Calls all the methods
        JumpingJacks();
        Burpees();
        HighKnees();
        MountainClimbing();
        SideBend();
        StandingSideBend();
        FlutterKick();
        VsitBicycle();
        PilatesHundred();
        SpidermanPlank();

    }
    //METHODS TO CALL
    private void JumpingJacks(){
        btnJumpingJack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_15_mmnejga41l"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                    uwfb_Progress = uwfb_Progress + 10;
                    documentReference = fStore.collection("users").document(userID);

                    documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {

                            documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                                @Override
                                public void onSuccess(DocumentSnapshot documentSnapshot) {
                                    if (documentSnapshot.exists()){
                                        // Get the data from the document
                                        String firstname = documentSnapshot.getString("first_name");
                                        String lastname = documentSnapshot.getString("last_name");
                                        String email = documentSnapshot.getString("email");

                                        Map<String, Object> progress = new HashMap<>();
                                        progress.put("id", userID);
                                        progress.put("email", email);
                                        progress.put("first_name", firstname);
                                        progress.put("last_name", lastname);
                                        progress.put("fullbody_progress", uwfb_Progress);

                                        // Set the document ID to be the same as the "id" field
                                        fStore.collection("fullbody_underweight").document(userID)
                                                .set(progress)
                                                .addOnSuccessListener(aVoid -> {
                                                    // Data added successfully
                                                })
                                                .addOnFailureListener(e -> {
                                                    // Error occurred while adding data
                                                    //Log.e(TAG, "Error adding document", e);
                                                });
                                    }
                                    else{}
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {

                                }
                            });
                        }
                    });
            }
        });
    }
    private void Burpees(){
        btnBurpees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_9_2l7apn8eea"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwfb_Progress = uwfb_Progress + 10;
                documentReference = fStore.collection("users").document(userID);

                documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists()){
                                    // Get the data from the document
                                    String firstname = documentSnapshot.getString("first_name");
                                    String lastname = documentSnapshot.getString("last_name");
                                    String email = documentSnapshot.getString("email");

                                    Map<String, Object> progress = new HashMap<>();
                                    progress.put("id", userID);
                                    progress.put("email", email);
                                    progress.put("first_name", firstname);
                                    progress.put("last_name", lastname);
                                    progress.put("fullbody_progress", uwfb_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("fullbody_underweight").document(userID)
                                            .set(progress)
                                            .addOnSuccessListener(aVoid -> {
                                                // Data added successfully
                                            })
                                            .addOnFailureListener(e -> {
                                                // Error occurred while adding data
                                                //Log.e(TAG, "Error adding document", e);
                                            });
                                }
                                else{}
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });
                    }
                });
            }
        });
    }
    private void HighKnees(){
        btnHighKnees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_8_tnpe1n5ysr"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwfb_Progress = uwfb_Progress + 10;
                documentReference = fStore.collection("users").document(userID);

                documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists()){
                                    // Get the data from the document
                                    String firstname = documentSnapshot.getString("first_name");
                                    String lastname = documentSnapshot.getString("last_name");
                                    String email = documentSnapshot.getString("email");

                                    Map<String, Object> progress = new HashMap<>();
                                    progress.put("id", userID);
                                    progress.put("email", email);
                                    progress.put("first_name", firstname);
                                    progress.put("last_name", lastname);
                                    progress.put("fullbody_progress", uwfb_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("fullbody_underweight").document(userID)
                                            .set(progress)
                                            .addOnSuccessListener(aVoid -> {
                                                // Data added successfully
                                            })
                                            .addOnFailureListener(e -> {
                                                // Error occurred while adding data
                                                //Log.e(TAG, "Error adding document", e);
                                            });
                                }
                                else{}
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });
                    }
                });
            }
        });
    }
    private void MountainClimbing(){
        btnMountainClimbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_10_zr9linccu1"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwfb_Progress = uwfb_Progress + 10;
                documentReference = fStore.collection("users").document(userID);

                documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists()){
                                    // Get the data from the document
                                    String firstname = documentSnapshot.getString("first_name");
                                    String lastname = documentSnapshot.getString("last_name");
                                    String email = documentSnapshot.getString("email");

                                    Map<String, Object> progress = new HashMap<>();
                                    progress.put("id", userID);
                                    progress.put("email", email);
                                    progress.put("first_name", firstname);
                                    progress.put("last_name", lastname);
                                    progress.put("fullbody_progress", uwfb_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("fullbody_underweight").document(userID)
                                            .set(progress)
                                            .addOnSuccessListener(aVoid -> {
                                                // Data added successfully
                                            })
                                            .addOnFailureListener(e -> {
                                                // Error occurred while adding data
                                                //Log.e(TAG, "Error adding document", e);
                                            });
                                }
                                else{}
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });
                    }
                });
            }
        });
    }
    private void SideBend(){
        btnSideBend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_13_9gz0fnjw2y"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwfb_Progress = uwfb_Progress + 10;
                documentReference = fStore.collection("users").document(userID);

                documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists()){
                                    // Get the data from the document
                                    String firstname = documentSnapshot.getString("first_name");
                                    String lastname = documentSnapshot.getString("last_name");
                                    String email = documentSnapshot.getString("email");

                                    Map<String, Object> progress = new HashMap<>();
                                    progress.put("id", userID);
                                    progress.put("email", email);
                                    progress.put("first_name", firstname);
                                    progress.put("last_name", lastname);
                                    progress.put("fullbody_progress", uwfb_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("fullbody_underweight").document(userID)
                                            .set(progress)
                                            .addOnSuccessListener(aVoid -> {
                                                // Data added successfully
                                            })
                                            .addOnFailureListener(e -> {
                                                // Error occurred while adding data
                                                //Log.e(TAG, "Error adding document", e);
                                            });
                                }
                                else{}
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });
                    }
                });
            }
        });
    }
    private void StandingSideBend(){
        btnStandingSideBend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_2_cu4fot1xnn"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwfb_Progress = uwfb_Progress + 10;
                documentReference = fStore.collection("users").document(userID);

                documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists()){
                                    // Get the data from the document
                                    String firstname = documentSnapshot.getString("first_name");
                                    String lastname = documentSnapshot.getString("last_name");
                                    String email = documentSnapshot.getString("email");

                                    Map<String, Object> progress = new HashMap<>();
                                    progress.put("id", userID);
                                    progress.put("email", email);
                                    progress.put("first_name", firstname);
                                    progress.put("last_name", lastname);
                                    progress.put("fullbody_progress", uwfb_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("fullbody_underweight").document(userID)
                                            .set(progress)
                                            .addOnSuccessListener(aVoid -> {
                                                // Data added successfully
                                            })
                                            .addOnFailureListener(e -> {
                                                // Error occurred while adding data
                                                //Log.e(TAG, "Error adding document", e);
                                            });
                                }
                                else{}
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });
                    }
                });
            }
        });
    }
    private void FlutterKick(){
        btnFlutterKick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_4_cmcl2z0g5f"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwfb_Progress = uwfb_Progress + 10;
                documentReference = fStore.collection("users").document(userID);

                documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists()){
                                    // Get the data from the document
                                    String firstname = documentSnapshot.getString("first_name");
                                    String lastname = documentSnapshot.getString("last_name");
                                    String email = documentSnapshot.getString("email");

                                    Map<String, Object> progress = new HashMap<>();
                                    progress.put("id", userID);
                                    progress.put("email", email);
                                    progress.put("first_name", firstname);
                                    progress.put("last_name", lastname);
                                    progress.put("fullbody_progress", uwfb_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("fullbody_underweight").document(userID)
                                            .set(progress)
                                            .addOnSuccessListener(aVoid -> {
                                                // Data added successfully
                                            })
                                            .addOnFailureListener(e -> {
                                                // Error occurred while adding data
                                                //Log.e(TAG, "Error adding document", e);
                                            });
                                }
                                else{}
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });
                    }
                });
            }
        });
    }
    private void VsitBicycle(){
        btnVsitBicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_14_32gwdnlb9g"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwfb_Progress = uwfb_Progress + 10;
                documentReference = fStore.collection("users").document(userID);

                documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists()){
                                    // Get the data from the document
                                    String firstname = documentSnapshot.getString("first_name");
                                    String lastname = documentSnapshot.getString("last_name");
                                    String email = documentSnapshot.getString("email");

                                    Map<String, Object> progress = new HashMap<>();
                                    progress.put("id", userID);
                                    progress.put("email", email);
                                    progress.put("first_name", firstname);
                                    progress.put("last_name", lastname);
                                    progress.put("fullbody_progress", uwfb_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("fullbody_underweight").document(userID)
                                            .set(progress)
                                            .addOnSuccessListener(aVoid -> {
                                                // Data added successfully
                                            })
                                            .addOnFailureListener(e -> {
                                                // Error occurred while adding data
                                                //Log.e(TAG, "Error adding document", e);
                                            });
                                }
                                else{}
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });
                    }
                });
            }
        });
    }
    private void PilatesHundred(){
        btnPilatesHundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_nonhct4smh"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwfb_Progress = uwfb_Progress + 10;
                documentReference = fStore.collection("users").document(userID);

                documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists()){
                                    // Get the data from the document
                                    String firstname = documentSnapshot.getString("first_name");
                                    String lastname = documentSnapshot.getString("last_name");
                                    String email = documentSnapshot.getString("email");

                                    Map<String, Object> progress = new HashMap<>();
                                    progress.put("id", userID);
                                    progress.put("email", email);
                                    progress.put("first_name", firstname);
                                    progress.put("last_name", lastname);
                                    progress.put("fullbody_progress", uwfb_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("fullbody_underweight").document(userID)
                                            .set(progress)
                                            .addOnSuccessListener(aVoid -> {
                                                // Data added successfully
                                            })
                                            .addOnFailureListener(e -> {
                                                // Error occurred while adding data
                                                //Log.e(TAG, "Error adding document", e);
                                            });
                                }
                                else{}
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });
                    }
                });
            }
        });
    }
    private void SpidermanPlank(){
        btnSpidermanPlank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_6_ausnvzde5p"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwfb_Progress = uwfb_Progress + 10;
                documentReference = fStore.collection("users").document(userID);

                documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists()){
                                    // Get the data from the document
                                    String firstname = documentSnapshot.getString("first_name");
                                    String lastname = documentSnapshot.getString("last_name");
                                    String email = documentSnapshot.getString("email");

                                    Map<String, Object> progress = new HashMap<>();
                                    progress.put("id", userID);
                                    progress.put("email", email);
                                    progress.put("first_name", firstname);
                                    progress.put("last_name", lastname);
                                    progress.put("fullbody_progress", uwfb_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("fullbody_underweight").document(userID)
                                            .set(progress)
                                            .addOnSuccessListener(aVoid -> {
                                                // Data added successfully
                                            })
                                            .addOnFailureListener(e -> {
                                                // Error occurred while adding data
                                                //Log.e(TAG, "Error adding document", e);
                                            });
                                }
                                else{}
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });
                    }
                });
            }
        });
    }
}