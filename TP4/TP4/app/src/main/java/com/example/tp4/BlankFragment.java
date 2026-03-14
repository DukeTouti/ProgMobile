package com.example.tp4;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    private EditText txtLogin;
    private EditText txtPassword;
    private Button btnConnect;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        txtLogin    = rootView.findViewById(R.id.txtLogin);
        txtPassword = rootView.findViewById(R.id.txtPassword);
        btnConnect  = rootView.findViewById(R.id.btnConnect);

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login    = txtLogin.getText().toString();
                String password = txtPassword.getText().toString();

                Log.i("DEBUG", login + " / " + password);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Informations de connexion");
                builder.setMessage("Login : " + login + "\nPassword : " + password);
                builder.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
                builder.setNegativeButton("Annuler", (dialog, which) -> dialog.cancel());
                builder.show();
            }
        });

        return rootView;
    }
}