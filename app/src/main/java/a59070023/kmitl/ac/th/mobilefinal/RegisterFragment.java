package a59070023.kmitl.ac.th.mobilefinal;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterFragment extends Fragment {

    SQLiteDatabase database;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.register_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initRegisterNewAccount();
    }

    void initRegisterNewAccount()
    {
        Button registerButton =getView().findViewById(R.id.register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userId = getView().findViewById(R.id.register_user);
                EditText name = getView().findViewById(R.id.register_name);
                EditText age = getView().findViewById(R.id.register_age);
                EditText password = getView().findViewById(R.id.register_password);
                String strUserId = userId.getText().toString();
                String strName = name.getText().toString();
                String strAge = age.getText().toString();
                String strPassword = password.getText().toString();

                if (strUserId.length() < 6 || strUserId.length() > 12)
                {
                    Toast.makeText(getActivity(),"ใส่ได้แค่ 6-12 ตัว", Toast.LENGTH_SHORT).show();
                }
                if (strPassword.length() <= 6)
                {
                    Toast.makeText(getActivity(),"ใส่ให้มากกว่า 6 ตัว", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
