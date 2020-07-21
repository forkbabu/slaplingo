package jp.wasabeef.picasso.transformations;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.squareup.picasso.Transformation;

public class RoundedCornersTransformation implements Transformation {
    private CornerType mCornerType;
    private int mDiameter;
    private int mMargin;
    private int mRadius;

    public enum CornerType {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public RoundedCornersTransformation(int i, int i2) {
        this(i, i2, CornerType.ALL);
    }

    public RoundedCornersTransformation(int i, int i2, CornerType cornerType) {
        this.mRadius = i;
        this.mDiameter = i * 2;
        this.mMargin = i2;
        this.mCornerType = cornerType;
    }

    @Override // com.squareup.picasso.Transformation
    public Bitmap transform(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        drawRoundRect(canvas, paint, (float) width, (float) height);
        bitmap.recycle();
        return createBitmap;
    }

    private void drawRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mMargin;
        float f3 = f - ((float) i);
        float f4 = f2 - ((float) i);
        switch (AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType[this.mCornerType.ordinal()]) {
            case 1:
                int i2 = this.mMargin;
                RectF rectF = new RectF((float) i2, (float) i2, f3, f4);
                int i3 = this.mRadius;
                canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
                return;
            case 2:
                drawTopLeftRoundRect(canvas, paint, f3, f4);
                return;
            case 3:
                drawTopRightRoundRect(canvas, paint, f3, f4);
                return;
            case 4:
                drawBottomLeftRoundRect(canvas, paint, f3, f4);
                return;
            case 5:
                drawBottomRightRoundRect(canvas, paint, f3, f4);
                return;
            case 6:
                drawTopRoundRect(canvas, paint, f3, f4);
                return;
            case 7:
                drawBottomRoundRect(canvas, paint, f3, f4);
                return;
            case 8:
                drawLeftRoundRect(canvas, paint, f3, f4);
                return;
            case 9:
                drawRightRoundRect(canvas, paint, f3, f4);
                return;
            case 10:
                drawOtherTopLeftRoundRect(canvas, paint, f3, f4);
                return;
            case 11:
                drawOtherTopRightRoundRect(canvas, paint, f3, f4);
                return;
            case 12:
                drawOtherBottomLeftRoundRect(canvas, paint, f3, f4);
                return;
            case 13:
                drawOtherBottomRightRoundRect(canvas, paint, f3, f4);
                return;
            case 14:
                drawDiagonalFromTopLeftRoundRect(canvas, paint, f3, f4);
                return;
            case 15:
                drawDiagonalFromTopRightRoundRect(canvas, paint, f3, f4);
                return;
            default:
                int i4 = this.mMargin;
                RectF rectF2 = new RectF((float) i4, (float) i4, f3, f4);
                int i5 = this.mRadius;
                canvas.drawRoundRect(rectF2, (float) i5, (float) i5, paint);
                return;
        }
    }

