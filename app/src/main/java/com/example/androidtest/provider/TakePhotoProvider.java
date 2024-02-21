package com.example.androidtest.provider;

import android.content.Context;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;

import java.io.File;

public class TakePhotoProvider extends FileProvider {
    public static Uri getUriForFile(@NonNull Context context, @NonNull File file) {
        return FileProvider.getUriForFile(context, context.getPackageName() + ".web.fileprovider", file);
    }

}
