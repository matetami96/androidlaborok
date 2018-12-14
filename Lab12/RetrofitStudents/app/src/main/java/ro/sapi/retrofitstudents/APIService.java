package ro.sapi.retrofitstudents;

import java.util.List;

import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {

    @GET("students/{id}")
    public Call<Student> getStudentWithId(@Path("id") int id);

    @DELETE("students/{id}")
    public Call<Student> deleteStudentWithId(@Path("id") int id);

    //Insert new Student
    @FormUrlEncoded
    @POST("students")
    public Call<Student> createStudent(

            @Field("nev") String nev,
            @Field("szak") String szak,
            @Field("evfolyam") Integer evfolyam

    );

}