    /* renamed from: jp.wasabeef.picasso.transformations.RoundedCornersTransformation$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType = r0
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x001d }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x0028 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x0033 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x003e }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x0049 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.TOP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x0054 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x0060 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.LEFT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x006c }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.RIGHT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x0078 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.OTHER_TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x0084 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.OTHER_TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x0090 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.OTHER_BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x009c }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.OTHER_BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x00a8 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.DIAGONAL_FROM_TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$RoundedCornersTransformation$CornerType     // Catch:{ NoSuchFieldError -> 0x00b4 }
                jp.wasabeef.picasso.transformations.RoundedCornersTransformation$CornerType r1 = jp.wasabeef.picasso.transformations.RoundedCornersTransformation.CornerType.DIAGONAL_FROM_TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.wasabeef.picasso.transformations.RoundedCornersTransformation.AnonymousClass1.<clinit>():void");
        }
    }

    private void drawTopLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mMargin;
        int i2 = this.mDiameter;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + i2), (float) (i + i2));
        int i3 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.mMargin;
        int i5 = this.mRadius;
        canvas.drawRect(new RectF((float) i4, (float) (i4 + i5), (float) (i4 + i5), f2), paint);
        int i6 = this.mMargin;
        canvas.drawRect(new RectF((float) (this.mRadius + i6), (float) i6, f, f2), paint);
    }

    private void drawTopRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mDiameter;
        int i2 = this.mMargin;
        RectF rectF = new RectF(f - ((float) i), (float) i2, f, (float) (i2 + i));
        int i3 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.mMargin;
        canvas.drawRect(new RectF((float) i4, (float) i4, f - ((float) this.mRadius), f2), paint);
        int i5 = this.mRadius;
        canvas.drawRect(new RectF(f - ((float) i5), (float) (this.mMargin + i5), f, f2), paint);
    }

    private void drawBottomLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mMargin;
        int i2 = this.mDiameter;
        RectF rectF = new RectF((float) i, f2 - ((float) i2), (float) (i + i2), f2);
        int i3 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.mMargin;
        canvas.drawRect(new RectF((float) i4, (float) i4, (float) (i4 + this.mDiameter), f2 - ((float) this.mRadius)), paint);
        int i5 = this.mMargin;
        canvas.drawRect(new RectF((float) (this.mRadius + i5), (float) i5, f, f2), paint);
    }

    private void drawBottomRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mDiameter;
        RectF rectF = new RectF(f - ((float) i), f2 - ((float) i), f, f2);
        int i2 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.mMargin;
        canvas.drawRect(new RectF((float) i3, (float) i3, f - ((float) this.mRadius), f2), paint);
        int i4 = this.mRadius;
        canvas.drawRect(new RectF(f - ((float) i4), (float) this.mMargin, f, f2 - ((float) i4)), paint);
    }

    private void drawTopRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mMargin;
        RectF rectF = new RectF((float) i, (float) i, f, (float) (i + this.mDiameter));
        int i2 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.mMargin;
        canvas.drawRect(new RectF((float) i3, (float) (i3 + this.mRadius), f, f2), paint);
    }

    private void drawBottomRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF((float) this.mMargin, f2 - ((float) this.mDiameter), f, f2);
        int i = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        int i2 = this.mMargin;
        canvas.drawRect(new RectF((float) i2, (float) i2, f, f2 - ((float) this.mRadius)), paint);
    }

    private void drawLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mMargin;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + this.mDiameter), f2);
        int i2 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.mMargin;
        canvas.drawRect(new RectF((float) (this.mRadius + i3), (float) i3, f, f2), paint);
    }

    private void drawRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(f - ((float) this.mDiameter), (float) this.mMargin, f, f2);
        int i = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        int i2 = this.mMargin;
        canvas.drawRect(new RectF((float) i2, (float) i2, f - ((float) this.mRadius), f2), paint);
    }

    private void drawOtherTopLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF((float) this.mMargin, f2 - ((float) this.mDiameter), f, f2);
        int i = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        RectF rectF2 = new RectF(f - ((float) this.mDiameter), (float) this.mMargin, f, f2);
        int i2 = this.mRadius;
        canvas.drawRoundRect(rectF2, (float) i2, (float) i2, paint);
        int i3 = this.mMargin;
        int i4 = this.mRadius;
        canvas.drawRect(new RectF((float) i3, (float) i3, f - ((float) i4), f2 - ((float) i4)), paint);
    }

    private void drawOtherTopRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mMargin;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + this.mDiameter), f2);
        int i2 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        RectF rectF2 = new RectF((float) this.mMargin, f2 - ((float) this.mDiameter), f, f2);
        int i3 = this.mRadius;
        canvas.drawRoundRect(rectF2, (float) i3, (float) i3, paint);
        int i4 = this.mMargin;
        int i5 = this.mRadius;
        canvas.drawRect(new RectF((float) (i4 + i5), (float) i4, f, f2 - ((float) i5)), paint);
    }

    private void drawOtherBottomLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mMargin;
        RectF rectF = new RectF((float) i, (float) i, f, (float) (i + this.mDiameter));
        int i2 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        RectF rectF2 = new RectF(f - ((float) this.mDiameter), (float) this.mMargin, f, f2);
        int i3 = this.mRadius;
        canvas.drawRoundRect(rectF2, (float) i3, (float) i3, paint);
        int i4 = this.mMargin;
        int i5 = this.mRadius;
        canvas.drawRect(new RectF((float) i4, (float) (i4 + i5), f - ((float) i5), f2), paint);
    }

    private void drawOtherBottomRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mMargin;
        RectF rectF = new RectF((float) i, (float) i, f, (float) (i + this.mDiameter));
        int i2 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.mMargin;
        RectF rectF2 = new RectF((float) i3, (float) i3, (float) (i3 + this.mDiameter), f2);
        int i4 = this.mRadius;
        canvas.drawRoundRect(rectF2, (float) i4, (float) i4, paint);
        int i5 = this.mMargin;
        int i6 = this.mRadius;
        canvas.drawRect(new RectF((float) (i5 + i6), (float) (i5 + i6), f, f2), paint);
    }

    private void drawDiagonalFromTopLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mMargin;
        int i2 = this.mDiameter;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + i2), (float) (i + i2));
        int i3 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.mDiameter;
        RectF rectF2 = new RectF(f - ((float) i4), f2 - ((float) i4), f, f2);
        int i5 = this.mRadius;
        canvas.drawRoundRect(rectF2, (float) i5, (float) i5, paint);
        int i6 = this.mMargin;
        canvas.drawRect(new RectF((float) i6, (float) (i6 + this.mRadius), f - ((float) this.mDiameter), f2), paint);
        int i7 = this.mMargin;
        canvas.drawRect(new RectF((float) (this.mDiameter + i7), (float) i7, f, f2 - ((float) this.mRadius)), paint);
    }

    private void drawDiagonalFromTopRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.mDiameter;
        int i2 = this.mMargin;
        RectF rectF = new RectF(f - ((float) i), (float) i2, f, (float) (i2 + i));
        int i3 = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.mMargin;
        int i5 = this.mDiameter;
        RectF rectF2 = new RectF((float) i4, f2 - ((float) i5), (float) (i4 + i5), f2);
        int i6 = this.mRadius;
        canvas.drawRoundRect(rectF2, (float) i6, (float) i6, paint);
        int i7 = this.mMargin;
        int i8 = this.mRadius;
        canvas.drawRect(new RectF((float) i7, (float) i7, f - ((float) i8), f2 - ((float) i8)), paint);
        int i9 = this.mMargin;
        int i10 = this.mRadius;
        canvas.drawRect(new RectF((float) (i9 + i10), (float) (i9 + i10), f, f2), paint);
    }

    @Override // com.squareup.picasso.Transformation
    public String key() {
        return "RoundedTransformation(radius=" + this.mRadius + ", margin=" + this.mMargin + ", diameter=" + this.mDiameter + ", cornerType=" + this.mCornerType.name() + ")";
    }
}