package com.example.clashroyalemanager.actividades;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.clashroyalemanager.R;
import com.example.clashroyalemanager.api.RoyaleAPI;
import com.example.clashroyalemanager.clases.Player;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClanMemberActivity extends AppCompatActivity {
    private ImageView ivClanMemberFavCard;
    private TextView tvClanMemberName;
    private TextView tvClanName;
    private TextView tvClanRole;
    private TextView tvDonations;
    private TextView tvWarDayWins;
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clan_member);

        ivClanMemberFavCard = findViewById(R.id.ivClanMemberFavCard);
        tvClanMemberName = findViewById(R.id.tvClanMemberName);
        tvClanName = findViewById(R.id.tvClanName);
        tvClanRole = findViewById(R.id.tvClanRole);
        tvDonations = findViewById(R.id.tvDonations);
        tvWarDayWins = findViewById(R.id.tvWarDayWins);

        //Obtiene el id del actor que se a seleccionado en la anterior actividad.
        Bundle extras = getIntent().getExtras();
        if (extras !=null) {
            id = extras.getString("id").substring(1);
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
                        //TODO: (11) En caso de que haya éxito en la respuesta, extraigo la información del jugador
                        Player player = response.body();

                        String name = player.getName();
                        String clanName = player.getClan().getName();
                        String clanRole = player.getRole();
                        String donations = player.getDonations().toString();
                        String warDayWins = player.getWarDayWins().toString();
                        String path = player.getCurrentFavouriteCard().getIconUrls().getMedium();

                        tvClanMemberName.setText(name);
                        tvClanName.setText(clanName);
                        tvClanRole.setText(clanRole);
                        tvDonations.setText("Donations: " + donations);
                        tvWarDayWins.setText("War Day Wins: " + warDayWins);
                        Picasso.get().load(path).into(ivClanMemberFavCard);
                        break;
                    case 401:
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onFailure(Call<Player> call, Throwable t) {

            }
        });
    }
}
