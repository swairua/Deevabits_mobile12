package com.example.newsapp.ui.Wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.newsapp.R;
import com.example.newsapp.WebViewController;

public class WalletFragment extends Fragment {

    private WalletViewModel walletViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        walletViewModel =
                new ViewModelProvider(this).get(WalletViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        WebView webView=root.findViewById(R.id.web_view_hindustan);
        webView.loadUrl("https://deevabits-z3pp5.ondigitalocean.app/wallet.php");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}