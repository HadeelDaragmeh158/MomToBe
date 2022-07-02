// Generated by view binder compiler. Do not edit!
package com.example.momtobe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.momtobe.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityExperianceBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final FloatingActionButton QuestionAddImg;

  @NonNull
  public final RecyclerView RecycleComment;

  @NonNull
  public final BottomNavigationView bottomNavigator;

  @NonNull
  public final TextView textView3;

  private ActivityExperianceBinding(@NonNull RelativeLayout rootView,
      @NonNull FloatingActionButton QuestionAddImg, @NonNull RecyclerView RecycleComment,
      @NonNull BottomNavigationView bottomNavigator, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.QuestionAddImg = QuestionAddImg;
    this.RecycleComment = RecycleComment;
    this.bottomNavigator = bottomNavigator;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExperianceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExperianceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_experiance, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExperianceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Question_add_img;
      FloatingActionButton QuestionAddImg = ViewBindings.findChildViewById(rootView, id);
      if (QuestionAddImg == null) {
        break missingId;
      }

      id = R.id.Recycle_Comment;
      RecyclerView RecycleComment = ViewBindings.findChildViewById(rootView, id);
      if (RecycleComment == null) {
        break missingId;
      }

      id = R.id.bottom_navigator;
      BottomNavigationView bottomNavigator = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigator == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new ActivityExperianceBinding((RelativeLayout) rootView, QuestionAddImg,
          RecycleComment, bottomNavigator, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
