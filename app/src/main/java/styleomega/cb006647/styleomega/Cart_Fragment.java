package styleomega.cb006647.styleomega;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by AnverMAM on 7/19/2017.
 */

public class Cart_Fragment extends Fragment {


    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.cart,container,false);

        Button cart;
        cart = (Button) myView.findViewById(R.id.btnCart);
        cart.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), CartActivity.class);
                intent.putExtra("emailholder",getArguments().getString("emailholder"));
                startActivity(intent);
            }
        });

        Button checkout;
        checkout = (Button) myView.findViewById(R.id.btnProd);
        checkout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Home.class);
                startActivity(intent);

            }
        });

        return myView;
    }
}
