package com.example.clashroyalemanager.actividades;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.clashroyalemanager.R;
import com.example.clashroyalemanager.api.RoyaleAPI;
import com.example.clashroyalemanager.clases.Player;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClanMemberActivity extends AppCompatActivity {
    private ImageView ivClanMemberProfile;
    private TextView tvClanMemberName;
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clan_member);

        ivClanMemberProfile = findViewById(R.id.ivClanMemberProfile);
        tvClanMemberName = findViewById(R.id.tvClanMemberName);

        //Obtiene el id del actor que se a seleccionado en la anterior actividad.
        Bundle extras = getIntent().getExtras();
        if (extras !=null) {
            id = extras.getString("id").substring(1);
            Toast.makeText(this, id, Toast.LENGTH_LONG).show();
        }

        //TODO: (7) Creo una instancia de la clase Retrofit, a la que le indico la URL de la API
        //y el conversor que vamos a usar
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RoyaleAPI.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //TODO: (8) Crea un objeto del servicio RoyaleAPI
        RoyaleAPI royaleAPI = retrofit.create(RoyaleAPI.class);

        //TODO: (9) Crea que un objeto de llamada a la función
        Call<Player> callPlayer = royaleAPI.getPlayer(id);

        //TODO: (10) Ese objeto se encola, para que se ejecute de forma asíncrona
        callPlayer.enqueue(new Callback<Player>() {
            @Override
            public void onResponse(Call<Player> call, Response<Player> response) {
                switch(response.code()) {
                    case 200:
                        Toast.makeText(getBaseContext(), "200", Toast.LENGTH_LONG).show();
                        //TODO: (11) En caso de que haya éxito en la respuesta, extraigo la información del jugador
                        Player player = response.body();

                        String name = player.getName();

                        tvClanMemberName.setText(name);
                        break;
                    case 401:
                        break;
                    default:
                        Toast.makeText(getBaseContext(), response.toString(), Toast.LENGTH_LONG).show();
                        break;
                }
            }

            @Override
            public void onFailure(Call<Player> call, Throwable t) {

            }
        });
    }
}
