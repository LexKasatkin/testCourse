
package com.example.lex.testcourse;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
//import javax.validation.Valid;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Course implements Parcelable
{

    @SerializedName("stock")
    @Expose
//    @Valid
    private List<Stock> stock = new ArrayList<Stock>();
    @SerializedName("as_of")
    @Expose
    private String asOf;
    public final static Parcelable.Creator<Course> CREATOR = new Creator<Course>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Course createFromParcel(Parcel in) {
            Course instance = new Course();
            in.readList(instance.stock, (com.example.lex.testcourse.Stock.class.getClassLoader()));
            instance.asOf = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Course[] newArray(int size) {
            return (new Course[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The stock
     */
    public List<Stock> getStock() {
        return stock;
    }

    /**
     * 
     * @param stock
     *     The stock
     */
    public void setStock(List<Stock> stock) {
        this.stock = stock;
    }

    /**
     * 
     * @return
     *     The asOf
     */
    public String getAsOf() {
        return asOf;
    }

    /**
     * 
     * @param asOf
     *     The as_of
     */
    public void setAsOf(String asOf) {
        this.asOf = asOf;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(stock);
        dest.writeValue(asOf);
    }

    public int describeContents() {
        return  0;
    }

}
