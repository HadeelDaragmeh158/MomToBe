// Generated by view binder compiler. Do not edit!
package com.example.momtobe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.momtobe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MenuBlogsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView blogDesc;

  @NonNull
  public final TextView blogTitle;

  private MenuBlogsBinding(@NonNull LinearLayout rootView, @NonNull TextView blogDesc,
      @NonNull TextView blogTitle) {
    this.rootView = rootView;
    this.blogDesc = blogDesc;
    this.blogTitle = blogTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MenuBlogsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MenuBlogsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.menu_blogs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MenuBlogsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.blog_desc;
      TextView blogDesc = ViewBindings.findChildViewById(rootView, id);
      if (blogDesc == null) {
        break missingId;
      }

      id = R.id.blog_title;
      TextView blogTitle = ViewBindings.findChildViewById(rootView, id);
      if (blogTitle == null) {
        break missingId;
      }

      return new MenuBlogsBinding((LinearLayout) rootView, blogDesc, blogTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
