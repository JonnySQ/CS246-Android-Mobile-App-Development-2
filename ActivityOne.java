package cs246stuff.week06;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void create(){

        String filename = "numbers.txt";

        //context = new Context();

        File file = new File(getFilesDir(), filename);
        try{

            String string = "1 2 3 4 5 6 7 8 9 10";
            //Thread.sleep(250);

            FileOutputStream fs;
            fs = openFileOutput(filename, Context.MODE_PRIVATE);
            fs.write(string.getBytes());
            fs.close();

        }

        catch (Exception e) {

            e.printStackTrace();

        }




    }
    
    public void load(){
        try {
            FileInputStream fin = openFileInput("number.txt");
            //int chunk;
            //String munch="";
            //while ((chunk = fin.read()) != -1){
            //    munch = munch + Character.toString((char)chunk);
            //}


            fin.close();
        }
        catch (Exception e) {

            e.printStackTrace();
        }




    }

    public void clear(){


    }
}
