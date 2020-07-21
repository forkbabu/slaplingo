package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.ItemTouchHelper;
import io.reactivex.annotations.SchedulerSupport;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaav {
    public static final zzaag<String> zzclg = zzaag.zza(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
    public static final zzaag<String> zzclh = zzaag.zza(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
    private static final zzabx<Boolean> zzcli = zzacm.zzcli;
    private static final zzaag<Integer> zzclj = zzaag.zza(1, "gads:http_url_connection_factory:timeout_millis", 10000);
    public static final zzaag<String> zzclk = zzaag.zza(1, "gads:video_exo_player:version", ExifInterface.GPS_MEASUREMENT_3D);
    public static final zzaag<Integer> zzcll = zzaag.zza(1, "gads:video_exo_player:connect_timeout", 8000);
    public static final zzaag<Integer> zzclm = zzaag.zza(1, "gads:video_exo_player:read_timeout", 8000);
    public static final zzaag<Integer> zzcln = zzaag.zza(1, "gads:video_exo_player:loading_check_interval", 1048576);
    public static final zzaag<Integer> zzclo = zzaag.zza(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);
    public static final zzaag<Integer> zzclp = zzaag.zza(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);
    public static final zzaag<Integer> zzclq = zzaag.zza(1, "gads:video_exo_player_socket_receive_buffer_size", 0);
    public static final zzaag<String> zzclr = zzaag.zza(1, "gads:video_exo_player:precache_exceptions", "");
    public static final zzaag<Integer> zzcls = zzaag.zza(1, "gads:video_exo_player:min_retry_count", -1);
    public static final zzaag<Boolean> zzclt = zzaag.zza(1, "gads:video_exo_player:fmp4_extractor_enabled", (Boolean) false);
    public static final zzaag<Integer> zzclu = zzaag.zza(1, "gads:video_stream_cache:limit_count", 5);
    public static final zzaag<Integer> zzclv = zzaag.zza(1, "gads:video_stream_cache:limit_space", 8388608);
    public static final zzaag<Integer> zzclw = zzaag.zza(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
    public static final zzaag<Long> zzclx = zzaag.zzb(1, "gads:video_stream_cache:limit_time_sec", 300);
    public static final zzaag<Long> zzcly = zzaag.zzb(1, "gads:video_stream_cache:notify_interval_millis", 125);
    public static final zzaag<Integer> zzclz = zzaag.zza(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final zzaag<String> zzcma = zzaag.zza(1, "gads:video:metric_frame_hash_times", "");
    public static final zzaag<Long> zzcmb = zzaag.zzb(1, "gads:video:metric_frame_hash_time_leniency", 500);
    public static final zzaag<Boolean> zzcmc = zzaag.zza(1, "gads:video:force_watermark", (Boolean) false);
    public static final zzaag<Long> zzcmd = zzaag.zzb(1, "gads:video:surface_update_min_spacing_ms", 1000);
    public static final zzaag<Boolean> zzcme = zzaag.zza(1, "gads:video:spinner:enabled", (Boolean) false);
    public static final zzaag<Integer> zzcmf = zzaag.zza(1, "gads:video:spinner:scale", 4);
    public static final zzaag<Long> zzcmg = zzaag.zzb(1, "gads:video:spinner:jank_threshold_ms", 50);
    public static final zzaag<Boolean> zzcmh = zzaag.zza(1, "gads:video:aggressive_media_codec_release", (Boolean) false);
    public static final zzaag<Boolean> zzcmi = zzaag.zza(1, "gads:memory_bundle:debug_info", (Boolean) false);
    public static final zzaag<String> zzcmj = zzaag.zza(1, "gads:video:codec_query_mime_types", "");
    public static final zzaag<Integer> zzcmk = zzaag.zza(1, "gads:video:codec_query_minimum_version", 16);
    public static final zzaag<String> zzcml = zzaag.zza(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");
    public static final zzaag<String> zzcmm = zzaag.zza(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");
    public static final zzaag<String> zzcmn = zzaag.zza(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");
    public static final zzaag<String> zzcmo = zzaag.zza(1, "gad:mraid:version", "3.0");
    public static final zzaag<Boolean> zzcmp = zzaag.zza(1, "gads:mraid:expanded_interstitial_fix", (Boolean) false);
    public static final zzaag<Boolean> zzcmq = zzaag.zza(1, "gads:mraid:initial_size_fallback", (Boolean) false);
    public static final zzaag<Integer> zzcmr = zzaag.zza(1, "gads:content_vertical_fingerprint_number", 100);
    public static final zzaag<Integer> zzcms = zzaag.zza(1, "gads:content_vertical_fingerprint_bits", 23);
    public static final zzaag<Integer> zzcmt = zzaag.zza(1, "gads:content_vertical_fingerprint_ngram", 3);
    public static final zzaag<String> zzcmu = zzaag.zza(1, "gads:content_fetch_view_tag_id", "googlebot");
    public static final zzaag<String> zzcmv = zzaag.zza(1, "gads:content_fetch_exclude_view_tag", SchedulerSupport.NONE);
    public static final zzaag<Boolean> zzcmw = zzaag.zza(1, "gads:content_fetch_disable_get_title_from_webview", (Boolean) false);
    public static final zzaag<Boolean> zzcmx = zzaag.zza(1, "gads:content_fetch_enable_new_content_score", (Boolean) false);
    public static final zzaag<Boolean> zzcmy = zzaag.zza(1, "gads:content_fetch_enable_serve_once", (Boolean) false);
    public static final zzaag<Boolean> zzcmz = zzaag.zza(1, "gads:sai:enabled", (Boolean) true);
    public static final zzaag<String> zzcna = zzaag.zza(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
    public static final zzaag<String> zzcnb = zzaag.zza(1, "gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");
    public static final zzaag<Boolean> zzcnc = zzaag.zza(1, "gads:sai:using_macro:enabled", (Boolean) false);
    public static final zzaag<String> zzcnd = zzaag.zza(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
    public static final zzaag<Long> zzcne = zzaag.zzb(1, "gads:sai:timeout_ms", -1);
    public static final zzaag<Integer> zzcnf = zzaag.zza(1, "gads:sai:scion_thread_pool_size", 5);
    public static final zzaag<Boolean> zzcng = zzaag.zza(1, "gads:sai:app_measurement_enabled3", (Boolean) false);
    public static final zzaag<Integer> zzcnh = zzaag.zza(1, "gads:sai:app_measurement_min_client_dynamite_version", 20290);
    public static final zzaag<Boolean> zzcni = zzaag.zza(1, "gads:sai:force_through_reflection", (Boolean) true);
    public static final zzaag<Boolean> zzcnj = zzaag.zza(1, "gads:sai:gmscore_availability_check_disabled", (Boolean) false);
    public static final zzaag<Boolean> zzcnk = zzaag.zza(1, "gads:sai:logging_disabled_for_drx", (Boolean) false);
    public static final zzaag<Boolean> zzcnl = zzaag.zza(1, "gads:sai:inject_firebase_proxy", (Boolean) false);
    public static final zzaag<Boolean> zzcnm = zzaag.zza(1, "gads:sai:app_measurement_npa_enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcnn = zzaag.zza(1, "gads:interstitial:app_must_be_foreground:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcno = zzaag.zza(1, "gads:interstitial:foreground_report:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcnp = zzaag.zza(1, "gads:webview:error_web_response:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcnq = zzaag.zza(1, "gads:webview:pause_interstitial:enabled", (Boolean) true);
    private static final zzaag<Boolean> zzcnr = zzaag.zza(1, "gads:rsku:webviewgone:kill_process:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcns = zzaag.zza(1, "gads:webviewgone:kill_process:enabled", (Boolean) false);
    private static final zzaag<Boolean> zzcnt = zzaag.zza(1, "gads:rsku:webviewgone:new_onshow:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcnu = zzaag.zza(1, "gads:webviewgone:new_onshow:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcnv = zzaag.zza(1, "gads:webview:pause_resume:enabled", (Boolean) true);
    public static final zzaag<String> zzcnw = zzaag.zza(1, "gads:webview_cookie_url", "googleads.g.doubleclick.net");
    private static final zzaag<Boolean> zzcnx = zzaag.zza(1, "gads:new_rewarded_ad:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcny = zzaag.zza(1, "gads:rewarded:adapter_initialization_enabled", (Boolean) false);
    private static final zzaag<Long> zzcnz = zzaag.zzb(1, "gads:rewarded:adapter_timeout_ms", 20000);
    public static final zzaag<Boolean> zzcoa = zzaag.zza(1, "gads:rewarded:ad_metadata_enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcob = zzaag.zza(1, "gads:rewarded:ssv_custom_data_enabled", (Boolean) true);
    public static final zzaag<Long> zzcoc = zzaag.zzb(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);
    public static final zzaag<Long> zzcod = zzaag.zzb(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final zzaag<Boolean> zzcoe = zzaag.zza(1, "gads:adid_values_in_adrequest:enabled", (Boolean) false);
    public static final zzaag<Long> zzcof = zzaag.zzb(1, "gads:adid_values_in_adrequest:timeout", 2000);
    public static final zzaag<Boolean> zzcog = zzaag.zza(1, "gads:disable_adid_values_in_ms", (Boolean) false);
    public static final zzaag<Long> zzcoh = zzaag.zzb(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);
    public static final zzaag<Boolean> zzcoi = zzaag.zza(1, "gads:custom_close_blocking:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcoj = zzaag.zza(1, "gads:disabling_closable_area:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcok = zzaag.zza(1, "gads:use_system_ui_for_fullscreen:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcol = zzaag.zza(1, "gads:ad_overlay:collect_cutout_info:enabled", (Boolean) false);
    private static final zzaag<Boolean> zzcom = zzaag.zza(1, "gads:impression_optimization_enabled", (Boolean) false);
    private static final zzaag<String> zzcon = zzaag.zza(1, "gads:banner_ad_pool:schema", "customTargeting");
    private static final zzaag<Integer> zzcoo = zzaag.zza(1, "gads:banner_ad_pool:max_queues", 3);
    private static final zzaag<Integer> zzcop = zzaag.zza(1, "gads:banner_ad_pool:max_pools", 3);
    public static final zzaag<Boolean> zzcoq = zzaag.zza(1, "gads:delay_banner_renderer:enabled", (Boolean) true);
    private static final zzaag<Boolean> zzcor = zzaag.zza(1, "gads:interstitial_ad_pool:enabled", (Boolean) false);
    private static final zzaag<Boolean> zzcos = zzaag.zza(1, "gads:interstitial_ad_pool:enabled_for_rewarded", (Boolean) false);
    private static final zzaag<String> zzcot = zzaag.zza(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    private static final zzaag<String> zzcou = zzaag.zza(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    private static final zzaag<Integer> zzcov = zzaag.zza(1, "gads:interstitial_ad_pool:max_pools", 3);
    private static final zzaag<Integer> zzcow = zzaag.zza(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    private static final zzaag<Integer> zzcox = zzaag.zza(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    private static final zzaag<String> zzcoy = zzaag.zza(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    private static final zzaag<Integer> zzcoz = zzaag.zza(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
    private static final zzaag<Integer> zzcpa = zzaag.zza(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
    private static final zzaag<Long> zzcpb = zzaag.zzb(1, "gads:interstitial_ad_pool:discard_thresholds", 0);
    private static final zzaag<Long> zzcpc = zzaag.zzb(1, "gads:interstitial_ad_pool:miss_thresholds", 0);
    private static final zzaag<Float> zzcpd = zzaag.zza(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);
    private static final zzaag<Float> zzcpe = zzaag.zza(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);
    public static final zzaag<String> zzcpf = zzaag.zza(1, "gads:spherical_video:vertex_shader", "");
    public static final zzaag<String> zzcpg = zzaag.zza(1, "gads:spherical_video:fragment_shader", "");
    public static final zzaag<Boolean> zzcph = zzaag.zza(1, "gads:include_local_global_rectangles", (Boolean) false);
    public static final zzaag<Long> zzcpi = zzaag.zzb(1, "gads:position_watcher:throttle_ms", 200);
    public static final zzaag<Long> zzcpj = zzaag.zzb(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);
    public static final zzaag<Boolean> zzcpk = zzaag.zza(1, "gads:position_watcher:enable_scroll_aware_ads", (Boolean) false);
    public static final zzaag<Boolean> zzcpl = zzaag.zza(1, "gads:position_watcher:send_scroll_data", (Boolean) false);
    private static final zzaag<Boolean> zzcpm = zzaag.zza(1, "gads:gen204_signals:enabled", (Boolean) false);
    public static final zzaag<String> zzcpn = zzaag.zza(1, "gads:logged_adapter_version_classes", "");
    public static final zzaag<Long> zzcpo = zzaag.zzb(1, "gads:rtb_v1_1:signal_timeout_ms", 1000);
    public static final zzaag<Boolean> zzcpp = zzaag.zza(1, "gads:rtb_signal:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcpq = zzaag.zza(1, "gads:rtb_v1_1:cld:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcpr = zzaag.zza(1, "gads:rtb_v1_1:cld:check_regex:enabled", (Boolean) true);
    public static final zzaag<String> zzcps = zzaag.zza(1, "gads:rtb_logging:regex", "(?!)");
    public static final zzaag<Boolean> zzcpt = zzaag.zza(1, "gads:v1_1:adapter_initialization:enabled", (Boolean) true);
    public static final zzaag<Integer> zzcpu = zzaag.zza(1, "gads:adapter_initialization:min_sdk_version", 15301000);
    public static final zzaag<Long> zzcpv = zzaag.zzb(1, "gads:adapter_initialization:timeout", 30);
    public static final zzaag<Long> zzcpw = zzaag.zzb(1, "gads:adapter_initialization:cld_timeout", 10);
    public static final zzaag<Boolean> zzcpx = zzaag.zza(1, "gads:initialization_csi:enabled", (Boolean) false);
    private static final zzaag<Boolean> zzcpy = zzaag.zza(1, "gads:initialization_csi_control:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcpz = zzaag.zza(1, "gads:msa:experiments:enabled", (Boolean) false);
    public static final zzaag<Integer> zzcqa = zzaag.zza(1, "gads:gestures:a2:enabled", 0);
    public static final zzaag<Boolean> zzcqb = zzaag.zza(1, "gads:gestures:clearTd:enabled", (Boolean) false);
    public static final zzabx<Boolean> zzcqc = zzacn.zzdaq;
    public static final zzaag<Boolean> zzcqd = zzaag.zza(1, "gads:gestures:errorlogging:enabled", (Boolean) false);
    public static final zzaag<Long> zzcqe = zzaag.zzb(1, "gads:gestures:task_timeout", 2000);
    public static final zzaag<Boolean> zzcqf = zzaag.zza(1, "gads:gestures:asig:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcqg = zzaag.zza(1, "gads:gestures:ans:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcqh = zzaag.zza(1, "gads:gestures:tos:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcqi = zzaag.zza(1, "gads:gestures:brt:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcqj = zzaag.zza(1, "gads:gestures:fpi:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcqk = zzaag.zza(1, "gads:signal:app_permissions:disabled", (Boolean) false);
    public static final zzaag<Boolean> zzcql = zzaag.zza(1, "gads:gestures:inthex:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcqm = zzaag.zza(1, "gads:gestures:hpk:enabled", (Boolean) true);
    public static final zzaag<String> zzcqn = zzaag.zza(1, "gads:gestures:pk", "");
    public static final zzaag<Boolean> zzcqo = zzaag.zza(1, "gads:gestures:bs:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcqp = zzaag.zza(1, "gads:gestures:check_initialization_thread:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcqq = zzaag.zza(1, "gads:gestures:get_query_in_non_ui_thread:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcqr = zzaag.zza(1, "gads:gestures:init_new_thread:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcqs = zzaag.zza(1, "gads:gestures:pds:enabled", (Boolean) true);
    private static final zzaag<Integer> zzcqt = zzaag.zza(1, "gads:gestures:as2percentage", 0);
    public static final zzaag<Boolean> zzcqu = zzaag.zza(1, "gads:gestures:las:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcqv = zzaag.zza(1, "gads:gestures:ns:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcqw = zzaag.zza(1, "gads:gestures:vdd:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcqx = zzaag.zza(1, "gads:native:asset_view_touch_events", (Boolean) false);
    public static final zzaag<Boolean> zzcqy = zzaag.zza(1, "gads:native:set_touch_listener_on_asset_views", (Boolean) true);
    public static final zzaag<Boolean> zzcqz = zzaag.zza(1, "gads:ais:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcra = zzaag.zza(1, "gads:send_available_disk_space:enabled", (Boolean) false);
    private static final zzaag<String> zzcrb;
    public static final zzaag<String> zzcrc = zzaag.zza(1, "gads:sdk_core_constants:caps", "");
    private static final zzaag<Boolean> zzcrd = zzaag.zza(1, "gads:js_flags:disable_phenotype", (Boolean) false);
    public static final zzaag<String> zzcre = zzaag.zza(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    private static final zzaag<String> zzcrf = zzaag.zza(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
    public static final zzaag<String> zzcrg = zzaag.zza(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
    public static final zzaag<Integer> zzcrh = zzaag.zza(1, "gads:native_video_load_timeout", 10);
    private static final zzaag<Integer> zzcri = zzaag.zza(1, "gads:omid:native_webview_load_timeout", 2000);
    public static final zzaag<Boolean> zzcrj = zzaag.zza(1, "gads:enable_native_media_aspect_ratio", (Boolean) true);
    public static final zzaag<Boolean> zzcrk = zzaag.zza(1, "gads:native:media_content_main_image:enabled", (Boolean) true);
    public static final zzaag<String> zzcrl = zzaag.zza(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    private static final zzaag<Boolean> zzcrm = zzaag.zza(1, "gads:enable_store_active_view_state", (Boolean) false);
    public static final zzaag<Boolean> zzcrn = zzaag.zza(1, "gads:enable_singleton_broadcast_receiver", (Boolean) false);
    public static final zzaag<Boolean> zzcro = zzaag.zza(1, "gads:native:media_view_match_parent:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcrp = zzaag.zza(1, "gads:native:count_impression_for_assets", (Boolean) false);
    private static final zzaag<Boolean> zzcrq = zzaag.zza(1, "gads:instream_ad:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcrr = zzaag.zza(1, "gads:fluid_ad:use_wrap_content_height", (Boolean) false);
    private static final zzaag<Boolean> zzcrs = zzaag.zza(1, "gads:auto_location_for_coarse_permission", (Boolean) false);
    private static final zzaag<String> zzcrt = zzaag.zzb(1, "gads:auto_location_for_coarse_permission:experiment_id");
    public static final zzaag<Long> zzcru = zzaag.zzb(1, "gads:auto_location_timeout", 2000);
    private static final zzaag<String> zzcrv = zzaag.zzb(1, "gads:auto_location_timeout:experiment_id");
    private static final zzaag<Long> zzcrw = zzaag.zzb(1, "gads:auto_location_interval", -1);
    private static final zzaag<String> zzcrx = zzaag.zzb(1, "gads:auto_location_interval:experiment_id");
    public static final zzaag<Boolean> zzcry = zzaag.zza(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcrz = zzaag.zza(1, "gads:get_request_signals_cld:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcsa = zzaag.zza(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", (Boolean) true);
    public static final zzaag<Long> zzcsb = zzaag.zzb(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final zzaag<Long> zzcsc = zzaag.zzb(1, "gads:parental_controls:timeout", 2000);
    private static final zzaag<Integer> zzcsd = zzaag.zza(1, "gads:cache:ad_request_timeout_millis", (int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    private static final zzaag<Integer> zzcse = zzaag.zza(1, "gads:cache:max_concurrent_downloads", 10);
    private static final zzaag<Long> zzcsf = zzaag.zzb(1, "gads:cache:javascript_timeout_millis", 5000);
    public static final zzaag<Boolean> zzcsg = zzaag.zza(1, "gads:cache:bind_on_foreground", (Boolean) false);
    public static final zzaag<Boolean> zzcsh = zzaag.zza(1, "gads:cache:bind_on_init", (Boolean) false);
    public static final zzaag<Boolean> zzcsi = zzaag.zza(1, "gads:cache:bind_on_request", (Boolean) false);
    public static final zzaag<Long> zzcsj = zzaag.zzb(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final zzaag<Boolean> zzcsk = zzaag.zza(1, "gads:cache:use_cache_data_source", (Boolean) false);
    public static final zzaag<Boolean> zzcsl = zzaag.zza(1, "gads:cache:connection_per_read", (Boolean) false);
    public static final zzaag<Long> zzcsm = zzaag.zzb(1, "gads:cache:connection_timeout", 5000);
    public static final zzaag<Long> zzcsn = zzaag.zzb(1, "gads:cache:read_only_connection_timeout", 5000);
    public static final zzaag<Boolean> zzcso = zzaag.zza(1, "gads:http_assets_cache:enabled", (Boolean) false);
    public static final zzaag<String> zzcsp = zzaag.zza(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");
    public static final zzaag<Integer> zzcsq = zzaag.zza(1, "gads:http_assets_cache:time_out", 100);
    public static final zzaag<Boolean> zzcsr = zzaag.zza(1, "gads:chrome_custom_tabs_browser:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcss = zzaag.zza(1, "gads:chrome_custom_tabs:disabled", (Boolean) false);
    public static final zzaag<Long> zzcst = zzaag.zzb(1, "gads:debug_hold_gesture:time_millis", 2000);
    public static final zzaag<String> zzcsu = zzaag.zza(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final zzaag<String> zzcsv = zzaag.zza(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final zzaag<String> zzcsw = zzaag.zza(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final zzaag<String> zzcsx = zzaag.zza(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final zzaag<Integer> zzcsy = zzaag.zza(1, "gads:drx_debug:timeout_ms", 5000);
    public static final zzaag<Integer> zzcsz = zzaag.zza(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final zzaag<Boolean> zzcta = zzaag.zza(1, "gad:interstitial_for_multi_window", (Boolean) false);
    public static final zzaag<Boolean> zzctb = zzaag.zza(1, "gad:interstitial_ad_stay_active_in_multi_window", (Boolean) false);
    public static final zzaag<Boolean> zzctc = zzaag.zza(1, "gad:interstitial_multi_window_method", (Boolean) false);
    public static final zzaag<Integer> zzctd = zzaag.zza(1, "gad:interstitial:close_button_padding_dip", 0);
    public static final zzaag<Boolean> zzcte = zzaag.zza(1, "gads:clearcut_logging:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzctf = zzaag.zza(1, "gads:clearcut_logging:write_to_file", (Boolean) false);
    public static final zzaag<Boolean> zzctg = zzaag.zza(1, "gad:publisher_testing:force_local_request:enabled", (Boolean) true);
    public static final zzaag<String> zzcth = zzaag.zza(1, "gad:publisher_testing:force_local_request:enabled_list", "");
    public static final zzaag<String> zzcti = zzaag.zza(1, "gad:publisher_testing:force_local_request:disabled_list", "");
    public static final zzaag<Integer> zzctj = zzaag.zza(1, "gad:http_redirect_max_count:times", 8);
    public static final zzaag<Boolean> zzctk = zzaag.zza(1, "gads:omid:enabled", (Boolean) true);
    public static final zzaag<Integer> zzctl = zzaag.zza(1, "gads:omid:destroy_webview_delay", 1000);
    private static final zzaag<Boolean> zzctm = zzaag.zza(1, "gads:omid_1_3_activate:enabled", (Boolean) false);
    private static final zzaag<Boolean> zzctn = zzaag.zza(1, "gads:nonagon:banner:enabled", (Boolean) false);
    private static final zzaag<String> zzcto = zzaag.zza(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");
    private static final zzaag<Boolean> zzctp = zzaag.zza(1, "gads:nonagon:app_open:enabled", (Boolean) true);
    public static final zzaag<Integer> zzctq = zzaag.zza(1, "gads:app_open_beta:min_version", 99999999);
    private static final zzaag<String> zzctr = zzaag.zza(1, "gads:nonagon:app_open:ad_unit_exclusions", "(?!)");
    private static final zzaag<Boolean> zzcts = zzaag.zza(1, "gads:nonagon:interstitial:enabled", (Boolean) false);
    private static final zzaag<String> zzctt = zzaag.zza(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
    private static final zzaag<Boolean> zzctu = zzaag.zza(1, "gads:nonagon:rewardedvideo:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzctv = zzaag.zza(1, "gads:nonagon:mobile_ads_setting_manager:enabled", (Boolean) false);
    public static final zzaag<String> zzctw = zzaag.zza(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
    private static final zzaag<Boolean> zzctx = zzaag.zza(1, "gads:nonagon:nativead:enabled", (Boolean) false);
    private static final zzaag<String> zzcty = zzaag.zza(1, "gads:nonagon:nativead:app_name", "(?!)");
    public static final zzaag<Boolean> zzctz = zzaag.zza(1, "gads:nonagon:banner:check_dp_size", (Boolean) true);
    public static final zzaag<Boolean> zzcua = zzaag.zza(1, "gads:nonagon:rewarded:load_multiple_ads", (Boolean) true);
    private static final zzaag<Boolean> zzcub = zzaag.zza(1, "gads:nonagon:return_last_error_code", (Boolean) false);
    public static final zzaag<Boolean> zzcuc = zzaag.zza(1, "gads:nonagon:return_no_fill_error_code", (Boolean) false);
    public static final zzaag<Boolean> zzcud = zzaag.zza(1, "gads:nonagon:continue_on_no_fill", (Boolean) false);
    private static final zzaag<Boolean> zzcue = zzaag.zza(1, "gads:nonagon:open_not_loaded_interstitial", (Boolean) true);
    public static final zzaag<Boolean> zzcuf = zzaag.zza(1, "gads:nonagon:separate_timeout:enabled", (Boolean) true);
    public static final zzaag<Integer> zzcug = zzaag.zza(1, "gads:nonagon:request_timeout:seconds", 60);
    public static final zzaag<Boolean> zzcuh = zzaag.zza(1, "gads:nonagon:banner_recursive_renderer", (Boolean) false);
    public static final zzaag<Boolean> zzcui = zzaag.zza(1, "gads:nonagon:app_stats_lock:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcuj = zzaag.zza(1, "gads:nonagon:app_stats_main_thread:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcuk = zzaag.zza(1, "gads:uri_query_to_map_bg_thread:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcul = zzaag.zza(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcum = zzaag.zza(1, "gads:active_view_gmsg_separate_pool:enabled", (Boolean) true);
    private static final zzaag<Boolean> zzcun = zzaag.zza(1, "gads:nonagon:service:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcuo = zzaag.zza(1, "gads:nonagon:dpl_cancel_destroy_webview:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcup = zzaag.zza(1, "gads:signals:ad_id_info:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcuq = zzaag.zza(1, "gads:signals:app_index:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcur = zzaag.zza(1, "gads:signals:attestation_token:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcus = zzaag.zza(1, "gads:signals:cache:enabled", (Boolean) false);
    private static final zzaag<Boolean> zzcut = zzaag.zza(1, "gads:signals:doritos:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcuu = zzaag.zza(1, "gads:signals:doritos:v1:enabled", (Boolean) false);
    private static final zzaag<Boolean> zzcuv = zzaag.zza(1, "gads:signals:doritos:v2:immediate:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcuw = zzaag.zza(1, "gads:signals:location:enabled", (Boolean) false);
    private static final zzaag<Boolean> zzcux = zzaag.zza(1, "gads:signals:network_prediction:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcuy = zzaag.zza(1, "gads:signals:parental_control:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcuz = zzaag.zza(1, "gads:signals:video_decoder:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcva = zzaag.zza(1, "gads:signals:app_version_name:enabled", (Boolean) false);
    private static final zzaag<Boolean> zzcvb = zzaag.zza(1, "gads:attestation_token:enabled", (Boolean) false);
    public static final zzaag<Long> zzcvc = zzaag.zzb(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);
    public static final zzaag<Integer> zzcvd = zzaag.zza(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);
    public static final zzaag<Integer> zzcve = zzaag.zza(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);
    public static final zzaag<Integer> zzcvf = zzaag.zza(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 27);
    public static final zzaag<Integer> zzcvg = zzaag.zza(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 26);
    private static final zzabx<Boolean> zzcvh = zzaco.zzdar;
    public static final zzaag<Boolean> zzcvi = zzaag.zza(1, "gads:consent:shared_preference_reading:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcvj = zzaag.zza(1, "gads:consent:iab_consent_info:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcvk = zzaag.zza(1, "gads:fc_consent:shared_preference_reading:enabled", (Boolean) true);
    public static final zzaag<String> zzcvl = zzaag.zza(1, "gads:sp:json_string", "");
    public static final zzaag<Boolean> zzcvm = zzaag.zza(1, "gads:nativeads:image:sample:enabled", (Boolean) true);
    public static final zzaag<Integer> zzcvn = zzaag.zza(1, "gads:nativeads:image:sample:pixels", 1048576);
    public static final zzaag<Boolean> zzcvo = zzaag.zza(1, "gads:nativeads:pub_image_scale_type:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcvp = zzaag.zza(1, "gads:offline_signaling:enabled", (Boolean) false);
    public static final zzaag<Integer> zzcvq = zzaag.zza(1, "gads:offline_signaling:log_maximum", 100);
    public static final zzaag<Boolean> zzcvr = zzaag.zza(1, "gads:nativeads:template_signal:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcvs = zzaag.zza(1, "gads:nativeads:media_content_aspect_ratio:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcvt = zzaag.zza(1, "gads:nativeads:media_content_metadata:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcvu = zzaag.zza(1, "gads:ar_ads:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcvv = zzaag.zza(1, "gads:precache_pool:verbose_logging", (Boolean) false);
    public static final zzaag<Integer> zzcvw = zzaag.zza(1, "gads:rewarded_precache_pool:count", 0);
    public static final zzaag<Integer> zzcvx = zzaag.zza(1, "gads:interstitial_precache_pool:count", 0);
    public static final zzaag<String> zzcvy = zzaag.zza(1, "gads:rewarded_precache_pool:discard_strategy", "lru");
    public static final zzaag<String> zzcvz = zzaag.zza(1, "gads:interstitial_precache_pool:discard_strategy", "lru");
    public static final zzaag<String> zzcwa = zzaag.zza(1, "gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");
    public static final zzaag<String> zzcwb = zzaag.zza(1, "gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");
    public static final zzaag<Integer> zzcwc = zzaag.zza(1, "gads:rewarded_precache_pool:size", 1);
    public static final zzaag<Integer> zzcwd = zzaag.zza(1, "gads:interstitial_precache_pool:size", 1);
    public static final zzaag<Integer> zzcwe = zzaag.zza(1, "gads:rewarded_precache_pool:ad_time_limit", 1200);
    public static final zzaag<Integer> zzcwf = zzaag.zza(1, "gads:interstitial_precache_pool:ad_time_limit", 1200);
    public static final zzaag<String> zzcwg = zzaag.zza(1, "gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final zzaag<String> zzcwh = zzaag.zza(1, "gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final zzaag<String> zzcwi = zzaag.zza(1, "gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final zzaag<String> zzcwj = zzaag.zza(1, "gads:app_open_precache_pool:discard_strategy", "oldest");
    public static final zzaag<Integer> zzcwk = zzaag.zza(1, "gads:app_open_precache_pool:count", 0);
    public static final zzaag<String> zzcwl = zzaag.zza(1, "gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");
    public static final zzaag<Integer> zzcwm = zzaag.zza(1, "gads:app_open_precache_pool:size", 1);
    public static final zzaag<Integer> zzcwn = zzaag.zza(1, "gads:app_open_precache_pool:ad_time_limit", 14400);
    public static final zzaag<Boolean> zzcwo = zzaag.zza(1, "gads:memory_leak:b129558083", (Boolean) false);
    public static final zzaag<Boolean> zzcwp = zzaag.zza(1, "gads:unhandled_event_reporting:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcwq = zzaag.zza(1, "gads:response_info:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcwr = zzaag.zza(1, "gads:csi:interstitial_failed_to_show:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcws = zzaag.zza(1, "gads:csi:mediation_failure:enabled", (Boolean) false);
    public static final zzaag<String> zzcwt = zzaag.zza(1, "gads:csi:error_parsing:regex", "^(\\d+)");
    public static final zzaag<Boolean> zzcwu = zzaag.zza(1, "gads:signal_collection_without_rendering:enabled", (Boolean) true);
    public static final zzaag<Integer> zzcwv = zzaag.zza(1, "gads:native_ads_signal:timeout", 1000);
    public static final zzaag<Integer> zzcww = zzaag.zza(1, "gads:signal_v2:min_version", 19677000);
    public static final zzaag<Boolean> zzcwx = zzaag.zza(2, "DISABLE_CRASH_REPORTING", (Boolean) false);
    public static final zzaag<Boolean> zzcwy = zzaag.zza(1, "gads:paid_event_listener:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcwz = zzaag.zza(1, "gads:is_in_scroll_view_new_api:enabled", (Boolean) true);
    public static final zzaag<Boolean> zzcxa = zzaag.zza(1, "gads:native_ad_policy_validator:enabled", (Boolean) true);
    public static final zzaag<Integer> zzcxb = zzaag.zza(1, "gads:policy_validator_layoutparam:flags", 808);
    public static final zzaag<Boolean> zzcxc = zzaag.zza(2, "NATIVE_AD_DEBUGGER_ENABLED", (Boolean) false);
    public static final zzaag<Integer> zzcxd = zzaag.zza(1, "gads:policy_validator_overlay_margins:dp", 15);
    public static final zzaag<Integer> zzcxe = zzaag.zza(1, "gads:policy_validator_overlay_width:dp", 350);
    public static final zzaag<Integer> zzcxf = zzaag.zza(1, "gads:policy_validator_overlay_height:dp", 140);
    public static final zzaag<Float> zzcxg = zzaag.zza(1, "gads:policy_validator_overlay:scale", 1.0f);
    public static final zzaag<Boolean> zzcxh = zzaag.zza(1, "gads:use_wide_viewport:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcxi = zzaag.zza(1, "gads:load_with_overview_mode:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcxj = zzaag.zza(1, "gads:wire_banner_listener_after_request:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcxk = zzaag.zza(1, "gads:wire_rewarded_listener_after_request:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcxl = zzaag.zza(1, "gads:wire_app_open_listener_after_request:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcxm = zzaag.zza(1, "gads:wire_interstitial_listener_after_request:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcxn = zzaag.zza(1, "gads:wire_ad_loader_listener_after_request:enabled", (Boolean) false);
    public static final zzaag<Boolean> zzcxo = zzaag.zza(1, "gads:server_transaction_source:enabled", (Boolean) false);
    public static final zzaag<String> zzcxp = zzaag.zza(1, "gads:server_transaction_source:list", "Network");
    public static final zzaag<Boolean> zzcxq = zzaag.zza(1, "gads:can_open_app_and_open_app_action:enabled", (Boolean) false);

    public static void initialize(Context context) {
        zzbai.zza(new zzaau(context));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzaap, com.google.android.gms.internal.ads.zzadb] */
    public static void zza(Context context, int i, JSONObject jSONObject) {
        zzwg.zzpu();
        SharedPreferences.Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        zzacc.zza(new zzaap(zzwg.zzpv(), edit, jSONObject));
        zzwg.zzpv().zza(edit, 1, jSONObject);
        zzwg.zzpu();
        edit.commit();
    }

    public static List<String> zzrc() {
        return zzwg.zzpv().zzrc();
    }

    public static List<String> zzrd() {
        return zzwg.zzpv().zzrd();
    }

    static {
        zzaag<String> zza = zzaag.zza(1, "gads:sdk_core_constants:experiment_id", (String) null);
        zzwg.zzpv().zzb(zza);
        zzcrb = zza;
    }
}