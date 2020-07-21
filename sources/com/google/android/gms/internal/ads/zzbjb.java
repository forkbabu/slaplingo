package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zzbjb implements zzcbf {
    private zzbxa zzeti;
    private zzbrx zzetj;
    private zzcay zzetk;
    private zzdkw zzetl;
    private zzdir zzetm;
    private zzdhv zzetn;
    private final /* synthetic */ zzbiz zzeto;

    private zzbjb(zzbiz zzbiz) {
        this.zzeto = zzbiz;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    /* renamed from: zzaef */
    public final zzcbc zzaeg() {
        zzelg.zza(this.zzeti, zzbxa.class);
        zzelg.zza(this.zzetj, zzbrx.class);
        zzelg.zza(this.zzetk, zzcay.class);
        return new zzbje(this.zzeto, this.zzetk, new zzbqf(), new zzdlt(), new zzbrl(), new zzcll(), this.zzeti, this.zzetj, new zzdmb(), this.zzetl, this.zzetm, this.zzetn);
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final /* synthetic */ zzcbf zza(zzcay zzcay) {
        this.zzetk = (zzcay) zzelg.checkNotNull(zzcay);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final /* synthetic */ zzcbf zza(zzbrx zzbrx) {
        this.zzetj = (zzbrx) zzelg.checkNotNull(zzbrx);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final /* synthetic */ zzcbf zza(zzbxa zzbxa) {
        this.zzeti = (zzbxa) zzelg.checkNotNull(zzbxa);
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zzbru' to match base method */
    @Override // com.google.android.gms.internal.ads.zzbru
    public final /* synthetic */ zzbru<zzcbc> zza(zzdhv zzdhv) {
        this.zzetn = zzdhv;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zzbru' to match base method */
    @Override // com.google.android.gms.internal.ads.zzbru
    public final /* synthetic */ zzbru<zzcbc> zza(zzdir zzdir) {
        this.zzetm = zzdir;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zzbru' to match base method */
    @Override // com.google.android.gms.internal.ads.zzbru
    public final /* synthetic */ zzbru<zzcbc> zza(zzdkw zzdkw) {
        this.zzetl = zzdkw;
        return this;
    }
}