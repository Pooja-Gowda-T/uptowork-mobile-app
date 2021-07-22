package util;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import java.io.IOException;

public class ImageUtils {
    public static void loadImage(@NonNull Context context,
                                 @NonNull Uri uri,
                                 @NonNull ImageView imageView) {
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
            imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
