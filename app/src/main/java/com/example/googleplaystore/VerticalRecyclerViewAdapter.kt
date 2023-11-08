import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplaystore.HorizontalItem
import com.example.googleplaystore.HorizontalRecyclerViewAdapter
import com.example.googleplaystore.R

data class VerticalItem(
    val header: String,
    val horizontalItems: List<HorizontalItem>
)

class VerticalRecyclerViewAdapter(private val data: List<VerticalItem>) :
    RecyclerView.Adapter<VerticalRecyclerViewAdapter.VerticalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.vertical_item_layout, parent, false)
        return VerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        val item = data[position]
        holder.header.text = item.header

        val layoutManager =
            LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
        holder.horizontalRecyclerView.layoutManager = layoutManager

        val adapter = HorizontalRecyclerViewAdapter(item.horizontalItems)
        holder.horizontalRecyclerView.adapter = adapter
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class VerticalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var header: TextView = itemView.findViewById(R.id.header)
        var horizontalRecyclerView: RecyclerView = itemView.findViewById(R.id.horizontal_recycler_view)
    }
}
