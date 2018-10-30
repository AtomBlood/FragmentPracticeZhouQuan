package fdn.f.f.fragmentpracticezhouquan.fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;

import fdn.f.f.fragmentpracticezhouquan.R;

public class NavigationFragment extends BaseFragment implements  View.OnClickListener {

    private LinearLayout tabItemHome;
    private LinearLayout tabItemCategory;
    private LinearLayout tabItemCart;
    private LinearLayout tabItemPersonal;
    private ImageButton tabItemHomeBtn;
    private ImageButton tabItemCategoryBtn;
    private ImageButton tabItemCartBtn;
    private ImageButton tabItemPersonalBtn;
    private FragmentManager fragmentManager;
    private Fragment homeFragment;
    private Fragment categoryFragment;
    private Fragment cartFragment;
    private Fragment personalFragment;
    private int currentID;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigation, container, false);
        initViews(view);
        setTabSelection(R.id.tab_item_home);
        return view;
    }

    private void initViews(View view) {
        tabItemHome = (LinearLayout) view.findViewById(R.id.tab_item_home);
        tabItemHome.setOnClickListener(this);

        tabItemCategory = (LinearLayout) view.findViewById(R.id.tab_item_category);
        tabItemCategory.setOnClickListener(this);

        tabItemCart = (LinearLayout) view.findViewById(R.id.tab_item_cart);
        tabItemCart.setOnClickListener(this);

        tabItemPersonal = (LinearLayout) view.findViewById(R.id.tab_item_personal);
        tabItemPersonal.setOnClickListener(this);

        tabItemHomeBtn = (ImageButton) view.findViewById(R.id.tab_item_home_btn);
        tabItemCategoryBtn = (ImageButton) view.findViewById(R.id.tab_item_category_btn);
        tabItemCartBtn = (ImageButton) view.findViewById(R.id.tab_item_cart_btn);
        tabItemPersonalBtn = (ImageButton) view.findViewById(R.id.tab_item_personal_btn);

        fragmentManager = getFragmentManager();

    }

    @Override
    public void onClick(View v) {
        setTabSelection(v.getId());
    }

    public void setTabSelection(int id) {

        tabItemHomeBtn.setImageResource(R.drawable.tab_item_home_focus);
        tabItemCategoryBtn.setImageResource(R.drawable.tab_item_category_focus);
        tabItemCartBtn.setImageResource(R.drawable.tab_item_cart_focus);
        tabItemPersonalBtn.setImageResource(R.drawable.tab_item_personal_focus);


        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        if (homeFragment!=null)
            fragmentTransaction.hide(homeFragment);

        if (categoryFragment!=null) {
            fragmentTransaction.hide(categoryFragment);
        }

        if (cartFragment!=null)
            fragmentTransaction.hide(cartFragment);

        if (personalFragment!=null)
            fragmentTransaction.hide(personalFragment);

        switch (id){
            case R.id.tab_item_home:
                tabItemHomeBtn.setImageResource(R.drawable.tab_item_home_normal);
                if (homeFragment == null){
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.content,homeFragment);
                } else {
                    fragmentTransaction.show(homeFragment);
                }
                break;

            case R.id.tab_item_category:
                tabItemCategoryBtn.setImageResource(R.drawable.tab_item_category_normal);
                if (categoryFragment == null){
                    categoryFragment = new CategoryFragment();
                    fragmentTransaction.add(R.id.content,categoryFragment);
                } else {
                    fragmentTransaction.show(categoryFragment);
                }
                break;

            case R.id.tab_item_cart:
                tabItemCartBtn.setImageResource(R.drawable.tab_item_cart_normal);
                if (cartFragment == null){
                    cartFragment = new CartFragment();
                    fragmentTransaction.add(R.id.content,cartFragment);
                } else {
                    fragmentTransaction.show(cartFragment);
                }
                break;

            case R.id.tab_item_personal:
                tabItemPersonalBtn.setImageResource(R.drawable.tab_item_personal_normal);
                if (personalFragment == null){
                    personalFragment = new PersonalFragment();
                    fragmentTransaction.add(R.id.content,personalFragment);
                } else {
                    fragmentTransaction.show(personalFragment);
                }
                break;
        }
        fragmentTransaction.commit();
        currentID = id;

    }

}