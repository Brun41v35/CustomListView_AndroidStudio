package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TableRow
import android.widget.TextView

class CustomAdapter(var context: Context, var estacionamento: ArrayList<Estacionamento>): BaseAdapter() {

    private class ViewHolder(row: View?) {
        var txtPlacaCarro: TextView
        var txtData: TextView
        var txtHora: TextView

        init {
            this.txtPlacaCarro = row?.findViewById(R.id.placaCarro) as TextView
            this.txtHora = row?.findViewById(R.id.horario) as TextView
            this.txtData = row?.findViewById(R.id.data) as TextView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder
        if (convertView == null) {
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.information_list, parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var estacionamento: Estacionamento = getItem(position) as Estacionamento
        viewHolder.txtPlacaCarro.text = estacionamento.placaCarro
        viewHolder.txtData.text = estacionamento.data
        viewHolder.txtHora.text = estacionamento.horario
        return view as View
    }

    override fun getItem(position: Int): Any {
        return estacionamento.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return estacionamento.count()
    }
}