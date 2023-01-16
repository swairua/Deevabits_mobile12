package com.example.newsapp.ui.Gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.newsapp.R;
import com.example.newsapp.WebViewController;

public class GalleryFragment extends Fragment {

    private com.example.newsapp.ui.Gallery.GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(com.example.newsapp.ui.Gallery.GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        WebView webView=root.findViewById(R.id.web_view_toi);
        webView.loadUrl("https://deevabits-z3pp5.ondigitalocean.app/sacco.php");

        webView.setWebViewClient(new WebViewController());
        return root;
    }
}