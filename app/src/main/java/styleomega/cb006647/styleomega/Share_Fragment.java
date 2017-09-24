package styleomega.cb006647.styleomega;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by AnverMAM on 8/26/2017.
 */

public class Share_Fragment extends Fragment {


    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.share,container,false);



        Button tweet;
        tweet = (Button) myView.findViewById(R.id.btnProd);
        tweet.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://twitter.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        Button gram;
        gram = (Button) myView.findViewById(R.id.btnGram);
        gram.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.instagram.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });






        return myView;
    }
}