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

import com.example.augmentedexercise.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Abs_Exercises_Overweight extends AppCompatActivity {

    FirebaseFirestore fStore;
    DocumentReference documentReference;
    public int owAbs_Progress = 0;
    CardView btnLowplank, btnBurpees, btnHighknees, btnMountainClimbing, btnStandingOpenGate, btnJumpingJack
            ,btnFlutterKickSquat, btnVsitBicycle, btnPilatesHundred, btnSpiderPlank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_exercises_overweight);

        btnLowplank = (CardView) findViewById(R.id.cdLowplank);
        btnBurpees = (CardView) findViewById(R.id.cdBurpees);
        btnHighknees = (CardView) findViewById(R.id.cdHighKnees);
        btnMountainClimbing = (CardView) findViewById(R.id.cdMountainClimbing);
        btnStandingOpenGate = (CardView) findViewById(R.id.cdStandingOpenGate);
        btnJumpingJack = (CardView) findViewById(R.id.cdJumpingJack);
        btnFlutterKickSquat = (CardView) findViewById(R.id.cdFlutterKickSquat);
        btnVsitBicycle = (CardView) findViewById(R.id.cdVSitBicycle);
        btnPilatesHundred = (CardView) findViewById(R.id.cdPilatesHundred);
        btnSpiderPlank = (CardView) findViewById(R.id.cdSpidermanPlank);

        JumpingJacks();
        Lowplank();
        Burpees();
        Highknees();
        MountainClimbing();
        StandingOpenGate();
        FlutterKickSquat();
        VsitBicycle();
        PilateHundred();
        SpidermanPlank();
    }
    private void JumpingJacks(){
        btnJumpingJack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_0_6ft5ny5zmc"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_overweight").document(userID)
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
    private void Lowplank(){
        btnLowplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_2_fwd6eyh9af"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_overweight").document(userID)
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

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_abs_overweight").document(userID)
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
    private void Highknees(){
        btnHighknees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_8_tnpe1n5ysr"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_overweight").document(userID)
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

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_overweight").document(userID)
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
    private void StandingOpenGate(){
        btnStandingOpenGate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_12_q2jq9ni86e"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_overweight").document(userID)
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
    private void FlutterKickSquat(){
        btnFlutterKickSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_11_emuwnngo6o"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_overweight").document(userID)
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

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_overweight").document(userID)
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
    private void PilateHundred(){
        btnPilatesHundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_6_ausnvzde5p"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_overweight").document(userID)
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
        btnSpiderPlank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_s9blkykvap"));
                startActivity(intent);

                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owAbs_Progress = owAbs_Progress + 10;
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
                                    progress.put("abs_progress", owAbs_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("abs_overweight").document(userID)
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