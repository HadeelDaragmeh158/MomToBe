// Generated by view binder compiler. Do not edit!
package com.example.momtobe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.momtobe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddProductBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView avatar;

  @NonNull
  public final Button btnAddProduct;

  @NonNull
  public final EditText editProductDesc;

  @NonNull
  public final EditText editProductName;

  @NonNull
  public final EditText editProductPrice;

  @NonNull
  public final EditText editProductQuantity;

  @NonNull
  public final RelativeLayout lytAvatar;

  @NonNull
  public final TextView pageTitle;

  private ActivityAddProductBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView avatar,
      @NonNull Button btnAddProduct, @NonNull EditText editProductDesc,
      @NonNull EditText editProductName, @NonNull EditText editProductPrice,
      @NonNull EditText editProductQuantity, @NonNull RelativeLayout lytAvatar,
      @NonNull TextView pageTitle) {
    this.rootView = rootView;
    this.avatar = avatar;
    this.btnAddProduct = btnAddProduct;
    this.editProductDesc = editProductDesc;
    this.editProductName = editProductName;
    this.editProductPrice = editProductPrice;
    this.editProductQuantity = editProductQuantity;
    this.lytAvatar = lytAvatar;
    this.pageTitle = pageTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatar;
      ImageView avatar = ViewBindings.findChildViewById(rootView, id);
      if (avatar == null) {
        break missingId;
      }

      id = R.id.btn_add_product;
      Button btnAddProduct = ViewBindings.findChildViewById(rootView, id);
      if (btnAddProduct == null) {
        break missingId;
      }

      id = R.id.edit_product_desc;
      EditText editProductDesc = ViewBindings.findChildViewById(rootView, id);
      if (editProductDesc == null) {
        break missingId;
      }

      id = R.id.edit_product_name;
      EditText editProductName = ViewBindings.findChildViewById(rootView, id);
      if (editProductName == null) {
        break missingId;
      }

      id = R.id.edit_product_price;
      EditText editProductPrice = ViewBindings.findChildViewById(rootView, id);
      if (editProductPrice == null) {
        break missingId;
      }

      id = R.id.edit_product_quantity;
      EditText editProductQuantity = ViewBindings.findChildViewById(rootView, id);
      if (editProductQuantity == null) {
        break missingId;
      }

      id = R.id.lyt_avatar;
      RelativeLayout lytAvatar = ViewBindings.findChildViewById(rootView, id);
      if (lytAvatar == null) {
        break missingId;
      }

      id = R.id.page_title;
      TextView pageTitle = ViewBindings.findChildViewById(rootView, id);
      if (pageTitle == null) {
        break missingId;
      }

      return new ActivityAddProductBinding((ConstraintLayout) rootView, avatar, btnAddProduct,
          editProductDesc, editProductName, editProductPrice, editProductQuantity, lytAvatar,
          pageTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
