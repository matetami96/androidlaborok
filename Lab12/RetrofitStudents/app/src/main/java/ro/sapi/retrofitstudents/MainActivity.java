package ro.sapi.retrofitstudents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView editText = findViewById(R.id.editText);
        final Button btnGet = findViewById(R.id.buttonGet);
        final Button btnDelete = findViewById(R.id.buttonDelete);
        final TextView id = findViewById(R.id.id);
        final TextView szak = findViewById(R.id.szak);
        final TextView nev = findViewById(R.id.nev);
        final TextView evfolyam = findViewById(R.id.evfolyam);
        final TextView editName = findViewById(R.id.editName);
        final TextView editSzak = findViewById(R.id.editSzak);
        final TextView editEvfolyam = findViewById(R.id.editEvfolyam);
        final Button btnAdd = findViewById(R.id.addStudent);
        final APIService service = RetrofitClient.getRetrofitInstance().create(APIService.class);

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Call<Student> call =service.getStudentWithId(Integer.valueOf(editText.getText().toString()));

                call.enqueue(new Callback<Student>() {

                    @Override
                    public void onResponse(Call<Student> call, Response<Student> response) {
                        Student student = response.body();
                        id.setText(student.getId().toString());
                        nev.setText(student.getNev());
                        szak.setText(student.getSzak());
                        evfolyam.setText(student.getEvfolyam().toString());
                    }

                    @Override
                    public void onFailure(Call<Student> call, Throwable t) {
                        t.printStackTrace();
                    }

                });
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Call<Student> call = service.deleteStudentWithId(Integer.valueOf(editText.getText().toString()));

                call.enqueue(new Callback<Student>() {

                    @Override
                    public void onResponse(Call<Student> call, Response<Student> response) {
                        Student student = response.body();
                        id.setText(student.getId().toString());
                        nev.setText(student.getNev());
                        szak.setText(student.getSzak());
                        evfolyam.setText(student.getEvfolyam().toString());
                    }

                    @Override
                    public void onFailure(Call<Student> call, Throwable t) {
                        t.printStackTrace();
                    }

                });

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Call<Student> call = service.createStudent(editName.getText().toString(),editSzak.getText().toString(),Integer.valueOf(editEvfolyam.getText().toString()));

                call.enqueue(new Callback<Student>() {

                    @Override
                    public void onResponse(Call<Student> call, Response<Student> response) {
                        Student student = response.body();
                        id.setText(student.getId().toString());
                        nev.setText(student.getNev());
                        szak.setText(student.getSzak());
                        evfolyam.setText(student.getEvfolyam().toString());
                    }

                    @Override
                    public void onFailure(Call<Student> call, Throwable t) {
                        t.printStackTrace();
                    }

                });

            }
        });
    }
}
