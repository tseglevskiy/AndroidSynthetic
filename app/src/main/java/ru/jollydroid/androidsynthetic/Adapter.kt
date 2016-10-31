package ru.jollydroid.androidsynthetic

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recycler_item.view.*

class Adapter() : RecyclerView.Adapter<Adapter.MyViewHolder>() {
    override fun getItemCount(): Int {
        return 105
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.recycler_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.sayHello("hello #$position from adapter")
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun sayHello(msg: String) {
            itemView.helloItem.text = msg
        }
    }
}
