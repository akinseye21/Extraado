package mobile.extraado.com;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentExplore.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentExplore#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentExplore extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    ImageView imgView;
    LinearLayout exploreSearch;
    RelativeLayout searchRel;
    RelativeLayout all, hairsalon, barber, nailsalon, salon2, barber22;
    TextView alltext, hairsaontext, barbertext, nailsalontext, salon2text, barber22text;
    ImageView allimg;
    HorizontalScrollView hsv;
    LinearLayout realsearch;
    ScrollView scrollView;
    LinearLayout myLinLay;
    RelativeLayout cardClick;

    public FragmentExplore() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentExplore.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentExplore newInstance(String param1, String param2) {
        FragmentExplore fragment = new FragmentExplore();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_explore, container, false);


        all = v.findViewById(R.id.all);
        alltext = v.findViewById(R.id.alltext);
        allimg = v.findViewById(R.id.picall);
//        allimg.setColorFilter(ContextCompat.getColor(getContext(), R.color.colorAccent), android.graphics.PorterDuff.Mode.MULTIPLY);
        hairsalon = v.findViewById(R.id.hairsalon);
        hairsaontext = v.findViewById(R.id.hairsalontext);
        barber = v.findViewById(R.id.barber);
        barbertext = v.findViewById(R.id.barbertext);
        nailsalon = v.findViewById(R.id.nailsalon);
        nailsalontext = v.findViewById(R.id.nailsalontext);
        salon2 = v.findViewById(R.id.salon2);
        salon2text = v.findViewById(R.id.salon2text);
        barber22 = v.findViewById(R.id.barber22);
        barber22text = v.findViewById(R.id.barber22text);

        //all is the default view

        //view and look for  hairsalon when clicked
        hairsalon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hairsalon.getBackground().equals(R.drawable.blue_layout)){
                    //do nothing because it is in view already
                    Toast.makeText(getContext(), "Hair salon is in view", Toast.LENGTH_SHORT).show();
                }
                else{
                    hairsalon.setBackgroundResource(R.drawable.blue_layout);
                    hairsaontext.setTextColor(Color.parseColor("#ffffff"));
                    //set the view to hairsalon
                    //change other relative layout background to white
                    all.setBackgroundResource(R.drawable.plain_white_layout);
                    alltext.setTextColor(Color.parseColor("#b8b7b7"));
                    allimg.setColorFilter(ContextCompat.getColor(getContext(), R.color.colorScroll), android.graphics.PorterDuff.Mode.MULTIPLY);
                    barber.setBackgroundResource(R.drawable.plain_white_layout);
                    barbertext.setTextColor(Color.parseColor("#b8b7b7"));
                    nailsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    nailsalontext.setTextColor(Color.parseColor("#b8b7b7"));
                    salon2.setBackgroundResource(R.drawable.plain_white_layout);
                    salon2text.setTextColor(Color.parseColor("#b8b7b7"));
                    barber22.setBackgroundResource(R.drawable.plain_white_layout);
                    barber22text.setTextColor(Color.parseColor("#b8b7b7"));
                }
            }
        });

        //view and look for  barber when clicked
        barber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(barber.getBackground().equals(R.drawable.blue_layout)){
                    //do nothing because it is in view already
                    Toast.makeText(getContext(), "Barber is in view", Toast.LENGTH_SHORT).show();
                }
                else{
                    barber.setBackgroundResource(R.drawable.blue_layout);
                    barbertext.setTextColor(Color.parseColor("#ffffff"));
                    //set the view to hairsalon
                    //change other relative layout background to white
                    all.setBackgroundResource(R.drawable.plain_white_layout);
                    alltext.setTextColor(Color.parseColor("#b8b7b7"));
                    allimg.setColorFilter(ContextCompat.getColor(getContext(), R.color.colorScroll), android.graphics.PorterDuff.Mode.MULTIPLY);
                    hairsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    hairsaontext.setTextColor(Color.parseColor("#b8b7b7"));
                    nailsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    nailsalontext.setTextColor(Color.parseColor("#b8b7b7"));
                    salon2.setBackgroundResource(R.drawable.plain_white_layout);
                    salon2text.setTextColor(Color.parseColor("#b8b7b7"));
                    barber22.setBackgroundResource(R.drawable.plain_white_layout);
                    barber22text.setTextColor(Color.parseColor("#b8b7b7"));
                }
            }
        });

        //view and look for  nailsalon when clicked
        nailsalon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nailsalon.getBackground().equals(R.drawable.blue_layout)){
                    //do nothing because it is in view already
                    Toast.makeText(getContext(), "Nail salon is in view", Toast.LENGTH_SHORT).show();
                }
                else{
                    nailsalon.setBackgroundResource(R.drawable.blue_layout);
                    nailsalontext.setTextColor(Color.parseColor("#ffffff"));
                    //set the view to hairsalon
                    //change other relative layout background to white
                    all.setBackgroundResource(R.drawable.plain_white_layout);
                    alltext.setTextColor(Color.parseColor("#b8b7b7"));
                    allimg.setColorFilter(ContextCompat.getColor(getContext(), R.color.colorScroll), android.graphics.PorterDuff.Mode.MULTIPLY);
                    hairsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    hairsaontext.setTextColor(Color.parseColor("#b8b7b7"));
                    barber.setBackgroundResource(R.drawable.plain_white_layout);
                    barbertext.setTextColor(Color.parseColor("#b8b7b7"));
                    salon2.setBackgroundResource(R.drawable.plain_white_layout);
                    salon2text.setTextColor(Color.parseColor("#b8b7b7"));
                    barber22.setBackgroundResource(R.drawable.plain_white_layout);
                    barber22text.setTextColor(Color.parseColor("#b8b7b7"));
                }
            }
        });

        //view and look for  salon2 when clicked
        salon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(salon2.getBackground().equals(R.drawable.blue_layout)){
                    //do nothing because it is in view already
                    Toast.makeText(getContext(), "Salon2 is in view", Toast.LENGTH_SHORT).show();
                }
                else{
                    salon2.setBackgroundResource(R.drawable.blue_layout);
                    salon2text.setTextColor(Color.parseColor("#ffffff"));
                    //set the view to hairsalon
                    //change other relative layout background to white
                    all.setBackgroundResource(R.drawable.plain_white_layout);
                    alltext.setTextColor(Color.parseColor("#b8b7b7"));
                    allimg.setColorFilter(ContextCompat.getColor(getContext(), R.color.colorScroll), android.graphics.PorterDuff.Mode.MULTIPLY);
                    hairsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    hairsaontext.setTextColor(Color.parseColor("#b8b7b7"));
                    nailsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    nailsalontext.setTextColor(Color.parseColor("#b8b7b7"));
                    nailsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    nailsalontext.setTextColor(Color.parseColor("#b8b7b7"));
                    barber22.setBackgroundResource(R.drawable.plain_white_layout);
                    barber22text.setTextColor(Color.parseColor("#b8b7b7"));
                }
            }
        });

        //view and look for  barber22 when clicked
        barber22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(barber22.getBackground().equals(R.drawable.blue_layout)){
                    //do nothing because it is in view already
                    Toast.makeText(getContext(), "Barber22 is in view", Toast.LENGTH_SHORT).show();
                }
                else{
                    barber22.setBackgroundResource(R.drawable.blue_layout);
                    barber22text.setTextColor(Color.parseColor("#ffffff"));
                    //set the view to hairsalon
                    //change other relative layout background to white
                    all.setBackgroundResource(R.drawable.plain_white_layout);
                    alltext.setTextColor(Color.parseColor("#b8b7b7"));
                    allimg.setColorFilter(ContextCompat.getColor(getContext(), R.color.colorScroll), android.graphics.PorterDuff.Mode.MULTIPLY);
                    hairsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    hairsaontext.setTextColor(Color.parseColor("#b8b7b7"));
                    nailsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    nailsalontext.setTextColor(Color.parseColor("#b8b7b7"));
                    salon2.setBackgroundResource(R.drawable.plain_white_layout);
                    salon2text.setTextColor(Color.parseColor("#b8b7b7"));
                    barber.setBackgroundResource(R.drawable.plain_white_layout);
                    barbertext.setTextColor(Color.parseColor("#b8b7b7"));
                }
            }
        });

        //view and look for  all when clicked
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(all.getBackground().equals(R.drawable.blue_layout)){
                    //do nothing because it is in view already
                    Toast.makeText(getContext(), "All is in view", Toast.LENGTH_SHORT).show();
                }
                else{
                    all.setBackgroundResource(R.drawable.blue_layout);
                    alltext.setTextColor(Color.parseColor("#ffffff"));
                    //set the view to hairsalon
                    //change other relative layout background to white
                    barber.setBackgroundResource(R.drawable.plain_white_layout);
                    barbertext.setTextColor(Color.parseColor("#b8b7b7"));
                    allimg.setColorFilter(ContextCompat.getColor(getContext(), R.color.colorScroll), android.graphics.PorterDuff.Mode.MULTIPLY);
                    hairsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    hairsaontext.setTextColor(Color.parseColor("#b8b7b7"));
                    nailsalon.setBackgroundResource(R.drawable.plain_white_layout);
                    nailsalontext.setTextColor(Color.parseColor("#b8b7b7"));
                    salon2.setBackgroundResource(R.drawable.plain_white_layout);
                    salon2text.setTextColor(Color.parseColor("#b8b7b7"));
                    barber22.setBackgroundResource(R.drawable.plain_white_layout);
                    barber22text.setTextColor(Color.parseColor("#b8b7b7"));
                }
            }
        });


        searchRel = v.findViewById(R.id.searchrel);
        hsv = v.findViewById(R.id.hsv);
        realsearch = v.findViewById(R.id.realSearch);
        myLinLay = v.findViewById(R.id.myLinLayout);
        cardClick = v.findViewById(R.id.cardClick1);
        cardClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create new fragment and transaction
                Fragment newFragment = new CardDetail();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                // Replace whatever is in the old fragment view with this fragment,
                // and add the transaction to the back stack if needed
                transaction.replace(R.id.dashboardFrame, newFragment);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        //access views in root activity
        final View topMenu = getActivity().findViewById(R.id.rel1);


        exploreSearch = v.findViewById(R.id.explore_search);
        exploreSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //converting root activity views
//                if( topMenu instanceof RelativeLayout) {
//                    RelativeLayout rel1 = (RelativeLayout) topMenu;
//                    rel1.setVisibility(View.GONE);
//                }

                // Create new fragment and transaction
                Fragment newFragment = new SearchPage();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                // Replace whatever is in the old fragment view with this fragment,
                // and add the transaction to the back stack if needed
                transaction.replace(R.id.dashboardFrame, newFragment);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();

//                searchRel.setVisibility(View.GONE);
//                hsv.setVisibility(View.GONE);
//                realsearch.setVisibility(View.VISIBLE);
//                myLinLay.setVisibility(View.GONE);
            }
        });

        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
