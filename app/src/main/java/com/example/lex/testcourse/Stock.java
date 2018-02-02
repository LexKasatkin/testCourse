
package com.example.lex.testcourse;

import javax.annotation.Generated;
//import javax.validation.Valid;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Stock implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
//    @Valid
    private Price price;
    @SerializedName("percent_change")
    @Expose
    private double percentChange;
    @SerializedName("volume")
    @Expose
    private int volume;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    public final static Parcelable.Creator<Stock> CREATOR = new Creator<Stock>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Stock createFromParcel(Parcel in) {
            Stock instance = new Stock();
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.price = ((Price) in.readValue((Price.class.getClassLoader())));
            instance.percentChange = ((double) in.readValue((double.class.getClassLoader())));
            instance.volume = ((int) in.readValue((int.class.getClassLoader())));
            instance.symbol = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Stock[] newArray(int size) {
            return (new Stock[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Price getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The percentChange
     */
    public double getPercentChange() {
        return percentChange;
    }

    /**
     * 
     * @param percentChange
     *     The percent_change
     */
    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }

    /**
     * 
     * @return
     *     The volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * 
     * @param volume
     *     The volume
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * 
     * @return
     *     The symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * 
     * @param symbol
     *     The symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(price);
        dest.writeValue(percentChange);
        dest.writeValue(volume);
        dest.writeValue(symbol);
    }

    public int describeContents() {
        return  0;
    }

}
