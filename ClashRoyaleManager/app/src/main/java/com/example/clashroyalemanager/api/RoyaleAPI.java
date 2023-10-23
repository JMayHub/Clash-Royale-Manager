package com.example.clashroyalemanager.api;

import com.example.clashroyalemanager.clases.ClanMembers;
import com.example.clashroyalemanager.clases.Player;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface RoyaleAPI {

    final static String URL = "https://proxy.royaleapi.dev/v1/";

    @Headers({
            "Content-Type: application/json; charset=utf-8",
            "Host: proxy.royaleapi.dev",
            "Access-Control-Allow-Origin: *",
            "Access-Control-Allow-Methods: GET, POST, OPTIONS",
            "Access-Control-Allow-Headers: DNT,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Content-Type,Range,Azuthorization",
            "Access-Control-Expose-Headers: Content-Length,Content-Range,Authorization",
            "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6ImRmNjA3OTc4LTE1YTMtNDA5Yi05NWQwLTI5OWE2M2JkMTg0NiIsImlhdCI6MTY3ODUyODU2OCwic3ViIjoiZGV2ZWxvcGVyL2RmZTYxNmRhLTE2ZGEtZTVhNy05ZTA5LWZhMTczZjI5N2RjNiIsInNjb3BlcyI6WyJyb3lhbGUiXSwibGltaXRzIjpbeyJ0aWVyIjoiZGV2ZWxvcGVyL3NpbHZlciIsInR5cGUiOiJ0aHJvdHRsaW5nIn0seyJjaWRycyI6WyI0NS43OS4yMTguNzkiXSwidHlwZSI6ImNsaWVudCJ9XX0.uW2ApDK1wsAtvD-ImkvPjILVs2thX7bgOM0W58aVdrDUSZPSsM5kajMY81E-mmN264AZ2UIDovvM-mHB4jiAeQ"
    })
    @GET("players/%23{id}")//9YG8UGLU
    Call<Player> getPlayer(@Path("id") String id);

    @Headers({
            "Content-Type: application/json; charset=utf-8",
            "Host: proxy.royaleapi.dev",
            "Access-Control-Allow-Origin: *",
            "Access-Control-Allow-Methods: GET, POST, OPTIONS",
            "Access-Control-Allow-Headers: DNT,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Content-Type,Range,Azuthorization",
            "Access-Control-Expose-Headers: Content-Length,Content-Range,Authorization",
            "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6ImRmNjA3OTc4LTE1YTMtNDA5Yi05NWQwLTI5OWE2M2JkMTg0NiIsImlhdCI6MTY3ODUyODU2OCwic3ViIjoiZGV2ZWxvcGVyL2RmZTYxNmRhLTE2ZGEtZTVhNy05ZTA5LWZhMTczZjI5N2RjNiIsInNjb3BlcyI6WyJyb3lhbGUiXSwibGltaXRzIjpbeyJ0aWVyIjoiZGV2ZWxvcGVyL3NpbHZlciIsInR5cGUiOiJ0aHJvdHRsaW5nIn0seyJjaWRycyI6WyI0NS43OS4yMTguNzkiXSwidHlwZSI6ImNsaWVudCJ9XX0.uW2ApDK1wsAtvD-ImkvPjILVs2thX7bgOM0W58aVdrDUSZPSsM5kajMY81E-mmN264AZ2UIDovvM-mHB4jiAeQ"
    })
    @GET("clans/%23{id}/members")//2200JG8L
    Call<ClanMembers> getClanMembers(@Path("id") String id);
}
