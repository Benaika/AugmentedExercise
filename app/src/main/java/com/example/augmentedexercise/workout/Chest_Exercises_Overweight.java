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

public class Chest_Exercises_Overweight extends AppCompatActivity {

    FirebaseFirestore fStore;
    DocumentReference documentReference;
    public int owChest_Progress = 0;
    CardView cdJumpingJack, cdKneePushup, cdPushup, cdShoulderStretch, cdCobraStretch, cdWideArmPushup
            ,cdKneePushup2, cdPushup2, cdShoulderStretch2, cdCobrStretch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_exercises_overweight);

        cdJumpingJack = (CardView) findViewById(R.id.cdJumpingJack);
        cdKneePushup = (CardView) findViewById(R.id.cdJumpingJack);
        cdPushup = (CardView) findViewById(R.id.cdJumpingJack);
        cdShoulderStretch = (CardView) findViewById(R.id.cdJumpingJack);
        cdCobraStretch = (CardView) findViewById(R.id.cdJumpingJack);
        cdWideArmPushup = (CardView) findViewById(R.id.cdJumpingJack);
        cdKneePushup2 = (CardView) findViewById(R.id.cdJumpingJack);
        cdPushup2 = (CardView) findViewById(R.id.cdJumpingJack);
        cdShoulderStretch2 = (CardView) findViewById(R.id.cdJumpingJack);
        cdCobrStretch2 = (CardView) findViewById(R.id.cdJumpingJack);

        JumpingJack();
        KneePushup();
        Pushup();
        ShoulderStretch();
        CobraStretch();
        WideArmPushup();
        CobraStretch2();
        KneePushup2();
        Pushup2();
        ShoulderStretch2();
    }
    private void JumpingJack(){
        cdJumpingJack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_0_6ft5ny5zmc"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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
        cdKneePushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_0_mcw8srdl0"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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
    private void Pushup(){
        cdPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_1_uso4asz9ii"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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
    private void ShoulderStretch(){
        cdShoulderStretch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_2_cu4fot1xnn"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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
    private void CobraStretch(){
        cdCobraStretch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_nonhct4smh"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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
    private void WideArmPushup(){
        cdWideArmPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_nonhct4smh"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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
    private void CobraStretch2(){
        cdCobrStretch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_nonhct4smh"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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
        cdKneePushup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_nonhct4smh"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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
    private void Pushup2(){
        cdPushup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_nonhct4smh"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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
    private void ShoulderStretch2(){
        cdShoulderStretch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mywebar.com/p/Project_3_nonhct4smh"));
                startActivity(intent);
                SharedPreferences preferences = getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
                String userID = preferences.getString("id", "");

                owChest_Progress = owChest_Progress + 10;
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
                                    progress.put("chest_progress", owChest_Progress);

                                    // Set the document ID to be the same as the "id" field
                                    fStore.collection("chest_overweight").document(userID)
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