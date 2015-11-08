// Generated code from Butter Knife. Do not modify!
package com.mayo.mvp.login.model;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ActLogin$$ViewBinder<T extends com.mayo.mvp.login.model.ActLogin> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492897, "field 'username'");
    target.username = finder.castView(view, 2131492897, "field 'username'");
    view = finder.findRequiredView(source, 2131492898, "field 'password'");
    target.password = finder.castView(view, 2131492898, "field 'password'");
  }

  @Override public void unbind(T target) {
    target.username = null;
    target.password = null;
  }
}
