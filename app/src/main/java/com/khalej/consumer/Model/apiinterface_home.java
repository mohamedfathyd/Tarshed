package com.khalej.consumer.Model;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface apiinterface_home {

    @FormUrlEncoded
    @POST("montag/Consumer/Consumer_login.php")
    Call<List<contact_userinfo>> getcontacts_login(@Field("phonee") String phone, @Field("passw") String password, @Field("usertype") int user);
    @FormUrlEncoded
    @POST("montag/Consumer/Consumer_Registraion.php")
    Call<ResponseBody> getcontacts_newaccount(@Field("name") String name, @Field("password") String password, @Field("address") String address,
                                              @Field("phone") String phone, @Field("usertype") int user);

    @GET("montag/Consumer/Consumer_annonce.php")
    Call<List<contact_annonce>> getcontacts_annonce();
    @GET("montag/Consumer/Consumer_first_category.php")
    Call<List<contact_home>> getcontacts_first();
    @FormUrlEncoded
    @POST("montag/Consumer/Consumer_add_order.php")
    Call<ResponseBody> getcontacts_order(@Field("name") String name,@Field("phone") String phone,@Field("address") String address,
                                         @Field("sud_id") int sud_id,@Field("charge") double charge
    );

    @FormUrlEncoded
    @POST("montag/Consumer/Consumer_add_category.php")
    Call<ResponseBody> getcontacts_add_first_category(@Field("name") String name, @Field("image") String image,
                                                      @Field("price") String price,@Field("description")String description );

    @FormUrlEncoded
    @POST("montag/Consumer/Tarched_delete_category.php")
    Call<ResponseBody> delete_first(@Field("id") int id);
    @FormUrlEncoded
    @POST("montag/Consumer/Consumer_add_annonce.php") Call<ResponseBody> getcontacts_add_annonce(@Field("image") String image);
    @FormUrlEncoded
    @POST("montag/Consumer/Consumer_delete_annonce.php")
    Call<ResponseBody> delete_annonce(@Field("id") int id);
    @FormUrlEncoded
    @POST("montag/Consumer/Consumer_update_point.php")
    Call<ResponseBody> chargepoints(@Field("id") int id,@Field("points") int  points);
    @FormUrlEncoded
    @POST("montag/Consumer/Consumer_delete_order.php")
    Call<ResponseBody> delete_order(@Field("id") int id);

    @GET("montag/Consumer/Consumer_all_neworders.php")
    Call<List<contact_order>> get_all_neworders();
    @GET("montag/Consumer/Consumer_all_users.php")
    Call<List<contact_userinfo>> get_all_users();
    @FormUrlEncoded
    @POST("montag/Consumer/Consumer_get_point.php")
    Call<ResponseBody> getpoints(@Field("id") int id,@Field("points") int  points);
}

