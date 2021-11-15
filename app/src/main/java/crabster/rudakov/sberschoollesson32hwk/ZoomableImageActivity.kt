package crabster.rudakov.sberschoollesson32hwk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView

class ZoomableImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoomable_image)

        val imageView: SubsamplingScaleImageView = findViewById(R.id.zoomable_image_view)

        val imageId: Int = intent.getIntExtra("image", 0)
        imageView.setImage(ImageSource.resource(imageId))
    }

}