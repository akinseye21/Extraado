package mobile.extraado.com;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CardDetail.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CardDetail#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CardDetail extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private TabLayout tab;
    private ViewPager viewpager;
    ViewPagerAdapter2 viewPagerAdapter2;

    LinearLayout back;

    public CardDetail() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CardDetail.
     */
    // TODO: Rename and change types and number of parameters
    public static CardDetail newInstance(String param1, String param2) {
        CardDetail fragment = new CardDetail();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_card_detail, container, false);

         final TabLayout tabLayout = getActivity().findViewById(R.id.tabLayout);

         tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
             @Override
             public void onTabSelected(TabLayout.Tab tab) {

                 if (tabLayout.getSelectedTabPosition() == 1){
                     Toast.makeText(getContext(), "Go back first", Toast.LENGTH_SHORT).show();
//                     // Create new fragment and transaction
//                     Fragment newFragment = new FragmentFavorite();
//                     FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//                     // Replace whatever is in the old fragment view with this fragment,
//                     // and add the transaction to the back stack if needed
//                     transaction.replace(R.id.framelayout, newFragment);
//                     transaction.addToBackStack(null);
//                     // Commit the transaction
//                     transaction.commit();
                 }

                 if (tabLayout.getSelectedTabPosition() == 2){
                     Toast.makeText(getContext(), "Go back first", Toast.LENGTH_SHORT).show();
//                     // Create new fragment and transaction
//                     Fragment newFragment = new FragmentBooking();
//                     FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//                     // Replace whatever is in the old fragment view with this fragment,
//                     // and add the transaction to the back stack if needed
//                     transaction.replace(R.id.framelayout, newFragment);
//                     transaction.addToBackStack(null);
//                     // Commit the transaction
//                     transaction.commit();
                 }

             }

             @Override
             public void onTabUnselected(TabLayout.Tab tab) {

             }

             @Override
             public void onTabReselected(TabLayout.Tab tab) {

             }
         });

        viewpager = v.findViewById(R.id.viewpager);
        tab = v.findViewById(R.id.tabLayout);
        back = v.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Dashboard.class);
                startActivity(i);
            }
        });

        viewPagerAdapter2 = new ViewPagerAdapter2(getChildFragmentManager());
        viewpager.setAdapter(viewPagerAdapter2);

        tab.setupWithViewPager(viewpager);

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
