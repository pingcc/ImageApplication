package com.dream.user;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created  on 2018/7/17.
 *
 * @author CPing
 * Email yy_cping@163.com
 * edit androidStudio
 */
public class LoadImageActivity extends AppCompatActivity {
    public static final String INTENTVALUE = "intentValue";
    private ImageView imageView;

    public static void goLoadImageActivity(Context context,int key){
        Intent intent=new Intent();
        intent.putExtra(INTENTVALUE,key);
        intent.setClass(context,LoadImageActivity.class);
        context.startActivity(intent);

    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_imge);
        imageView = findViewById(R.id.image);


        Intent intent = getIntent();
        int key =intent.getIntExtra(INTENTVALUE, -1);

            loadImage(key);


    }

    private void loadImage(int key) {
        Bitmap bitmap1 = ((BitmapDrawable) ContextCompat.getDrawable(this, R.mipmap.img1))
                .getBitmap();
        Bitmap bitmap2 = ((BitmapDrawable) ContextCompat.getDrawable(this, R.mipmap.img2))
                .getBitmap();
        Bitmap bitmap3 = ((BitmapDrawable) ContextCompat.getDrawable(this, R.mipmap.img3))
                .getBitmap();
        Bitmap bitmap4 = ((BitmapDrawable) ContextCompat.getDrawable(this, R.mipmap.img4))
                .getBitmap();
        //绘制一张画布将四小图合成大图
        Bitmap bitmap = ImageToUtil.imageToUtil(bitmap1, bitmap2, bitmap3, bitmap4);
        switch (key) {
            case 1:
                ImageUtils.loadRoundedCornersImage(bitmap4, imageView, 20, GlideRoundedCornersTransform
                        .CornerType.LEFT);
                break;
            case 2:
                ImageUtils.loadRoundedCornersImage(bitmap2, imageView, 50, GlideRoundedCornersTransform
                        .CornerType.RIGHT);
                break;
            case 3:
                ImageUtils.loadRoundedCornersImage(bitmap3, imageView, 20, GlideRoundedCornersTransform
                        .CornerType.TOP);
                break;
            case 4:
                ImageUtils.loadRoundedCornersImage(bitmap4, imageView, 20, GlideRoundedCornersTransform
                        .CornerType.BOTTOM);
                break;
            case 5:
                ImageUtils.loadRoundedCornersImage(bitmap4, imageView, 20, GlideRoundedCornersTransform
                        .CornerType.TOP_LEFT_BOTTOM_RIGHT);
                break;
            default:
                ImageUtils.loadRoundedCornersImage(bitmap, imageView, 20, GlideRoundedCornersTransform
                        .CornerType.ALL);
                break;
        }
    }
}
