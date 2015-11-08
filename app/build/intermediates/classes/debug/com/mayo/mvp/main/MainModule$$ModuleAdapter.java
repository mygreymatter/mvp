// Code generated by dagger-compiler.  Do not edit.
package com.mayo.mvp.main;

import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class MainModule$$ModuleAdapter extends ModuleAdapter<MainModule> {
  private static final String[] INJECTS = { "members/com.mayo.mvp.main.model.ActMain", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public MainModule$$ModuleAdapter() {
    super(com.mayo.mvp.main.MainModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, false /*complete*/, true /*library*/);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, MainModule module) {
    bindings.contributeProvidesBinding("com.mayo.mvp.main.view.ViewMain", new ProvideViewMainProvidesAdapter(module));
    bindings.contributeProvidesBinding("com.mayo.mvp.main.presenter.PresenterMain", new ProvidePresenterMainProvidesAdapter(module));
  }

  /**
   * A {@code Binding<com.mayo.mvp.main.view.ViewMain>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.mayo.mvp.main.view.ViewMain>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideViewMainProvidesAdapter extends ProvidesBinding<com.mayo.mvp.main.view.ViewMain>
      implements Provider<com.mayo.mvp.main.view.ViewMain> {
    private final MainModule module;

    public ProvideViewMainProvidesAdapter(MainModule module) {
      super("com.mayo.mvp.main.view.ViewMain", IS_SINGLETON, "com.mayo.mvp.main.MainModule", "provideViewMain");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.mayo.mvp.main.view.ViewMain>}.
     */
    @Override
    public com.mayo.mvp.main.view.ViewMain get() {
      return module.provideViewMain();
    }
  }

  /**
   * A {@code Binding<com.mayo.mvp.main.presenter.PresenterMain>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code com.mayo.mvp.main.presenter.PresenterMain} and its
   * dependencies.
   *
   * Being a {@code Provider<com.mayo.mvp.main.presenter.PresenterMain>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidePresenterMainProvidesAdapter extends ProvidesBinding<com.mayo.mvp.main.presenter.PresenterMain>
      implements Provider<com.mayo.mvp.main.presenter.PresenterMain> {
    private final MainModule module;
    private Binding<com.mayo.mvp.main.view.ViewMain> viewMain;

    public ProvidePresenterMainProvidesAdapter(MainModule module) {
      super("com.mayo.mvp.main.presenter.PresenterMain", IS_SINGLETON, "com.mayo.mvp.main.MainModule", "providePresenterMain");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      viewMain = (Binding<com.mayo.mvp.main.view.ViewMain>) linker.requestBinding("com.mayo.mvp.main.view.ViewMain", MainModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(viewMain);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.mayo.mvp.main.presenter.PresenterMain>}.
     */
    @Override
    public com.mayo.mvp.main.presenter.PresenterMain get() {
      return module.providePresenterMain(viewMain.get());
    }
  }
}