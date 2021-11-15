package crabster.rudakov.sberschoollesson32hwk

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class TankAdapter(private val tankImages: List<Int>, private val context: Context) :
    RecyclerView.Adapter<TankAdapter.TankHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TankHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.activity_main_item, parent, false)
        return TankHolder(view, context)
    }

    override fun onBindViewHolder(holder: TankHolder, position: Int) {
        val tankImage = tankImages[position]
        holder.bind(tankImage)
    }

    override fun getItemCount(): Int {
        return tankImages.size
    }

    class TankHolder(itemView: View, private val context: Context) :
        RecyclerView.ViewHolder(itemView) {

        fun bind(imageID: Int) {
            val tankImage = itemView.findViewById<ImageView>(R.id.tank_view)
            tankImage.setImageResource(imageID)
            tankImage.setOnClickListener {
                val intent = Intent(context, ZoomableImageActivity::class.java)
                intent.putExtra("image", imageID)
                context.startActivity(intent)
            }
        }

    }

}