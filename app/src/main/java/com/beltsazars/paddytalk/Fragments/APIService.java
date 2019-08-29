package com.beltsazars.paddytalk.Fragments;

import com.beltsazars.paddytalk.Notifications.MyResponse;
import com.beltsazars.paddytalk.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAABP84qMM:APA91bHSeSXbyX472Z4Woq4w9U0vtxXzHbE22A-pfnhdlq5tq_rZBEOkHx4VLDapPUxdozdwAoJJSVrJO29xOCGmh8o5O0_0z7fZ23kbS2ETmUd4Dr_yH0yvtVA0UTCqUCQE7HLycuzG"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
