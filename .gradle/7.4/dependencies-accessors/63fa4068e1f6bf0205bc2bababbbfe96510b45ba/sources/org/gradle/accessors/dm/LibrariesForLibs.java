package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final ApacheLibraryAccessors laccForApacheLibraryAccessors = new ApacheLibraryAccessors(owner);
    private final ArchLibraryAccessors laccForArchLibraryAccessors = new ArchLibraryAccessors(owner);
    private final BuildLibraryAccessors laccForBuildLibraryAccessors = new BuildLibraryAccessors(owner);
    private final DaggerLibraryAccessors laccForDaggerLibraryAccessors = new DaggerLibraryAccessors(owner);
    private final DebugLibraryAccessors laccForDebugLibraryAccessors = new DebugLibraryAccessors(owner);
    private final EspressoLibraryAccessors laccForEspressoLibraryAccessors = new EspressoLibraryAccessors(owner);
    private final GreenrobotLibraryAccessors laccForGreenrobotLibraryAccessors = new GreenrobotLibraryAccessors(owner);
    private final HokoLibraryAccessors laccForHokoLibraryAccessors = new HokoLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final MockitoLibraryAccessors laccForMockitoLibraryAccessors = new MockitoLibraryAccessors(owner);
    private final OkhttpLibraryAccessors laccForOkhttpLibraryAccessors = new OkhttpLibraryAccessors(owner);
    private final RefineLibraryAccessors laccForRefineLibraryAccessors = new RefineLibraryAccessors(owner);
    private final RestrictionLibraryAccessors laccForRestrictionLibraryAccessors = new RestrictionLibraryAccessors(owner);
    private final RetrofitLibraryAccessors laccForRetrofitLibraryAccessors = new RetrofitLibraryAccessors(owner);
    private final RxLibraryAccessors laccForRxLibraryAccessors = new RxLibraryAccessors(owner);
    private final ToolsLibraryAccessors laccForToolsLibraryAccessors = new ToolsLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for circleindicator (me.relex:circleindicator)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCircleindicator() { return create("circleindicator"); }

        /**
         * Creates a dependency provider for elib (foundation.e:elib)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getElib() { return create("elib"); }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() { return create("junit"); }

        /**
         * Creates a dependency provider for mockk (io.mockk:mockk)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockk() { return create("mockk"); }

        /**
         * Creates a dependency provider for robolectric (org.robolectric:robolectric)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRobolectric() { return create("robolectric"); }

        /**
         * Creates a dependency provider for telemetry (foundation.e.lib:telemetry)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTelemetry() { return create("telemetry"); }

        /**
         * Creates a dependency provider for timber (com.jakewharton.timber:timber)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTimber() { return create("timber"); }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() { return laccForAndroidxLibraryAccessors; }

    /**
     * Returns the group of libraries at apache
     */
    public ApacheLibraryAccessors getApache() { return laccForApacheLibraryAccessors; }

    /**
     * Returns the group of libraries at arch
     */
    public ArchLibraryAccessors getArch() { return laccForArchLibraryAccessors; }

    /**
     * Returns the group of libraries at build
     */
    public BuildLibraryAccessors getBuild() { return laccForBuildLibraryAccessors; }

    /**
     * Returns the group of libraries at dagger
     */
    public DaggerLibraryAccessors getDagger() { return laccForDaggerLibraryAccessors; }

    /**
     * Returns the group of libraries at debug
     */
    public DebugLibraryAccessors getDebug() { return laccForDebugLibraryAccessors; }

    /**
     * Returns the group of libraries at espresso
     */
    public EspressoLibraryAccessors getEspresso() { return laccForEspressoLibraryAccessors; }

    /**
     * Returns the group of libraries at greenrobot
     */
    public GreenrobotLibraryAccessors getGreenrobot() { return laccForGreenrobotLibraryAccessors; }

    /**
     * Returns the group of libraries at hoko
     */
    public HokoLibraryAccessors getHoko() { return laccForHokoLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() { return laccForKotlinLibraryAccessors; }

    /**
     * Returns the group of libraries at mockito
     */
    public MockitoLibraryAccessors getMockito() { return laccForMockitoLibraryAccessors; }

    /**
     * Returns the group of libraries at okhttp
     */
    public OkhttpLibraryAccessors getOkhttp() { return laccForOkhttpLibraryAccessors; }

    /**
     * Returns the group of libraries at refine
     */
    public RefineLibraryAccessors getRefine() { return laccForRefineLibraryAccessors; }

    /**
     * Returns the group of libraries at restriction
     */
    public RestrictionLibraryAccessors getRestriction() { return laccForRestrictionLibraryAccessors; }

    /**
     * Returns the group of libraries at retrofit
     */
    public RetrofitLibraryAccessors getRetrofit() { return laccForRetrofitLibraryAccessors; }

    /**
     * Returns the group of libraries at rx
     */
    public RxLibraryAccessors getRx() { return laccForRxLibraryAccessors; }

    /**
     * Returns the group of libraries at tools
     */
    public ToolsLibraryAccessors getTools() { return laccForToolsLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxBenchmarkLibraryAccessors laccForAndroidxBenchmarkLibraryAccessors = new AndroidxBenchmarkLibraryAccessors(owner);
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxRoomLibraryAccessors laccForAndroidxRoomLibraryAccessors = new AndroidxRoomLibraryAccessors(owner);
        private final AndroidxTestLibraryAccessors laccForAndroidxTestLibraryAccessors = new AndroidxTestLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("androidx.appcompat"); }

            /**
             * Creates a dependency provider for localbroadcast (androidx.localbroadcastmanager:localbroadcastmanager)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLocalbroadcast() { return create("androidx.localbroadcast"); }

            /**
             * Creates a dependency provider for profileinstaller (androidx.profileinstaller:profileinstaller)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProfileinstaller() { return create("androidx.profileinstaller"); }

            /**
             * Creates a dependency provider for recyclerview (androidx.recyclerview:recyclerview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRecyclerview() { return create("androidx.recyclerview"); }

        /**
         * Returns the group of libraries at androidx.benchmark
         */
        public AndroidxBenchmarkLibraryAccessors getBenchmark() { return laccForAndroidxBenchmarkLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() { return laccForAndroidxCoreLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.room
         */
        public AndroidxRoomLibraryAccessors getRoom() { return laccForAndroidxRoomLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.test
         */
        public AndroidxTestLibraryAccessors getTest() { return laccForAndroidxTestLibraryAccessors; }

    }

    public static class AndroidxBenchmarkLibraryAccessors extends SubDependencyFactory {

        public AndroidxBenchmarkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (androidx.benchmark:benchmark-macro-junit4)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("androidx.benchmark.junit"); }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.core.ktx"); }

    }

    public static class AndroidxRoomLibraryAccessors extends SubDependencyFactory {

        public AndroidxRoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("androidx.room.compiler"); }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("androidx.room.runtime"); }

    }

    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for espresso (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEspresso() { return create("androidx.test.espresso"); }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("androidx.test.junit"); }

            /**
             * Creates a dependency provider for rules (androidx.test:rules)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRules() { return create("androidx.test.rules"); }

            /**
             * Creates a dependency provider for runner (androidx.test:runner)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRunner() { return create("androidx.test.runner"); }

            /**
             * Creates a dependency provider for uiautomator (androidx.test.uiautomator:uiautomator)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUiautomator() { return create("androidx.test.uiautomator"); }

    }

    public static class ApacheLibraryAccessors extends SubDependencyFactory {

        public ApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for commons (org.apache.commons:commons-lang3)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommons() { return create("apache.commons"); }

    }

    public static class ArchLibraryAccessors extends SubDependencyFactory {

        public ArchLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.arch.core:core-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("arch.core"); }

    }

    public static class BuildLibraryAccessors extends SubDependencyFactory {

        public BuildLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for spotless (com.diffplug.spotless:spotless-plugin-gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSpotless() { return create("build.spotless"); }

    }

    public static class DaggerLibraryAccessors extends SubDependencyFactory {
        private final DaggerAndroidLibraryAccessors laccForDaggerAndroidLibraryAccessors = new DaggerAndroidLibraryAccessors(owner);

        public DaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:dagger-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("dagger.compiler"); }

        /**
         * Returns the group of libraries at dagger.android
         */
        public DaggerAndroidLibraryAccessors getAndroid() { return laccForDaggerAndroidLibraryAccessors; }

    }

    public static class DaggerAndroidLibraryAccessors extends SubDependencyFactory {

        public DaggerAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for processor (com.google.dagger:dagger-android-processor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProcessor() { return create("dagger.android.processor"); }

    }

    public static class DebugLibraryAccessors extends SubDependencyFactory {

        public DebugLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for db (com.amitshekhar.android:debug-db)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDb() { return create("debug.db"); }

    }

    public static class EspressoLibraryAccessors extends SubDependencyFactory {

        public EspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("espresso.core"); }

    }

    public static class GreenrobotLibraryAccessors extends SubDependencyFactory {

        public GreenrobotLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for eventbus (org.greenrobot:eventbus)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEventbus() { return create("greenrobot.eventbus"); }

    }

    public static class HokoLibraryAccessors extends SubDependencyFactory {

        public HokoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for blur (io.github.hokofly:hoko-blur)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBlur() { return create("hoko.blur"); }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {
        private final KotlinStdlibLibraryAccessors laccForKotlinStdlibLibraryAccessors = new KotlinStdlibLibraryAccessors(owner);

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlin.stdlib
         */
        public KotlinStdlibLibraryAccessors getStdlib() { return laccForKotlinStdlibLibraryAccessors; }

    }

    public static class KotlinStdlibLibraryAccessors extends SubDependencyFactory {

        public KotlinStdlibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jdk7 (org.jetbrains.kotlin:kotlin-stdlib-jdk7)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk7() { return create("kotlin.stdlib.jdk7"); }

            /**
             * Creates a dependency provider for jdk8 (org.jetbrains.kotlin:kotlin-stdlib-jdk8)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk8() { return create("kotlin.stdlib.jdk8"); }

    }

    public static class MockitoLibraryAccessors extends SubDependencyFactory {

        public MockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.mockito:mockito-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("mockito.core"); }

    }

    public static class OkhttpLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("okhttp"); }

            /**
             * Creates a dependency provider for logging (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() { return create("okhttp.logging"); }

    }

    public static class RefineLibraryAccessors extends SubDependencyFactory {
        private final RefineAnnotationLibraryAccessors laccForRefineAnnotationLibraryAccessors = new RefineAnnotationLibraryAccessors(owner);

        public RefineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (dev.rikka.tools.refine:runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("refine.runtime"); }

        /**
         * Returns the group of libraries at refine.annotation
         */
        public RefineAnnotationLibraryAccessors getAnnotation() { return laccForRefineAnnotationLibraryAccessors; }

    }

    public static class RefineAnnotationLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public RefineAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotation (dev.rikka.tools.refine:annotation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("refine.annotation"); }

            /**
             * Creates a dependency provider for processor (dev.rikka.tools.refine:annotation-processor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProcessor() { return create("refine.annotation.processor"); }

    }

    public static class RestrictionLibraryAccessors extends SubDependencyFactory {

        public RestrictionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bypass (com.github.ChickenHook:RestrictionBypass)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBypass() { return create("restriction.bypass"); }

    }

    public static class RetrofitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final RetrofitGsonLibraryAccessors laccForRetrofitGsonLibraryAccessors = new RetrofitGsonLibraryAccessors(owner);
        private final RetrofitRxjavaLibraryAccessors laccForRetrofitRxjavaLibraryAccessors = new RetrofitRxjavaLibraryAccessors(owner);

        public RetrofitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("retrofit"); }

        /**
         * Returns the group of libraries at retrofit.gson
         */
        public RetrofitGsonLibraryAccessors getGson() { return laccForRetrofitGsonLibraryAccessors; }

        /**
         * Returns the group of libraries at retrofit.rxjava
         */
        public RetrofitRxjavaLibraryAccessors getRxjava() { return laccForRetrofitRxjavaLibraryAccessors; }

    }

    public static class RetrofitGsonLibraryAccessors extends SubDependencyFactory {

        public RetrofitGsonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for converter (com.squareup.retrofit2:converter-gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConverter() { return create("retrofit.gson.converter"); }

    }

    public static class RetrofitRxjavaLibraryAccessors extends SubDependencyFactory {

        public RetrofitRxjavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for adapter (com.squareup.retrofit2:adapter-rxjava2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAdapter() { return create("retrofit.rxjava.adapter"); }

    }

    public static class RxLibraryAccessors extends SubDependencyFactory {

        public RxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (io.reactivex.rxjava2:rxandroid)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("rx.android"); }

            /**
             * Creates a dependency provider for binding (com.jakewharton.rxbinding3:rxbinding)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBinding() { return create("rx.binding"); }

            /**
             * Creates a dependency provider for java (io.reactivex.rxjava2:rxjava)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJava() { return create("rx.java"); }

            /**
             * Creates a dependency provider for kotlin (io.reactivex.rxjava2:rxkotlin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlin() { return create("rx.kotlin"); }

            /**
             * Creates a dependency provider for relay (com.jakewharton.rxrelay2:rxrelay)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRelay() { return create("rx.relay"); }

    }

    public static class ToolsLibraryAccessors extends SubDependencyFactory {

        public ToolsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for desugar (com.android.tools:desugar_jdk_libs)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDesugar() { return create("tools.desugar"); }

            /**
             * Creates a dependency provider for leakcanary (com.squareup.leakcanary:leakcanary-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLeakcanary() { return create("tools.leakcanary"); }

            /**
             * Creates a dependency provider for timber (com.jakewharton.timber:timber)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTimber() { return create("tools.timber"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: agp (7.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAgp() { return getVersion("agp"); }

            /**
             * Returns the version associated to this alias: axAppcompat (1.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAxAppcompat() { return getVersion("axAppcompat"); }

            /**
             * Returns the version associated to this alias: axCore (1.2.0-alpha03)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAxCore() { return getVersion("axCore"); }

            /**
             * Returns the version associated to this alias: axTest (1.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAxTest() { return getVersion("axTest"); }

            /**
             * Returns the version associated to this alias: dagger (2.24)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDagger() { return getVersion("dagger"); }

            /**
             * Returns the version associated to this alias: espresso (3.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEspresso() { return getVersion("espresso"); }

            /**
             * Returns the version associated to this alias: kotlin (1.7.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: okhttp (4.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttp() { return getVersion("okhttp"); }

            /**
             * Returns the version associated to this alias: refine (3.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRefine() { return getVersion("refine"); }

            /**
             * Returns the version associated to this alias: retrofit (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit() { return getVersion("retrofit"); }

            /**
             * Returns the version associated to this alias: room (2.2.0-beta01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: spotless (6.11.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSpotless() { return getVersion("spotless"); }

            /**
             * Returns the version associated to this alias: uiautomator (2.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getUiautomator() { return getVersion("uiautomator"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final TestingBundleAccessors baccForTestingBundleAccessors = new TestingBundleAccessors(providers, config);

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at bundles.testing
         */
        public TestingBundleAccessors getTesting() { return baccForTestingBundleAccessors; }

    }

    public static class TestingBundleAccessors extends BundleFactory {

        public TestingBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for testing.android which is an aggregate for the following dependencies:
             * <ul>
             *    <li>junit:junit</li>
             *    <li>androidx.test.espresso:espresso-core</li>
             *    <li>androidx.test:runner</li>
             *    <li>androidx.test:rules</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getAndroid() { return createBundle("testing.android"); }

            /**
             * Creates a dependency bundle provider for testing.unit which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.arch.core:core-testing</li>
             *    <li>junit:junit</li>
             *    <li>org.robolectric:robolectric</li>
             *    <li>org.mockito:mockito-core</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getUnit() { return createBundle("testing.unit"); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final AndroidPluginAccessors baccForAndroidPluginAccessors = new AndroidPluginAccessors(providers, config);
        private final BenmanesPluginAccessors baccForBenmanesPluginAccessors = new BenmanesPluginAccessors(providers, config);
        private final GooglePluginAccessors baccForGooglePluginAccessors = new GooglePluginAccessors(providers, config);
        private final KotlinPluginAccessors baccForKotlinPluginAccessors = new KotlinPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for refine to the plugin id 'dev.rikka.tools.refine'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getRefine() { return createPlugin("refine"); }

        /**
         * Returns the group of bundles at plugins.android
         */
        public AndroidPluginAccessors getAndroid() { return baccForAndroidPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.benmanes
         */
        public BenmanesPluginAccessors getBenmanes() { return baccForBenmanesPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.google
         */
        public GooglePluginAccessors getGoogle() { return baccForGooglePluginAccessors; }

        /**
         * Returns the group of bundles at plugins.kotlin
         */
        public KotlinPluginAccessors getKotlin() { return baccForKotlinPluginAccessors; }

    }

    public static class AndroidPluginAccessors extends PluginFactory {

        public AndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for android.application to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApplication() { return createPlugin("android.application"); }

            /**
             * Creates a plugin provider for android.library to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLibrary() { return createPlugin("android.library"); }

            /**
             * Creates a plugin provider for android.test to the plugin id 'com.android.test'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getTest() { return createPlugin("android.test"); }

    }

    public static class BenmanesPluginAccessors extends PluginFactory {

        public BenmanesPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for benmanes.versions to the plugin id 'com.github.ben-manes.versions'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getVersions() { return createPlugin("benmanes.versions"); }

    }

    public static class GooglePluginAccessors extends PluginFactory {

        public GooglePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for google.services to the plugin id 'com.google.gms.google-services'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getServices() { return createPlugin("google.services"); }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlin.android to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("kotlin.android"); }

            /**
             * Creates a plugin provider for kotlin.kapt to the plugin id 'org.jetbrains.kotlin.kapt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKapt() { return createPlugin("kotlin.kapt"); }

    }

}
