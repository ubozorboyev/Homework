package hu.andersen.task.extentions

import android.content.res.Resources.NotFoundException
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.io.File


fun ImageView.load(url:String?){
    Glide.with(this).load(url).into(this)
}

fun ImageView.load(file:File?){
    Glide.with(this).load(file).into(this)
}

fun ImageView.load(uri:Uri?){
    Glide.with(this).load(uri).into(this)
}

fun ImageView.load(draw:Drawable?){
    Glide.with(this).load(draw).into(this)

}

fun ImageView.load(resId:Int?){
    Glide.with(this).load(resId).into(this)

}

fun ImageView.load(bitmap:Bitmap?){
    Glide.with(this).load(bitmap).into(this)

}
fun ImageView.load(source: Any?){

    when(source){
        is File,
        is String,
        is Drawable,
        is Uri,
        is Bitmap,
        is ByteArray,
        is Int -> {
            Glide.with(this).load(source).into(this)
        }
        else -> throw NotFoundException("source is invalid")
    }

}