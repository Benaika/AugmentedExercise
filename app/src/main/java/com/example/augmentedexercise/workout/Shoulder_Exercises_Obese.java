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

public class Shoulder_Exercises_Obese extends AppCompatActivity {

    FirebaseFirestore fStore;
    DocumentReference documentReference;
    public int oShoulder_Progress = 0;
    CardView btnJumpingJack, btnArmRaises, btnSideArmRaise, btnKneePushup, btnArmScissor
            ,btnJumpingJack2, btnArmRaises2, btnSideArmRaise2, btnKneePushup2, btnArmScissor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.augmentedexercise.R.layout.activity_shoulder_exercises_obese);

        btnJumpingJack = (CardView) findViewById(R.id.cdJumpingJack);
        btnSideArmRaise = (CardView) findViewById(R.id.cdSideArmRaise);
        btnArmRaises = (CardView) findViewById(R.id.cdArmRaises);
        btnKneePushup = (CardView) findViewById(R.id.cdKneePushup);
        btnArmScissor = (CardView) findViewById(R.id.cdArmScissor);
        btnJumpingJack2 = (CardView) findViewById(R.id.cdJumpingJack2);
        btnSideArmRaise2 = (CardView) findViewById(R.id.cdSideArmRaise2);
        btnArmRaises2 = (CardView) findViewById(R.id.cdArmRaises2);
        btnKneePushup2 = (CardView) findViewById(R.id.cdKneePushup2);
        btnArmScissor2 = (CardView) findViewById(R.id.cdArmScissor2);

        JumpingJack();
        SideArmRaise();
        ArmRaises();
        KneePushup();
        ArmScissor();
        JumpingJack2();
        SideArmRaise2();
        ArmRaises2();
        KneePushup2();
        ArmScissor2();
    }
    private void JumpingJack(){
        btnJumpingJack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_0_6ft5ny5zmc"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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
    private void SideArmRaise(){
        btnSideArmRaise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_1_uso4asz9ii"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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
    private void ArmRaises(){
        btnArmRaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_1_mgjtty9qzx"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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
    private void KneePushup(){
        btnKneePushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_6_ausnvzde5p"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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
    private void ArmScissor(){
        btnArmScissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_nonhct4smh"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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
    private void SideArmRaise2(){
        btnSideArmRaise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_1_uso4asz9ii"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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
    private void ArmRaises2(){
        btnArmRaises2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_1_mgjtty9qzx"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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
    private void KneePushup2(){
        btnKneePushup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_6_ausnvzde5p"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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
    private void ArmScissor2(){
        btnArmScissor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_nonhct4smh"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                oShoulder_Progress = oShoulder_Progress + 10;
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
                                    progress.put("shoulder_progress", oShoulder_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("shoulder_obese").document(userID)
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