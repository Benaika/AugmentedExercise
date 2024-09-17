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

public class LegAndButt_Exercises_Underweight extends AppCompatActivity {

    FirebaseFirestore fStore;
    DocumentReference documentReference;
    public int uwLeg_Progress = 0;

    CardView btnJumpingJack, btnSquats, btnBackwardLunge, btnWallCalfRaises, btnSumoSquat
            ,btnJumpingJack2, btnSquats2, btnBackwardLunge2, btnWallCalfRaises2, btnSumoSquat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_and_butt_exercises_underweight);

        SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
        String userID = preferences.getString("id", "");

        fStore = FirebaseFirestore.getInstance();
        documentReference = fStore.collection("user_progress").document(userID);

        btnJumpingJack = (CardView) findViewById(R.id.cdJumpingJack);
        btnSquats = (CardView) findViewById(R.id.cdSquats);
        btnBackwardLunge = (CardView) findViewById(R.id.cdBackwardLunge);
        btnWallCalfRaises = (CardView) findViewById(R.id.cdWallCalfRaises);
        btnSumoSquat = (CardView) findViewById(R.id.cdSumoSquat);
        btnJumpingJack2 = (CardView) findViewById(R.id.cdJumpingJack);
        btnSquats2 = (CardView) findViewById(R.id.cdSquats2);
        btnBackwardLunge2 = (CardView) findViewById(R.id.cdBackwardLunge2);
        btnWallCalfRaises2 = (CardView) findViewById(R.id.cdWallCalfRaises2);
        btnSumoSquat2 = (CardView) findViewById(R.id.cdSumoSquat2);

        JumpingJack();
        Squats();
        BackwardLunge();
        WallCalfRaises();
        SumoSquat();
        JumpingJack2();
        Squats2();
        BackwardLunge2();
        WallCalfRaises2();
        SumoSquat2();

    }
    private void JumpingJack(){
        btnJumpingJack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_0_6ft5ny5zmc"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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
    private void Squats(){
        btnSquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_11_emuwnngo6o"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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
    private void BackwardLunge(){
        btnBackwardLunge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_7_xffqvmya8e"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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
    private void WallCalfRaises(){
        btnWallCalfRaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_12_q2jq9ni86e"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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
    private void SumoSquat(){
        btnSumoSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_13_9gz0fnjw2y"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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
    private void JumpingJack2(){
        btnJumpingJack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_0_6ft5ny5zmc"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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
    private void Squats2(){
        btnSquats2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_11_emuwnngo6o"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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
    private void BackwardLunge2(){
        btnBackwardLunge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_7_xffqvmya8e"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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
    private void WallCalfRaises2(){
        btnWallCalfRaises2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_12_q2jq9ni86e"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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
    private void SumoSquat2(){
        btnSumoSquat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_13_9gz0fnjw2y"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                uwLeg_Progress = uwLeg_Progress + 10;
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
                                    progress.put("leg_progress", uwLeg_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("leg_underweight").document(userID)
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