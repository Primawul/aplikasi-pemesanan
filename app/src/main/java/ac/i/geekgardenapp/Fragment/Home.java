package ac.i.geekgardenapp.Fragment;

import ac.i.geekgardenapp.Activity.Jasa;
import ac.i.geekgardenapp.Activity.Produk;
import ac.i.geekgardenapp.Adapter.ImageSliderSatu;
import ac.i.geekgardenapp.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState ) {
        View view=  inflater.inflate(R.layout.fragment_home, container, false);

        CardView cvproduk = (CardView) view.findViewById(R.id.produk);
        cvproduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), Produk.class);
                startActivity(i);
            }
        });

        CardView cvjasa = (CardView) view.findViewById(R.id.jasa);
        cvjasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Jasa.class);
                startActivity(i);
            }
        });

        SliderView sliderView = view.findViewById(R.id.imageSlider);//as recyclerview

        ImageSliderSatu adapter = new ImageSliderSatu(getActivity());//as adapter

        sliderView.setSliderAdapter(adapter);

        //sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

        return view;
    }
}